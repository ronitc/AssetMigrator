
package com.symantec.eloqua.assetMigrator.Email.Models;

import java.util.List;

public class DynamicContents {
	private String updatedAt;

	private String id;

	private String createdBy;

	private String createdAt;

	private String name;

	public String[] permissions = { "Retrieve", "SetSecurity", "Delete", "Update" };

	private DefaultContentSection defaultContentSection;

	private String type;

	private List<Rules> rules;
	public Rules rule;

	public Rules getRule() {
		return rule;
	}

	public void setRule(Rules rule) {
		this.rule = rule;
	}

	public DefaultContentSection getDefaultContentSection() {
		return defaultContentSection;
	}

	public void setDefaultContentSection(DefaultContentSection defaultContentSection) {
		this.defaultContentSection = defaultContentSection;
	}

	public List<Rules> getRules() {
		return rules;
	}

	public void setRules(List<Rules> rules) {
		this.rules = rules;
	}

	private String depth;

	private String updatedBy;

	private String folderId;

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

	/*
	 * public List<DefaultContentSection> getDefaultContentSection() { return
	 * defaultContentSection; }
	 * 
	 * public void setDefaultContentSection(List<DefaultContentSection>
	 * defaultContentSection) { this.defaultContentSection =
	 * defaultContentSection; }
	 */

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * public List<Rules> getRules() { return rules; }
	 * 
	 * public void setRules(List<Rules> rules) { this.rules = rules; }
	 */
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

	public String getFolderId() {
		return folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}

	@Override
	public String toString() {
		return "ClassPojo [updatedAt = " + updatedAt + ", id = " + id + ", createdBy = " + createdBy + ", createdAt = "
				+ createdAt + ", name = " + name + ", permissions = " + permissions + ", defaultContentSection = "
				+ defaultContentSection + ", type = " + type + ", rules = " + rules + ", depth = " + depth
				+ ", updatedBy = " + updatedBy + ", folderId = " + folderId + "]";
	}
}
