package sampletest3;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.*;
import jxl.write.Boolean;
import jxl.write.Number;


public class read_excel_data {
	
	
  private WebDriver driver;
  //private String baseUrl;
  
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {    
	  
	 //driver = new FirefoxDriver();
    // baseUrl = "https://www.google.com.pk/";
    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    //String FilePath = "D://pms_login.xls";
    File exlFile = new File("D:/pms_login_read.xls");
    FileInputStream fs = new FileInputStream(exlFile);

    Workbook wb = Workbook.getWorkbook(fs);
    Sheet sh = wb.getSheet(0);
    
    /*String CellGetContent = sh.getCell(0,0).getContents();
    System.out.println(CellGetContent);
    // GetCell(Column,Row);
    
    String CellGetContent01 = sh.getCell(1,0).getContents();
    System.out.println(CellGetContent01);
    
    String CellGetContent02 = sh.getCell(0,1).getContents();
    System.out.println(CellGetContent02); */
    
    WritableWorkbook writableWorkbook = Workbook.createWorkbook(exlFile);
    WritableSheet writableSheet = writableWorkbook.createSheet( "pms_login", 0);
    
    Label label = new Label(0, 0, "Label (String)");
    DateTime date = new DateTime(1, 0, new Date(0));
    Boolean bool = new Boolean(2, 0, true);
    Number num = new Number(3, 0, 9.99);

   // Add the created Cells to the sheet
    writableSheet.addCell(label);
    writableSheet.addCell(date);
    writableSheet.addCell(bool);
    writableSheet.addCell(num);
  }
  
  

  @Test
  public void testLogin() throws Exception {
    //driver.get(baseUrl + "/");
    //driver.findElement(By.id("lst-ib")).clear();
   // driver.findElement(By.id("lst-ib")).sendKeys("mtbc.com");
   // driver.findElement(By.name("btnG")).click();
    //driver.findElement(By.linkText("MTBC: Medical Billing Services – Medical Billing Company")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  
}


