package com.symantec.eloqua.assetMigrator.Contact;

import com.symantec.eloqua.assetMigrator.Client;

public class GetContactFields {

	private Client _client;

	public GetContactFields(Client client) {

		this._client = client;
	}

	public com.symantec.eloqua.assetMigrator.Response getResponse(String url)

	{
		com.symantec.eloqua.assetMigrator.Response response = _client.get(url);
		return response;

	}

}
