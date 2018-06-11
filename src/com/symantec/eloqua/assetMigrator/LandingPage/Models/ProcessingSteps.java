package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class ProcessingSteps { private String id;

private String execute;

private Condition condition;

private String description;

private String name;

private KeyFieldMapping keyFieldMapping;

private ContactUpdateRuleSet contactUpdateRuleSet;

private String type;

public String getId ()
{
    return id;
}

public void setId (String id)
{
    this.id = id;
}

public String getExecute ()
{
    return execute;
}

public void setExecute (String execute)
{
    this.execute = execute;
}

public Condition getCondition ()
{
    return condition;
}

public void setCondition (Condition condition)
{
    this.condition = condition;
}

public String getDescription ()
{
    return description;
}

public void setDescription (String description)
{
    this.description = description;
}

public String getName ()
{
    return name;
}

public void setName (String name)
{
    this.name = name;
}

public KeyFieldMapping getKeyFieldMapping ()
{
    return keyFieldMapping;
}

public void setKeyFieldMapping (KeyFieldMapping keyFieldMapping)
{
    this.keyFieldMapping = keyFieldMapping;
}

public ContactUpdateRuleSet getContactUpdateRuleSet ()
{
    return contactUpdateRuleSet;
}

public void setContactUpdateRuleSet (ContactUpdateRuleSet contactUpdateRuleSet)
{
    this.contactUpdateRuleSet = contactUpdateRuleSet;
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
    return "ClassPojo [id = "+id+", execute = "+execute+", condition = "+condition+", description = "+description+", name = "+name+", keyFieldMapping = "+keyFieldMapping+", contactUpdateRuleSet = "+contactUpdateRuleSet+", type = "+type+"]";
}
}
		
		