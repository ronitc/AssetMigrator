package com.symantec.eloqua.assetMigrator.Form.Models;

public class ConditionalFieldCriteria
{
    private String id;

    private Condition condition;

    private String fieldId;

    private String type;

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

    public String getFieldId ()
    {
        return fieldId;
    }

    public void setFieldId (String fieldId)
    {
        this.fieldId = fieldId;
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
        return "ClassPojo [id = "+id+", condition = "+condition+", fieldId = "+fieldId+", type = "+type+"]";
    }
}
			
			