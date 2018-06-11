package com.symantec.eloqua.assetMigrator.user;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;

public class GetUser {
	private Client _client;
	
	
		
		
		public GetUser(Client client) {
			
			this._client = client;
		}

	
	
		public com.symantec.eloqua.assetMigrator.Response getResponse(String url)
		
		{
			com.symantec.eloqua.assetMigrator.Response response=_client.get(url);
			return response; 	                                                                      
			
		}


public User GetUserInfo(Response user)
{
	User userinfo=_client.Gson().fromJson(user.body, User.class);
	return userinfo;
}

}
