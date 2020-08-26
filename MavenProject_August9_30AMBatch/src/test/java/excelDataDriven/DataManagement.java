package excelDataDriven;

public class DataManagement 
{

	public static void main(String[] args) throws Exception
	{
		ExcelAPI e = new ExcelAPI("C:/Users/DELL/Desktop/suitex.xlsx");
		String sheetName = "data";
		String testcaseName = "LoginTest";

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
		
		
		//Read the testData  for matching Textcase
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			for(int cNum=0;cNum<cols;cNum++)
			{
				System.out.println(e.getCellData(sheetName, cNum, rNum));
			}
		}
		
	}

}
