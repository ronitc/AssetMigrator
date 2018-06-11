package com.symantec.eloqua.assetMigrator.Contact;

public class Elements {
	private String internalName;

	private String isProtected;

	private String type;

	private String updateType;

	private String depth;

	private String id;

	private String updatedAt;

	private String dataType;

	private String isRequired;

	private String createdAt;

	private String displayType;

	private String isPopulatedInOutlookPlugin;

	private String name;

	private String isReadOnly;

	private String isAccountLinkageField;

	private String isCaseSensitive;

	private String isStandard;

	public String getInternalName() {
		return internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public String getIsProtected() {
		return isProtected;
	}

	public void setIsProtected(String isProtected) {
		this.isProtected = isProtected;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(String isRequired) {
		this.isRequired = isRequired;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getIsPopulatedInOutlookPlugin() {
		return isPopulatedInOutlookPlugin;
	}

	public void setIsPopulatedInOutlookPlugin(String isPopulatedInOutlookPlugin) {
		this.isPopulatedInOutlookPlugin = isPopulatedInOutlookPlugin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsReadOnly() {
		return isReadOnly;
	}

	public void setIsReadOnly(String isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	public String getIsAccountLinkageField() {
		return isAccountLinkageField;
	}

	public void setIsAccountLinkageField(String isAccountLinkageField) {
		this.isAccountLinkageField = isAccountLinkageField;
	}

	public String getIsCaseSensitive() {
		return isCaseSensitive;
	}

	public void setIsCaseSensitive(String isCaseSensitive) {
		this.isCaseSensitive = isCaseSensitive;
	}

	public String getIsStandard() {
		return isStandard;
	}

	public void setIsStandard(String isStandard) {
		this.isStandard = isStandard;
	}

	@Override
	public String toString() {
		return "ClassPojo [internalName = " + internalName + ", isProtected = " + isProtected + ", type = " + type
				+ ", updateType = " + updateType + ", depth = " + depth + ", id = " + id + ", updatedAt = " + updatedAt
				+ ", dataType = " + dataType + ", isRequired = " + isRequired + ", createdAt = " + createdAt
				+ ", displayType = " + displayType + ", isPopulatedInOutlookPlugin = " + isPopulatedInOutlookPlugin
				+ ", name = " + name + ", isReadOnly = " + isReadOnly + ", isAccountLinkageField = "
				+ isAccountLinkageField + ", isCaseSensitive = " + isCaseSensitive + ", isStandard = " + isStandard
				+ "]";
	}
}