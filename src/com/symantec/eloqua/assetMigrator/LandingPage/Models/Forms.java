package com.symantec.eloqua.assetMigrator.LandingPage.Models;

import java.util.List;

public class Forms { private String type;

private String currentStatus;

private String processingType;

private String depth;

private Size size;

private String folderId;

private String updatedBy;

private String id;

private String updatedAt;

private String customCSS;

private String style;

private String createdBy;

private String createdAt;

private String name;

private String htmlName;

private List<String> permissions;

private String html;

private List<ProcessingSteps> processingSteps;

private List<Elements> elements;

private DefaultKeyFieldMapping defaultKeyFieldMapping;

public String getType ()
{
    return type;
}

public void setType (String type)
{
    this.type = type;
}

public String getCurrentStatus ()
{
    return currentStatus;
}

public void setCurrentStatus (String currentStatus)
{
    this.currentStatus = currentStatus;
}

public String getProcessingType ()
{
    return processingType;
}

public void setProcessingType (String processingType)
{
    this.processingType = processingType;
}

public String getDepth ()
{
    return depth;
}

public void setDepth (String depth)
{
    this.depth = depth;
}

public Size getSize ()
{
    return size;
}

public void setSize (Size size)
{
    this.size = size;
}

public String getFolderId ()
{
    return folderId;
}

public void setFolderId (String folderId)
{
    this.folderId = folderId;
}

public String getUpdatedBy ()
{
    return updatedBy;
}

public void setUpdatedBy (String updatedBy)
{
    this.updatedBy = updatedBy;
}

public String getId ()
{
    return id;
}

public void setId (String id)
{
    this.id = id;
}

public String getUpdatedAt ()
{
    return updatedAt;
}

public void setUpdatedAt (String updatedAt)
{
    this.updatedAt = updatedAt;
}

public String getCustomCSS ()
{
    return customCSS;
}

public void setCustomCSS (String customCSS)
{
    this.customCSS = customCSS;
}

public String getStyle ()
{
    return style;
}

public void setStyle (String style)
{
    this.style = style;
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

public String getHtmlName ()
{
    return htmlName;
}

public void setHtmlName (String htmlName)
{
    this.htmlName = htmlName;
}

public List<String> getPermissions ()
{
    return permissions;
}

public void setPermissions (List<String> permissions)
{
    this.permissions = permissions;
}

public String getHtml ()
{
    return html;
}

public void setHtml (String html)
{
    this.html = html;
}

public List<ProcessingSteps> getProcessingSteps ()
{
    return processingSteps;
}

public void setProcessingSteps (List<ProcessingSteps> processingSteps)
{
    this.processingSteps = processingSteps;
}

public List<Elements> getElements ()
{
    return elements;
}

public void setElements (List<Elements> elements)
{
    this.elements = elements;
}

public DefaultKeyFieldMapping getDefaultKeyFieldMapping ()
{
    return defaultKeyFieldMapping;
}

public void setDefaultKeyFieldMapping (DefaultKeyFieldMapping defaultKeyFieldMapping)
{
    this.defaultKeyFieldMapping = defaultKeyFieldMapping;
}

@Override
public String toString()
{
    return "ClassPojo [type = "+type+", currentStatus = "+currentStatus+", processingType = "+processingType+", depth = "+depth+", size = "+size+", folderId = "+folderId+", updatedBy = "+updatedBy+", id = "+id+", updatedAt = "+updatedAt+", customCSS = "+customCSS+", style = "+style+", createdBy = "+createdBy+", createdAt = "+createdAt+", name = "+name+", htmlName = "+htmlName+", permissions = "+permissions+", html = "+html+", processingSteps = "+processingSteps+", elements = "+elements+", defaultKeyFieldMapping = "+defaultKeyFieldMapping+"]";
}
}
		
		