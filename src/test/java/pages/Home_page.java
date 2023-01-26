package pages;

import org.openqa.selenium.By;

import base.Base_class;

public class Home_page extends Base_class{

	private By oWelcome = By.xpath("//h3[contains(text(),' Welcome!')]");
	private By oLogout = By.xpath("//a[text()='Logout']");
	By apply_for_new_account = By.xpath("//div[text()='Apply For New Account']");
	By profile = By.xpath("//a[text()='Profile']");
	By logout = By.xpath("//a[text()='Logout']");
}
