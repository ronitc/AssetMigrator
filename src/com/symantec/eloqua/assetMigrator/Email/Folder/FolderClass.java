package com.symantec.eloqua.assetMigrator.Email.Folder;

import javax.servlet.ServletException;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;

public class FolderClass {
	
	public boolean createFolder(BulkAndRestClient restClient,String siteName) throws ServletException
	{
		
		
		Folder folder=new Folder();
		folder.setName("TEST_RONIT");
		
		
		
		Folder createFo=restClient.FolderClient().CreateFolder(folder);
		System.out.println("FolderID"+createFo.getId());
		System.out.println("FolderName"+createFo.getName());
		return false;
		
		
	}
	
	
	public boolean getFolder(BulkAndRestClient restClient,String siteName, String ID) throws ServletException
	{
		
		
		Response folderName= restClient.FolderClient().GetFolder(ID);
		
		System.out.println("FOLDER RESPONSE ********************"+ folderName);
		return false;
		
		
	}

}
