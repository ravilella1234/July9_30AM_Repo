package excelDataDriven;

public class TestDataDemo 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e1 = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata.xlsx");
		
		int row = e1.getRowCount("login");
		System.out.println(row);
		
		int col = e1.columnCount("login");
		System.out.println(col);
		
		System.out.println(e1.getCellData("login", 0, 1));
		System.out.println(e1.getCellData("login", "Password", 2));
		
		e1.setCellData("login", 4, 2, "Aborted");
	}

}
