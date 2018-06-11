package com.symantec.eloqua.assetMigrator.Email.DynamicContent;

public class DynamicContentObject {

	private static DynamicContentClass dynamicContentClass = null;

	public static DynamicContentClass getDynamicContentClassObject() {
		if (dynamicContentClass == null) {
			dynamicContentClass = new DynamicContentClass();
		}

		return dynamicContentClass;
	}

}
