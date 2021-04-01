package read_write_data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		String excelPath = ".//Data//TestData.xlsx";
		FileInputStream InputStream = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(InputStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//FOR LOOPS
//		int rows = sheet.getLastRowNum();
//		int cols =sheet.getRow(1).getLastCellNum();
		
//		
//		for(int i=0; i<=rows;i++) {
//			XSSFRow row = sheet.getRow(i);
//			for(int a=0;a<cols;a++) {
//				XSSFCell cell = row.getCell(a);
//				switch(cell.getCellType()) {
//				case STRING: System.out.print(cell.getStringCellValue()); break;
//				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
//				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
//				}
//				System.out.print(" | ");
//				}
//		
//			System.out.println();
//		}
			
	//	ITERATOR METHOD
		
		Iterator iterator = sheet.iterator();
		
		while(iterator.hasNext()) {
			
			XSSFRow row = (XSSFRow) iterator.next();
			Iterator cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIterator.next();
				
				switch(cell.getCellType()) {
			case STRING: System.out.print(cell.getStringCellValue()); break;
			case NUMERIC:System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				}
				System.out.print(" | ");
			}
			System.out.println();
			
		}
		
	}
	
}
