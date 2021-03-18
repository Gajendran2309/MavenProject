package or.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\admin\\eclipse-workspace\\SampleMaven\\Excel Read\\Testdata.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook b=new XSSFWorkbook(stream);
	Sheet sheet = b.getSheet("Sheet1");
	
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			String ss = cell.getStringCellValue();
			System.out.println(ss);
			
		}
	}
	
//	String s = cell.getStringCellValue();
//	System.out.println(s);
	}
	

}
