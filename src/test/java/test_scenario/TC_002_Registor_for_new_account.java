package test_scenario;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.Test;

import base.Base_class;
import pages.Login_page;
import pages.Registor_page;
import utilities.Faker_Data_Factory;

public class TC_002_Registor_for_new_account extends Base_class {

	@Test(priority = 1)
	public void validate_registor_page_element() {
		new Login_page(driver).click_on_registor_for_account_link().validate_registor_page_webElements()
				.click_on_navigate_ui_logo();
		;
	}

	@Test(priority = 2, invocationCount = 5)
	public void registor_for_new_account_with_mandatory_fields() {
		new Login_page(driver).click_on_registor_for_account_link().select_Title(Faker_Data_Factory.title())
				.select_Gender(Faker_Data_Factory.gender()).enter_UserName(Faker_Data_Factory.user_name())
				.enter_Email(Faker_Data_Factory.email_id()).enter_Password(Faker_Data_Factory.password())
				.click_On_Register_Button().verify_User_Registration().click_On_UILogo().validate_Login_page_webElements();

	}

	@Test(priority = 3, invocationCount = 5)
	public void registor_for_new_account_with_all_fields() {
		boolean result = new Login_page(driver).click_on_registor_for_account_link().enter_FirstName(Faker_Data_Factory.first_name())
				.select_Title(Faker_Data_Factory.title()).enter_MiddleName(Faker_Data_Factory.middle_name())
				.enter_LastName(Faker_Data_Factory.last_name()).select_Gender(Faker_Data_Factory.gender())
				.select_employment_Status(Faker_Data_Factory.employment_status())
				.enter_age_textBox(Faker_Data_Factory.age_mmddyy())
				.select_maritalStatus(Faker_Data_Factory.marital_status())
				.enter_numberOfDependents(Faker_Data_Factory.number_of_dependents())
				.enter_UserName(Faker_Data_Factory.user_name()).enter_Email(Faker_Data_Factory.email_id())
				.enter_Password(Faker_Data_Factory.password()).click_On_Register_Button().verify_User_Registration().click_On_UILogo()
				.validate_Login_page_webElements();
		assertTrue(result);
	}

}
