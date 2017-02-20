package write_data;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class write_data {
	
	public static void main(String[] args) throws IOException, WriteException 
	{
		 WritableWorkbook workbook = Workbook.createWorkbook(new File("D:\\pms_login_write.xls"));
         WritableSheet sheet = workbook.createSheet("Sheet1", 0);
         
         Label testcase_status =null;
       
         //sr_no = 				new Label(3, 2, "Sr. No");
         //report_name = 			new Label(4, 2, "Report Name");
         testcase_status = 		new Label(0, 0, "Test Case Status");
         
        // sheet.addCell(sr_no);
        // sheet.addCell(report_name);
         sheet.addCell(testcase_status);
     
         //for (int i = 3 ; i < 5 ; i ++) 
         //{ 
         //for (int j = 3 ; j < 5 ; j ++) 
         //{  
           //sheet.insertColumn(insertColumn);
           //lable = 					new Label(i, j, "" + i + " OK");
           //	sr_no = 					new Label(i, j, "" + i +"");
           //report_name = 			new Label(i, j, 	"Report Name");
           //testcase_status = 		new Label(i, j,  	"Test Case Status");
     
           //sheet.addCell(lable);
       
        // }
        // }
         workbook.write(); 
         workbook.close();
	}
}