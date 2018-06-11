package com.symantec.eloqua.assetMigrator.Campaign.Models;

public class Campaign {

	private String region;

	private String isIncludedInROI;

	private String isEmailMarketingCampaign;

	private String endAt;

	private String type;

	private String updatedBy;

	private String folderId;

	private String id;

	private String createdAt;

	private String name;

	private String[] permissions;

	private String isReadOnly;

	private Elements[] elements;

	private String budgetedCost;

	private String isSyncedWithCRM;

	private String campaignType;

	private String campaignCategory;

	private String actualCost;

	private String isMemberAllowedReEntry;

	private String currentStatus;

	private String depth;

	private String product;

	private String updatedAt;

	private String runAsUserId;

	private String createdBy;

	private String startAt;

	private String crmId;

	private FieldValues[] fieldValues;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getIsIncludedInROI() {
		return isIncludedInROI;
	}

	public void setIsIncludedInROI(String isIncludedInROI) {
		this.isIncludedInROI = isIncludedInROI;
	}

	public String getIsEmailMarketingCampaign() {
		return isEmailMarketingCampaign;
	}

	public void setIsEmailMarketingCampaign(String isEmailMarketingCampaign) {
		this.isEmailMarketingCampaign = isEmailMarketingCampaign;
	}

	public String getEndAt() {
		return endAt;
	}

	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getIsReadOnly() {
		return isReadOnly;
	}

	public void setIsReadOnly(String isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	public Elements[] getElements() {
		return elements;
	}

	public void setElements(Elements[] elements) {
		this.elements = elements;
	}

	public String getBudgetedCost() {
		return budgetedCost;
	}

	public void setBudgetedCost(String budgetedCost) {
		this.budgetedCost = budgetedCost;
	}

	public String getIsSyncedWithCRM() {
		return isSyncedWithCRM;
	}

	public void setIsSyncedWithCRM(String isSyncedWithCRM) {
		this.isSyncedWithCRM = isSyncedWithCRM;
	}

	public String getCampaignType() {
		return campaignType;
	}

	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

	public String getCampaignCategory() {
		return campaignCategory;
	}

	public void setCampaignCategory(String campaignCategory) {
		this.campaignCategory = campaignCategory;
	}

	public String getActualCost() {
		return actualCost;
	}

	public void setActualCost(String actualCost) {
		this.actualCost = actualCost;
	}

	public String getIsMemberAllowedReEntry() {
		return isMemberAllowedReEntry;
	}

	public void setIsMemberAllowedReEntry(String isMemberAllowedReEntry) {
		this.isMemberAllowedReEntry = isMemberAllowedReEntry;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getRunAsUserId() {
		return runAsUserId;
	}

	public void setRunAsUserId(String runAsUserId) {
		this.runAsUserId = runAsUserId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getStartAt() {
		return startAt;
	}

	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}

	public String getCrmId() {
		return crmId;
	}

	public void setCrmId(String crmId) {
		this.crmId = crmId;
	}

	public FieldValues[] getFieldValues() {
		return fieldValues;
	}

	public void setFieldValues(FieldValues[] fieldValues) {
		this.fieldValues = fieldValues;
	}

	@Override
	public String toString() {
		return "ClassPojo [region = " + region + ", isIncludedInROI = " + isIncludedInROI
				+ ", isEmailMarketingCampaign = " + isEmailMarketingCampaign + ", endAt = " + endAt + ", type = " + type
				+ ", updatedBy = " + updatedBy + ", folderId = " + folderId + ", id = " + id + ", createdAt = "
				+ createdAt + ", name = " + name + ", permissions = " + permissions + ", isReadOnly = " + isReadOnly
				+ ", elements = " + elements + ", budgetedCost = " + budgetedCost + ", isSyncedWithCRM = "
				+ isSyncedWithCRM + ", campaignType = " + campaignType + ", campaignCategory = " + campaignCategory
				+ ", actualCost = " + actualCost + ", isMemberAllowedReEntry = " + isMemberAllowedReEntry
				+ ", currentStatus = " + currentStatus + ", depth = " + depth + ", product = " + product
				+ ", updatedAt = " + updatedAt + ", runAsUserId = " + runAsUserId + ", createdBy = " + createdBy
				+ ", startAt = " + startAt + ", crmId = " + crmId + ", fieldValues = " + fieldValues + "]";
	}

}
