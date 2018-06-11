package com.symantec.eloqua.assetMigrator.Email.FieldMerges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.CustomDataObject.CdoField;
import com.symantec.eloqua.assetMigrator.CustomDataObject.CustomObject;
import com.symantec.eloqua.assetMigrator.CustomDataObject.DestCDOField;
import com.symantec.eloqua.assetMigrator.CustomDataObject.GetCDO;
import com.symantec.eloqua.assetMigrator.CustomDataObject.Items;
import com.symantec.eloqua.assetMigrator.Email.Models.FieldMerges;

public class FieldMergesClass {

	public FieldMerges postFieldMerges(BulkAndRestClient restclient, String site, FieldMerges fieldMerge,
			BulkAndRestClient DrestClient, String instanceName, BulkAndRestClient BulkUrl2) {
		FieldMerges postFieldMerge = null;
		FieldMerges newFieldMerge = new FieldMerges();

		String SrcFieldMergeName = fieldMerge.getName();

		if (fieldMerge.getContactFieldId() != null)

		{
			newFieldMerge.setName(fieldMerge.getName());
			newFieldMerge.setAllowUrlsInValue(fieldMerge.getAllowUrlsInValue());
			newFieldMerge.setSyntax(fieldMerge.getSyntax());

			newFieldMerge.setDefaultValue(fieldMerge.getDefaultValue());
			newFieldMerge.setFieldConditions(fieldMerge.getFieldConditions());
			newFieldMerge.setMergeType(fieldMerge.getMergeType());

			try {
				String srcContactFieldID = fieldMerge.getContactFieldId();
				String srcContactFieldName = null;
				String destContactFieldName = null;
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root", "root");

				// String query = "Select id from dest_contactField where exists
				// (select internalName from src_contactField where
				// internalName=dest_contactField.internalName);";
				String query = "select name from src_contactField where id'" + srcContactFieldID + "'";

				java.sql.PreparedStatement stmt = conn.prepareStatement(query);

				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					// System.out.println("Field ID is " +
					// rs.getString("id"));
					srcContactFieldName = rs.getString("name");

				}
				System.out.println(" ***********Source CDO NAME " + srcContactFieldName);

				String query2 = "Select id from dest_contactField where name='" + srcContactFieldName + "'";

				java.sql.PreparedStatement stmt2 = conn.prepareStatement(query2);
				ResultSet rs2 = stmt2.executeQuery(query2);

				while (rs2.next()) {
					System.out.println("DEST CDO ID is ************* " + rs2.getString("id"));
					newFieldMerge.setContactFieldId(rs2.getString("id"));
					destContactFieldName = rs2.getString("id");
				}

				conn.close();
			} catch (Exception e) {
				System.out.println("ERRRORRRR in DynamicContentClass" + e);
			}

		}

		else {
			newFieldMerge.setType(fieldMerge.getType());

			newFieldMerge.setName(fieldMerge.getName());
			newFieldMerge.setAllowUrlsInValue(fieldMerge.getAllowUrlsInValue());
			newFieldMerge.setSyntax(fieldMerge.getSyntax());
			newFieldMerge.setCustomObjectSort(fieldMerge.getCustomObjectSort());
			newFieldMerge.setDefaultValue(fieldMerge.getDefaultValue());

			newFieldMerge.setFieldConditions(fieldMerge.getFieldConditions());

			newFieldMerge.setMergeType(fieldMerge.getMergeType());

			String srcCdoID = fieldMerge.getCustomObjectId();
			String srcCdoFieldID = fieldMerge.getContactFieldId();
			String srcFieldMergeID = fieldMerge.getId();
			String srcCdoName = null;
			String destCdoId = null;
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root", "root");

				String query = "Select name from Src_CDO where id= '" + srcCdoID + "'";

				java.sql.PreparedStatement stmt = conn.prepareStatement(query);
				// stmt.setString(1, srcCdoID);

				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
					// System.out.println("Field ID is " +
					// rs.getString("id"));
					srcCdoName = rs.getString("name");

				}
				System.out.println(" ***********Source CDO NAME " + srcCdoName);

				String query2 = "Select id from dest_cdo where name='" + srcCdoName + "'";

				java.sql.PreparedStatement stmt2 = conn.prepareStatement(query2);
				ResultSet rs2 = stmt2.executeQuery(query2);

				while (rs2.next()) {
					System.out.println("DEST CDO ID is ************* " + rs2.getString("id"));
					newFieldMerge.setCustomObjectId(rs2.getString("id"));
					destCdoId = rs2.getString("id");
				}

				GetCDO objDest = new GetCDO(DrestClient);

				Response responseDestCDOFields = objDest
						.getResponse("/assets/customObject/" + destCdoId + "?depth=complete");

				System.out.println("response Dest CDO Field s Array****" + responseDestCDOFields.body);
				System.out.println("StatusCode " + responseDestCDOFields.exception);
				CustomObject customObject = new CustomObject();
				customObject = DrestClient.GetCdoClient().GetCustomObjectInfo(responseDestCDOFields);
				List<com.symantec.eloqua.assetMigrator.CustomDataObject.Fields> fieldList = customObject.getFields();
				Iterator<com.symantec.eloqua.assetMigrator.CustomDataObject.Fields> fieldListItarator = fieldList
						.iterator();

				// Fetch field name from Src CDO

				String srcCdoFieldId = fieldMerge.getCustomObjectFieldId();
				System.out.println("******src CDo Field ID" + srcCdoFieldId);
				GetCDO objSrcField = new GetCDO(BulkUrl2);
				Response responseSrcCDOField = objSrcField
						.getResponse("/customObjects/" + srcCdoID + "/fields/" + fieldMerge.getCustomObjectFieldId());
				CdoField srcCdoField = new CdoField();
				srcCdoField = BulkUrl2.GetCdoClient().GetCustomObjectFieldInfo(responseSrcCDOField);
				System.out.println("*******responseSrcCDOField " + responseSrcCDOField.body);
				System.out.println("*********responseSrcCDOField StatusCode" + responseSrcCDOField.exception);

				// Src CDO Field Name
				String srcCdoFieldName = srcCdoField.getName();

				String srcCdoFieldInternalName = srcCdoField.getInternalName();
				System.out.println("**********Src CDO FIELD Internal NAME" + srcCdoFieldInternalName);

				GetCDO objDestField = new GetCDO(BulkUrl2);

				Response responseDestCDOField = objDestField.getResponse("/customObjects/" + destCdoId
						+ "/fields?q='internalName=" + srcCdoFieldInternalName + "'&limit=1");

				System.out.println("responseDESTCDOField***********" + responseDestCDOField.body);
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

				// System.out.println("exception in Destination CDO FIELD ID
				// *********" + e.getMessage());
				newFieldMerge.setCustomObjectFieldId(destCdoFieldId);

				conn.close();

			} catch (Exception e) {
				System.out.println("ERRRORRRR" + e);
			}

			postFieldMerge = restclient.FieldMergeClient().PostFieldMerge(DrestClient, newFieldMerge, srcFieldMergeID,
					instanceName);

		}
		return postFieldMerge;
	}

}
