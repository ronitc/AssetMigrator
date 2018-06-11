package com.symantec.eloqua.assetMigrator.Form.Models;

public class FieldMerges {
	
    private String updatedAt;

    private String id;

    private String syntax;

    private String mergeType;

    private String name;

    private String contactFieldId;

    private String defaultValue;

    private String type;

    private String depth;

    private String[] fieldConditions;

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

    public String getSyntax ()
    {
        return syntax;
    }

    public void setSyntax (String syntax)
    {
        this.syntax = syntax;
    }

    public String getMergeType ()
    {
        return mergeType;
    }

    public void setMergeType (String mergeType)
    {
        this.mergeType = mergeType;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getContactFieldId ()
    {
        return contactFieldId;
    }

    public void setContactFieldId (String contactFieldId)
    {
        this.contactFieldId = contactFieldId;
    }

    public String getDefaultValue ()
    {
        return defaultValue;
    }

    public void setDefaultValue (String defaultValue)
    {
        this.defaultValue = defaultValue;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getDepth ()
    {
        return depth;
    }

    public void setDepth (String depth)
    {
        this.depth = depth;
    }

    public String[] getFieldConditions ()
    {
        return fieldConditions;
    }

    public void setFieldConditions (String[] fieldConditions)
    {
        this.fieldConditions = fieldConditions;
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
        return "ClassPojo [updatedAt = "+updatedAt+", id = "+id+", syntax = "+syntax+", mergeType = "+mergeType+", name = "+name+", contactFieldId = "+contactFieldId+", defaultValue = "+defaultValue+", type = "+type+", depth = "+depth+", fieldConditions = "+fieldConditions+", folderId = "+folderId+"]";
    }
}


			
			