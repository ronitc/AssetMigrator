package com.symantec.eloqua.assetMigrator.Email.Models;

import java.util.List;

public class Rules {
	public String statement;

	public String id;

	public List<Criteria> criteria;

	public List<Criteria> getCriteria() {
		return criteria;
	}

	public void setCriteria(List<Criteria> criteria) {
		this.criteria = criteria;
	}

	public ContentSection getContentSection() {
		return contentSection;
	}

	public void setContentSection(ContentSection contentSection) {
		this.contentSection = contentSection;
	}

	public ContentSection contentSection;

	public String type;

	public String depth;

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/*
	 * public Criteria[] getCriteria() { return criteria; }
	 * 
	 * public void setCriteria(Criteria[] criteria) { this.criteria = criteria;
	 * }
	 */
	/*
	 * public ContentSection getContentSection() { return contentSection; }
	 * 
	 * public void setContentSection(ContentSection contentSection) {
	 * this.contentSection = contentSection; }
	 */

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
		return "ClassPojo [statement = " + statement + ", id = " + id + ", criteria = " + criteria
				+ ", contentSection = " + contentSection + ", type = " + type + ", depth = " + depth + "]";
	}
}