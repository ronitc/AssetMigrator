package com.symantec.eloqua.assetMigrator.Campaign.Models;

public class FieldValues {
	private String id;

	private String value;

	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", value = " + value + ", type = " + type + "]";
	}

}
