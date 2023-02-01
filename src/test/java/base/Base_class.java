package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import utilities.Excel_reader;
import utilities.propertiesReader;

public class Base_class {

	public WebDriver driver;
	public String browserType = propertiesReader.property_file_reader("environmental_details", "browser_type");
	public String url = propertiesReader.property_file_reader("environmental_details", "production");
    public String sheet_name="";
	@BeforeClass
	public void invokingBrowser() {
		switch (browserType.toLowerCase()) {
		case "chrome":
			System.out.println("User option is : " + browserType + " ,So invoking Chrome Browser. ");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.out.println("User option is : " + browserType + " ,So invoking FF Browser. ");
			driver = new FirefoxDriver();
			break;

		case "edge":
			System.out.println("User option is : " + browserType + " ,So invoking Edge Browser. ");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("User option is wrong : " + browserType + " ,So invoking the default Chrome Browser. ");
			driver = new ChromeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@DataProvider(name = "ui_login")
	public Object[][] login_data() {
		Object[][] loginDatas = Excel_reader.read_from_ui_login_excel_file(sheet_name);
		return loginDatas;
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
