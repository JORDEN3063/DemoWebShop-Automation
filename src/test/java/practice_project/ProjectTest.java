package practice_project;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectTest {
	WebDriver d;
	
	@BeforeClass
	void setup() {
		d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
	}
	
	@Test(priority=1)
	void TestLogin(){
		Login login=new Login(d);
		login.clickLoginlink();
		login.enterEmail("joe30062003@gmail.com");
		login.enterPassword("JOE@3063");
		login.clickRememberMe();
		login.clickLoginButton();
	}
	
	@Test(priority=2)
	void TestAddToCart() {
		AddToCart atc=new AddToCart(d);
		atc.clickBooks();
		atc.selectSortOption("Price: Low to High");
		atc.chooseBook();
		atc.enterQuantity("3");
		atc. addToCart();
	}
	
	@Test(priority=3)
	void TestAddToCart2() {
		AddToCart2 atc2=new AddToCart2(d);
		atc2.clickElectronics();
		atc2.clickPhone();
		atc2.clickatc();
	}
	
	@Test(priority=4)
	void TestAddToCart3() {
		AddToCart3 atc3=new AddToCart3(d);
		atc3.clickElectronics();
		atc3.clickCellPhones();
		atc3.clickPhoneCover();
		atc3.Brand("Apple");
		atc3.Color("White");
		atc3.clickAddToCart();
	}
	
	@Test(priority=6)
	void TestEmailToFriend() {
		EmailToFriend ef=new EmailToFriend(d);
		ef.clickJewel();
		ef.dropdown("Price: Low to High");
		ef.clickjewl();
		ef.clickEmail() ;
		ef.emailFriend("jorden.3062003@gmail.com");
		ef.personalMessage("Hey Check This Out");
		ef.emaliSend();
	}
	
	@Test(priority=5)
	void TestAddToWishlist() {
		AddToWishList atw=new AddToWishList(d);
		atw.clickElectronics();
		atw.clickCellPhone();
		atw. clickPhone();
		atw.clickAddToWishlist();
	}
	
	@Test(priority=7)
	void TestCheckout() {
		Checkout c=new Checkout(d);
		c.clickShoppingcart();
		c.clickEdit();
		c.Brand("Samsung");
		c.Color("Black");
		c.clickUpdate();
		c.clickShoppingcart();
		c.dropdown1("India");
		c. code1("600081");
		c.clickDateEstimate();
		c.clickTermsAndConditions();
		c.clickCheckOut();
		c.dropdown2("India");
		c.City("Chennai");
		c.Address("B-10, No-108, Prince Apartment Eliya Streen Thondiarpet");
		c.code2("600081");
		c.Phnumber("6512487920");
		c.clickContinue1();
		c.clickinStorePickup();
		c.clickContinue2();
		c.clickCheck();
		c.clickContinue3();
		c.clickcontinue4();
		c.clickconform();
	}
	
	@Test(priority=8) 
	void TestLogOut() { 
    LogOut lo=new LogOut(d);
	lo.clickLoogout(); 
	}
	 
	
	
	
	
	  @AfterClass 
	  void tearDown(){ 
		  d.quit(); 
		  }
	 
	 
	 
	 	 
}
