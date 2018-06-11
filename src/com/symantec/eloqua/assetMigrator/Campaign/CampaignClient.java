package com.symantec.eloqua.assetMigrator.Campaign;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Campaign.Models.Campaign;

public class CampaignClient {

	private Client _client;

	public CampaignClient(Client client) {

		_client = client;
	}

	public Campaign GetCampaignInfo(Response campaign) {
		// com.symantec.eloqua.assetMigrator.Response response =
		// _client.post("/assets/email/304?depth=complete",
		// _client.Gson().toJson(email));
		Campaign upCampaign = _client.Gson().fromJson(campaign.body, Campaign.class);

		System.out.println("upCampaign   :" + upCampaign.getDepth());

		System.out.println("upCampaign Info:" + upCampaign.getCreatedBy());
		return upCampaign;
	}

	public Campaign PostCampaign(BulkAndRestClient DrestClient, Campaign campaign) {

		GetCampaign obj = new GetCampaign(DrestClient);

		Response response = obj.postResponse("/assets/campaign", _client.Gson().toJson(campaign));

		return campaign;
	}

}
