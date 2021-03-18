package org.facebook;


import org.baseclass.BaseClass;
import org.baseclass.BaseClasses;
import org.openqa.selenium.WebElement;

public class CheckFac extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		BaseClasses b=new BaseClasses();
		FacebookLogin fb=new FacebookLogin();
		b.getDriver();
		b.LauncUrl("https://www.facebook.com/");
		//Thread.sleep(3000);
		WebElement txtUserName = fb.getTxtUserName();
BaseClasses.enterText(txtUserName,"vakj");
	}

}
