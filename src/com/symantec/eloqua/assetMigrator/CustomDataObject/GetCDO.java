package com.symantec.eloqua.assetMigrator.CustomDataObject;

import com.symantec.eloqua.assetMigrator.Client;

public class GetCDO {
	private Client _client;

	public GetCDO(Client client) {

		this._client = client;
	}

	public com.symantec.eloqua.assetMigrator.Response getResponse(String url)

	{
		com.symantec.eloqua.assetMigrator.Response response = _client.get(url);
		return response;

	}

}
