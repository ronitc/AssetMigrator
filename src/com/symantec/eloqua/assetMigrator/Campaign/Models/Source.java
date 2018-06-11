package com.symantec.eloqua.assetMigrator.Campaign.Models;

public class Source {
	private String updatedAt;

	private String id;

	private String createdBy;

	private String description;

	private String createdAt;

	private String name;

	private String[] permissions;

	private String type;

	private String depth;

	private String updatedBy;

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getPermissions() {
		return permissions;
	}

	public void setPermissions(String[] permissions) {
		this.permissions = permissions;
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

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "ClassPojo [updatedAt = " + updatedAt + ", id = " + id + ", createdBy = " + createdBy
				+ ", description = " + description + ", createdAt = " + createdAt + ", name = " + name
				+ ", permissions = " + permissions + ", type = " + type + ", depth = " + depth + ", updatedBy = "
				+ updatedBy + "]";
	}
}
