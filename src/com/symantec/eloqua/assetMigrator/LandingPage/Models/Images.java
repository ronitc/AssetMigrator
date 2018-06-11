package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class Images {
	     
		private String type;
		 private String currentStatus;
		private String id;
		private String name;
	    private String fullImageUrl;
	    private String thumbnailUrl;

	    
	    

	   

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
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

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", thumbnailUrl = "+thumbnailUrl+", name = "+name+", fullImageUrl = "+fullImageUrl+", type = "+type+", currentStatus = "+currentStatus+"]";
	    }
	}
				
				