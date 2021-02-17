package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.DjelatnostiPage;
import com.platformX.page.EntitetiPage;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.NaseljenaMjestaPage;
import com.platformX.page.OperativnaPodrucjaPage;
import com.platformX.page.OperatoriSistemaPage;
import com.platformX.page.OpstinePage;
import com.platformX.page.OrganizacijePage;
import com.platformX.page.PostePage;
import com.platformX.page.RadneJedinicePage;
import com.platformX.page.UlicePage;

public class QA_002_Verifikacija_Sekcije_Sifarnici_Test extends BaseTest {

	public QA_002_Verifikacija_Sekcije_Sifarnici_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice u sekciji SIFARNICI i verifikuje ih

	@Test
	public void qa_002_verifikacije_sekcije_sifarnici_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		OrganizacijePage organizacijePage = homePage.navigateToOrganizacije();
		organizacijePage.verifikujOrganizacijeStranicu();
		OperatoriSistemaPage operatoriSistemaPage = homePage.navigateToOperatoriSistema();
		operatoriSistemaPage.verifikujOperatoreSistemaStranicu();
		RadneJedinicePage radneJedinicePage = homePage.navigateToRadneJedinice();
		radneJedinicePage.verifikujRadneJedinice();
		OperativnaPodrucjaPage opertivnaPodrucjaPage = homePage.navigateToOperativnaPodrucja();
		opertivnaPodrucjaPage.verifikujOperativnaPodrucja();
		DjelatnostiPage djelatnostiPage = homePage.navigateToDjelatnosti();
		djelatnostiPage.verifikujDjelatnosti();
		EntitetiPage entitetiPage = homePage.navigateToEntiteti();
		entitetiPage.verifikujEntiteti();
		OpstinePage opstinePage = homePage.navigateToOpstine();
		opstinePage.verifikujOpstine();
		NaseljenaMjestaPage naseljenaMjestaPage = homePage.navigateToNaseljenaMjesta();
		naseljenaMjestaPage.verifikujNaseljenaMjesta();
		PostePage postePage = homePage.navigateToPoste();
		postePage.verifikujPoste();
		UlicePage ulicePage = homePage.navigateToUlice();
		ulicePage.verifikujUlice();
	}
}