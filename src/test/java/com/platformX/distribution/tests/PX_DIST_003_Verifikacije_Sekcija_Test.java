package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.*;

public class PX_DIST_003_Verifikacije_Sekcija_Test extends BaseTest {

	public PX_DIST_003_Verifikacije_Sekcija_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test1() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		// Nova implementacija za navigaciju:
		Organizacije organizacije = homePage.navigateOnPage("PXD", Organizacije.class, "Šifarnici", "Organizacije");
		organizacije.verifikujOrganizacije();
		TerenskeJedinice terenskeJedinice = homePage.navigateOnPage("PXD", TerenskeJedinice.class, "Šifarnici", "Terenske jedinice");
		terenskeJedinice.verifikujTerenskeJedinice();
		FizickeLokacije fizickeLokacije = homePage.navigateOnPage("PXD", FizickeLokacije.class, "Šifarnici", "Fizičke lokacije");
		fizickeLokacije.verifikujFizickeLokacije();
		Snabdjevaci snabdjevaci = homePage.navigateOnPage("PXD", Snabdjevaci.class, "Šifarnici", "Snabdjevači");
		snabdjevaci.verifikujSnabdjevaci();
		Citaci citaci = homePage.navigateOnPage("PXD", Citaci.class, "Šifarnici", "Čitači");
		citaci.verifikujCitaci();
		Entiteti entiteti = homePage.navigateOnPage("PXD", Entiteti.class, "Šifarnici", "Entiteti");
		entiteti.verifikujEntitete();
		Opstine opstine = homePage.navigateOnPage("PXD", Opstine.class, "Šifarnici", "Opštine");
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = homePage.navigateOnPage("PXD", NaseljenaMjesta.class, "Šifarnici", "Naseljena mjesta");
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = homePage.navigateOnPage("PXD", Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		Ulice ulice = homePage.navigateOnPage("PXD", Ulice.class, "Šifarnici", "Ulice");
		ulice.verifikujUlice();
		Monteri monteri = homePage.navigateOnPage("PXD", Monteri.class, "Šifarnici", "Monteri");
		monteri.verifikujMonteri();
		LokacijeMontera lokacije = homePage.navigateOnPage("PXD", LokacijeMontera.class, "Šifarnici", "Lokacije montera");
		lokacije.verifikujLokacijeMontera();
		VrstePodrucja vrstePodrucja = homePage.navigateOnPage("PXD", VrstePodrucja.class, "Šifarnici", "Vrste područja");
		vrstePodrucja.verifikujVrstePodrucja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz podsekcije SIFARNICI ZA ZAPISNIKE i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test2() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		VrsteObjekata vrsteObjekata = homePage.navigateOnPage("PXD", VrsteObjekata.class, "Šifarnici", "Vrste objekata");
		vrsteObjekata.verifikujVrsteObjekata();
		LokacijeMjernihMjesta lokacijeMjernihMjesta = homePage.navigateOnPage("PXD", LokacijeMjernihMjesta.class, "Šifarnici", "Lokacije mjernih mjesta");
		lokacijeMjernihMjesta.verifikujLokacijeMjernihMjesta();
		MjestaPrikljucenja mjestaPrikljucenja = homePage.navigateOnPage("PXD", MjestaPrikljucenja.class, "Šifarnici", "Mjesta priključenja");
		mjestaPrikljucenja.verifikujMjestaPrikljucenja();
		NaciniPolaganjaInstalacija naciniPolaganjaInstalacija = homePage.navigateOnPage("PXD", NaciniPolaganjaInstalacija.class, "Šifarnici", "Načini polaganja instalacija");
		naciniPolaganjaInstalacija.verifikujNaciniPolaganjaInstalacija();
		TipoviPrikljucnogVoda tipoviPrikljucnogVoda = homePage.navigateOnPage("PXD", TipoviPrikljucnogVoda.class, "Šifarnici", "Tipovi priključnog voda");
		tipoviPrikljucnogVoda.verifikujTipoviPrikljucnogVoda();
		PresjeciPrikljucnogVoda presjeciPrikljucnogVoda = homePage.navigateOnPage("PXD", PresjeciPrikljucnogVoda.class, "Šifarnici", "Presjeci priključnog voda");
		presjeciPrikljucnogVoda.verifikujPresjeciPrikljucnogVoda();
		TipoviPrikljucka tipoviPrikljucka = homePage.navigateOnPage("PXD", TipoviPrikljucka.class, "Šifarnici", "Tipovi priključka");
		tipoviPrikljucka.verifikujTipoviPrikljucka();
		PrikljucneSnage prikljucneSnage = homePage.navigateOnPage("PXD", PrikljucneSnage.class, "Šifarnici", "Priključne snage");
		prikljucneSnage.verifikujPrikljucneSnage();
		MaterijaliProvodnika materijaliProvodnika = homePage.navigateOnPage("PXD", MaterijaliProvodnika.class, "Šifarnici", "Materijali provodnika");
		materijaliProvodnika.verifikujMaterijaliProvodnika();
		TipoviIzolacija tipoviIzolacija = homePage.navigateOnPage("PXD", TipoviIzolacija.class, "Šifarnici", "Tipovi izolacija");
		tipoviIzolacija.verifikujTipoviIzolacija();
		TipoviMjernihMostova tipoviMjernihMostova = homePage.navigateOnPage("PXD", TipoviMjernihMostova.class, "Šifarnici", "Tipovi mjernih mostova");
		tipoviMjernihMostova.verifikujTipoviMjernihMostova();
		MaterijaliOrmaricaBrojila materijaliOrmaricaBrojila = homePage.navigateOnPage("PXD", MaterijaliOrmaricaBrojila.class, "Šifarnici", "Materijali ormarića brojila");
		materijaliOrmaricaBrojila.verifikujMaterijaliOrmaricaBrojila();
		KlaseTacnostiBrojila klaseTacnostiBrojila = homePage.navigateOnPage("PXD", KlaseTacnostiBrojila.class, "Šifarnici", "Klase tačnosti brojila");
		klaseTacnostiBrojila.verifikujKlaseTacnostiBrojila();
		NazivneStrujeBrojila nazivneStrujeBrojila = homePage.navigateOnPage("PXD", NazivneStrujeBrojila.class, "Šifarnici", "Nazivne struje brojila");
		nazivneStrujeBrojila.verifikujNazivneStrujeBrojila();
		KlaseTacnostiStrujnogTransformatora klaseTacnostiStrujnogTransformatora = homePage
				.navigateOnPage("PXD", KlaseTacnostiStrujnogTransformatora.class, "Šifarnici", "Klase tačnosti strujnog tran.");
		klaseTacnostiStrujnogTransformatora.verifikujKlaseTacnostiStrujnogTransformatora();
		StrujniPrenosniOdnos strujniPrenosniOdnos = homePage.navigateOnPage("PXD", StrujniPrenosniOdnos.class, "Šifarnici", "Strujni prenosni odnos");
		strujniPrenosniOdnos.verifikujStrujniPrenosniOdnos();
		NazivneStrujeOsiguraca nazivneStrujeOsiguraca = homePage.navigateOnPage("PXD", NazivneStrujeOsiguraca.class, "Šifarnici", "Nazivne struje osigurača");
		nazivneStrujeOsiguraca.verifikujNazivneStrujeOsiguraca();
		KlaseTacnostiNaponskogTransformatora klaseTacnostiNaponskogTransformatora = homePage
				.navigateOnPage("PXD", KlaseTacnostiNaponskogTransformatora.class, "Šifarnici", "Klase tačnosti naponskog tran.");
		klaseTacnostiNaponskogTransformatora.verifikujKlaseTacnostiNaponskogTransformatora();
		NaponskiPrenosniOdnos naponskiPrenosniodnos = homePage.navigateOnPage("PXD", NaponskiPrenosniOdnos.class, "Šifarnici", "Naponski prenosni odnos");
		naponskiPrenosniodnos.verifikujNaponskiPrenosniOdnos();
		NaciniUpravljanjaPotrosnjom naciniUpravljanjaPotrosnjom = homePage.navigateOnPage("PXD", NaciniUpravljanjaPotrosnjom.class, "Šifarnici", "Načini upravljanja potrošnjom");
		naciniUpravljanjaPotrosnjom.verifikujNaciniUpravljanjaPotrosnjom();
		VrsteUpravljackihUredjaja vrsteUpravljackihUredjaja = homePage.navigateOnPage("PXD", VrsteUpravljackihUredjaja.class, "Šifarnici", "Vrste upravljačkih uređaja");
		vrsteUpravljackihUredjaja.verifikujVrsteUpravljackihUredjaja();
		VrsteImpulsnihUredjaja vrsteImpulsnihUredjaja = homePage.navigateOnPage("PXD", VrsteImpulsnihUredjaja.class, "Šifarnici", "Vrste impulsnih uređaja");
		vrsteImpulsnihUredjaja.verifikujVrsteImpulsnihUredjaja();
		VrsteZastitnihUredjaja vrsteZastitnihUredjaja = homePage.navigateOnPage("PXD", VrsteZastitnihUredjaja.class, "Šifarnici", "Vrste zaštitnih uređaja");
		vrsteZastitnihUredjaja.verifikujVrsteZastitnihUredjaja();
		SistemiZastiteOdIndDodira sistemiZastiteOdIndDodira = homePage.navigateOnPage("PXD", SistemiZastiteOdIndDodira.class, "Šifarnici", "Sistemi zaštite od ind. dodira");
		sistemiZastiteOdIndDodira.verifikujSistemiZastiteOdIndDodira();
		SistemiZastiteOdPrenapona sistemiZastiteOdPrenapona = homePage.navigateOnPage("PXD", SistemiZastiteOdPrenapona.class, "Šifarnici", "Sistemi zaštite od prenapona");
		sistemiZastiteOdPrenapona.verifikujSistemiZastiteOdPrenapona();
		RokoviVazenja rokoviVazenja = homePage.navigateOnPage("PXD", RokoviVazenja.class, "Šifarnici", "Rokovi važenja");
		rokoviVazenja.verifikujRokoviVazenja();
		NaciniPlacanja naciniPlacanja = homePage.navigateOnPage("PXD", NaciniPlacanja.class, "Šifarnici", "Načini plaćanja");
		naciniPlacanja.verifikujNaciniPlacanja();
		UsloviPlacanja usloviPlacanja = homePage.navigateOnPage("PXD", UsloviPlacanja.class, "Šifarnici", "Uslovi plaćanja");
		usloviPlacanja.verifikujUsloviPlacanja();		
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz podsekcije MJERNI SIFARNICI i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test3() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Trafostanice trafostanice = homePage.navigateOnPage("PXD", Trafostanice.class, "Šifarnici", "Trafostanice");
		trafostanice.verifikujTrafostanice();
		Vlasnistva vlasnistva = homePage.navigateOnPage("PXD", Vlasnistva.class, "Šifarnici", "Vlasništva");
		vlasnistva.verifikujVlasnistva();
		TipoviBrojila tipoviBrojila = homePage.navigateOnPage("PXD", TipoviBrojila.class, "Šifarnici", "Tipovi brojila");
		tipoviBrojila.verifikujTipoviBrojila();
		IzvorNapajanjaBrojila izvorNapajanjaBrojila = homePage.navigateOnPage("PXD", IzvorNapajanjaBrojila.class, "Šifarnici", "Izvori napajanja brojila");
		izvorNapajanjaBrojila.verifikujIzvorNapajanjaBrojila();
		ProizvodjaciBrojila proizvodjaciBrojila = homePage.navigateOnPage("PXD", ProizvodjaciBrojila.class, "Šifarnici", "Proizvođači brojila");
		proizvodjaciBrojila.verifikujProizvodjaciBrojila();
		SposobnostPrikljucenjaBrojila sposobnostPrikljucenjaBrojila = homePage
				.navigateOnPage("PXD", SposobnostPrikljucenjaBrojila.class, "Šifarnici", "Sposobnosti priključenja brojila");
		sposobnostPrikljucenjaBrojila.verifikujSposobnostPrikljucenjaBrojila();
		MogucnostDaljinskogPristupa mogucnostDaljinskogPristupa = homePage.navigateOnPage("PXD", MogucnostDaljinskogPristupa.class, "Šifarnici", "Mogućnost daljinskog pristupa");
		mogucnostDaljinskogPristupa.verifikujMogucnostDaljinskogPristupa();
		LokacijaBrojila lokacijaBrojila = homePage.navigateOnPage("PXD", LokacijaBrojila.class, "Šifarnici", "Lokacije brojila");
		lokacijaBrojila.verifikujLokacijaBrojila();
		RazlogPromjeneLokacije razlogPromjeneLokacije = homePage.navigateOnPage("PXD", RazlogPromjeneLokacije.class, "Šifarnici", "Razlozi promjene lokacije");
		razlogPromjeneLokacije.verifikujRazlogPromjeneLokacije();
		NaponskiNivoi naponskiNivoi = homePage.navigateOnPage("PXD", NaponskiNivoi.class, "Šifarnici", "Naponski nivoi");
		naponskiNivoi.verifikujNaponskiNivoi();
		StrujniNivoi strujniNivoi = homePage.navigateOnPage("PXD", StrujniNivoi.class, "Šifarnici", "Strujni nivoi");
		strujniNivoi.verifikujStrujniNivoi();
		TipoviTransformatora tipoviTransformatora = homePage.navigateOnPage("PXD", TipoviTransformatora.class, "Šifarnici", "Tipovi transformatora");
		tipoviTransformatora.verifikujTipoviTransformatora();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_dist_003_02_verifikacija_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigateOnPage("PXD", KategorijePotrosnje.class, "Tarifni sistem", "Kategorije potrošnje");
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		Sezone sezone = homePage.navigateOnPage("PXD", Sezone.class, "Tarifni sistem", "Sezone");
		sezone.verifikujSezone();
		TarifneNadgrupe tarifneNadgrupe = homePage.navigateOnPage("PXD", TarifneNadgrupe.class, "Tarifni sistem", "Tarifne nadgrupe");
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = homePage.navigateOnPage("PXD", TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
		tarifneGrupe.verifikujTarifneGrupe();
		ObracunskaSnaga obracunskaSnaga = homePage.navigateOnPage("PXD", ObracunskaSnaga.class, "Tarifni sistem", "Obračunska snaga");
		obracunskaSnaga.verifikujObracunskaSnaga();
		CjenovnikMrezarine cjenovnik = homePage.navigateOnPage("PXD", CjenovnikMrezarine.class, "Tarifni sistem", "Cjenovnik mrežarine");
		cjenovnik.verifikujCjenovnikMrezarine();
		CjenovnikNeovlastenePotrosnje cjenovnikNeovlastenePotrosnje = homePage.navigateOnPage("PXD", CjenovnikNeovlastenePotrosnje.class, "Tarifni sistem", "Cjenovnik neovlaštene potrošnje");
		cjenovnikNeovlastenePotrosnje.verifikujCjenovnikNeovlastenePotrosnje();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_dist_003_03_verifikacija_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = homePage.navigateOnPage("PXD", MjernaMjesta.class, "Mjerna mjesta", "Mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		ZbirnaKontrolnaMjernaMjesta zbirnaMjernaMjesta = homePage.navigateOnPage("PXD", ZbirnaKontrolnaMjernaMjesta.class, "Mjerna mjesta", "Zbirna/kontrolna mjerna mjesta");
		zbirnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		EnergetskaKartica kartica = homePage.navigateOnPage("PXD", EnergetskaKartica.class, "Mjerna mjesta", "Energetska kartica");
		kartica.verifikujEnergetskaKartica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavu = homePage.navigateOnPage("PXD", ZahtjeviZaDostavuPodataka.class, "Mjerna mjesta", "Zahtjevi za dostavu podataka");
		zahtjeviZaDostavu.verifikujZahtjeviZaDostavuPodataka();
		ZahtjeviZaIskljucenja zahtjeviZaIskljucenja = homePage.navigateOnPage("PXD", ZahtjeviZaIskljucenja.class, "Mjerna mjesta", "Zahtjevi za isključenja");
		zahtjeviZaIskljucenja.verifikujZahtjeviZaIskljucenja();
		ZahtjeviZaUkljucenja zahtjeviZaUkljucenja = homePage.navigateOnPage("PXD", ZahtjeviZaUkljucenja.class, "Mjerna mjesta", "Zahtjevi za uključenja");
		zahtjeviZaUkljucenja.verifikujZahtjeviZaUkljucenja();
		RazlogNeizvrsavanjaZahtjeva razlogNeizvrsavanjaZahtjeva = homePage.navigateOnPage("PXD", RazlogNeizvrsavanjaZahtjeva.class, "Mjerna mjesta", "Razlog neizvršavanja zahtjeva");
		razlogNeizvrsavanjaZahtjeva.verifikujRazlogNeizvrsavanjaZahtjeva();
		AktivnaIskljucenjaMjernihMjesta aktivnaIskljucenjaMjernihMjesta = homePage
				.navigateOnPage("PXD", AktivnaIskljucenjaMjernihMjesta.class, "Mjerna mjesta", "Aktivna isključenja mjernih mjesta");
		aktivnaIskljucenjaMjernihMjesta.verifikujAktivnaIskljucenjaMjernihMjesta();
		IndirektnaMjernaMjesta indirektnaMjernaMjesta = homePage.navigateOnPage("PXD", IndirektnaMjernaMjesta.class, "Mjerna mjesta", "Indirektna mjerna mjesta");
		indirektnaMjernaMjesta.verifikujIndirektnaMjernaMjesta();
		KontrolaMjernogMjesta kontrolaMjernogMjesta = homePage.navigateOnPage("PXD", KontrolaMjernogMjesta.class, "Mjerna mjesta", "Kontrola mjernog mjesta");
		kontrolaMjernogMjesta.verifikujKontrolaMjernogMjesta();
		SaglasnostNaLokaciju saglasnostNaLokaciju = homePage.navigateOnPage("PXD", SaglasnostNaLokaciju.class, "Mjerna mjesta", "Saglasnost na lokaciju");
		saglasnostNaLokaciju.verifikujSaglasnostNaLokaciju();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = homePage.navigateOnPage("PXD", ElektroenergetskeSaglasnosti.class, "Mjerna mjesta", "Elektroenergetske saglasnosti");
		elektroenergetskeSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		UgovorOPrikljucenju ugovorOPrikljucenju = homePage.navigateOnPage("PXD", UgovorOPrikljucenju.class, "Mjerna mjesta", "Ugovor o priključenju");
		ugovorOPrikljucenju.verifikujUgovorOPrikljucenju();
		DeklaracijaOPrikljucku deklaracijaOPrikljucku = homePage.navigateOnPage("PXD", DeklaracijaOPrikljucku.class, "Mjerna mjesta", "Deklaracija o priključku");
		deklaracijaOPrikljucku.verifikujDeklaracijaOPrikljucku();
		RegistarPlombi registarPlombi = homePage.navigateOnPage("PXD", RegistarPlombi.class, "Mjerna mjesta", "Registar plombi");
		registarPlombi.verifikujRegistarPlombi();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_dist_003_04_verifikacija_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PXD", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = homePage.navigateOnPage("PXD", FizickaLica.class, "Kupci", "Fizička lica");
		fizickaLica.verifikujFizickaLica();
		ZahtjeviZaDostavuPodatakaKUPCI zahtjeviZaDostavuPodatakaKupci = homePage
				.navigateOnPage("PXD", ZahtjeviZaDostavuPodatakaKUPCI.class, "Kupci", "Zahtjevi za dostavu podataka kupci"); // dopisano "kupci" da bi ispravno navigiralo preko linka (isti naziv stranice u drugoj sekciji, nije jedinstven element)
		zahtjeviZaDostavuPodatakaKupci.verifikujZahtjeviZaDostavuPodatakaKUPCI();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije BROJILA i verifikuje ih")
	public void px_dist_003_05_verifikacija_sekcije_brojila_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KoristenaBrojila koristenaBrojila = homePage.navigateOnPage("PXD", KoristenaBrojila.class, "Brojila", "Korištena brojila");
	    koristenaBrojila.verifikujKoristenaBrojila();
	    ZamjeneBrojila zamjeneBrojila = homePage.navigateOnPage("PXD", ZamjeneBrojila.class, "Brojila", "Zamjene brojila");
	    zamjeneBrojila.verifikujZamjeneBrojila();
		RegistarBrojila registarBrojila = homePage.navigateOnPage("PXD", RegistarBrojila.class, "Brojila", "Registar brojila");
		registarBrojila.verifikujRegistarBrojila();
		RelokacijeBrojila relokacijeBrojila = homePage.navigateOnPage("PXD", RelokacijeBrojila.class, "Brojila", "Relokacije brojila");
		relokacijeBrojila.verifikujRelokacijeBrojila();
		Transformatori transformatori = homePage.navigateOnPage("PXD", Transformatori.class, "Brojila", "Transformatori");
		transformatori.verifikujTransformatori();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OBRACUNSKI UGOVORI i verifikuje ih")
	public void px_dist_003_06_verifikacija_sekcije_obracunski_ugovori_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskiUgovori obracunskiUgovori = homePage.navigateOnPage("PXD", ObracunskiUgovori.class, "Obračunski ugovori", "Obračunski ugovori");
		obracunskiUgovori.verifikujObracunskiUgovori();
		ZahtjeviZaObracunskeUgovore zahtjeviZaObracunskeUgovore = homePage.navigateOnPage("PXD", ZahtjeviZaObracunskeUgovore.class, "Obračunski ugovori", "Zahtjevi za obračunske ugovore");
		zahtjeviZaObracunskeUgovore.verifikujZahtjeviZaObracunskeUgovore();
		ZahtjeviZaRaskidUgovora zahtjeviZaRaskidUgovora = homePage.navigateOnPage("PXD", ZahtjeviZaRaskidUgovora.class, "Obračunski ugovori", "Zahtjevi za raskid ugovora");
		zahtjeviZaRaskidUgovora.verifikujZahtjeviZaRaskidUgovora();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OCITANJA i verifikuje ih")
	public void px_dist_003_07_verifikacija_sekcije_ocitanja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		OcitanjaBrojila ocitanjabrojila = homePage.navigateOnPage("PXD", OcitanjaBrojila.class, "Očitanja", "Očitanja brojila");
		ocitanjabrojila.verifikujOcitanjaBrojila();
		KorekcijeOcitanja korekcijeocitanja = homePage.navigateOnPage("PXD", KorekcijeOcitanja.class, "Očitanja", "Korekcije očitanja");
		korekcijeocitanja.verifikujKorekcijeOcitanja();
		ImportiOcitanja importiocitanja = homePage.navigateOnPage("PXD", ImportiOcitanja.class, "Očitanja", "Importi očitanja");
		importiocitanja.verifikujImportiOcitanja();
		IzmijenjenaOcitanja izmijenjenaocitanja = homePage.navigateOnPage("PXD", IzmijenjenaOcitanja.class, "Očitanja", "Izmijenjena očitanja");
		izmijenjenaocitanja.verifikujIzmijenjenaOcitanja();
		NevalidnaOcitanja nevalidnaocitanja = homePage.navigateOnPage("PXD", NevalidnaOcitanja.class, "Očitanja", "Nevalidna očitanja");
		nevalidnaocitanja.verifikujNevalidnaOcitanja();
		CitackiHodovi citackihodovi = homePage.navigateOnPage("PXD", CitackiHodovi.class, "Očitanja", "Čitački hodovi");
		citackihodovi.verifikujCitackiHodovi();
		CitackeListe citackeliste = homePage.navigateOnPage("PXD", CitackeListe.class, "Očitanja", "Čitačke liste");
		citackeliste.verifikujCitackeListe();
		CitaciPoCitackimHodovima citaciPoCitackimHodovima = homePage.navigateOnPage("PXD", CitaciPoCitackimHodovima.class, "Očitanja", "Čitači po čitačkim hodovima");
		citaciPoCitackimHodovima.verifikujCitaciPoCitackimHodovima();
		ZbirnaKontrolnaOcitanja zbirnaKontrolnaOcitanja = homePage.navigateOnPage("PXD", ZbirnaKontrolnaOcitanja.class, "Očitanja", "Zbirna/kontrolna očitanja");
		zbirnaKontrolnaOcitanja.verifikujZbirnaKontrolnaOcitanja();
		ZbirnaKontrolnaPotrosnja zbirnaKontrolnaPotrosnja = homePage.navigateOnPage("PXD", ZbirnaKontrolnaPotrosnja.class, "Očitanja", "Zbirna/kontrolna potrošnja");
		zbirnaKontrolnaPotrosnja.verifikujZbirnaKontrolnaPotrosnja();
//		TODO ProcjenaOcitanja
		MonitoringOcitanja monitoringOcitanja = homePage.navigateOnPage("PXD", MonitoringOcitanja.class, "Očitanja", "Monitoring očitanja");
		monitoringOcitanja.verifikujMonitoringOcitanja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije NEOVLASTENA POTROSNJA i verifikuje ih")
	public void px_dist_003_08_verifikacija_sekcije_neovlastena_potrosnja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NeovlastenaPotrosnja neovlastenaPotrosnja = homePage.navigateOnPage("PXD", NeovlastenaPotrosnja.class, "Neovlaštena potrošnja", "Neovlaštena potrošnja");
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
		RacuniNeovlastenePotrosnje racuni = homePage.navigateOnPage("PXD", RacuniNeovlastenePotrosnje.class, "Neovlaštena potrošnja", "Računi");
		racuni.verifikujRacuniNeovlastenePotrosnje();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OBRACUN i verifikuje ih")
	public void px_dist_003_09_verifikacija_sekcije_obracun_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NaloziZaObracun naloziZaObracun = homePage.navigateOnPage("PXD", NaloziZaObracun.class, "Obračun", "Nalozi za obračun");
		naloziZaObracun.verifikujNaloziZaObracun();
		KorekcijeEnergetskihObracuna korekcijeEnergetskihObracuna = homePage.navigateOnPage("PXD", KorekcijeEnergetskihObracuna.class, "Obračun", "Korekcije energetskih obračuna");
		korekcijeEnergetskihObracuna.verifikujKorekcijeEnergetskihObracuna();
		MjesecnaOdobrenjaZaduzenja mjesecnaOdobrenjaZaduzenja = homePage.navigateOnPage("PXD", MjesecnaOdobrenjaZaduzenja.class, "Obračun", "Mjesečna odobrenja/zaduženja");
		mjesecnaOdobrenjaZaduzenja.verifikujMjesecnaOdobrenjaZaduzenja();
		KorekcionaOdobrenjaZaduzenja korekcionaOdobrenjaZaduzenja = homePage.navigateOnPage("PXD", KorekcionaOdobrenjaZaduzenja.class, "Obračun", "Korekciona odobrenja/zaduženja");
		korekcionaOdobrenjaZaduzenja.verifikujKorekcionaOdobrenjaZaduzenja();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih")
	public void px_dist_003_10_verifikacija_sekcije_finansije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FinansijskeKartice finansijskeKartice = homePage.navigateOnPage("PXD", FinansijskeKartice.class, "Finansije", "Finansijske kartice");
		finansijskeKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevniciUplata = homePage.navigateOnPage("PXD", DnevniciUplata.class, "Finansije", "Dnevnici uplata");
		dnevniciUplata.verifikujDnevniciUplata();
		SveUplate sveUplate = homePage.navigateOnPage("PXD", SveUplate.class, "Finansije", "Sve uplate");
		sveUplate.verifikujSveUplate();
		ZiroRacuni ziroRacuni = homePage.navigateOnPage("PXD", ZiroRacuni.class, "Finansije", "Žiro računi");
		ziroRacuni.verifikujZiroRacuni();
		Banke banke = homePage.navigateOnPage("PXD", Banke.class, "Finansije", "Banke");
		banke.verifikujBanke();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije ADMINISTRACIJA i verifikuje ih")
	public void px_dist_003_11_verifikacija_sekcije_administracija_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Korisnici korisnici = homePage.navigateOnPage("PXD", Korisnici.class, "Administracija", "Korisnici");
		korisnici.verifikujKorisnici();
		Poruke poruke = homePage.navigateOnPage("PXD", Poruke.class, "Administracija", "Poruke");
		poruke.verifikujPoruke();
		DnevnikIzmjena dnevnikIzmjena = homePage.navigateOnPage("PXD", DnevnikIzmjena.class, "Administracija", "Dnevnik izmjena");
		dnevnikIzmjena.verifikujDnevnikIzmjena();
//		PozadinskiProcesi pozadinskiProcesi = homePage.navigirajNaPozadinskiProcesi();
//		pozadinskiProcesi.verifikujPozadinskiProcesi();
	}

}