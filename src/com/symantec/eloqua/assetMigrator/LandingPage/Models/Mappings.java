package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class Mappings { private String sourceFormFieldId;

private String type;

private String updateType;

public String getSourceFormFieldId ()
{
    return sourceFormFieldId;
}

public void setSourceFormFieldId (String sourceFormFieldId)
{
    this.sourceFormFieldId = sourceFormFieldId;
}

public String getType ()
{
    return type;
}

public void setType (String type)
{
    this.type = type;
}

public String getUpdateType ()
{
    return updateType;
}

public void setUpdateType (String updateType)
{
    this.updateType = updateType;
}

@Override
public String toString()
{
    return "ClassPojo [sourceFormFieldId = "+sourceFormFieldId+", type = "+type+", updateType = "+updateType+"]";
}
}
		
		