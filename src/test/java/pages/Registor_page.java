package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base_class;

public class Registor_page extends Base_class{
	
	private By firstName_TextBox = By.id("firstName");
	private By Title_select_Tag = By.id("title");
	private By gender_select_tag = By.id("sex");
	private By middleName_textBox=By.id("middleName");
	private By lastName_text_box=By.id("lastName");
	private By employment_Status_select_tag=By.id("employmentStatus");
	private By age_textBox=By.id("age");
	private By maritalStatus_select_tag=By.id("maritalStatus");
	private By numberOfDependents_textBox=By.id("numberOfDependents");
	private By username_textBox=By.id("username");
	private By email_textBox=By.id("email");
	private By password_textBox=By.id("password");
	private By registor_Button = By.xpath("//button[text()='Register']");
	private By ui_Logo = By.xpath("//a[@class='navbar-brand']");
	
	public Login_page click_on_navigate_ui_logo() {
		driver.findElement(ui_Logo).click();
		return new Login_page();
	}
	
	public Registor_page validate_registor_page_webElements() {
		if(driver.findElement(firstName_TextBox).isDisplayed()
				&& driver.findElement(Title_select_Tag).isDisplayed()
				&& driver.findElement(gender_select_tag).isDisplayed()
				&& driver.findElement(middleName_textBox).isDisplayed()
				&& driver.findElement(lastName_text_box).isDisplayed()
				&& driver.findElement(employment_Status_select_tag).isDisplayed()
				&& driver.findElement(age_textBox).isDisplayed()
				&& driver.findElement(maritalStatus_select_tag).isDisplayed()
				&& driver.findElement(numberOfDependents_textBox).isDisplayed()
				&& driver.findElement(username_textBox).isDisplayed()
				&& driver.findElement(email_textBox).isDisplayed()
				&& driver.findElement(password_textBox).isDisplayed()
				&& driver.findElement(registor_Button).isDisplayed()) {
			System.out.println("usre has landed to the correct page  All the elements of registor page is displayed");
		}else {
			System.out.println("usre has not landed to the correct page");
		}
		return this;
	}
	
	public Registor_page enter_FirstName(String first_Name) {
		driver.findElement(firstName_TextBox).sendKeys(first_Name);
		return this;
	}
	
	public Registor_page select_Title(String title) {
		Select select = new Select(driver.findElement(Title_select_Tag));
		select.selectByVisibleText(title);
		return this;
	}
	
	public Registor_page enter_MiddleName(String mName) {
		driver.findElement(middleName_textBox).sendKeys(mName);
		return this;
	}
	
	public Registor_page enter_LastName(String lName) {
		driver.findElement(lastName_text_box).sendKeys(lName);
		return this;
	}
	
	public Registor_page select_Gender(String gender) {
		Select select = new Select(driver.findElement(gender_select_tag));
		select.selectByVisibleText(gender);
		return this;
	}
	
	public Registor_page select_employment_Status(String employment_status) {
		Select select=new Select(driver.findElement(employment_Status_select_tag));
		select.selectByVisibleText(employment_status);
		return this;
	}
	
	public Registor_page enter_age_textBox(String age) {
		driver.findElement(age_textBox).sendKeys(age);
		return this;
	}
	
	public Registor_page select_maritalStatus(String marital_status) {
		Select select = new Select(driver.findElement(maritalStatus_select_tag));
		select.selectByVisibleText(marital_status);
		return this;
	}
	
	public Registor_page enter_numberOfDependents(String no_of_dependencies) {
		driver.findElement(numberOfDependents_textBox).sendKeys(no_of_dependencies);
		return this;
	}
	public Registor_page enter_UserName(String uName) {
		driver.findElement(username_textBox).sendKeys(uName);
		return this;
	}
	
	public Registor_page enter_Email(String email) {
		driver.findElement(email_textBox).sendKeys(email);
		return this;
	}
	
	public Registor_page enter_Password(String password) {
		driver.findElement(password_textBox).sendKeys(password);
		return this;
	}
	
	public Email_Verification_Page click_On_Register_Button() {
		driver.findElement(registor_Button).click();
		return new Email_Verification_Page(); 
	}

}
