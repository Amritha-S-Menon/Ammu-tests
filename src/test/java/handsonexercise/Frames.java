package handsonexercise;

import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

import org.testng.annotations.BeforeClass;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Frames {

	WebDriver driver;
	WebDriverManager webDrvMgr;
	WebDriverWait wait;


	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://demoqa.com/frames");
	}

	@Test
	public void framesTest() {
		driver.switchTo().frame("frame1");
		String header = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(header);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
