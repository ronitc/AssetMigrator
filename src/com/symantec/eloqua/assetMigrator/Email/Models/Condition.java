package com.symantec.eloqua.assetMigrator.Email.Models;

public class Condition {
	public String value;

	public String type;

	public String operator;

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

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "ClassPojo [value = " + value + ", type = " + type + ", operator = " + operator + "]";
	}

}