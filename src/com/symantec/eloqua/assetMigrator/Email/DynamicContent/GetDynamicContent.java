
package com.symantec.eloqua.assetMigrator.Email.DynamicContent;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;

public class GetDynamicContent {

	private Client _client;

	public GetDynamicContent(Client client) {

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
