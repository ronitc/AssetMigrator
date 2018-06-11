package com.symantec.eloqua.assetMigrator.Email;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import java.util.HashMap;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletResponse;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.DynamicContent.DynamicContentObject;
import com.symantec.eloqua.assetMigrator.Email.DynamicContent.Elements;
import com.symantec.eloqua.assetMigrator.Email.DynamicContent.GetDynamicContent;
import com.symantec.eloqua.assetMigrator.Email.DynamicContent.SearchDynamicContentResult;
import com.symantec.eloqua.assetMigrator.Email.FieldMerges.FieldMergeObject;
import com.symantec.eloqua.assetMigrator.Email.FieldMerges.GetFieldMerge;
import com.symantec.eloqua.assetMigrator.Email.FieldMerges.SearchFieldMergeResult;
import com.symantec.eloqua.assetMigrator.Email.Models.DynamicContents;
//import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.Models.Email;
import com.symantec.eloqua.assetMigrator.Email.Models.FieldMerges;
import com.symantec.eloqua.assetMigrator.Email.Models.HtmlContent;
import com.symantec.eloqua.assetMigrator.Email.Models.Images;
import com.symantec.eloqua.assetMigrator.Email.Models.Rules;

public class EmailClass {

	public Email postEmail(BulkAndRestClient restclient, String site, Email email, BulkAndRestClient DrestClient,
			String NewEmail_name, String Subject, String emailGroupId, String instanceName,
			BulkAndRestClient BulkUrl2) {
		Email newEmail = new Email();
		List<Images> imageList = email.getImages();
		List<FieldMerges> fieldMergeList = email.getFieldMerges();
		List<DynamicContents> dynamicContentList = email.getDynamicContents();
		String DinstanceName = instanceName;
		Iterator<Images> imageIterator = imageList.iterator();
		Iterator<FieldMerges> fieldMergeIterator = fieldMergeList.iterator();
		Iterator<DynamicContents> dynamicContentIterator = dynamicContentList.iterator();

		/*
		 * int imgId=Integer.parseInt(img.getId()); String
		 * imgName=img.getName(); String imgFullUrl=img.getFullImageUrl();
		 * System.out.println("^^^^^^Full Img URL^^^^^^^^^^"+imgFullUrl);
		 * 
		 * String imgCreatedBy=img.getCreatedBy(); String
		 * emailCreatedBy=email.getCreatedBy();
		 */
		if (email.getFieldMerges() != null) {
			List<FieldMerges> newFieldMerges = new ArrayList<FieldMerges>();
			while (fieldMergeIterator.hasNext()) {
				FieldMerges fieldMerges = new FieldMerges();
				fieldMerges = fieldMergeIterator.next();
				FieldMerges result = new FieldMerges();

				String FieldMergeName = fieldMerges.getName();

				String SrcFieldMergeName = FieldMergeName.replaceAll("\\s+", "%20");
				System.out.println("^^^^^^^^^^^^^^^^SrcFieldMergeName" + SrcFieldMergeName);

				GetFieldMerge objSrcFieldMerge = new GetFieldMerge(DrestClient);

				Response responseSrcFieldMerge = objSrcFieldMerge
						.getResponse("assets/fieldMerge/folder/root/contents?count=600&page=1&depth=minimal&search='"
								+ SrcFieldMergeName + "'");
				System.out.println("responseDESTCDOField***********" + responseSrcFieldMerge.body);
				System.out.println("responseDESTCDOField StatusCode" + responseSrcFieldMerge.exception);

				SearchFieldMergeResult searchFieldMergeResult = new SearchFieldMergeResult();
				searchFieldMergeResult = DrestClient.FieldMergeClient().GetFieldMergeInfo(responseSrcFieldMerge);

				List<com.symantec.eloqua.assetMigrator.Email.FieldMerges.Elements> elementList = searchFieldMergeResult
						.getElements();
				Iterator<com.symantec.eloqua.assetMigrator.Email.FieldMerges.Elements> elementIterator = elementList
						.iterator();
				String destFieldMergeID = null;
				while (elementIterator.hasNext()) {
					com.symantec.eloqua.assetMigrator.Email.FieldMerges.Elements elements = null;
					elements = elementIterator.next();
					destFieldMergeID = elements.getId();

				}

				if (destFieldMergeID == null) {

					result = FieldMergeObject.getFieldMergesClassObject().postFieldMerges(restclient, site, fieldMerges,
							DrestClient, DinstanceName, BulkUrl2);

				}

				else {

					System.out.println("()()()()()()()(()(FieldMerge FOUND iN DESTINATION " + destFieldMergeID);
					GetFieldMerge getDestFieldMerge = new GetFieldMerge(DrestClient);
					Response responseDestFieldMerge = getDestFieldMerge
							.getResponse("assets/fieldMerge/" + destFieldMergeID + "?depth=complete");
					System.out.println("getDestFieldMerge***********" + responseDestFieldMerge.body);
					System.out.println("responseDestFieldMerge StatusCode" + responseDestFieldMerge.exception);

					result = DrestClient.FieldMergeClient().GetFieldMerge(responseDestFieldMerge);
				}

				if (result != null) {
					newFieldMerges.add(result);
				}

			}
			for (FieldMerges model : newFieldMerges) {
				System.out.println(model.getId());
				System.out.println(model.getName());
			}
			newEmail.setFieldMerges(newFieldMerges);
		}

		if (email.getDynamicContents() != null) {

			List<DynamicContents> newDynamicContents = new ArrayList<DynamicContents>();
			while (dynamicContentIterator.hasNext())

			{
				String flag = null;
				DynamicContents result = new DynamicContents();
				DynamicContents dynamicContent = new DynamicContents();
				dynamicContent = dynamicContentIterator.next();
				List<Rules> ruleList = dynamicContent.getRules();
				Iterator<Rules> rulesIterator = ruleList.iterator();

				String DynamicContentName = dynamicContent.getName();
				String SrcDynamicContentName = null;
				try {
					SrcDynamicContentName = URLEncoder.encode(DynamicContentName, "UTF-8");
				} catch (UnsupportedEncodingException e) {

					e.printStackTrace();
				}

				GetDynamicContent objSrcDynamicContent = new GetDynamicContent(DrestClient);

				Response responseSrcDynamicContent = objSrcDynamicContent.getResponse(
						"assets/dynamicContent/folder/root/contents?count=600&page=1&depth=minimal&search='"
								+ SrcDynamicContentName + "'");

				System.out
						.println("responseSrcDynamicContent DESTCDOField***********" + responseSrcDynamicContent.body);
				System.out.println(
						"responseSrcDynamicContent DESTCDOField StatusCode" + responseSrcDynamicContent.exception);

				SearchDynamicContentResult searchDynamicContentResult = new SearchDynamicContentResult();
				searchDynamicContentResult = DrestClient.DynamicContentClient()
						.GetDynamicContentInfo(responseSrcDynamicContent);

				List<Elements> elementList = searchDynamicContentResult.getElements();
				Iterator<Elements> elementIterator = elementList.iterator();

				String destDynamicContentID = null;
				while (elementIterator.hasNext()) {
					com.symantec.eloqua.assetMigrator.Email.DynamicContent.Elements elements = new Elements();
					elements = elementIterator.next();
					destDynamicContentID = elements.getId();

				}

				if (destDynamicContentID == null) {

					result = DynamicContentObject.getDynamicContentClassObject().postDynamicContent(restclient, site,
							dynamicContent, DrestClient, DinstanceName, BulkUrl2);
				}

				else {

					System.out
							.println("------------>DynamicContent FOUND iN DESTINATION ----->" + destDynamicContentID);
					GetDynamicContent getDestDynamicContent = new GetDynamicContent(DrestClient);
					Response responseDestDynamicContent = getDestDynamicContent
							.getResponse("assets/DynamicContent/" + destDynamicContentID + "?depth=complete");
					System.out.println("getDestDynamicContent***********" + responseDestDynamicContent.body);
					System.out.println("responseDestDynamicContent StatusCode" + responseDestDynamicContent.exception);

					result = DrestClient.DynamicContentClient().GetDynamicContent(responseDestDynamicContent);
				}

				if (result != null) {
					newDynamicContents.add(result);
				}
			}

			for (

			DynamicContents model : newDynamicContents) {
				System.out.println(model.getId());
				System.out.println(model.getName());

			}

			newEmail.setDynamicContents(newDynamicContents);
		}
		/*
		 * while (imageIterator.hasNext()) { Images img = null; img = (Images)
		 * imageIterator.next();
		 * 
		 * System.out.println(img.getFullImageUrl());
		 * System.out.println(img.getId());
		 * 
		 * int imgId = Integer.parseInt(img.getId()); String imgName =
		 * img.getName(); String imgFullUrl = img.getFullImageUrl(); //
		 * System.out.println("^^^^^^Full Img URL^^^^^^^^^^"+imgFullUrl);
		 * 
		 * 
		 * String imgCreatedBy=img.getCreatedBy(); String
		 * emailCreatedBy=email.getCreatedBy();
		 * 
		 * String search = "http://www4.symantec.com"; if ((imgId > 0) &&
		 * (imgFullUrl.toLowerCase().indexOf(search.toLowerCase()) == -1)) {
		 * 
		 * try { ImageObject.getImageClassObject().postImage(restclient,
		 * "https://secure.p03.eloqua.com", imgName, imgFullUrl, DrestClient);
		 * // ImageObject.getImageClassObject().postImage(restclient, //
		 * "https://secure.p03.eloqua.com", // "TEST_RONIT",
		 * "http://cdn2.kidsdiscover.com/wp-content/uploads/2012/11/4.jpg",
		 * DrestClient);
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * System.out.println("Error Ouccured At EmailClass At img iterator" +
		 * e.getMessage()); } //
		 * EmailObject.getEmailClassObject().postEmail(restclient, //
		 * "https://secure.p03.eloqua.com",email,DrestClient );
		 * 
		 * System.out.println("Image ID of ID>0"+imgId);
		 * System.out.println("full Image uRL of ID>0"+imgFullUrl);
		 * 
		 * }
		 * 
		 * 
		 * if(imgCreatedBy==emailCreatedBy) {
		 * System.out.println("\n!!!!!!!!!! image Created BY : " +imgCreatedBy);
		 * System.out.println("\n !!!!!!!!!!!!!!!EMAIL CREAYED BY : "
		 * +emailCreatedBy);
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * try { ImageObject.getImageClassObject().postImage(restclient,
		 * "https://secure.p03.eloqua.com", "TEST_RONIT",
		 * "http://cdn2.kidsdiscover.com/wp-content/uploads/2012/11/4.jpg",
		 * DrestClient); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 * 
		 */

		String srcEmailID = email.getId();

		HtmlContent html = new HtmlContent();
		html.setHtml(email.getHtmlContent().getHtml());
		html.setType(email.getHtmlContent().getType());
		html.setContentSource(email.getHtmlContent().getContentSource());

		if (email.getHtmlContent().getHtmlBody() != null) {
			html.setHtmlBody(email.getHtmlContent().getHtmlBody());
		}
		if (email.getHtmlContent().getMetaTags() != null) {
			html.setMetaTags(email.getHtmlContent().getMetaTags());
		}
		if (email.getHtmlContent().getDocumentDescription() != null) {
			html.setDocumentDescription(email.getHtmlContent().getDocumentDescription());
		}

		if (email.getHtmlContent().getCssHeader() != null) {
			html.setCssHeader(email.getHtmlContent().getCssHeader());
		}

		// Set Email Name
		newEmail.setName(email.getName());
		newEmail.setId(null);
		// Set Email EmailFooter
		newEmail.setEmailFooterId(email.getEmailFooterId());
		// newEmail.setFieldMerges(email.getFieldMerges());

		/*
		 * newEmail.setHtmlContent.setHtml(newEmail.getHtmlContent().getHtml());
		 * 
		 * newEmail.setHtmlContent(newEmail.setHtmlContent().setHtml);
		 */
		// newEmail.setHtmlContent();

		// Set Email EmailGroupID
		if (email.getEmailGroupId() != null) {

			newEmail.setEmailGroupId(emailGroupId);
		}
		newEmail.setFolderId("13525");

		// Set Email header
		newEmail.setSubject(Subject);

		// Set Email Header
		if (email.getEmailHeaderId() != null) {
			newEmail.setEmailHeaderId(email.getEmailHeaderId());
		}
		// Set Email html content
		newEmail.setHtmlContent(html);

		// Set Email Name
		newEmail.setName(NewEmail_name);
		// Set Email ContentProtected
		newEmail.setIsContentProtected(email.getIsContentProtected());
		// Set Email Set IsplainText
		newEmail.setIsPlainTextEditable(email.getIsPlainTextEditable());
		// Set Email IsPrivate
		newEmail.setIsPrivate(email.getIsPrivate());
		// Set Email IsTracked
		newEmail.setIsTracked(email.getIsTracked());
		// Set Email PlainText
		newEmail.setPlainText(email.getPlainText());
		// Set Email ReplyToEmail
		newEmail.setReplyToEmail(email.getReplyToEmail());
		// Set Email ReplyToName
		newEmail.setReplyToName(email.getReplyToName());
		// Set Email SenderEmail
		newEmail.setSenderEmail(email.getSenderEmail());
		// Set Email SenderName
		newEmail.setSenderName(email.getSenderName());
		// Set Email EncodingId
		newEmail.setEncodingId(null);
		// Set Email Style
		newEmail.setStyle(email.getStyle());
		// Set Email T ype
		newEmail.setType(email.getType());

		// System.out.println("\nEmail Class HyperLINK:
		// "+newEmail.getHtmlContent());
		// newEmail.setHtmlContent(email.getHtmlContent());

		Email postEmail = restclient.EmailClient().PostEmail(DrestClient, newEmail, srcEmailID);
		// System.out.println("\nEmail Class Post Email" +
		// postEmail.getCreatedBy());

		// System.out.println("Email Was Posted SuccessFully!!! " +
		// postEmail.getId());
		/*
		 * Email email1= new Email();
		 * 
		 * email.setName("My test Email");
		 */
		return postEmail;
	}

}
