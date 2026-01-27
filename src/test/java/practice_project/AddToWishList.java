package practice_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishList {
	WebDriver d;
	
	//Constructor
	AddToWishList(WebDriver d){
		this.d=d;
		PageFactory.initElements(d,this);
		}
	
	//Locators
	@FindBy(partialLinkText="Electroni")WebElement electronics;
	@FindBy(linkText="Smartphone")WebElement phone;
	@FindBy(id="add-to-wishlist-button-43")WebElement ATW;
	@FindBy(partialLinkText="Cell phon")WebElement cellPhone;
	
	//Action Methods
	public void clickElectronics() {
		electronics.click();
	}
	
	public void clickPhone() {
		 phone.click();
	}
	
	public void clickAddToWishlist() {
		ATW.click();
	}
	
	public void clickCellPhone() {
		cellPhone.click();
	}
}
