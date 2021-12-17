package framework.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.DataProvider;
import utilities.selenium.WebDriverManager;

public class Assesment4 {

	WebDriver driver;
	WebDriverManager webDrvMgr;
	SoftAssert sf;

	// Test input
	private String propFile = "src/test/resources/base.prop";
	private String url = DataProvider.getTestData(propFile, "url");
	private String searchParam = DataProvider.getTestData(propFile, "searchParam");
	
	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		driver.get(url);
	}
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
		
	}
	
	@Test
	public void assaignmetTest() {
		sf.assertAll();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
