package com.magento.utilities;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;
	public ConfigReader() {
	FileReader reader;
	try {
		reader = new FileReader("./Config/config.properties");
		prop=new Properties();
		 prop.load(reader);	 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
	public String getProperty(String key)
	{ String value= prop.getProperty(key);
		return value;
		
		}
	}
