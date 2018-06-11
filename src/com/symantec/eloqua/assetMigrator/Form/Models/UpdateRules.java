package com.symantec.eloqua.assetMigrator.Form.Models;

public class UpdateRules
{
    private String type;

    private String targetFieldId;

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
        return "ClassPojo [type = "+type+", targetFieldId = "+targetFieldId+"]";
    }
}
			
			