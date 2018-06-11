package com.symantec.eloqua.assetMigrator;

import com.symantec.eloqua.assetMigrator.BaseClient;

public class Client extends BaseClient {
	public Client(String site, String user, String password, String url) {
		super(site, user, password, url);
	}

	public com.google.gson.Gson Gson() {
		if (gson == null) {
			gson = new com.google.gson.Gson();
		}
		
		System.out.println("gson"+gson);
		return gson;
	}
	private com.google.gson.Gson gson;
}
