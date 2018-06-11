package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class Validations {
	private String message;

    private String id;

    private Condition condition;

    private String description;

    private String name;

    private String type;

    private String isEnabled;

    private String depth;

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Condition getCondition ()
    {
        return condition;
    }

    public void setCondition (Condition condition)
    {
        this.condition = condition;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getIsEnabled ()
    {
        return isEnabled;
    }

    public void setIsEnabled (String isEnabled)
    {
        this.isEnabled = isEnabled;
    }

    public String getDepth ()
    {
        return depth;
    }

    public void setDepth (String depth)
    {
        this.depth = depth;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", id = "+id+", condition = "+condition+", description = "+description+", name = "+name+", type = "+type+", isEnabled = "+isEnabled+", depth = "+depth+"]";
    }
}
			
			