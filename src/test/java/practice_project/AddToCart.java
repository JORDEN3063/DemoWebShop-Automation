package practice_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	WebDriver d;
	
	//Constructor
	AddToCart(WebDriver d){
		this.d=d;
		PageFactory.initElements(d,this);
	}
	
	//Locators(Using PageFactory Approach)
	@FindBy(partialLinkText="Books") WebElement booksLink;
	@FindBy(id="products-orderby") WebElement dd;
	@FindBy(linkText="Fiction") WebElement SelectBook;
	@FindBy(id="addtocart_45_EnteredQuantity") WebElement Quantity;
	@FindBy(id="add-to-cart-button-45") WebElement ATC;
	
	//Action Methods
	public void clickBooks() {
		booksLink.click();
	}
	
	public void selectSortOption(String text) {
		Select s= new Select(dd);
		s.selectByVisibleText(text);
	}
	
	public void chooseBook() {
		SelectBook.click();
	}
	
	public void enterQuantity(String q) {
		Quantity.sendKeys(Keys.BACK_SPACE);
		Quantity.sendKeys(q);
	}
	
	public void addToCart() {
		ATC.click();
	}

}
