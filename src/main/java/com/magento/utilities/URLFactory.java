package com.magento.utilities;

public class URLFactory {
ConfigReader configreader=new ConfigReader();
String url;
	public String getURL(String environment)
	{
		if(environment.equals("Staging"))
		{
			String url1=environment+"URL";
		 url=configreader.getProperty(url1);
		 
		}
		else
		{
			url=configreader.getProperty("SxtagingURL");
		}
		

		return url;
	}
}
