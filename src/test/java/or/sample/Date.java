package or.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\dri\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement textBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	textBox.sendKeys("iphone12",Keys.ENTER);
 List<WebElement> li = driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
//	String text = textPrint.getText();	
//	WebElement textPrint1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
//	String text1 = textPrint.getText();
	
	
	
	
	File file=new File("C:\\Users\\admin\\eclipse-workspace\\SampleMaven\\Excel Read\\Testdata2.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook f= new XSSFWorkbook(stream);
		Sheet sheet = f.createSheet("dak1");
		for (int k = 0; k <li.size(); k++) {
			WebElement tt = li.get(k);
		String text = tt.getText();
	
		for (int i = 0; i <2; i++) {
			
		
		Row row = sheet.createRow(i);
		for (int j = 0; j <2; j++) {
			
		Cell cell = row.createCell(j);
		cell.setCellValue(text);
		}
		
			
		}
		
	}
		FileOutputStream ff=new FileOutputStream(file);
		f.write(ff);
}
}
