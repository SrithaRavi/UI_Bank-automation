package test_scenario;

import java.util.Random;

import org.testng.annotations.Test;

import base.Base_class;
import libraries.Random_integer;
import pages.Login_page;
import pages.registor_page;

public class TC_002_Registor_for_new_account extends Base_class {

	public int getRandomIntNumber(int start, int end) {
		Random ran = new Random();
		int result = ran.nextInt((end - start) + 1) + 1;
		return result;
	}

	@Test(priority = 1)
	public void validate_registor_page_element() {
		new Login_page().click_on_registor_for_account_link().validate_registor_page_webElements()
				.click_on_navigate_ui_logo();
		;
	}

	//@Test(priority = 2)
	public void registor_for_new_account_with_mandatory_fields() {
		new Login_page().click_on_registor_for_account_link().select_Title(new registor_page().title[0])
				.select_Gender(new registor_page().gender[0]).enter_UserName("stitha")
				.enter_Email("Sritha" + getRandomIntNumber(10, 99) + "@gmail.com")
				.enter_Password("sritha" + getRandomIntNumber(10, 99)).click_On_Register_Button().click_On_UILogo();
	}

	@Test(priority = 3)
	public void registor_for_new_account_with_all_fields() {
		new Login_page().click_on_registor_for_account_link().enter_FirstName("sritha" + getRandomIntNumber(10, 99))
				.select_Title(new registor_page().title[0]).enter_MiddleName("santhi").enter_LastName("ravi")
				.select_Gender(new registor_page().gender[0])
				.select_employment_Status(new registor_page().employment_Status[2]).enter_age_textBox("05/05/1995")
				.select_maritalStatus(new registor_page().maritalStatus[0]).enter_numberOfDependents("2")
				.enter_UserName("stitha").enter_Email("Sritha" + getRandomIntNumber(10, 99) + "@gmail.com")
				.enter_Password("sritha" + getRandomIntNumber(10, 99)).click_On_Register_Button().click_On_UILogo();
	}

}
