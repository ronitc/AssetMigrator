package com.symantec.eloqua.assetMigrator.LandingPage.Models;

public class HtmlContent {
	private String html;

    private String contentSource;

    private String type;

    public String getHtml ()
    {
        return html;
    }

    public void setHtml (String html)
    {
        this.html = html;
    }

    public String getContentSource ()
    {
        return contentSource;
    }

    public void setContentSource (String contentSource)
    {
        this.contentSource = contentSource;
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
        return "ClassPojo [html = "+html+", contentSource = "+contentSource+", type = "+type+"]";
    }
}
			
			

