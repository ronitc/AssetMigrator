package com.symantec.eloqua.assetMigrator.LandingPage.Models;

import java.util.List;

public class Files {
	private String link;

    private String type;

    private String currentStatus;

    private String depth;

    private String folderId;

    private String updatedBy;

    private String id;

    private String updatedAt;

    private String createdBy;

    private String trackedLink;

    private String createdAt;

    private String name;

    private List<String> permissions;

    private String fileName;

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
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

    public String getFolderId ()
    {
        return folderId;
    }

    public void setFolderId (String folderId)
    {
        this.folderId = folderId;
    }

    public String getUpdatedBy ()
    {
        return updatedBy;
    }

    public void setUpdatedBy (String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt (String updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy ()
    {
        return createdBy;
    }

    public void setCreatedBy (String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getTrackedLink ()
    {
        return trackedLink;
    }

    public void setTrackedLink (String trackedLink)
    {
        this.trackedLink = trackedLink;
    }

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public List<String> getPermissions ()
    {
        return permissions;
    }

    public void setPermissions (List<String> permissions)
    {
        this.permissions = permissions;
    }

    public String getFileName ()
    {
        return fileName;
    }

    public void setFileName (String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [link = "+link+", type = "+type+", currentStatus = "+currentStatus+", depth = "+depth+", folderId = "+folderId+", updatedBy = "+updatedBy+", id = "+id+", updatedAt = "+updatedAt+", createdBy = "+createdBy+", trackedLink = "+trackedLink+", createdAt = "+createdAt+", name = "+name+", permissions = "+permissions+", fileName = "+fileName+"]";
    }
}
			
			