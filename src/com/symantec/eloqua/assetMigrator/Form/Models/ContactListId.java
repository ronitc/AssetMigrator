package com.symantec.eloqua.assetMigrator.Form.Models;

public class ContactListId
{
    private String constantValue;

    private String valueType;

    private String type;

    public String getConstantValue ()
    {
        return constantValue;
    }

    public void setConstantValue (String constantValue)
    {
        this.constantValue = constantValue;
    }

    public String getValueType ()
    {
        return valueType;
    }

    public void setValueType (String valueType)
    {
        this.valueType = valueType;
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
        return "ClassPojo [constantValue = "+constantValue+", valueType = "+valueType+", type = "+type+"]";
    }
}
			
			