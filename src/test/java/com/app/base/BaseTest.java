package com.app.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.app.util.PropertiesUtil;

public abstract class BaseTest {

	protected WebDriver driver;
	protected PropertiesUtil vci_properties = null;
	protected final String VCI_PROPERTIES = "vci.properties";

	static long startTime;
	static long endTime;
	static long duration;
	static double seconds;
	static float minutes;

	public BaseTest() throws IOException, FileNotFoundException {
		vci_properties = new PropertiesUtil(VCI_PROPERTIES);
	}

	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(@Optional("firefox") String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			FirefoxProfile profile = new FirefoxProfile();
	        profile.setPreference("security.sandbox.content.level", 5);
	        profile.setPreference("browser.privatebrowsing.autostart", true);
	        profile.setPreference("dom.disable_beforeunload", true);
	        FirefoxOptions options = new FirefoxOptions();
	        options.setProfile(profile);
	        options.addArguments("--headless"); // Enable headless mode
	        options.addArguments("--width=1920");  // Optional width
	        options.addArguments("--height=1080"); // Optional height
	        driver = new FirefoxDriver(options);
	        driver.manage().window().maximize(); // (Optional) still fine in headless mode
		} else if (browser.equalsIgnoreCase("chrome")) {
			try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--window-size=1466,768");
			options.addArguments("guest");
			options.addArguments("chrome.switches", "--disable-extensions");
			driver = new ChromeDriver(options);
			} catch (Exception e) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		    ChromeOptions options = new ChromeOptions();
			options.setBinary("C://Program Files//Google//Chrome//Application//chrome.exe");
		    options.addArguments("--start-maximized");
//			options.addArguments("--window-size=1466,768");
			options.addArguments("guest");
			options.addArguments("chrome.switches", "--disable-extensions");
			driver = new ChromeDriver(options);
			  }
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			driver = new EdgeDriver(options);
		}
		else {
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		startTime = System.currentTimeMillis();
	}

	@AfterMethod
	public void cleanUp() {
 	driver.quit();
	endTime = System.currentTimeMillis();
	duration = endTime - startTime;
	seconds = (double)duration/1000.0;
	DecimalFormat df = new DecimalFormat();
	df.setMaximumFractionDigits(2);
	if (seconds>30) {
		minutes = (float) (seconds/30);
		System.out.println("Time taken to execute test: " + df.format(minutes) + " minutes");
	}
	else
		
		System.out.println("Time taken to execute test: " + df.format(seconds) + " seconds");
	}
	
}