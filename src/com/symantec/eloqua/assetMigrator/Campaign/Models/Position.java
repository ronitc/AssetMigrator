package com.symantec.eloqua.assetMigrator.Campaign.Models;

public class Position {

	private String type;

	private String y;

	private String x;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "ClassPojo [type = " + type + ", y = " + y + ", x = " + x + "]";
	}

}
