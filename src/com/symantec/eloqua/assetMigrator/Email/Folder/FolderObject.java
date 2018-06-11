package com.symantec.eloqua.assetMigrator.Email.Folder;

public class FolderObject {

	private static FolderClass folderclass=null;
	
	
	
	public static FolderClass getFolderClassobject()
	{
		
		if(folderclass==null)
		{
			folderclass=new FolderClass();
		}
		return folderclass;
		
		
	}
	
}
