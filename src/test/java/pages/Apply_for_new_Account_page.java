package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.Base_class;

public class Apply_for_new_Account_page extends Base_class {
	private By acc_nickname = By.id("accountNickname");
	private By type_Of_Account_Select_tag = By.id("typeOfAccount");
	private String type_of_account[] = { "Savings", "Checking" };
	private By apply = By.xpath("//button[text()='Apply']");
	private WebDriver driver;

	public Apply_for_new_Account_page(WebDriver driver) {
		this.driver = driver;
	}

	public Apply_for_new_Account_page enter_account_nicname() {
		driver.findElement(acc_nickname).sendKeys("sritha");
		return this;
	}

	public Apply_for_new_Account_page select_type_of_account(String account_type) {
		Select oselect = new Select(driver.findElement(type_Of_Account_Select_tag));
		oselect.deselectByVisibleText(account_type);
		return this;
	}

	public Home_page click_on_apply() {
		driver.findElement(apply).click();
		return new Home_page(driver);
	}
}
