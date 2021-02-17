package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.OperativnaPodrucjaPage;

public class QA_014_Dodavanje_Operativnog_Podrucja_Test extends BaseTest {

	public QA_014_Dodavanje_Operativnog_Podrucja_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_014_dodavanje_operativnog_podrucja_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		OperativnaPodrucjaPage operativnaPodrucjaPage = homePage.navigateToOperativnaPodrucja();
		operativnaPodrucjaPage.verifikujOperativnaPodrucja();
		String operativnaPodrucja= operativnaPodrucjaPage.dodajOperativnoPodrucje();
		operativnaPodrucjaPage.verifikujOperativnoPodrucje(operativnaPodrucja);
	}

}