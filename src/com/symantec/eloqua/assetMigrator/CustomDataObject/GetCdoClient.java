package com.symantec.eloqua.assetMigrator.CustomDataObject;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;

public class GetCdoClient {
	private Client _client;

	public GetCdoClient(Client client) {

		_client = client;
	}

	public CDO GetCdoInfo(Response cdo) {
		CDO cdoData = _client.Gson().fromJson(cdo.body, CDO.class);
		return cdoData;
	}

	public CustomObject GetCustomObjectInfo(Response customObject) {
		CustomObject customObjectData = _client.Gson().fromJson(customObject.body, CustomObject.class);
		return customObjectData;
	}

	public CdoField GetCustomObjectFieldInfo(Response srcCdoField) {
		CdoField customObjectData = _client.Gson().fromJson(srcCdoField.body, CdoField.class);
		return customObjectData;
	}

	public DestCDOField GetCdoDestFieldInfo(Response destCdoFieldResposne) {

		DestCDOField destCdoFieldInfo = _client.Gson().fromJson(destCdoFieldResposne.body, DestCDOField.class);
		return destCdoFieldInfo;
	}
}
