package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.TarifneGrupe;
import com.platformX.page.LogInPage;

public class QA_048_Izmjena_Tarifne_Grupe_Test extends BaseTest {

	public QA_048_Izmjena_Tarifne_Grupe_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_048_izmjena_tarifne_grupe_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		String tarifnaGrupa = tarifneGrupe.dodajTarifnuGrupu();
		tarifneGrupe.verifikujTarifnuGrupu(tarifnaGrupa);
		String novaTarifnaGrupa = tarifneGrupe.izmjeniTarifnuGrupu();
		tarifneGrupe.verifikujTarifnuGrupu(novaTarifnaGrupa);
	}

}