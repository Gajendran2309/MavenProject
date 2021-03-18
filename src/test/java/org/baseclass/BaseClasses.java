package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasses {
	public static WebDriver driver;
	
	public  void getDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public  void LauncUrl(String url) {
		// TODO Auto-generated method stub
driver.get(url);
	}
	
	public static void enterText(WebElement element,String a) {
		// TODO Auto-generated method stub
       element.sendKeys(a);
	}

}
