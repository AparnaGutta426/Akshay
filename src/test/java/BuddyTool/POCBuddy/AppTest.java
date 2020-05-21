package BuddyTool.POCBuddy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AppTest {
	
	public AppTest( String testName )
    {
    }
	
	@Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
        System.out.println("inside the code of demoBuddy");
        System.out.println("Development change 1");
        System.out.println("Development change 2");
        System.out.println("Development change 3");
        System.out.println("Development change 4");
        
    }
	
	private WebDriver driver; 
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Buddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Chrome/chromedriver.exe");
		//System.out.println(System.getProperty("user.dir")+"/Chrome/chromedriver.exe");
		//driver = new ChromeDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		//driver.navigate().to(appURL);
		//String getTitle = driver.getTitle();
		//Assert.assertEquals(getTitle, "Google");
		//System.out.println("The title is "+getTitle);
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
}
