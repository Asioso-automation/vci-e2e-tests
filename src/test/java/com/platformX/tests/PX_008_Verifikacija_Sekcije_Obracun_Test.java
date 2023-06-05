package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.AvansneFakture;
import com.platformX.page.ImportiKorekcija;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KamatePage;
import com.platformX.page.KorekcijeKamate;
import com.platformX.page.KorekcijeRacuna;
import com.platformX.page.KupciZaTestneRacune;
import com.platformX.page.LogIn;
import com.platformX.page.MasovnoGenerisanjeRacuna;
import com.platformX.page.NaloziZaObracun;
import com.platformX.page.Racuni;
import com.platformX.page.TefObrazac;
import com.platformX.page.UmanjenjaCijene;

public class PX_008_Verifikacija_Sekcije_Obracun_Test extends BaseTest {

	public PX_008_Verifikacija_Sekcije_Obracun_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcije OBRAČUN i verifikuje ih")
	public void px_008_verifikacija_sekcije_obracun_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		NaloziZaObracun naloziZaObracun = pocetna.navigirajNaNaloziZaObracun();
		naloziZaObracun.verifikujNaloziZaObracun();
		Racuni racuni = pocetna.navigirajNaRacuni();
		racuni.verifikujRacuni();
		MasovnoGenerisanjeRacuna masovnoGenerisanjeRacuna = pocetna.navigirajNaMasovnoGenerisanjeRacuna();
		masovnoGenerisanjeRacuna.verifikujMasovnoGenerisanjeRacuna();
		KorekcijeRacuna korekcijeRacuna = pocetna.navigirajNaKorekcijeRacuna();
		korekcijeRacuna.verifikujKorekcijeRacuna();
		ImportiKorekcija importiKorekcija = pocetna.navigirajNaImporteKorekcija();
		importiKorekcija.verifikujImporteKorekcija();
		KamatePage kamatePage = pocetna.navigirajNaKamate();
		kamatePage.verifikujKamate();
		KorekcijeKamate korekcijeKamatePage = pocetna.navigateToKorekcijeKamate();
		korekcijeKamatePage.verifikujKorekcijeKamate();
		AvansneFakture avansneFakture = pocetna.navigirajNaAvansneFakture();
		avansneFakture.verifikujAvansneFakture();
		UmanjenjaCijene umanjenjaCijene = pocetna.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		TefObrazac tef = pocetna.navigirajNaTefObrazac();
		tef.verifikujTefObrazac();
		KupciZaTestneRacune kupciZaTestneRacune = pocetna.navigirajNaKupciZaTestneRacune();
		kupciZaTestneRacune.verifikujKupciZaTestneRacune();
	}
	
}