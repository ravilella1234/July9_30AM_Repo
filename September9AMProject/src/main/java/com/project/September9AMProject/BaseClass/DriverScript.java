package com.project.September9AMProject.BaseClass;

import java.util.Hashtable;
import java.util.Properties;

import com.project.September9AMProject.BaseClass.ExcelAPI;

public class DriverScript 
{
	
	public Properties orProp;
	
	public void setOrProp(Properties orProp) 
	{
		this.orProp = orProp;
	}

	public void executeKeywords(ExcelAPI xls, String testName, Hashtable<String, String> testData)
	{
		System.out.println("iam driverscript class....");
		
		int rows = xls.getRowCount("Keywords");
		System.out.println("Rows : " + rows);
		
		for(int rNum=1;rNum<rows;rNum++)
		{
			String tcid = xls.getCellData("Keywords", "TCID", rNum);
			if(tcid.equals(testName))
			{
				String kWord = xls.getCellData("Keywords", "Keyword", rNum);
				String objectKey = xls.getCellData("Keywords", "Object", rNum);
				String dataKey = xls.getCellData("Keywords", "Data", rNum);
				String data = testData.get(dataKey);
				
				System.out.println(tcid + "----"+ kWord + "----"+ orProp.getProperty(objectKey) +"----"+ data);
			}
		}
	}

}
