package practice_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {
	WebDriver d;
	WebDriverWait wait;
	
	//Constructor
	Checkout(WebDriver d){
		this.d=d;
		PageFactory.initElements(d,this);
		wait=new WebDriverWait(d,Duration.ofSeconds(5));
	}
	
	//Locators
	@FindBy(xpath="//span[normalize-space()='Shopping cart']")WebElement shoppingCart;
	@FindBy(xpath="//a[normalize-space()='Edit']")WebElement edit;
	@FindBy(id="product_attribute_80_2_37")WebElement brand;
	@FindBy(id="product_attribute_80_1_38")WebElement color;
	@FindBy(css="#add-to-cart-button-80")WebElement update;
	@FindBy(id="CountryId")WebElement dd1;
	@FindBy(id="ZipPostalCode")WebElement zipCode;
	@FindBy(xpath="//input[@name='estimateshipping']")WebElement estimate;
	@FindBy(id="termsofservice")WebElement condition;
	@FindBy(id="checkout")WebElement checkout;
	@FindBy(id="BillingNewAddress_CountryId")WebElement dd2;
	@FindBy(id="BillingNewAddress_City")WebElement city;
	@FindBy(id="BillingNewAddress_Address1")WebElement address;
	@FindBy(id="BillingNewAddress_ZipPostalCode")WebElement postalCode;
	@FindBy(id="BillingNewAddress_PhoneNumber")WebElement phoneNumber;
	@FindBy(xpath="//input[@onclick='Billing.save()']")WebElement continue1;
	@FindBy(id="PickUpInStore")WebElement inStorePickup;
	@FindBy(xpath="//input[@onclick='Shipping.save()']")WebElement continue2;
	@FindBy(xpath="//input[@id='paymentmethod_1']")WebElement check;
	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")WebElement continue4;
	@FindBy(css="input[class='button-1 payment-method-next-step-button']")WebElement Continue3;
	@FindBy(xpath="//input[@value='Confirm']")WebElement conform;
	
	//Action Methods
	public void clickShoppingcart() {
		wait.until(ExpectedConditions.elementToBeClickable(shoppingCart));
		shoppingCart.click();
	}
	
	public void clickEdit() {
		edit.click();
	}
	
	public void Brand(String text) {
		Select s1=new Select(brand);
		s1.selectByVisibleText(text);
	}
	
	public void Color(String text) {
		Select s2= new Select(color);
		s2.selectByVisibleText(text);
	}
	
	public void clickUpdate() {
		update.click();
	}
	
	public void dropdown1(String text) {
		Select s3=new Select(dd1);
		s3.selectByVisibleText(text);
	}
	
	public void code1(String num) {
		zipCode.sendKeys(num);
	}
	
	public void clickDateEstimate() {
		estimate.click();
	}
	
	public void clickTermsAndConditions() {
		condition.click();
	}
	
	public void clickCheckOut() {
		checkout.click();
	}
	
	public void dropdown2(String text) {
		Select s4=new Select(dd2);
		s4.selectByVisibleText(text);
	}
	
	public void City(String c) {
		city.sendKeys(c);
	}
	
	public void Address(String a) {
		address.sendKeys(a);
	}
	
	public void code2(String c) {
		postalCode.sendKeys(c);
	}
	
	public void Phnumber(String ph) {
		phoneNumber.sendKeys(ph);
	}
	
	public void clickContinue1() {
		wait.until(ExpectedConditions.elementToBeClickable(continue1));
		continue1.click();
	}
	
	public void clickinStorePickup() {
		wait.until(ExpectedConditions.elementToBeClickable(inStorePickup));
		inStorePickup.click();
	}
	
	public void clickContinue2() {
		wait.until(ExpectedConditions.elementToBeClickable(continue2));
		continue2.click();
	}
	
	public void clickCheck() {
		wait.until(ExpectedConditions.elementToBeClickable(check));
		check.click();
	}
	
	public void clickContinue3() {
		wait.until(ExpectedConditions.elementToBeClickable(Continue3));
		Continue3.click();
	}
	
	public void clickcontinue4() {
		wait.until(ExpectedConditions.elementToBeClickable(continue4));
		continue4.click();
	}
	
	public void clickconform() {
		wait.until(ExpectedConditions.elementToBeClickable(conform));
		conform.click();
	}
}
