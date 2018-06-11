package com.symantec.eloqua.assetMigrator.CustomDataObject;

public class Fields {
	private String id;

	private String internalName;

	private String dataType;

	private String displayType;

	private String name;

	private String defaultValue;

	private String type;

	private String depth;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInternalName() {
		return internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", internalName = " + internalName + ", dataType = " + dataType
				+ ", displayType = " + displayType + ", name = " + name + ", defaultValue = " + defaultValue
				+ ", type = " + type + ", depth = " + depth + "]";
	}
}
