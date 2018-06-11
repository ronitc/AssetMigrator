package com.symantec.eloqua.assetMigrator.LandingPage;

import java.util.Collection;

import com.google.gson.reflect.TypeToken;
//import com.sun.org.apache.bcel.internal.generic.Type;
import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.Models.Email;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.LandingPage;

import java.lang.reflect.Type;
import java.lang.reflect.Type.*;
public class LandingPageClient {

	
	private Client _client;
	
	public LandingPageClient(Client client)
	{
		_client=client;
	}
	
	public LandingPage GetLandingPageInfo(Response landingPage)
	{
		
		
		
		//Type collectionType = (Type) new TypeToken<Collection<LandingPage>>(){}.getType();
		System.out.println(landingPage.body);
		//Collection<LandingPage> uplandingPage =(Collection<LandingPage>) _client.Gson().fromJson(landingPage.body,LandingPage.class);
		
		LandingPage uplandingPage=_client.Gson().fromJson(landingPage.body,LandingPage.class);
		
		
		return (LandingPage) uplandingPage;
		
	}
	public LandingPage PostLandingPageInfo(BulkAndRestClient DrestClient, LandingPage landingPage)
	{
		
		GetLandingPage obj=new GetLandingPage(DrestClient);
		
		Response response =obj.postResponse("/assets/landingPage",_client.Gson().toJson(landingPage));
		
		System.out.println("posting response LPClient Class response statusCode"+response.statusCode);
		return landingPage;
		
		
	}
	
}
