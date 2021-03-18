package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddicPayment extends BaseClass {
public AddicPayment() 
	// TODO Auto-generated constructor stub
	{
		PageFactory.initElements(driver,this);
		}
	
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement btnClick;

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getContinues() {
		return continues;
	}


	@FindBy(name="continue")
private WebElement continues;
}
