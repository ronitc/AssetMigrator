package com.symantec.eloqua.assetMigrator.Email.Images;

public class ImageObject {
	
	
	
	private static ImageClass imageClass=null;
	
	public static ImageClass getImageClassObject()
	{
		if (imageClass==null)
		{
			imageClass=new ImageClass();
		}
		return imageClass;
	}

}
