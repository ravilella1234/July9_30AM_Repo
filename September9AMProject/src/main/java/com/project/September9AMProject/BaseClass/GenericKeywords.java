package com.project.September9AMProject.BaseClass;

import java.util.Hashtable;
import java.util.Properties;

public class GenericKeywords 
{
	public Properties orProp;
	public Properties childProperty;
	public String objectKey;
	public String dataKey;
	public Hashtable<String, String> data;
	public String testdata;
	
	
	
	
	public void setTestdata(String testdata) {
		this.testdata = testdata;
	}

	public void setChildProperty(Properties childProperty) {
		this.childProperty = childProperty;
	}

	public void setOrProp(Properties orProp) {
		this.orProp = orProp;
	}

	public void setObjectKey(String objectKey) {
		this.objectKey = objectKey;
	}

	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public void setData(Hashtable<String, String> data) {
		this.data = data;
	}

	public void openBrowser()
	{
		System.out.println("opening the Browser .... " + testdata);
	}
	
	public void navigate()
	{
		System.out.println("navigate to website .... " + childProperty.getProperty("zohourl"));
	}
	
	public void click()
	{
		System.out.println("clicking the element .... " + orProp.getProperty(objectKey));
	}
	
	public void type()
	{
		System.out.println("typing the text..... " + orProp.getProperty(objectKey) +  "------" + data.get(dataKey));
	}


}
