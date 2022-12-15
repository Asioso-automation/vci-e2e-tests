package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.ObracunskiUgovori;
import com.platformX.distribution.page.ZahtjeviZaObracunskeUgovore;
import com.platformX.distribution.page.ZahtjeviZaRaskidUgovora;
import com.platformX.distribution.page.LogIn;

public class PX_DIST_009_Verifikacija_Sekcije_Obracunski_Ugovori_Test extends BaseTest {

	public PX_DIST_009_Verifikacija_Sekcije_Obracunski_Ugovori_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije OBRACUNSKI UGOVORI i verifikuje ih")
	public void px_dist_009_verifikacija_sekcije_obracunski_ugovori_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		ObracunskiUgovori obracunskiUgovori = pocetna.navigirajNaObracunskiUgovori();
		obracunskiUgovori.verifikujObracunskiUgovori();
		ZahtjeviZaObracunskeUgovore zahtjeviZaObracunskeUgovore = pocetna.navigirajNaZahtjeviZaObracunskeUgovore();
		zahtjeviZaObracunskeUgovore.verifikujZahtjeviZaObracunskeUgovore();
		ZahtjeviZaRaskidUgovora zahtjeviZaRaskidUgovora = pocetna.navigirajNaZahtjeviZaRaskidUgovora();
		zahtjeviZaRaskidUgovora.verifikujZahtjeviZaRaskidUgovora();
	}

}