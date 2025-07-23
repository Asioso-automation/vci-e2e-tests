package com.application.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.app.base.BaseTest;
import com.app.base.RetryAnalyzer;
import com.application.page.Homepage;
import com.application.page.LogIn;
import com.application.page.Newsletter;

public class VCI_003_Newsletter_Test extends BaseTest{

	public VCI_003_Newsletter_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="Verifikacija newsletter stranice", retryAnalyzer = RetryAnalyzer.class, enabled=false)
	public void vci_003_verify_newsletter_test() throws Exception {
		Homepage homepage = new Homepage(driver, VCI_PROPERTIES); // kreira se objekat klase Homepage koji kupi webdriver i vrijednosti iz properties file-a
		homepage.verifikujPocetnuStranicu(false);
		homepage.navigateToHomepage();
		LogIn loginpage = homepage.navigateToLoginPage(); // kreiramo objekat klase LogIn kojem pridruzujemo vrijednost koju vraca metoda navigateToLoginPage (sa homepage-a)
		loginpage.verifikujLogIn();
		loginpage.logIn();
		homepage.verifikujPocetnuStranicu(true);
		Newsletter newsletter = homepage.navigateToNewsletterPage();
		newsletter.verifyNewsletterPage();
		// de/aktivacija newslettera true
		// verifikacija checkboxa
		// logout
		// verifikacija početne false
		// login
		// verifikacija početne true
		// navigacija na newsletter
		// verifikacija newsletter page
		// verifikacija checkboxa
		// de/aktivacija newslettera false
	}
	
}

// Ostale metode iz newsletter stranice