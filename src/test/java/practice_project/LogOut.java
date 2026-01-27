package practice_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	WebDriver d;
	
	//Constructor
	LogOut(WebDriver d){
		this.d=d;
		PageFactory.initElements(d,this);
	}
	
	//Locator
	@FindBy(linkText="Log out")WebElement LogOut;
	
	//Action Method
	public void clickLoogout() {
		LogOut.click();
	}
}
