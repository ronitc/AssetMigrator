package com.symantec.eloqua.assetMigrator.Email.Models;

public class Size
{
    private String height;

    private String width;

    private String type;

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [height = "+height+", width = "+width+", type = "+type+"]";
    }
}
			
			