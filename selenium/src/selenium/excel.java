package selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
public void read() throws Exception{
	

	File src = new File ("C:\\Users\\anike\\OneDrive\\Documents\\eeee.xlsx");
	FileInputStream  fis = new FileInputStream(src);
    XSSFWorkbook wb = new   XSSFWorkbook(fis);
    XSSFSheet sheet= wb.getSheetAt(0);
   String s= sheet.getRow(0).getCell(0).getStringCellValue(); 	
    System.out.println(s);
	wb.close();
}}
