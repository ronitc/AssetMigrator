package com.symantec.eloqua.assetMigrator.emailFolder;

public class EmailFolder {
	
	
	 private String updatedAt;

	    private String id;

	    private String createdBy;

	    private String createdAt;

	    private String name;

	    private String archive;

	    private String type;

	    private String isSystem;

	    private String depth;

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

	    public String getArchive ()
	    {
	        return archive;
	    }

	    public void setArchive (String archive)
	    {
	        this.archive = archive;
	    }

	    public String getType ()
	    {
	        return type;
	    }

	    public void setType (String type)
	    {
	        this.type = type;
	    }

	    public String getIsSystem ()
	    {
	        return isSystem;
	    }

	    public void setIsSystem (String isSystem)
	    {
	        this.isSystem = isSystem;
	    }

	    public String getDepth ()
	    {
	        return depth;
	    }

	    public void setDepth (String depth)
	    {
	        this.depth = depth;
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
	        return "EmailFolder [updatedAt = "+updatedAt+", id = "+id+", createdBy = "+createdBy+", createdAt = "+createdAt+", name = "+name+", archive = "+archive+", type = "+type+", isSystem = "+isSystem+", depth = "+depth+", updatedBy = "+updatedBy+", folderId = "+folderId+"]";
	    }
	

}
