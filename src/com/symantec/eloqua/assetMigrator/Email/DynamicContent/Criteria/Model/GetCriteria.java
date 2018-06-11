package com.symantec.eloqua.assetMigrator.Email.DynamicContent.Criteria.Model;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.Models.Criteria;

public class GetCriteria {

	private Client _client;

	public GetCriteria(Client client) {

		this._client = client;
	}

	public com.symantec.eloqua.assetMigrator.Response getResponse(String url)

	{
		com.symantec.eloqua.assetMigrator.Response response = _client.get(url);
		return response;

	}

	public Criteria GetCriteriaInfo(Response response4) {
		Criteria criteriaInfo = _client.Gson().fromJson(response4.body, Criteria.class);
		return criteriaInfo;
	}

}
