package practice_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart2 {
	WebDriver d;
	
	//Constructor
	AddToCart2(WebDriver d){
		this.d=d;
		PageFactory.initElements(d,this);
	}
	
	//Locators
	@FindBy(partialLinkText="Electroni")WebElement eloctronicsLink;
	@FindBy(partialLinkText="Cell phon")WebElement phoneLink;
	@FindBy(xpath="//div[@class='item-box']//div[3]//div[2]//input[1]")WebElement ATC;
	
	//Action Methods
	public void clickElectronics() {
		eloctronicsLink.click();
	}
	
	public void clickPhone() {
		phoneLink.click();
	}
	
	public void clickatc() {
		ATC.click();
	}
}
