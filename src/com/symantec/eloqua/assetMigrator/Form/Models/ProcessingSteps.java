package com.symantec.eloqua.assetMigrator.Form.Models;

public class ProcessingSteps
{
    private String id;

    private String execute;

    private String description;

    private String name;

    private KeyFieldMapping keyFieldMapping;

    private ContactListId contactListId;

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

    public ContactListId getContactListId ()
    {
        return contactListId;
    }

    public void setContactListId (ContactListId contactListId)
    {
        this.contactListId = contactListId;
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
        return "ClassPojo [id = "+id+", execute = "+execute+", description = "+description+", name = "+name+", keyFieldMapping = "+keyFieldMapping+", contactListId = "+contactListId+", type = "+type+"]";
    }
}
			
			