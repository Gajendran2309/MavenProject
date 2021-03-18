package org.facebook;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends BaseClass {
	public FacebookLogin() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="email")
	private WebElement txtUserName;


	public WebElement getTxtUserName() {
		return txtUserName;
	}

}
