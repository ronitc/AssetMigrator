package com.symantec.eloqua.assetMigrator.Email.Models;

import java.util.List;

public class Criteria {
	public String id;

	public Condition condition;
	public String customObjectId;

	public String getCustomObjectId() {
		return customObjectId;
	}

	public void setCustomObjectId(String customObjectId) {
		this.customObjectId = customObjectId;
	}

	public List<FieldConditions> getFieldConditions() {
		return fieldConditions;
	}

	public void setFieldConditions(List<FieldConditions> fieldConditions) {
		this.fieldConditions = fieldConditions;
	}

	public List<FieldConditions> fieldConditions;

	public String fieldId;

	public String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
		return "ClassPojo [id = " + id + ", condition = " + condition + ", fieldId = " + fieldId + ", type = " + type
				+ "]";
	}
}
