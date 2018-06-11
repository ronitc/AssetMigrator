package com.symantec.eloqua.assetMigrator.LandingPage.Models;

import java.util.List;

public class ContentSections {
	 private String scope;

	    private String contentHtml;

	    private List<Hyperlinks> hyperlinks;

	    private String type;

	    private String depth;

	    private String contentText;

	    private Size size;

	    private String folderId;

	    private String updatedBy;

	    private String id;

	    private String updatedAt;

	    private String createdBy;

	    private String createdAt;

	    private String name;

	    private List<String> permissions;

	    private List<Images> images;

	    private List<Forms> forms;

	    public String getScope ()
	    {
	        return scope;
	    }

	    public void setScope (String scope)
	    {
	        this.scope = scope;
	    }

	    public String getContentHtml ()
	    {
	        return contentHtml;
	    }

	    public void setContentHtml (String contentHtml)
	    {
	        this.contentHtml = contentHtml;
	    }

	    public List<Hyperlinks> getHyperlinks ()
	    {
	        return hyperlinks;
	    }

	    public void setHyperlinks (List<Hyperlinks> hyperlinks)
	    {
	        this.hyperlinks = hyperlinks;
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

	    public String getContentText ()
	    {
	        return contentText;
	    }

	    public void setContentText (String contentText)
	    {
	        this.contentText = contentText;
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

	    public List<Images> getImages ()
	    {
	        return images;
	    }

	    public void setImages (List<Images> images)
	    {
	        this.images = images;
	    }

	    public List<Forms> getForms ()
	    {
	        return forms;
	    }

	    public void setForms (List<Forms> forms)
	    {
	        this.forms = forms;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [scope = "+scope+", contentHtml = "+contentHtml+", hyperlinks = "+hyperlinks+", type = "+type+", depth = "+depth+", contentText = "+contentText+", size = "+size+", folderId = "+folderId+", updatedBy = "+updatedBy+", id = "+id+", updatedAt = "+updatedAt+", createdBy = "+createdBy+", createdAt = "+createdAt+", name = "+name+", permissions = "+permissions+", images = "+images+", forms = "+forms+"]";
	    }
	}
				
				