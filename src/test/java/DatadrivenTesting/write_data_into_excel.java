package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class write_data_into_excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\DUMMY.xlsx");
		
		Workbook wb = WorkbookFactory.create(fi);
		
		Sheet sheet = wb.getSheet("sheet1");
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(1);
		cell.setCellValue("100");
		
		FileOutputStream fi1 = new FileOutputStream(".\\src\\test\\resources\\DUMMY.xlsx");
		
		wb.write(fi1);
		System.out.println("sucess"); 
		
		
		
		
	}

}
