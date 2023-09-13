package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {
	@Test
	public static void readdata() throws Exception
	{
		 File src=new File("C:\\Users\\Tanuja\\OneDrive\\Pictures\\Documents\\Tanuja1.xlsx");
		 FileInputStream f1=new FileInputStream(src);
		 XSSFWorkbook xsf=new XSSFWorkbook(f1);
		 XSSFSheet xs1=xsf.getSheetAt(0);
		 String E1= xs1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(E1);
	}
}