package com.symantec.eloqua.assetMigrator.CustomDataObject;

public class Items {
	private String statement;

	private String dataType;

	private String internalName;

	private String hasReadOnlyConstraint;

	private String name;

	private String hasUniquenessConstraint;

	private String uri;

	private String hasNotNullConstraint;

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getInternalName() {
		return internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public String getHasReadOnlyConstraint() {
		return hasReadOnlyConstraint;
	}

	public void setHasReadOnlyConstraint(String hasReadOnlyConstraint) {
		this.hasReadOnlyConstraint = hasReadOnlyConstraint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHasUniquenessConstraint() {
		return hasUniquenessConstraint;
	}

	public void setHasUniquenessConstraint(String hasUniquenessConstraint) {
		this.hasUniquenessConstraint = hasUniquenessConstraint;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getHasNotNullConstraint() {
		return hasNotNullConstraint;
	}

	public void setHasNotNullConstraint(String hasNotNullConstraint) {
		this.hasNotNullConstraint = hasNotNullConstraint;
	}

	@Override
	public String toString() {
		return "ClassPojo [statement = " + statement + ", dataType = " + dataType + ", internalName = " + internalName
				+ ", hasReadOnlyConstraint = " + hasReadOnlyConstraint + ", name = " + name
				+ ", hasUniquenessConstraint = " + hasUniquenessConstraint + ", uri = " + uri
				+ ", hasNotNullConstraint = " + hasNotNullConstraint + "]";
	}
}
