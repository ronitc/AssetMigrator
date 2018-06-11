package com.symantec.eloqua.assetMigrator.Form.Models;

import java.util.List;

public class CustomObjectUpdateRuleSet
{
    private String updatedAt;

    private String id;

    private List <UpdateRules> updateRules;

    private String scope;

    private String createdBy;

    private String createdAt;

    private String name;

    private String type;

    private String depth;

    private String updatedBy;

    public String getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt (String updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public List<UpdateRules> getUpdateRules ()
    {
        return updateRules;
    }

    public void setUpdateRules (List<UpdateRules> updateRules)
    {
        this.updateRules = updateRules;
    }

    public String getScope ()
    {
        return scope;
    }

    public void setScope (String scope)
    {
        this.scope = scope;
    }

    public String getCreatedBy ()
    {
        return createdBy;
    }

    public void setCreatedBy (String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getDepth ()
    {
        return depth;
    }

    public void setDepth (String depth)
    {
        this.depth = depth;
    }

    public String getUpdatedBy ()
    {
        return updatedBy;
    }

    public void setUpdatedBy (String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [updatedAt = "+updatedAt+", id = "+id+", updateRules = "+updateRules+", scope = "+scope+", createdBy = "+createdBy+", createdAt = "+createdAt+", name = "+name+", type = "+type+", depth = "+depth+", updatedBy = "+updatedBy+"]";
    }
}
			
			