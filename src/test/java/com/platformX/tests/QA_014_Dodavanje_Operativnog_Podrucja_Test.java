package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.OperativnaPodrucja;

public class QA_014_Dodavanje_Operativnog_Podrucja_Test extends BaseTest {

	public QA_014_Dodavanje_Operativnog_Podrucja_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_014_dodavanje_operativnog_podrucja_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		OperativnaPodrucja operativnaPodrucja = homePage.navigirajNaOperativnaPodrucja();
		operativnaPodrucja.verifikujOperativnaPodrucja();
		String podrucje = operativnaPodrucja.dodajOperativnoPodrucje();
		operativnaPodrucja.verifikujOperativnoPodrucje(podrucje);
	}

}