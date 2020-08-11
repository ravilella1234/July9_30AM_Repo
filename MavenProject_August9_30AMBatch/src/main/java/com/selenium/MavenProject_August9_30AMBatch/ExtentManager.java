package com.selenium.MavenProject_August9_30AMBatch;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
	
	public static ExtentReports report;
	
	public static ExtentReports getInsatnce()
	{
		if (report==null) 
		{
			report = new ExtentReports(projectPath + "//HtmlReports//" + filePath +".html");
			report.loadConfig(new File(projectPath + "//extentreportconfig.xml"));
			report.addSystemInfo("Selenium Language Binding", "3.141.59").addSystemInfo("Environment",mainProperty.getProperty("env"));
		}
		return report;
	}

}
