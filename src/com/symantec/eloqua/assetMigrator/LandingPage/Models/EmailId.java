package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class EmailId { private String valueType;

private String formFieldId;

private String type;

public String getValueType ()
{
    return valueType;
}

public void setValueType (String valueType)
{
    this.valueType = valueType;
}

public String getFormFieldId ()
{
    return formFieldId;
}

public void setFormFieldId (String formFieldId)
{
    this.formFieldId = formFieldId;
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
    return "ClassPojo [valueType = "+valueType+", formFieldId = "+formFieldId+", type = "+type+"]";
}
}
		
		