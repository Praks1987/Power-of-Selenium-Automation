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
	  
    File exlFile = new File("D:/pms_login_read.xls");
    FileInputStream fs = new FileInputStream(exlFile);

    Workbook wb = Workbook.getWorkbook(fs);
    Sheet sh = wb.getSheet(0);
    
    String CellGetContent01 = sh.getCell(1,0).getContents();
    System.out.println(CellGetContent01);
    
    String CellGetContent02 = sh.getCell(0,1).getContents();
    System.out.println(CellGetContent02);
    
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

  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
