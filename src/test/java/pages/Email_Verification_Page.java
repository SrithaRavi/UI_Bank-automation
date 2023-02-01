package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base_class;

public class Email_Verification_Page extends Base_class {
	private By oWelcome = By.xpath("//h2[contains(text(),'Welcome To The UiBank Family!')]");
	//private By oLogin = By.linkText("Login");
	private By oUILogo = By.xpath("//a[@class='navbar-brand']");
   private WebDriver driver;
   
   public Email_Verification_Page(WebDriver driver) {
	   this.driver=driver;
   }
		
	public Email_Verification_Page verify_User_Registration() {
		boolean displayed = driver.findElement(oWelcome).isDisplayed();
		if(displayed) {
			System.out.println("User Registration is Successfull!!!");
		}else {
			System.out.println("User Registration is Not Successfull!!!");
		}
		return this;
	} 
	
	public Login_page click_On_UILogo() {
		driver.findElement(oUILogo).click();
		return new Login_page(driver);
	}

}
