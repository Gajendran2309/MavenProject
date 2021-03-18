package org.baseclass;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Select s;

	public  void getDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public  void LauncUrl(String url) {
		// TODO Auto-generated method stub
driver.get(url);
	}
	
	public  void enterText(WebElement element,String value) {
		// TODO Auto-generated method stub
element.sendKeys(value);
	}
	

	
	public void click(WebElement element) {
		// TODO Auto-generated method stub
element.click();
	}
	public void screenShot() {
		// TODO Auto-generated method stub

	}
public void selectOption(WebElement element,String text) {
	// TODO Auto-generated method stub
Select s=new Select(element);
//List<WebElement> options = s.getOptions();
//WebElement webElement = options.get(index);
//String text = webElement.getText();
s.selectByVisibleText(text);


}

public void screenShot(String data) throws IOException {
	// TODO Auto-generated method stub
TakesScreenshot screenShot=(TakesScreenshot) driver;
File screenshotAs = screenShot.getScreenshotAs(OutputType.FILE);
File file=new File(System.getProperty("user.dir")+"\\target\\"+data+".png");
FileUtils.copyFile(screenshotAs, file);

}

}
