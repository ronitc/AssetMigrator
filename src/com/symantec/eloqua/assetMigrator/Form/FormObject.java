package com.symantec.eloqua.assetMigrator.Form;



public class FormObject {
private static FormClass formClass=null;
	
	
	

	public static FormClass getFormClassObject() {
		if(formClass==null)
		{
			formClass=new FormClass();
			
		}
		
		return formClass;
	}
	
}
