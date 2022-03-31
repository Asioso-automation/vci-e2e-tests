package com.platformX.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.platformX.util.PropertiesUtil;

public class BaseTest {

	protected WebDriver driver;
	protected PropertiesUtil platformx_properties = null;
	protected final String PLATFORMX_PROPERTIES = "platformx.properties";

	static long startTime;
	static long endTime;
	static long duration;
	static double seconds;
	static float minutes;

	public BaseTest() throws IOException, FileNotFoundException {
		platformx_properties = new PropertiesUtil(PLATFORMX_PROPERTIES);
	}

	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("security.sandbox.content.level", 5);
			profile.setPreference("browser.privatebrowsing.autostart", true);
			profile.setPreference("dom.disable_beforeunload", true);
			FirefoxOptions options = new FirefoxOptions();
			options.setProfile(profile);
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--window-size=1366,768");
			options.addArguments("incognito");
			options.addArguments("chrome.switches", "--disable-extensions");
			driver = new ChromeDriver(options);
		} else {
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
	if (seconds>60) {
		minutes = (float) (seconds/60);
		System.out.println("Time taken to execute test: " + df.format(minutes) + " minutes");
	}
	else
		
		System.out.println("Time taken to execute test: " + df.format(seconds) + " seconds");
	}
	
}