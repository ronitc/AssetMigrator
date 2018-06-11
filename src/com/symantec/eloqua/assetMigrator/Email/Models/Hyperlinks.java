package com.symantec.eloqua.assetMigrator.Email.Models;

public class Hyperlinks
{
    private String updatedAt;

    private String id;

    private String createdBy;

    private String createdAt;

    private String name;

    private String hyperlinkType;

    private String type;

    private String href;

    private String depth;

    private String referencedEntityId;

    private String updatedBy;

    private String folderId;

    public String getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt (String updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
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

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getHyperlinkType ()
    {
        return hyperlinkType;
    }

    public void setHyperlinkType (String hyperlinkType)
    {
        this.hyperlinkType = hyperlinkType;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    public String getDepth ()
    {
        return depth;
    }

    public void setDepth (String depth)
    {
        this.depth = depth;
    }

    public String getReferencedEntityId ()
    {
        return referencedEntityId;
    }

    public void setReferencedEntityId (String referencedEntityId)
    {
        this.referencedEntityId = referencedEntityId;
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

    @Override
    public String toString()
    {
        return "ClassPojo [updatedAt = "+updatedAt+", id = "+id+", createdBy = "+createdBy+", createdAt = "+createdAt+", name = "+name+", hyperlinkType = "+hyperlinkType+", type = "+type+", href = "+href+", depth = "+depth+", referencedEntityId = "+referencedEntityId+", updatedBy = "+updatedBy+", folderId = "+folderId+"]";
    }
}
			