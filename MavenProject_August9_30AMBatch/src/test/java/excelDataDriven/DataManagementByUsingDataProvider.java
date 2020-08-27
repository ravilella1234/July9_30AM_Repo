package excelDataDriven;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataManagementByUsingDataProvider 
{
  @Test(dataProvider = "getData")
  public void f(String RunMode, String Browser,String UserName, String UserPassword, String ExpectedResult) 
  {
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  
	  ExcelAPI e = new ExcelAPI("C:/Users/DELL/Desktop/suitex.xlsx");
		String sheetName = "data";
		String testcaseName = "TestB";

		int testStartRowNum =0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testcaseName))
		{
			testStartRowNum++;
		}
		System.out.println("Test starts from row :" + testStartRowNum);
		
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		
		//calculate the rows of data
		int rows = 0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are : "+ rows);
		
		
		//calculate the total columns 
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total columns are :- " + cols);
		
		int dataRow=0;
		Object[][] data = new Object[rows][cols];
		
		//Read the testData  for matching Textcase
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			for(int cNum=0;cNum<cols;cNum++)
			{
				//System.out.println(e.getCellData(sheetName, cNum, rNum));
				data[dataRow][cNum] = e.getCellData(sheetName, cNum, rNum);
			}
			dataRow++;
		}
	return data;
  }

}
