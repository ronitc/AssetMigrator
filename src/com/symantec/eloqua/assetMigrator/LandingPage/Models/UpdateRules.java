package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class UpdateRules { private String value;

private String type;

private String targetFieldId;

public String getValue ()
{
    return value;
}

public void setValue (String value)
{
    this.value = value;
}

public String getType ()
{
    return type;
}

public void setType (String type)
{
    this.type = type;
}

public String getTargetFieldId ()
{
    return targetFieldId;
}

public void setTargetFieldId (String targetFieldId)
{
    this.targetFieldId = targetFieldId;
}

@Override
public String toString()
{
    return "ClassPojo [value = "+value+", type = "+type+", targetFieldId = "+targetFieldId+"]";
}
}
		
		