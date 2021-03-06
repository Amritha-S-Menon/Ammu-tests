package assesments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class Assesment3 {
	WebDriver driver;
	WebDriverManager webDrvMgr;
	SoftAssert sf;
	WebDriverWait wait;
	WebDriverUtilities webDrvUtil;
	
	
	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		webDrvUtil = new WebDriverUtilities(driver);
		driver.get("https://demoqa.com/browser-windows/");
	}
	
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
		
	}
	

	@Test
	public void assaignmentTest() {
		sf.assertAll();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
