package com.symantec.eloqua.assetMigrator.Email.DynamicContent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Contact.ContactField;
import com.symantec.eloqua.assetMigrator.Contact.GetContactFields;
import com.symantec.eloqua.assetMigrator.CustomDataObject.CdoField;
import com.symantec.eloqua.assetMigrator.CustomDataObject.CustomObject;
import com.symantec.eloqua.assetMigrator.CustomDataObject.DestCDOField;
import com.symantec.eloqua.assetMigrator.CustomDataObject.GetCDO;
import com.symantec.eloqua.assetMigrator.CustomDataObject.Items;
import com.symantec.eloqua.assetMigrator.Email.Models.ContentSection;
import com.symantec.eloqua.assetMigrator.Email.Models.Criteria;
import com.symantec.eloqua.assetMigrator.Email.Models.DefaultContentSection;
//import com.symantec.eloqua.assetMigrator.Email.DynamicContentModel.Rules;
import com.symantec.eloqua.assetMigrator.Email.Models.DynamicContents;
import com.symantec.eloqua.assetMigrator.Email.Models.FieldConditions;
import com.symantec.eloqua.assetMigrator.Email.Models.Rules;

public class DynamicContentClass {

	public DynamicContents postDynamicContent(BulkAndRestClient restclient, String site, DynamicContents dynamicContent,
			BulkAndRestClient DrestClient, String instanceName, BulkAndRestClient BulkUrl2) {

		DynamicContents newDynamicContent = new DynamicContents();
		String srcDynamicContentID = dynamicContent.getId();
		String DinstanceName = instanceName;
		List<Rules> ruleList = dynamicContent.getRules();
		List<FieldConditions> newFieldConditionsArray = new ArrayList<FieldConditions>();
		Iterator<Rules> rulesIterator = ruleList.iterator();
		List<Rules> newRuleList = new ArrayList<Rules>();
		// int cnt = 1;
		System.out.println("");

		while (rulesIterator.hasNext()) {
			Rules newRule = new Rules();

			Rules rule = null;
			rule = (Rules) rulesIterator.next();
			// System.out.println("RULE!!!!!" + rule.getContentSection());

			List<Criteria> criteriaList = rule.getCriteria();
			Iterator<Criteria> criteriaIterator = criteriaList.iterator();
			List<Criteria> newcriteriaList = new ArrayList<Criteria>();

			while (criteriaIterator.hasNext()) {
				String destCdoId = null;
				Criteria criteria = null;
				Criteria newCriteria = new Criteria();
				criteria = (Criteria) criteriaIterator.next();
				// fieldCondition=(FieldConditions)

				newCriteria.setType(criteria.getType());
				String criteriaType = criteria.getType();
				System.out.println("^^^^^^^^^criteriaType^^^^^^^^^!1" + criteriaType);

				if (criteria.getFieldId() != null) {

					if (criteriaType.equals("ContactFieldCriterion")) {

						String srcFieldId = criteria.getFieldId();

						GetContactFields obj = new GetContactFields(DrestClient);
						Response response2 = obj.getResponse("/assets/contact/field/" + srcFieldId + "?depth=partial");

						ContactField srcContactField = new ContactField();

						srcContactField = DrestClient.ContactFieldClient().GetContactField(response2);

						String srcFieldInternalName = srcContactField.getInternalName();

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root",
									"root");

							String query = "Select id from dest_contactField where internalName=?";

							java.sql.PreparedStatement ps = conn.prepareStatement(query);
							ps.setString(1, srcFieldInternalName);
							ResultSet rs = ps.executeQuery();

							System.out.println("dest_contactField Result Set " + rs);
							while (rs.next()) {

								newCriteria.setFieldId(rs.getString("id"));
								newCriteria.setCondition(criteria.getCondition());
							}

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("ERRRORRRR in DynamicContentClass" + e);
						}

					} /*
						 * { // Criteria criteriaField = new Criteria();
						 * System.out.
						 * println("^^^^^^^^^^^^^^^^^  ContactFieldCriterion" +
						 * criteriaType); try {
						 * 
						 * Class.forName("com.mysql.jdbc.Driver"); Connection
						 * conn = DriverManager.getConnection(
						 * "jdbc:mysql://localhost:3306/eloqua", "root",
						 * "root");
						 * 
						 * String query =
						 * "Select id from dest_contactField where exists (select internalName from src_contactField  where internalName=dest_contactField.internalName);"
						 * ;
						 * 
						 * java.sql.PreparedStatement stmt =
						 * conn.prepareStatement(query); ResultSet rs =
						 * stmt.executeQuery(query);
						 * 
						 * while (rs.next()) { //
						 * System.out.println("Field ID is " + //
						 * rs.getString("id"));
						 * newCriteria.setFieldId(rs.getString("id"));
						 * newCriteria.setCondition(criteria.getCondition()); }
						 * conn.close(); } catch (Exception e) {
						 * System.out.println("ERRRORRRR in DynamicContentClass"
						 * + e); }
						 * 
						 * newcriteriaList.add(newCriteria); }
						 */
				} else {
					try {
						System.out.println("^^^^^^^^^^^^^^^^^  LinkedCustomObjectCriterion" + criteria.getType());

						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root",
								"root");
						// SString dCdoName= ;g
						// String query = "Select id from Dest_CDO where
						// Exists(Select name from Src_CDO where
						// Dest_CDO.name=Src_CDO.name )";
						String SrcCDOid = criteria.getCustomObjectId();
						String srcCdoName = null;
						System.out.println(" \n---------------Source CDO IDDDDDD " + criteria.getCustomObjectId());
						String query = "Select name from Src_CDO where id='" + SrcCDOid + "'";
						java.sql.PreparedStatement stmt = conn.prepareStatement(query);
						// stmt.setString(1, srcCdoID);

						ResultSet rs = stmt.executeQuery(query);

						while (rs.next()) {
							// System.out.println("Field ID is " +
							// rs.getString("id"));
							srcCdoName = rs.getString("name");

						}
						System.out.println(" \n---------------Source CDO NAME " + srcCdoName);

						String query2 = "Select id from dest_cdo where name='" + srcCdoName + "'";

						java.sql.PreparedStatement stmt2 = conn.prepareStatement(query2);
						ResultSet rs2 = stmt2.executeQuery(query2);

						while (rs2.next()) {
							System.out.println("DEST CDO ID is--------------- " + rs2.getString("id"));
							// newFieldMerge.setCustomObjectId(rs2.getString("id"));
							newCriteria.setCustomObjectId(rs2.getString("id"));
							destCdoId = rs2.getString("id");
							System.out.println(
									"===============CDO ID FOR CRITERIA IS=======================" + destCdoId);
						}

						GetCDO objDest = new GetCDO(DrestClient);

						Response responseDestCDOFields = objDest
								.getResponse("/assets/customObject/" + destCdoId + "?depth=complete");

						System.out
								.println("response Dest CDO Field s Array---------------" + responseDestCDOFields.body);
						System.out.println("exception " + responseDestCDOFields.exception);
						CustomObject customObject = new CustomObject();
						customObject = DrestClient.GetCdoClient().GetCustomObjectInfo(responseDestCDOFields);
						List<com.symantec.eloqua.assetMigrator.CustomDataObject.Fields> fieldList = customObject
								.getFields();
						Iterator<com.symantec.eloqua.assetMigrator.CustomDataObject.Fields> fieldListItarator = fieldList
								.iterator();

						// Fetch field name from Src CDO

						String srcCdoFieldId = null;
						FieldConditions newFieldConditions = new FieldConditions();
						List<com.symantec.eloqua.assetMigrator.Email.Models.FieldConditions> fieldConditionList = criteria
								.getFieldConditions();
						System.out.println("fieldConditionList^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
								+ fieldConditionList.isEmpty());
						// System.out.println("fieldConditionList^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+fieldConditionList.);

						for (FieldConditions fieldCondition : fieldConditionList) {
							System.out.println("*****");
							System.out.println("fieldCondition - " + fieldCondition.getFieldId());
							srcCdoFieldId = fieldCondition.getFieldId();
						}

						System.out.println("---------------src CDo Field ID" + srcCdoFieldId);
						GetCDO objSrcField = new GetCDO(BulkUrl2);
						Response responseSrcCDOField = objSrcField
								.getResponse("/customObjects/" + SrcCDOid + "/fields/" + srcCdoFieldId);
						CdoField srcCdoField = new CdoField();
						srcCdoField = BulkUrl2.GetCdoClient().GetCustomObjectFieldInfo(responseSrcCDOField);
						System.out.println("---------------responseSrcCDOField " + responseSrcCDOField.body);
						System.out.println(
								"---------------responseSrcCDOField StatusCode" + responseSrcCDOField.exception);

						// Src CDO Field Name
						String srcCdoFieldName = srcCdoField.getName();

						String srcCdoFieldInternalName = srcCdoField.getInternalName();
						System.out.println("---------------*Src CDO FIELD Internal NAME" + srcCdoFieldInternalName);

						GetCDO objDestField = new GetCDO(BulkUrl2);

						Response responseDestCDOField = objDestField.getResponse("/customObjects/" + destCdoId
								+ "/fields?q='internalName=" + srcCdoFieldInternalName + "'&limit=1");

						System.out.println("responseDESTCDOField---------------" + responseDestCDOField.body);
						System.out.println("responseDESTCDOField StatusCode" + responseDestCDOField.exception);

						DestCDOField destCdoField = new DestCDOField();
						destCdoField = BulkUrl2.GetCdoClient().GetCdoDestFieldInfo(responseDestCDOField);

						List<Items> itemList = destCdoField.getItems();
						Iterator<Items> itemIterator = itemList.iterator();
						String destCdoFieldStatement = null;
						while (itemIterator.hasNext()) {
							Items items = null;
							items = itemIterator.next();
							destCdoFieldStatement = items.getUri();
						}

						System.out.println("destCdoField*************" + destCdoField);

						// String destCdoFieldStatement = destCdoField.

						System.out.println("destCdoFieldStatement*************" + destCdoFieldStatement);

						Pattern pattern = Pattern.compile("\\d+$");
						Matcher matcher = pattern.matcher(destCdoFieldStatement);

						String destCdoFieldId = "error";
						while (matcher.find()) {
							System.out.println("Full match: " + matcher.group(0));
							destCdoFieldId = matcher.group(0);

						}
						System.out.println("Destination CDO FIELD ID ********* " + destCdoFieldId);
						// newFieldConditions.setFieldId(destCdoFieldId);
						// newFieldConditions.setType("FieldCondition");

						//
						// newFieldConditionsList.set(0, newFieldConditions);

						List<FieldConditions> newFieldConditionsList_Iteration = criteria.getFieldConditions();
						// System.out.println("!!!!!!!!!!!!!!!!!!!!!!!FieldCondition"
						// + newFieldConditionsList.size());

						/*
						 * for (FieldConditions model : newFieldConditionsList)
						 * {
						 * 
						 * System.out.println(
						 * "FieldConditions___________)_)_)_)_)_)_)_____------>"
						 * + model.getFieldId()); System.out.println(
						 * "FieldConditions___________)_)_)_)_)_)_)_____------>"
						 * + model.getType());
						 * newFieldConditions.setCondition(model.getCondition())
						 * ; }
						 */
						Iterator<FieldConditions> newFieldConditionsIterator = newFieldConditionsList_Iteration
								.iterator();
						while (newFieldConditionsIterator.hasNext()) {
							FieldConditions fieldCondition = newFieldConditionsIterator.next();
							System.out.println("FieldConditions___________)_)_)_)_)_)_)_____------>"
									+ fieldCondition.getFieldId());
							System.out.println(
									"FieldConditions___________)_)_)_)_)_)_)_____------>" + fieldCondition.getType());
							newFieldConditions.setCondition(fieldCondition.getCondition());
							newFieldConditions.setFieldId(destCdoFieldId);
							newFieldConditions.setType(fieldCondition.getType());

						}

						newFieldConditionsArray.add(newFieldConditions);

						System.out.println(
								"!!!!!!!!!!!!!!!!!!!!!!!FieldCondition LIST SIZE" + newFieldConditionsArray.size());
						newCriteria.setFieldConditions(newFieldConditionsArray);

					}

					catch (Exception e) {
						// TODO: handle exception
						System.out.println("Exception in POST DC CDO FIELD CONDITION " + e.getMessage());
					}

				}
				// System.out.println("LOOOP COUNT " + cnt);
				// cnt++;
				// newCriteria.setFieldConditions(newFieldConditionsList);
				newCriteria.setCustomObjectId(destCdoId);
				newcriteriaList.add(newCriteria);
			}

			newRule.setCriteria(newcriteriaList);

			// newRule.setContentSection(rule.getContentSection());

			newRule.setType(rule.getType());
			newRule.setStatement(rule.getStatement());

			ContentSection contentSection = new ContentSection();

			contentSection.setType(rule.getContentSection().getType());
			// contentSection.setId();
			contentSection.setName(rule.getContentSection().getName());
			contentSection.setContentHtml(rule.getContentSection().getContentHtml());
			contentSection.setContentText(rule.getContentSection().getContentText());

			newRule.setContentSection(contentSection);

			newRuleList.add(newRule);
		}

		// newDynamicContent.setFolderId(site);
		newDynamicContent.setRules(newRuleList);

		DefaultContentSection defaultContentSection = new DefaultContentSection();

		defaultContentSection.setType(dynamicContent.getDefaultContentSection().getType());
		defaultContentSection.setName(dynamicContent.getDefaultContentSection().getName());
		defaultContentSection.setContentHtml(dynamicContent.getDefaultContentSection().getContentHtml());
		defaultContentSection.setContentText(dynamicContent.getDefaultContentSection().getContentText());

		newDynamicContent.setDefaultContentSection(defaultContentSection);

		newDynamicContent.setType(dynamicContent.getType());
		newDynamicContent.setName(dynamicContent.getName());
		newDynamicContent.setFolderId("16375");///// hardCoded Folder ID needs
												///// to be
												///// Dynamic------------------------------------------------------------------------------
		DynamicContents postDynamicContent = DrestClient.DynamicContentClient().PostDynamicContent(DrestClient,

				newDynamicContent, srcDynamicContentID, DinstanceName);

		return postDynamicContent;

	}

}
