package com.symantec.eloqua.assetMigrator.Email.Folder;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;

public class GetFolder {
private Client _client;
	
	/*public GetFolder(Client client) {
		
		this._client = client;
	}*/
	
	
	
	public GetFolder(BulkAndRestClient restClient) {
		
		this._client = restClient;
		// TODO Auto-generated constructor stub
	}

	public com.symantec.eloqua.assetMigrator.Response get(String url)
	{
		
		com.symantec.eloqua.assetMigrator.Response response=_client.get(url);
		
		return response;
	}


	public com.symantec.eloqua.assetMigrator.Response post(String url, String body)
	{
		
		com.symantec.eloqua.assetMigrator.Response response=_client.post(url, body);
		
		return response;
	}


}
