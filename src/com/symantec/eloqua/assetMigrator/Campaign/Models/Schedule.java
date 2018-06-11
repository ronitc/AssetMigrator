package com.symantec.eloqua.assetMigrator.Campaign.Models;

public class Schedule {

	private String displayTimeZoneId;

	private String type;

	private Elements[] elements;

	public String getDisplayTimeZoneId() {
		return displayTimeZoneId;
	}

	public void setDisplayTimeZoneId(String displayTimeZoneId) {
		this.displayTimeZoneId = displayTimeZoneId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Elements[] getElements() {
		return elements;
	}

	public void setElements(Elements[] elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return "ClassPojo [displayTimeZoneId = " + displayTimeZoneId + ", type = " + type + ", elements = " + elements
				+ "]";
	}

}
