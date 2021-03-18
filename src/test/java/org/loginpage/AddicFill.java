package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddicFill extends BaseClass {
	public AddicFill() 
		// TODO Auto-generated constructor stub
		{
			PageFactory.initElements(driver,this);
			}
	
	@FindBy(name="location")
	private WebElement selectText;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[2]")
	private WebElement hotel; 
	
	@FindBy(name="room_type")
	private WebElement rooms;
	
	@FindBy(name="room_nos")
	private WebElement roomNos;
	
	@FindBy(name="datepick_in")
	private WebElement checkDate;
	
	@FindBy(name="datepick_out")
	private WebElement checkOut;
	
	@FindBy(name="room_type")
	private WebElement roomType;
	
	public WebElement getRoomType() {
		return roomType;
	}

	@FindBy(name="adult_room")
	private WebElement adultPerRoom;
	
	public WebElement getRooms() {
		return rooms;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getCheckDate() {
		return checkDate;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getSearc() {
		return searc;
	}
	@FindBy(name="child_room")
	private WebElement child_room;
	
	@FindBy(name="Submit")
	private WebElement searc;
	
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getSelectText() {
		return selectText;
	}
	


}
