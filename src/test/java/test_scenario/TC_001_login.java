package test_scenario;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base_class;
import pages.Login_page;

public class TC_001_login extends Base_class {

	@Test(priority = 1)
	public void login_Field_Validation() {
		boolean validateLoginUIElements = new Login_page().validate_Login_page_webElements();
		Assert.assertTrue(validateLoginUIElements);
	}

	@Test(priority = 2)
	public void login_With_Valid_Credential() {
		new Login_page().enter_UserName("sritha").enter_Password("Sri@8344519409")
				.click_On_SignIn_Button_with_valid_credential().validate_home_page_webElements().click_on_logout().validate_Login_page_webElements();

	}

	@Test(priority = 3)
	public void login_With_In_Valide_Credential() {
		new Login_page().enter_UserName("sritha").enter_Password("sritha")
				.click_On_SignIn_Button_With_Invalid_Credential();
	}

}
