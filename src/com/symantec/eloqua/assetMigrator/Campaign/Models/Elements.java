package com.symantec.eloqua.assetMigrator.Campaign.Models;

public class Elements {

	private Position position;

	private OutputTerminals[] outputTerminals;

	private String id;

	private Schedule schedule;

	private String emailId;

	private String isAllowingResend;

	private String name;

	private String isAllowingSentToMasterExclude;

	private String sendTimePeriod;

	private String type;

	private String isAllowingSentToUnsubscribe;

	private String includeListUnsubscribeHeader;

	private String memberCount;

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public OutputTerminals[] getOutputTerminals() {
		return outputTerminals;
	}

	public void setOutputTerminals(OutputTerminals[] outputTerminals) {
		this.outputTerminals = outputTerminals;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getIsAllowingResend() {
		return isAllowingResend;
	}

	public void setIsAllowingResend(String isAllowingResend) {
		this.isAllowingResend = isAllowingResend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsAllowingSentToMasterExclude() {
		return isAllowingSentToMasterExclude;
	}

	public void setIsAllowingSentToMasterExclude(String isAllowingSentToMasterExclude) {
		this.isAllowingSentToMasterExclude = isAllowingSentToMasterExclude;
	}

	public String getSendTimePeriod() {
		return sendTimePeriod;
	}

	public void setSendTimePeriod(String sendTimePeriod) {
		this.sendTimePeriod = sendTimePeriod;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIsAllowingSentToUnsubscribe() {
		return isAllowingSentToUnsubscribe;
	}

	public void setIsAllowingSentToUnsubscribe(String isAllowingSentToUnsubscribe) {
		this.isAllowingSentToUnsubscribe = isAllowingSentToUnsubscribe;
	}

	public String getIncludeListUnsubscribeHeader() {
		return includeListUnsubscribeHeader;
	}

	public void setIncludeListUnsubscribeHeader(String includeListUnsubscribeHeader) {
		this.includeListUnsubscribeHeader = includeListUnsubscribeHeader;
	}

	public String getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(String memberCount) {
		this.memberCount = memberCount;
	}

	@Override
	public String toString() {
		return "ClassPojo [position = " + position + ", outputTerminals = " + outputTerminals + ", id = " + id
				+ ", schedule = " + schedule + ", emailId = " + emailId + ", isAllowingResend = " + isAllowingResend
				+ ", name = " + name + ", isAllowingSentToMasterExclude = " + isAllowingSentToMasterExclude
				+ ", sendTimePeriod = " + sendTimePeriod + ", type = " + type + ", isAllowingSentToUnsubscribe = "
				+ isAllowingSentToUnsubscribe + ", includeListUnsubscribeHeader = " + includeListUnsubscribeHeader
				+ ", memberCount = " + memberCount + "]";
	}
}
