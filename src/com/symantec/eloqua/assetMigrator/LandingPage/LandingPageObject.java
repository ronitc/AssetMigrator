package com.symantec.eloqua.assetMigrator.LandingPage;

public class LandingPageObject {
	
	
	private static LandingPageClass landingPageClass=null;
	
	
	public static LandingPageClass getLandingPageClassObject()
	{
		
		if(landingPageClass==null)
		{
			landingPageClass=new LandingPageClass();
		}
		return landingPageClass;
	}	
}