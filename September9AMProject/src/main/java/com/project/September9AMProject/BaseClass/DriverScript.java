package com.project.September9AMProject.BaseClass;

import java.util.Hashtable;
import java.util.Properties;

import com.project.September9AMProject.BaseClass.ExcelAPI;

public class DriverScript 
{
	
	public Properties orProp;
	public Properties childProperty;
	AppKeywords app;
	public String objectKey;
	public String kWord;
	public String dataKey;
	public String data;
	
	public void setChildProperty(Properties childProperty) 
	{
		this.childProperty = childProperty;
	}
	
	public void setOrProp(Properties orProp) 
	{
		this.orProp = orProp;
	}

	public void executeKeywords(ExcelAPI xls, String testName, Hashtable<String, String> testData)
	{
		System.out.println("iam driverscript class....");
		
		int rows = xls.getRowCount("Keywords");
		System.out.println("Rows : " + rows);
		app = new AppKeywords();
		app.setOrProp(orProp);
		app.setChildProperty(childProperty);
		
		for(int rNum=1;rNum<rows;rNum++)
		{
			String tcid = xls.getCellData("Keywords", "TCID", rNum);
			if(tcid.equals(testName))
			{
				kWord  = xls.getCellData("Keywords", "Keyword", rNum);
				objectKey = xls.getCellData("Keywords", "Object", rNum);
				dataKey = xls.getCellData("Keywords", "Data", rNum);
				data = testData.get(dataKey);
				
				System.out.println(tcid + "----"+ kWord + "----"+ orProp.getProperty(objectKey) +"----"+ data);
				
				app.setObjectKey(objectKey);
				app.setData(testData);
				app.setTestdata(data);
				
				if(kWord.equals("openBrowser"))
					app.openBrowser();
				else if(kWord.equals("navigate"))
					app.navigate();
				else if(kWord.equals("click"))
					app.click();
				else if(kWord.equals("type"))
					app.type();
				else if(kWord.equals("validateLogin"))
					app.validateLogin();
					
			}
		}
	}

}
