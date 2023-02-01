package test_scenario;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base_class;
import pages.Login_page;

public class TC_001_login extends Base_class {
	
	@BeforeTest
	public void data_setup() {
		sheet_name="login";
	}

	@Test(priority = 1)
	public void login_Field_Validation() {
		boolean validateLoginUIElements = new Login_page(driver).validate_Login_page_webElements();
		Assert.assertTrue(validateLoginUIElements);
	}

	@Test(priority = 2, dataProvider = "ui_login")
	public void login_With_Valid_Credential(String user_name, String password) {
		new Login_page(driver).enter_UserName(user_name).enter_Password(password)
				.click_On_SignIn_Button_with_valid_credential().validate_home_page_webElements().click_on_logout().validate_Login_page_webElements();

	}

	@Test(priority = 3)
	public void login_With_In_Valide_Credential() {
		new Login_page(driver).enter_UserName("sritha").enter_Password("sritha")
				.click_On_SignIn_Button_With_Invalid_Credential();
	}

}
