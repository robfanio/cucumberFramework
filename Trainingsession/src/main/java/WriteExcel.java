import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
	//Create A FIle Object
	File file = new File("C:\\Automation\\cucumber Framework\\Trainingsession\\picture\\file.xlsx");
	//CREATE A WORKBOOK OBJECT
	XSSFWorkbook wrkbook= new XSSFWorkbook();
	//CREATE SHEET OBJECT
	XSSFSheet  sheet = wrkbook.createSheet("Sheet1");
	Row rw1;
	Cell cl1;
	
	
	
	
	
	
	rw1 = sheet.createRow(0);
	cl1 = rw1.createCell(0);
	cl1.setCellValue("Hello World");
	
	//-----------------------Creat Tables-----------------------//
	
	for(int i = 0; i<=9;i++) {
		rw1 = sheet.createRow(i);
		for(int j =0; j <=9;j++) {
			cl1 = rw1.createCell(j);
			cl1.setCellValue("Emp:" + (i + 1)*(j+1 ));
			
		}
	}
	
	
	
	
	FileOutputStream Excl = new FileOutputStream(file);
	wrkbook.write(Excl);
	Excl.close();
	wrkbook.close();
	}

}
