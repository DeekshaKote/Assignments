package TestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class stage2_logindpwithExcel {
  
	boolean res;
	String xlFilePath = "D:\\Selenium\\RedBusProject\\ReadXcelfile.xlsx";
	String sheetName = "Sheet1";
Utils.ExcelApiTest eat = null;
	
	@Test (dataProvider = "dp")
	   	
  public void login(String u, String p) {
		
		System.out.println("Username:" + u + " Password " + p);
  
	res = u.equals("tomsmith") ? true : false;
	
	Assert.assertEquals(true,res);	
}
	@DataProvider(name="dp")
    public Object[][] userdata() throws Exception {
     	Object [][] data = readfromexcel(xlFilePath, sheetName);
          return data;
      
     }     
	

	/*
	 @DataProvider
	  public Object[][] logindp() {
	    return new Object[][] {
	      new Object[] { "tomsmith", "SuperSecretPassword!" },
	      new Object[] { "someuser", "somewrongpassword" },
	    };
	  }
  */
  
  
public Object[][] readfromexcel(String xlFilePath, String sheetName) throws Exception
{
    Object[][] excelData = null;
    eat = new Utils.ExcelApiTest(xlFilePath);
    int rows = eat.getRowCount(sheetName);
    int columns = eat.getColumnCount(sheetName);
             
    excelData = new Object[rows-1][columns];
     
    for(int i=1; i<rows; i++)
    {
        for(int j=0; j<columns; j++)
        {
            excelData[i-1][j] = eat.getCellData(sheetName, j, i);
        }
         
    }
    return excelData;
}

}