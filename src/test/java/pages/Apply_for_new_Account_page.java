package pages;

import org.openqa.selenium.By;

import base.Base_class;

public class Apply_for_new_Account_page extends Base_class {
	By acc_nickname = By.id("accountNickname");
	By typeOfAccount_Seleecttag = By.id("typeOfAccount");
	String type_of_account[]= {"Savings","Checking"};
	By apply = By.xpath("//button[text()='Apply']");
}
