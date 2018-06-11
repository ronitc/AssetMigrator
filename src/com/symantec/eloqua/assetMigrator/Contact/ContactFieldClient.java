package com.symantec.eloqua.assetMigrator.Contact;

import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;

public class ContactFieldClient {

	private Client _client;

	public ContactFieldClient(Client client) {

		_client = client;
	}

	public Contact GetContactFieldInfo(Response contactField) {
		Contact upcontactField = _client.Gson().fromJson(contactField.body, Contact.class);
		return upcontactField;
	}

	public ContactField GetContactField(Response contactField) {
		ContactField upcontactField = _client.Gson().fromJson(contactField.body, ContactField.class);
		return upcontactField;
	}
}
