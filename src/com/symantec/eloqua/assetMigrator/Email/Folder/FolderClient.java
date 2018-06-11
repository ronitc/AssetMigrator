package com.symantec.eloqua.assetMigrator.Email.Folder;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Models.login.AccountInfo;

public class FolderClient {
	private Client _client;

	public FolderClient(Client client) {

		_client = client;
	}

	AccountInfo info2 = BulkAndRestClient.GetAccountInfo("SymantecSandbox1", "Ronit.chougule", "Ronit@kdym1");

	// for replacing {version} in bulk url with 1.0
	String bulkPrevUrl = info2.urls.apis.rest.bulk;
	// xString bulkUpdatedUrl = bulkPrevUrl.replace("{version}", "1.0");

	// creating client object which can be used to access contacts through Bulk
	// api
	// BulkAndRestClient bulkClient = new
	// BulkAndRestClient("SymantecSandbox1","Ronit.chougule","Ronit@271213",
	// bulkUpdatedUrl);

	// for replacing {version} in rest url with 2.0
	String restPrevUrl = info2.urls.apis.rest.standard;
	String restUpdatedUrl = restPrevUrl.replace("{version}", "2.0");

	BulkAndRestClient restClient = new BulkAndRestClient("SymantecSandbox1", "Ronit.chougule", "Ronit@kdym1",
			restUpdatedUrl);

	// System.out.println("@@@@@@@@@@@@@ REST CLIENT:"+restClient+"\n");

	GetFolder obj = new GetFolder(restClient);

	public Folder CreateFolder(Folder folder) {
		Response response = obj.post("assets/email/folder", _client.Gson().toJson(folder));

		System.out.println("@@@@@@@@@@@Status Code :" + response.statusCode);

		return folder;
	}

	public Response GetFolder(String ID) {

		Response response = obj.get("assets/email/folder/ID");
		return response;
	}

}
