package com.symantec.eloqua.assetMigrator.Form.Models;

public class Elements
{
	
	private String id;

    private String dataType;

    private String style;

    private String displayType;

    private String name;

    private String htmlName;

    private String[] validations;

    private String useGlobalSubscriptionStatus;

    private String type;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDataType ()
    {
        return dataType;
    }

    public void setDataType (String dataType)
    {
        this.dataType = dataType;
    }

    public String getStyle ()
    {
        return style;
    }

    public void setStyle (String style)
    {
        this.style = style;
    }

    public String getDisplayType ()
    {
        return displayType;
    }

    public void setDisplayType (String displayType)
    {
        this.displayType = displayType;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getHtmlName ()
    {
        return htmlName;
    }

    public void setHtmlName (String htmlName)
    {
        this.htmlName = htmlName;
    }

    public String[] getValidations ()
    {
        return validations;
    }

    public void setValidations (String[] validations)
    {
        this.validations = validations;
    }

    public String getUseGlobalSubscriptionStatus ()
    {
        return useGlobalSubscriptionStatus;
    }

    public void setUseGlobalSubscriptionStatus (String useGlobalSubscriptionStatus)
    {
        this.useGlobalSubscriptionStatus = useGlobalSubscriptionStatus;
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
        return "ClassPojo [id = "+id+", dataType = "+dataType+", style = "+style+", displayType = "+displayType+", name = "+name+", htmlName = "+htmlName+", validations = "+validations+", useGlobalSubscriptionStatus = "+useGlobalSubscriptionStatus+", type = "+type+"]";
    }
	
	
    /*private String id;

    private String dataType;

    private String style;

    private String displayType;

    private String createdFromContactFieldId;

    private String name;

    private String htmlName;

    private List <Validations> validations;

    private String useGlobalSubscriptionStatus;

    private List<FieldMerges> fieldMergeId;

    private String type;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDataType ()
    {
        return dataType;
    }

    public void setDataType (String dataType)
    {
        this.dataType = dataType;
    }

    public String getStyle ()
    {
        return style;
    }

    public void setStyle (String style)
    {
        this.style = style;
    }

    public String getDisplayType ()
    {
        return displayType;
    }

    public void setDisplayType (String displayType)
    {
        this.displayType = displayType;
    }

    public String getCreatedFromContactFieldId ()
    {
        return createdFromContactFieldId;
    }

    public void setCreatedFromContactFieldId (String createdFromContactFieldId)
    {
        this.createdFromContactFieldId = createdFromContactFieldId;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getHtmlName ()
    {
        return htmlName;
    }

    public void setHtmlName (String htmlName)
    {
        this.htmlName = htmlName;
    }

    public List<Validations> getValidations ()
    {
        return validations;
    }

    public void setValidations (List<Validations> validations)
    {
        this.validations = validations;
    }

    public String getUseGlobalSubscriptionStatus ()
    {
        return useGlobalSubscriptionStatus;
    }

    public void setUseGlobalSubscriptionStatus (String useGlobalSubscriptionStatus)
    {
        this.useGlobalSubscriptionStatus = useGlobalSubscriptionStatus;
    }

    public List<FieldMerges> getFieldMergeId ()
    {
        return fieldMergeId;
    }

    public void setFieldMergeId (List<FieldMerges> fieldMergeId)
    {
        this.fieldMergeId = fieldMergeId;
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
        return "ClassPojo [id = "+id+", dataType = "+dataType+", style = "+style+", displayType = "+displayType+", createdFromContactFieldId = "+createdFromContactFieldId+", name = "+name+", htmlName = "+htmlName+", validations = "+validations+", useGlobalSubscriptionStatus = "+useGlobalSubscriptionStatus+", fieldMergeId = "+fieldMergeId+", type = "+type+"]";
    }*/
}
			