package com.symantec.eloqua.assetMigrator.Email.Models;

import java.util.List;

import com.symantec.eloqua.assetMigrator.Form.Models.Form;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.ContentSections;

public class Email {
	private String sendPlainTextOnly;

	private String emailFooterId;

	private String isPlainTextEditable;

	private String subject;

	private String type;

	private Hyperlinks[] hyperlinks;

	private String updatedBy;

	private String folderId;

	private HtmlContent htmlContent;

	private String id;

	private List<ContentSections> contentSections;

	private String style;

	private String isPrivate;

	private String replyToName;

	private String renderMode;

	private String createdAt;

	private String layout;

	private String name;

	private List<FieldMerges> fieldMerges;

	public String[] permissions = { "Retrieve", "SetSecurity", "Delete", "Update" };

	private String emailGroupId;

	private String emailHeaderId;

	private String senderEmail;

	private List<Form> forms;

	private List<DynamicContents> dynamicContents;

	private String isTracked;

	private String currentStatus;

	private String depth;

	private String updatedAt;

	private String senderName;

	private String createdBy;

	private String bounceBackEmail;

	private List<Images> images;

	private String archive;

	private String replyToEmail;

	private String plainText;

	private String isContentProtected;

	private String encodingId;
	private ContentServiceInstances[] contentServiceInstances;

	public String getSendPlainTextOnly() {
		return sendPlainTextOnly;
	}

	public void setSendPlainTextOnly(String sendPlainTextOnly) {
		this.sendPlainTextOnly = sendPlainTextOnly;
	}

	public String getEmailFooterId() {
		return emailFooterId;
	}

	public void setEmailFooterId(String emailFooterId) {
		this.emailFooterId = emailFooterId;
	}

	public String getIsPlainTextEditable() {
		return isPlainTextEditable;
	}

	public void setIsPlainTextEditable(String isPlainTextEditable) {
		this.isPlainTextEditable = isPlainTextEditable;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Hyperlinks[] getHyperlinks() {
		return hyperlinks;
	}

	public void setHyperlinks(Hyperlinks[] hyperlinks) {
		this.hyperlinks = hyperlinks;
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

	public HtmlContent getHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(HtmlContent htmlContent) {
		this.htmlContent = htmlContent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ContentSections> getContentSections() {
		return contentSections;
	}

	public void setContentSections(List<ContentSections> contentSections) {
		this.contentSections = contentSections;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(String isPrivate) {
		this.isPrivate = isPrivate;
	}

	public String getReplyToName() {
		return replyToName;
	}

	public void setReplyToName(String replyToName) {
		this.replyToName = replyToName;
	}

	public String getRenderMode() {
		return renderMode;
	}

	public void setRenderMode(String renderMode) {
		this.renderMode = renderMode;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FieldMerges> getFieldMerges() {
		return fieldMerges;
	}

	public void setFieldMerges(List<FieldMerges> fieldMerges) {
		this.fieldMerges = fieldMerges;
	}

	public String getEmailGroupId() {
		return emailGroupId;
	}

	public void setEmailGroupId(String emailGroupId) {
		this.emailGroupId = emailGroupId;
	}

	public String getEmailHeaderId() {
		return emailHeaderId;
	}

	public void setEmailHeaderId(String emailHeaderId) {
		this.emailHeaderId = emailHeaderId;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public List<Form> getForms() {
		return forms;
	}

	public void setForms(List<Form> forms) {
		this.forms = forms;
	}

	public List<DynamicContents> getDynamicContents() {
		return dynamicContents;
	}

	public void setDynamicContents(List<DynamicContents> dynamicContents) {
		this.dynamicContents = dynamicContents;
	}

	public String getIsTracked() {
		return isTracked;
	}

	public void setIsTracked(String isTracked) {
		this.isTracked = isTracked;
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

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getBounceBackEmail() {
		return bounceBackEmail;
	}

	public void setBounceBackEmail(String bounceBackEmail) {
		this.bounceBackEmail = bounceBackEmail;
	}

	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public String getArchive() {
		return archive;
	}

	public void setArchive(String archive) {
		this.archive = archive;
	}

	public String getReplyToEmail() {
		return replyToEmail;
	}

	public void setReplyToEmail(String replyToEmail) {
		this.replyToEmail = replyToEmail;
	}

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	public String getIsContentProtected() {
		return isContentProtected;
	}

	public void setIsContentProtected(String isContentProtected) {
		this.isContentProtected = isContentProtected;
	}

	public String getEncodingId() {
		return encodingId;
	}

	public void setEncodingId(String encodingId) {
		this.encodingId = encodingId;
	}

	@Override
	public String toString() {
		return "ClassPojo [sendPlainTextOnly = " + sendPlainTextOnly + ", emailFooterId = " + emailFooterId
				+ ", isPlainTextEditable = " + isPlainTextEditable + ", subject = " + subject + ", type = " + type
				+ ", hyperlinks = " + hyperlinks + ", updatedBy = " + updatedBy + ", folderId = " + folderId
				+ ", htmlContent = " + htmlContent + ", id = " + id + ", contentSections = " + contentSections
				+ ", style = " + style + ", isPrivate = " + isPrivate + ", replyToName = " + replyToName
				+ ", renderMode = " + renderMode + ", createdAt = " + createdAt + ", layout = " + layout + ", name = "
				+ name + ", fieldMerges = " + fieldMerges + ", permissions = " + permissions + ", emailGroupId = "
				+ emailGroupId + ", emailHeaderId = " + emailHeaderId + ", senderEmail = " + senderEmail + ", forms = "
				+ forms + ", dynamicContents = " + dynamicContents + ", isTracked = " + isTracked + ", currentStatus = "
				+ currentStatus + ", depth = " + depth + ", updatedAt = " + updatedAt + ", senderName = " + senderName
				+ ", createdBy = " + createdBy + ", bounceBackEmail = " + bounceBackEmail + ", images = " + images
				+ ", archive = " + archive + ", replyToEmail = " + replyToEmail + ", plainText = " + plainText
				+ ", isContentProtected = " + isContentProtected + ", encodingId = " + encodingId + "]";
	}
}
