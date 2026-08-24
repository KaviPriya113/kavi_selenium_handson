package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	// Data Provider 1
	
	@DataProvider(name="LoginData")
	
	public String[][] getData() throws IOException
	{
		String path=".\\testData\\Ninja_TestData1.xlsx";  //taking excel from the test data
		ExcelUtils xlutil=new ExcelUtils(path);  // creating an object for excel utility
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1", 1);
		
		String logindata[][] = new String[totalrows][totalcols]; //created for two dimensional array
		for (int i=1;i<=totalrows;i++) //1 //read the data from xl storing i value
		{
			for (int j=0;j<totalcols;j++)
			{
				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
		}
		
		return logindata; // returning two dimensional array
		
	}
	
	

}
