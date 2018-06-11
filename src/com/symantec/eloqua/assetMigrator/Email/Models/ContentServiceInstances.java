package com.symantec.eloqua.assetMigrator.Email.Models;

public class ContentServiceInstances {
	private String id;

	private String appStatus;

	private String configurationUrlModalSize;

	private String configurationUrl;

	private String requiresConfiguration;

	private String enabledConfigStatus;

	private String type;

	private String editorImageUrl;

	private String componentId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getConfigurationUrlModalSize() {
		return configurationUrlModalSize;
	}

	public void setConfigurationUrlModalSize(String configurationUrlModalSize) {
		this.configurationUrlModalSize = configurationUrlModalSize;
	}

	public String getConfigurationUrl() {
		return configurationUrl;
	}

	public void setConfigurationUrl(String configurationUrl) {
		this.configurationUrl = configurationUrl;
	}

	public String getRequiresConfiguration() {
		return requiresConfiguration;
	}

	public void setRequiresConfiguration(String requiresConfiguration) {
		this.requiresConfiguration = requiresConfiguration;
	}

	public String getEnabledConfigStatus() {
		return enabledConfigStatus;
	}

	public void setEnabledConfigStatus(String enabledConfigStatus) {
		this.enabledConfigStatus = enabledConfigStatus;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEditorImageUrl() {
		return editorImageUrl;
	}

	public void setEditorImageUrl(String editorImageUrl) {
		this.editorImageUrl = editorImageUrl;
	}

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", appStatus = " + appStatus + ", configurationUrlModalSize = "
				+ configurationUrlModalSize + ", configurationUrl = " + configurationUrl + ", requiresConfiguration = "
				+ requiresConfiguration + ", enabledConfigStatus = " + enabledConfigStatus + ", type = " + type
				+ ", editorImageUrl = " + editorImageUrl + ", componentId = " + componentId + "]";
	}
}