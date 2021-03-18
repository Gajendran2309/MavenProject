package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddicBook extends BaseClass {
	public AddicBook() 
	// TODO Auto-generated constructor stub
	{
		PageFactory.initElements(driver,this);
		}
@FindBy(name="first_name")
private WebElement txtFirstName;

@FindBy(name="last_name")
private WebElement txtLastName;

@FindBy(name="address")
private WebElement address;

@FindBy(name="cc_num")
private WebElement creditCardNo;

@FindBy(name="cc_type")
private WebElement cardType;

@FindBy(name="cc_exp_month")
private WebElement  expMont;

@FindBy(name="cc_exp_year")
private WebElement expYear;

@FindBy(name="cc_cvv")
private WebElement cvvNo;

@FindBy(name="book_now")
private WebElement book;

public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCreditCardNo() {
	return creditCardNo;
}

public WebElement getCardType() {
	return cardType;
}

public WebElement getExpMont() {
	return expMont;
}

public WebElement getExpYear() {
	return expYear;
}

public WebElement getCvvNo() {
	return cvvNo;
}

public WebElement getBook() {
	return book;
}
	
}
