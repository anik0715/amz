package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ed {

	public static void main(String[] args) throws Exception {

		String si= "C:\\Users\\anike\\OneDrive\\Documents\\eeee.xlsx";
		FileInputStream fg = new FileInputStream(si);
		XSSFWorkbook  er = new XSSFWorkbook(fg);
	  // XSSFSheet ip= er.getSheetAt(0);
	 //  String t = ip.getRow(0).getCell(0).getStringCellValue();
	    
	}

}
