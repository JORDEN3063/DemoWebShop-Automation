package practice_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver d;
	
	//Constructor
	Login(WebDriver d){
		this.d=d;
	}
	 
	//Locators
	By login_link_loc=By.xpath("//a[normalize-space()='Log in']");
	By email_loc=By.xpath("//input[@id='Email']");
    By password_loc=By.xpath("//input[@id='Password']");
    By remember_me_loc=By.xpath("//input[@id='RememberMe']");
    By login_loc=By.xpath("//input[@value='Log in']");

    //Action Methods
    public void clickLoginlink() {
    	d.findElement(login_link_loc).click();
    }
    
    public void enterEmail(String email) {
    	d.findElement(email_loc).sendKeys(email);
    }
    
    public void enterPassword(String password) {
    	d.findElement(password_loc).sendKeys(password);
    }
    
    public void clickRememberMe() {
    	d.findElement(remember_me_loc).click();
    }
    
    public void clickLoginButton() {
    	d.findElement(login_loc).click();
    }
}
