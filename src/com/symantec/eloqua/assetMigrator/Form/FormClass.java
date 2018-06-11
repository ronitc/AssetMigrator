package com.symantec.eloqua.assetMigrator.Form;

import java.util.List;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Form.Models.Elements;
import com.symantec.eloqua.assetMigrator.Form.Models.Form;

public class FormClass {
	
	public boolean postForm(BulkAndRestClient restclient, String site, Form form, BulkAndRestClient DrestClient){
		Form newForm=new Form();
		
		
		newForm.setName(form.getName());
		newForm.setProcessingType(form.getProcessingType());		
		
		List <Elements> elementList=form.getElements();
		
		newForm.setElements(elementList);
		
		Form postForm=restclient.FormClient().PostForm(DrestClient,newForm);
		
		System.out.println("ID OF new Form"+postForm.getId());
		System.out.println("Name Of New Form"+postForm.getCreatedBy());
		System.out.println("\nForm Class Post Form"+form.getCreatedBy());
	return false;
		
	}
}
