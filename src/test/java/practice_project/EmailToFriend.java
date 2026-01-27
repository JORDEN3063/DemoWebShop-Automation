package practice_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmailToFriend {
	WebDriver d;
	
	//Construtor
	EmailToFriend(WebDriver d){
		this.d=d;
		PageFactory.initElements(d,this);
	}
	
	//Locators
	@FindBy(partialLinkText="Jewel")WebElement jewelLink;
	@FindBy(id="products-orderby")WebElement dd;
	@FindBy(xpath="//a[normalize-space()='Black & White Diamond Heart']")WebElement bwdLink;
	@FindBy(xpath="//input[@value='Email a friend']")WebElement emailLink;
	@FindBy(id="FriendEmail")WebElement friendEmail;
	@FindBy(id="PersonalMessage")WebElement personalMessage;
	@FindBy(name="send-email")WebElement sendEmail;
	
	//Action Methods
	public void clickJewel() {
		jewelLink.click();
	}
	
	public void dropdown(String text) {
		Select s=new Select(dd);
		s.selectByVisibleText(text);
	}
	
	public void clickjewl() {
		 bwdLink.click();
	}
	
	public void clickEmail() {
		emailLink.click();
	}
	
	public void emailFriend(String email) {
		friendEmail.sendKeys(email);
	}
		
	public void personalMessage(String txt) {
		personalMessage.sendKeys(txt);
	}
	
	public void emaliSend() {
		sendEmail.click();
	}
}
