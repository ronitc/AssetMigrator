package com.symantec.eloqua.assetMigrator.LandingPage;

import com.symantec.eloqua.assetMigrator.Client;

public class GetLandingPage 
{
private Client _client;
	
	public GetLandingPage(Client client) {
		
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
		
		return response;
	}
	
	}
	
