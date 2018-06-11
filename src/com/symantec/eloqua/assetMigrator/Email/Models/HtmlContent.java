package com.symantec.eloqua.assetMigrator.Email.Models;

public class HtmlContent {
	private String html;

	private String contentSource;

	private String type;
	private String docType;

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String[] getMetaTags() {
		return metaTags;
	}

	public void setMetaTags(String[] metaTags) {
		this.metaTags = metaTags;
	}

	public String getDocumentDescription() {
		return documentDescription;
	}

	public void setDocumentDescription(String documentDescription) {
		this.documentDescription = documentDescription;
	}

	public String getHtmlBody() {
		return htmlBody;
	}

	public void setHtmlBody(String htmlBody) {
		this.htmlBody = htmlBody;
	}

	public String getCssHeader() {
		return cssHeader;
	}

	public void setCssHeader(String cssHeader) {
		this.cssHeader = cssHeader;
	}

	private String[] metaTags;

	private String documentDescription;

	private String htmlBody;

	private String cssHeader;

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getContentSource() {
		return contentSource;
	}

	public void setContentSource(String contentSource) {
		this.contentSource = contentSource;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [html = " + html + ", contentSource = " + contentSource + ", type = " + type + "]";
	}
}