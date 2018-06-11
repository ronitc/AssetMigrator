package com.symantec.eloqua.assetMigrator.LandingPage.Models;

import java.util.List;

import com.symantec.eloqua.assetMigrator.Email.Models.Images;

public class LandingPage {
	

    private String type;
    
    private String relativePath;

    private List<Hyperlinks> hyperlinks;

    private String updatedBy;

    private String folderId;

    private HtmlContent htmlContent;

    private String id;

    private List<ContentSections> contentSections;

    private String style;

    private String excludeFromAuthentication;

    private String createdAt;

    private String micrositeId;

    private String name;

    private String layout;

    private List<String> permissions;

    private List<Forms> forms;

    private List<Files> files;

    private String refreshedAt;

    private List<String> dynamicContents;

    private String currentStatus;

    private String depth;

    private String updatedAt;

    private String sourceTemplateId;

    private String createdBy;

    private List<Images> images;

    private String deployedAt;

    private String isContentProtected;

    public String getRelativePath ()
    {
        return relativePath;
    }

    public void setRelativePath (String relativePath)
    {
        this.relativePath = relativePath;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public List<Hyperlinks> getHyperlinks ()
    {
        return hyperlinks;
    }

    public void setHyperlinks (List<Hyperlinks> hyperlinks)
    {
        this.hyperlinks = hyperlinks;
    }

    public String getUpdatedBy ()
    {
        return updatedBy;
    }

    public void setUpdatedBy (String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public String getFolderId ()
    {
        return folderId;
    }

    public void setFolderId (String folderId)
    {
        this.folderId = folderId;
    }

    public HtmlContent getHtmlContent ()
    {
        return htmlContent;
    }

    public void setHtmlContent (HtmlContent htmlContent)
    {
        this.htmlContent = htmlContent;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public List<ContentSections> getContentSections ()
    {
        return contentSections;
    }

    public void setContentSections (List<ContentSections> contentSections)
    {
        this.contentSections = contentSections;
    }

    public String getStyle ()
    {
        return style;
    }

    public void setStyle (String style)
    {
        this.style = style;
    }

    public String getExcludeFromAuthentication ()
    {
        return excludeFromAuthentication;
    }

    public void setExcludeFromAuthentication (String excludeFromAuthentication)
    {
        this.excludeFromAuthentication = excludeFromAuthentication;
    }

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getMicrositeId ()
    {
        return micrositeId;
    }

    public void setMicrositeId (String micrositeId)
    {
        this.micrositeId = micrositeId;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getLayout ()
    {
        return layout;
    }

    public void setLayout (String layout)
    {
        this.layout = layout;
    }

    public List<String> getPermissions ()
    {
        return permissions;
    }

    public void setPermissions (List<String> permissions)
    {
        this.permissions = permissions;
    }

    public List<Forms> getForms ()
    {
        return forms;
    }

    public void setForms (List<Forms> forms)
    {
        this.forms = forms;
    }

    public List<Files> getFiles ()
    {
        return files;
    }

    public void setFiles (List<Files> files)
    {
        this.files = files;
    }

    public String getRefreshedAt ()
    {
        return refreshedAt;
    }

    public void setRefreshedAt (String refreshedAt)
    {
        this.refreshedAt = refreshedAt;
    }

    public List<String> getDynamicContents ()
    {
        return dynamicContents;
    }

    public void setDynamicContents (List<String> dynamicContents)
    {
        this.dynamicContents = dynamicContents;
    }

    public String getCurrentStatus ()
    {
        return currentStatus;
    }

    public void setCurrentStatus (String currentStatus)
    {
        this.currentStatus = currentStatus;
    }

    public String getDepth ()
    {
        return depth;
    }

    public void setDepth (String depth)
    {
        this.depth = depth;
    }

    public String getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt (String updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public String getSourceTemplateId ()
    {
        return sourceTemplateId;
    }

    public void setSourceTemplateId (String sourceTemplateId)
    {
        this.sourceTemplateId = sourceTemplateId;
    }

    public String getCreatedBy ()
    {
        return createdBy;
    }

    public void setCreatedBy (String createdBy)
    {
        this.createdBy = createdBy;
    }

    public List<Images> getImages ()
    {
        return images;
    }

    public void setImages (List<Images>images)
    {
        this.images = images;
    }

    public String getDeployedAt ()
    {
        return deployedAt;
    }

    public void setDeployedAt (String deployedAt)
    {
        this.deployedAt = deployedAt;
    }

    public String getIsContentProtected ()
    {
        return isContentProtected;
    }

    public void setIsContentProtected (String isContentProtected)
    {
        this.isContentProtected = isContentProtected;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [relativePath = "+relativePath+", type = "+type+", hyperlinks = "+hyperlinks+", updatedBy = "+updatedBy+", folderId = "+folderId+", htmlContent = "+htmlContent+", id = "+id+", contentSections = "+contentSections+", style = "+style+", excludeFromAuthentication = "+excludeFromAuthentication+", createdAt = "+createdAt+", micrositeId = "+micrositeId+", name = "+name+", layout = "+layout+", permissions = "+permissions+", forms = "+forms+", files = "+files+", refreshedAt = "+refreshedAt+", dynamicContents = "+dynamicContents+", currentStatus = "+currentStatus+", depth = "+depth+", updatedAt = "+updatedAt+", sourceTemplateId = "+sourceTemplateId+", createdBy = "+createdBy+", images = "+images+", deployedAt = "+deployedAt+", isContentProtected = "+isContentProtected+"]";
    }
}
			

