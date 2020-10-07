package com.project.September9AMProject.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
	public static String projectPath=System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainProperty;
	public Properties childProperty;
	public Properties orProp;
	public ExcelAPI xls;
	public String testcaseName;
	public DriverScript ds;
	
	  public void load() throws Exception
	  {
		   fis = new FileInputStream(projectPath + "//src//test//resources//environment.properties");
			mainProperty = new Properties();
			mainProperty.load(fis);
			String e = mainProperty.getProperty("env");
			System.out.println(e);
			
			
			fis = new FileInputStream(projectPath + "//src//test//resources//"+e+".properties");
			childProperty = new Properties();
			childProperty.load(fis);
			System.out.println(childProperty.getProperty("amazonurl"));
			
			fis = new FileInputStream(projectPath + "//src//test//resources//or.properties");
			orProp = new Properties();
			orProp.load(fis);
			
			//How do i come to know which excel file to load
			String[] pack = this.getClass().getPackage().getName().split("\\.");
			String suiteName = pack[pack.length-1];
			System.out.println(suiteName);
			
			//init the xls file
			xls = new ExcelAPI(childProperty.getProperty(suiteName+"_xls"));
			
			//init the TestName
			testcaseName = this.getClass().getSimpleName();
			System.out.println(testcaseName);
			
			//init the driverscript
			ds = new DriverScript();
			ds.setOrProp(orProp);
	  }
	
	  @BeforeTest
	  public void init() throws Exception 
	  {
		  System.out.println("iam beforemethod.....");
		  load();
		    
	  }

	  @AfterTest
	  public void afterMethod() 
	  {
		  System.out.println("iam after Method....");
	  }
	  
	  
	  
}
