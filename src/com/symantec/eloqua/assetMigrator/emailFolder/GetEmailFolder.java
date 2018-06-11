package com.symantec.eloqua.assetMigrator.emailFolder;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.user.User;

public class GetEmailFolder {
	private Client _client;
	
	public GetEmailFolder(Client client) {
		
		this._client = client;
	}



	public com.symantec.eloqua.assetMigrator.Response getResponse(String url)
	
	{
		com.symantec.eloqua.assetMigrator.Response response=_client.get(url);
		return response; 	                                                                      
		
	}





public EmailFolder GetEmailFolderInfo(Response response4) {
	EmailFolder emailFolder=_client.Gson().fromJson(response4.body, EmailFolder.class);
	return emailFolder;
}

}
