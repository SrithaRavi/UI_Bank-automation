package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.Base_class;

public class Home_page extends Base_class{

	private By Welcome_text = By.xpath("//h3[contains(text(),' Welcome!')]");
	private By Logout_link = By.xpath("//a[text()='Logout']");
	private By apply_for_new_account_button = By.xpath("//div[text()='Apply For New Account']");
	private By profile_link = By.xpath("//a[text()='Profile']");

	
	public Home_page validate_home_page_webElements() {
		if(driver.findElement(Welcome_text).isDisplayed()
				&& driver.findElement(Logout_link).isDisplayed() 
				&& driver.findElement(apply_for_new_account_button).isDisplayed()
				&& driver.findElement(profile_link).isDisplayed()) {
			    Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		return this;
	}
	
	public Login_page click_on_logout() {
		driver.findElement(Logout_link).click();
		return new Login_page();
	}
	
	public Apply_for_new_Account_page click_on_apply_for_new_account() {
		driver.findElement(apply_for_new_account_button).click();
		return new Apply_for_new_Account_page();
	}
}
