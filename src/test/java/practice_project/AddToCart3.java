package practice_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart3 {
	WebDriver d;
	
	//Constructor
	AddToCart3(WebDriver d){
		this.d=d;
		PageFactory.initElements(d,this);
		}
	
	//Loactors
	@FindBy(partialLinkText="Electroni")WebElement electronics;
	@FindBy(xpath="//div[@class='page-body']//div[2]//div[1]//h2[1]")WebElement cellPhones;
	@FindBy(linkText="Phone Cover")WebElement phoneCover;
	@FindBy(id="product_attribute_80_2_37")WebElement brand;
	@FindBy(id="product_attribute_80_1_38")WebElement color;
	@FindBy(id="add-to-cart-button-80")WebElement ATC;
	
	//Action Methods
	public void clickElectronics() {
		electronics.click();
	}
	
	public void clickCellPhones() {
		cellPhones.click();
	}
	
	public void clickPhoneCover() {
		phoneCover.click();
	}
	
	public void Brand(String text) {
		Select s1=new Select(brand);
		s1.selectByVisibleText(text);
	}
	
	public void Color(String text) {
		Select s2=new Select(color);
		s2.selectByVisibleText(text);
	}
	
	public void clickAddToCart() {
		ATC.click();
	}
}
