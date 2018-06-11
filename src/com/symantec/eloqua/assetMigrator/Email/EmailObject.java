package com.symantec.eloqua.assetMigrator.Email;

public class EmailObject {

	private static EmailClass emailClass = null;

	public static EmailClass getEmailClassObject() {
		if (emailClass == null) {
			emailClass = new EmailClass();

		}

		return emailClass;
	}

}
