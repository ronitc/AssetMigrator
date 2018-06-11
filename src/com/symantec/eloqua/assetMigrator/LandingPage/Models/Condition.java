package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class Condition { private String value;

private String valueType;

private String type;

private String operator;

public String getValue ()
{
    return value;
}

public void setValue (String value)
{
    this.value = value;
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

public String getOperator ()
{
    return operator;
}

public void setOperator (String operator)
{
    this.operator = operator;
}

@Override
public String toString()
{
    return "ClassPojo [value = "+value+", valueType = "+valueType+", type = "+type+", operator = "+operator+"]";
}
}
		
		