package com.symantec.eloqua.assetMigrator.Email;



import com.symantec.eloqua.assetMigrator.Client;
//import com.symantec.eloqua.assetMigrator.Email.Models.Email;

public class GetEmail {
	
	private Client _client;
	
	public GetEmail(Client client) {
		
		this._client = client;
	}

	
	
	public com.symantec.eloqua.assetMigrator.Response getResponse(String url)
	
	{
		com.symantec.eloqua.assetMigrator.Response response=_client.get(url);
		return response; 	                                                                      
		
	}
	
	public com.symantec.eloqua.assetMigrator.Response postResponse(String url, String body)
	{
		
		com.symantec.eloqua.assetMigrator.Response response=_client.post(url, body);
		System.out.println("GetEmail CLASS RESPOSNE BODY :"+ response.body);
		return response;
	}
	
	}
	


