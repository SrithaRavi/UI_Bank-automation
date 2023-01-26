package pages;

import org.openqa.selenium.By;

import base.Base_class;

public class Login_page extends Base_class {
	private By oUsernameText = By.id("username");
	private By oPasswordText = By.id("password");
	private By oSignInBtn = By.xpath("//button[text()='Sign In']");
	private By oForgotLink = By.xpath("//*[text()='Register For Account']");
	private By oRegisterLink = By.xpath("//*[text()='Register For Account']");
	private By oLoginFailedInnerText = By.xpath("//div[contains(text(),'login failed')]");
	
	public boolean validateLoginUIElements() {
		if(driver.findElement(oUsernameText).isDisplayed() && 
				driver.findElement(oPasswordText).isDisplayed() &&
				driver.findElement(oSignInBtn).isDisplayed() && 
				driver.findElement(oForgotLink).isDisplayed() &&
				driver.findElement(oRegisterLink).isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	public Login_page enter_UserName(String uName) {
		driver.findElement(oUsernameText).sendKeys(uName);
		return this;
	}
	
	public Login_page enter_Password(String password) {
		driver.findElement(oPasswordText).sendKeys(password);
		return this;
	}
	
	public Home_page click_On_SignIn_Button_with_valid_credential() {
		driver.findElement(oSignInBtn).click();
		return new Home_page();
	}
	
	public Login_page click_On_SignIn_Button_With_Invalid_Credential() {
		driver.findElement(oSignInBtn).click();
		return this;
	}

}
