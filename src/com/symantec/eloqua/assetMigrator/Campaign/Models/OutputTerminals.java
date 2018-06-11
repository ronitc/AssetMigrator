package com.symantec.eloqua.assetMigrator.Campaign.Models;

public class OutputTerminals {

	private String id;

	private String connectedType;

	private String terminalType;

	private String connectedId;

	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConnectedType() {
		return connectedType;
	}

	public void setConnectedType(String connectedType) {
		this.connectedType = connectedType;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getConnectedId() {
		return connectedId;
	}

	public void setConnectedId(String connectedId) {
		this.connectedId = connectedId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", connectedType = " + connectedType + ", terminalType = " + terminalType
				+ ", connectedId = " + connectedId + ", type = " + type + "]";
	}

}
