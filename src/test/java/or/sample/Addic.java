package or.sample;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.loginpage.AddicBook;
import org.loginpage.AddicFill;
import org.loginpage.AddicPayment;
import org.loginpage.LoginPage;
import org.openqa.selenium.WebElement;

public class Addic {
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseClass b=new BaseClass();
		b.getDriver();
		b.LauncUrl("http://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		AddicFill addicFill=new AddicFill();
		WebElement txtUserName = l.getTxtUserName();
		b.enterText(txtUserName, "jerrykarthikeyan");
		WebElement txtPassword = l.getTxtPassword();
		b.enterText(txtPassword, "qwerty");
		WebElement btnLogin = l.getBtnLogin();
		b.click(btnLogin);
		Thread.sleep(3000);
		 WebElement selectText = addicFill.getSelectText();
		b.selectOption(selectText, "Sydney");
		WebElement hotel = addicFill.getHotel();
		b.selectOption(hotel, "Hotel Creek");
		WebElement roomType = addicFill.getRoomType();
		b.selectOption(roomType, "Standard");
		WebElement roomNos = addicFill.getRoomNos();
		b.selectOption(roomNos, "1 - One");
		WebElement checkDate = addicFill.getCheckDate();
		b.enterText(checkDate, "23/07/2021");
		WebElement checkOut = addicFill.getCheckOut();
		b.enterText(checkOut, "25/07/2021");
		WebElement adultPerRoom = addicFill.getAdultPerRoom();
		b.selectOption(adultPerRoom, "1 - One");
		WebElement child_room = addicFill.getChild_room();
		b.selectOption(child_room, "1 - One");
		WebElement searc = addicFill.getSearc();
		b.click(searc);
		AddicPayment AddPayment=new AddicPayment();
		WebElement btnClick = AddPayment.getBtnClick();
		b.click(btnClick);
		WebElement continues = AddPayment.getContinues();
		b.click(continues);
		AddicBook addBook= new AddicBook();
	WebElement txtFirstName = addBook.getTxtFirstName();
	b.enterText(txtFirstName, "boss");
	WebElement txtLastName = addBook.getTxtLastName();
	b.enterText(txtLastName, "kin");
	WebElement address = addBook.getAddress();
	b.enterText(address, "No:2/591");
	WebElement creditCardNo = addBook.getCreditCardNo();
	b.enterText(creditCardNo, "1234567891234512");
	WebElement cardType = addBook.getCardType();
	b.selectOption(cardType, "American Express");
	WebElement expMont = addBook.getExpMont();
	b.selectOption(expMont, "March");
	WebElement expYear = addBook.getExpYear();
	b.selectOption(expYear, "2021");
	WebElement cvvNo = addBook.getCvvNo();
	b.enterText(cvvNo, "123");
	WebElement book = addBook.getBook();
	b.click(book);
	Thread.sleep(3000);
	b.screenShot("file");

	
	
		
	}

}
