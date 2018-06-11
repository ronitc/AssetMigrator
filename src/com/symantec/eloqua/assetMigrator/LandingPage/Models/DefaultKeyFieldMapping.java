package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class DefaultKeyFieldMapping { private String sourceFormFieldId;

private String targetEntityFieldId;

private String type;

public String getSourceFormFieldId ()
{
    return sourceFormFieldId;
}

public void setSourceFormFieldId (String sourceFormFieldId)
{
    this.sourceFormFieldId = sourceFormFieldId;
}

public String getTargetEntityFieldId ()
{
    return targetEntityFieldId;
}

public void setTargetEntityFieldId (String targetEntityFieldId)
{
    this.targetEntityFieldId = targetEntityFieldId;
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
    return "ClassPojo [sourceFormFieldId = "+sourceFormFieldId+", targetEntityFieldId = "+targetEntityFieldId+", type = "+type+"]";
}
}
		
		