package com.symantec.eloqua.assetMigrator.Email.FieldMerges;

public class FieldMergeObject {
	private static FieldMergesClass fieldMergesClass = null;

	public static FieldMergesClass getFieldMergesClassObject() {
		if (fieldMergesClass == null) {
			fieldMergesClass = new FieldMergesClass();
		}

		return fieldMergesClass;
	}

}
