package com.symantec.eloqua.assetMigrator.Email.Images;

import java.io.FileNotFoundException;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Email.Models.Images;

public class GetImage {
	
	
	
	
	private Client _client;
	
	
	
	public GetImage(Client client)
	{
		
		this._client=client;
	}
   public com.symantec.eloqua.assetMigrator.Response getResponse(String url)
	
	{
		com.symantec.eloqua.assetMigrator.Response response=_client.get(url);
		return response; 	                                                                      
		
	}
	
	public com.symantec.eloqua.assetMigrator.Response postResponse(String url, Images img) throws FileNotFoundException
	{
		
		//System.out.println("Request BODY FOR AN IMG "+body);
		
		com.symantec.eloqua.assetMigrator.Response response=_client.imagePost(url, img);
	
		
		return response;
	}
	
	
	
	

}
