package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import base.Base_class;

public class Apply_for_new_Account_page extends Base_class {
	By acc_nickname = By.id("accountNickname");
	By type_Of_Account_Select_tag = By.id("typeOfAccount");
	String type_of_account[]= {"Savings","Checking"};
	By apply = By.xpath("//button[text()='Apply']");
	
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
		return new Home_page();
	}
}
