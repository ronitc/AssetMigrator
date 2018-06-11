package com.symantec.eloqua.assetMigrator.Form;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.GetEmail;
import com.symantec.eloqua.assetMigrator.Email.Models.Email;
import com.symantec.eloqua.assetMigrator.Form.Models.Form;

public class FormClient {
private Client _client;
	
	public FormClient(Client client)
	{
		
		_client = client;
	}
	
	public Form GetFormInfo(Response form) 
	{
		//com.symantec.eloqua.assetMigrator.Response response = _client.post("/assets/email/304?depth=complete", _client.Gson().toJson(email));
		Form upForm = _client.Gson().fromJson(form.body, Form.class);		

		System.out.println("upForm   :"+upForm.getDepth());
		
		System.out.println("Form Info:"+ upForm.getCreatedBy() );
		return upForm;
	}
	
	public Form PostForm(BulkAndRestClient DrestClient, Form form)
	{
		
		
		GetForm obj=new GetForm(DrestClient);
		
		Response response=obj.postResponse("/assets/form",_client.Gson().toJson(form));
		
		
		return form;
	}
	
}
