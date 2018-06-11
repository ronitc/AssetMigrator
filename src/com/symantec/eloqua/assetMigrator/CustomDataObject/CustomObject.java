package com.symantec.eloqua.assetMigrator.CustomDataObject;

import java.util.List;

public class CustomObject {
	private String recordCount;

	private String type;

	private String depth;

	private String folderId;

	private String updatedBy;

	private String id;

	private String updatedAt;

	private String createdBy;

	private String createdAt;

	private String description;

	private String name;

	private String displayNameFieldId;

	private String uniqueCodeFieldId;

	private String emailAddressFieldId;

	private List<Fields> fields;

	public String getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
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

	public String getFolderId() {
		return folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayNameFieldId() {
		return displayNameFieldId;
	}

	public void setDisplayNameFieldId(String displayNameFieldId) {
		this.displayNameFieldId = displayNameFieldId;
	}

	public String getUniqueCodeFieldId() {
		return uniqueCodeFieldId;
	}

	public void setUniqueCodeFieldId(String uniqueCodeFieldId) {
		this.uniqueCodeFieldId = uniqueCodeFieldId;
	}

	public String getEmailAddressFieldId() {
		return emailAddressFieldId;
	}

	public void setEmailAddressFieldId(String emailAddressFieldId) {
		this.emailAddressFieldId = emailAddressFieldId;
	}

	public List<Fields> getFields() {
		return fields;
	}

	public void setFields(List<Fields> fields) {
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "ClassPojo [recordCount = " + recordCount + ", type = " + type + ", depth = " + depth + ", folderId = "
				+ folderId + ", updatedBy = " + updatedBy + ", id = " + id + ", updatedAt = " + updatedAt
				+ ", createdBy = " + createdBy + ", createdAt = " + createdAt + ", description = " + description
				+ ", name = " + name + ", displayNameFieldId = " + displayNameFieldId + ", uniqueCodeFieldId = "
				+ uniqueCodeFieldId + ", emailAddressFieldId = " + emailAddressFieldId + ", fields = " + fields + "]";
	}
}
