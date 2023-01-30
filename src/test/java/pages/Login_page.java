package pages;

import org.openqa.selenium.By;

import base.Base_class;

public class Login_page extends Base_class {
	private By username_Text_box = By.id("username");
	private By password_Text_box = By.id("password");
	private By signIn_Button = By.xpath("//button[text()='Sign In']");
	private By forgot_password_Link = By.xpath("//*[text()='Register For Account']");
	private By register_for_newAccount_Link = By.xpath("//*[text()='Register For Account']");
	private By login_Failed_Inner_Text = By.xpath("//div[contains(text(),'login failed')]");
	
	public boolean validate_Login_page_webElements() {
		if(driver.findElement(username_Text_box).isDisplayed() && 
				driver.findElement(password_Text_box).isDisplayed() &&
				driver.findElement(signIn_Button).isDisplayed() && 
				driver.findElement(forgot_password_Link).isDisplayed() &&
				driver.findElement(register_for_newAccount_Link).isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	public Login_page enter_UserName(String uName) {
		driver.findElement(username_Text_box).sendKeys(uName);
		return this;
	}
	
	public Login_page enter_Password(String password) {
		driver.findElement(password_Text_box).sendKeys(password);
		return this;
	}
	
	public Home_page click_On_SignIn_Button_with_valid_credential() {
		driver.findElement(signIn_Button).click();
		return new Home_page();
	}
	
	public Login_page click_On_SignIn_Button_With_Invalid_Credential() {
		driver.findElement(signIn_Button).click();
		driver.findElement(login_Failed_Inner_Text).isDisplayed();
		return this;
	}
	
	public registor_page click_on_registor_for_account_link() {
		driver.findElement(register_for_newAccount_Link).click();
		return new registor_page();
	}

}
