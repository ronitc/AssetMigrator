package com.symantec.eloqua.assetMigrator.Form.Models;

public class Mappings
{
    private String sourceFormFieldId;

    private String targetEntityFieldId;

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
        return "ClassPojo [sourceFormFieldId = "+sourceFormFieldId+", targetEntityFieldId = "+targetEntityFieldId+", type = "+type+", updateType = "+updateType+"]";
    }
}
			
			