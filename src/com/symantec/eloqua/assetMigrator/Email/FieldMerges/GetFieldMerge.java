package com.symantec.eloqua.assetMigrator.Email.FieldMerges;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;

public class GetFieldMerge {

	private Client _client;

	public GetFieldMerge(Client client) {

		this._client = client;
	}

	public Response getResponse(String url) {

		Response response = _client.get(url);
		return response;

	}

	public Response postResponse(String url, String body) {
		Response response = _client.post(url, body);
		System.out.println("REQUESTURL" + url);
		System.out.println("REQUESTBODY" + body);

		return response;
	}

}
