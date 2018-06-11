package com.symantec.eloqua.assetMigrator.Email.Models;

public class Images
{
    private String syncDate;

    private String fullImageUrl;

    private String type;
    private String imageByte;

    private String currentStatus;

    private String depth;

    private Size size;

    private String folderId;

    private String updatedBy;

    private String id;

    private String updatedAt;

    private String createdBy;

    private String createdAt;

    private String thumbnailUrl;

    private String name;

    private String[] permissions;

    public String getSyncDate ()
    {
        return syncDate;
    }

    public void setSyncDate (String syncDate)
    {
        this.syncDate = syncDate;
    }

    public String getFullImageUrl ()
    {
        return fullImageUrl;
    }

    public void setFullImageUrl (String fullImageUrl)
    {
        this.fullImageUrl = fullImageUrl;
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

    public Size getSize ()
    {
        return size;
    }

    public void setSize (Size size)
    {
        this.size = size;
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

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getThumbnailUrl ()
    {
        return thumbnailUrl;
    }

    public void setThumbnailUrl (String thumbnailUrl)
    {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getPermissions ()
    {
        return permissions;
    }

    public void setPermissions (String[] permissions)
    {
        this.permissions = permissions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [syncDate = "+syncDate+", fullImageUrl = "+fullImageUrl+", type = "+type+", currentStatus = "+currentStatus+", depth = "+depth+", size = "+size+", folderId = "+folderId+", updatedBy = "+updatedBy+", id = "+id+", updatedAt = "+updatedAt+", createdBy = "+createdBy+", createdAt = "+createdAt+", thumbnailUrl = "+thumbnailUrl+", name = "+name+", permissions = "+permissions+"]";
    }

	public String getImageByte() {
		return imageByte;
	}

	public void setImageByte(String imgFullUrl) {
		this.imageByte = imgFullUrl;
	}
}
			
			