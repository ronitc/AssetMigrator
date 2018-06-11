package com.symantec.eloqua.assetMigrator.Email.FieldMerges;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.Models.FieldMerges;

public class FieldMergeClient {
	private Client _client;

	public FieldMergeClient(Client client) {

		this._client = client;
	}

	public FieldMerges GetFieldMerge(Response dynamicContent) {

		FieldMerges upFieldMerges = _client.Gson().fromJson(dynamicContent.body, FieldMerges.class);
		return upFieldMerges;

	}

	public FieldMerges PostFieldMerge(BulkAndRestClient DrestClient, FieldMerges fieldMerge, String srcDynamicContentID,
			String instanceName) {

		GetFieldMerge obj = new GetFieldMerge(DrestClient);

		Response response = obj.postResponse("assets/fieldMerge", _client.Gson().toJson(fieldMerge));
		System.out.println("\n=++++===+++++=Field Merge body " + response.body);
		System.out.println("\n=++++===+++++=Field Merge Status code " + response.statusCode);

		return fieldMerge;

	}

	public SearchFieldMergeResult GetFieldMergeInfo(Response dynamicContent) {

		SearchFieldMergeResult searchFieldMergeResult = _client.Gson().fromJson(dynamicContent.body,
				SearchFieldMergeResult.class);
		return searchFieldMergeResult;

	}
}
