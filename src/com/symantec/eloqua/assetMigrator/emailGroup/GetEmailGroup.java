package com.symantec.eloqua.assetMigrator.emailGroup;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;

public class GetEmailGroup {
	private Client _client;

	public GetEmailGroup(Client client) {

		this._client = client;
	}

	public com.symantec.eloqua.assetMigrator.Response getResponse(String url)

	{
		com.symantec.eloqua.assetMigrator.Response response = _client.get(url);
		return response;

	}

	public EmailGroup GetEmailGroupInfo(Response response5) {
		EmailGroup emailGroup = _client.Gson().fromJson(response5.body, EmailGroup.class);
		return emailGroup;
	}

	public EmailGroupList GetEmailGroupListInfo(Response response5) {
		EmailGroupList emailGroupList = _client.Gson().fromJson(response5.body, EmailGroupList.class);
		return emailGroupList;
	}

}
