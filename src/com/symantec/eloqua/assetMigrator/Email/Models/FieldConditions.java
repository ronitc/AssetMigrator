package com.symantec.eloqua.assetMigrator.Email.Models;

public class FieldConditions {
	private Condition condition;

	private String fieldId;

	private String type;

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [condition = " + condition + ", fieldId = " + fieldId + ", type = " + type + "]";
	}
}
