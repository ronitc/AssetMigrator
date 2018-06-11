package com.symantec.eloqua.assetMigrator.LandingPage;

import java.util.Iterator;
import java.util.List;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Email.Models.Images;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.ContentSections;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.Files;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.Forms;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.HtmlContent;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.LandingPage;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.Hyperlinks;
public class LandingPageClass {

	
	
	public boolean postLandingPage(BulkAndRestClient restclient, String site,LandingPage landingPage , BulkAndRestClient DrestClient)
	{
		
		List<Hyperlinks> hyperlinkList=landingPage.getHyperlinks();
		List<ContentSections> contentSectionsList=landingPage.getContentSections();
		List<String> permissionsList=landingPage.getPermissions();
		List<Forms> formsList=landingPage.getForms();
		List<Files> filesList=landingPage.getFiles();
		List<String> dynamicContentsList=landingPage.getDynamicContents();
		List<Images> imagesList=landingPage.getImages();
		
		
		Iterator<Images> imageIterator = imagesList.iterator();
	
		

		/*Iterator<Files> filesIterator = filesList.iterator();
		Iterator<String> dynamicContentsIterator = dynamicContentsList.iterator();
		Iterator<ContentSections> contentSectionsIterator = contentSectionsList.iterator();
		
		*/
		
		LandingPage newLandingPage= new LandingPage();
		
		if(landingPage.getHyperlinks().contains(hyperlinkList))
		{
			Iterator<Hyperlinks> hyperlinkIterator = hyperlinkList.iterator();
			while(hyperlinkIterator.hasNext())
			{ 
				Hyperlinks hyperlink=new Hyperlinks();
				hyperlink=(Hyperlinks)hyperlinkIterator.next();
				newLandingPage.setHyperlinks(landingPage.getHyperlinks());
			
			}
		}
		
		if(landingPage.getPermissions().contains(permissionsList))
		{	
			Iterator<String> permissionsIterator = permissionsList.iterator();	
			while(permissionsIterator.hasNext())
		{
			String permissions=new String(); 
			permissions=permissionsIterator.next();
			newLandingPage.setPermissions(landingPage.getPermissions());
			
		}
		
		}
		//if(landingPage.getForms().contains(formsList))
		if(!(landingPage.getForms().isEmpty()))
		{
			Iterator<Forms> formsIterator = formsList.iterator();
				while(formsIterator.hasNext())
			{
					Forms forms=new Forms();
					forms=formsIterator.next();
					newLandingPage.setForms(landingPage.getForms());
			}
		}
	
		
		
		newLandingPage.setName(landingPage.getName());
		newLandingPage.setId(null);
		
		
		HtmlContent html=new HtmlContent();
		html.setHtml(landingPage.getHtmlContent().getHtml());
		html.setType(landingPage.getHtmlContent().getType());
		newLandingPage.setHtmlContent(html);
		
		/*newLandingPage.setHtmlContent.setType(landingPage.getHtmlContent().getType());*/
		
		/*System.out.println("LAnding page Object "+newLandingPage.getName());
		System.out.println("LAnding page Object "+newLandingPage.getHtmlContent());
		System.out.println("LAnding page Object "+newLandingPage.getImages());*/
		
		LandingPage postLandingPage=restclient.LandingPageClient().PostLandingPageInfo(DrestClient, newLandingPage);
		
		System.out.println("CreatedBY "+postLandingPage.getCreatedBy());
		System.out.println("LAnding PAge POSTED SUCCESSFULLY "+postLandingPage.getId());
		
		
		return false;
		
		
	}
	
	
	
}
