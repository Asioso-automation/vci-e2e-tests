package com.platformX.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.page.KorekcijeRacunaZaNestandardneUsluge;
import com.platformX.page.LogIn;
import com.platformX.page.NaloziZaObracunNestandardnihUsluga;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Predracuni;
import com.platformX.page.RacuniZaNestandardneUsluge;

public class PX_081_Verifikacija_Sekcije_Nestandardne_Usluge_Test extends BaseTest {

	public PX_081_Verifikacija_Sekcije_Nestandardne_Usluge_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcije NESTANDARDNE USLUGE i verifikuje ih")
	public void px_081_verifikacija_sekcije_nestandardne_usluge_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		NaloziZaObracunNestandardnihUsluga naloziZaObracunNSU = pocetna.navigirajNaNaloziZaObracunNestandardnihUsluga();
		naloziZaObracunNSU.verifikujNaloziZaObracunNestandardnihUsluga();
		RacuniZaNestandardneUsluge racuniZaNSU = pocetna.navigirajNaRacuniZaNestandardneUsluge();
		racuniZaNSU.verifikujRacuniZaNestandardneUsluge();
		KorekcijeRacunaZaNestandardneUsluge korekcijeRacunaZaNSU = pocetna.navigirajNaKorekcijeRacunaZaNestandardneUsluge();
		korekcijeRacunaZaNSU.verifikujKorekcijeRacunaZaNestandardneUsluge();
		Predracuni predracuni = pocetna.navigirajNaPredracuni();
		predracuni.verifikujPredracuni();
	}
	
}
