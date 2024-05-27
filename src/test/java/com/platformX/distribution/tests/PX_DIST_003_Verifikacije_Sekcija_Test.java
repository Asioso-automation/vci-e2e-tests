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
	public void px_dist_003_01_verifikacije_sekcije_sifarnici_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		// Nova implementacija za navigaciju:
		Organizacije organizacije = homePage.navigateOnPage(Organizacije.class, "Šifarnici", "Organizacije");
		organizacije.verifikujOrganizacije();
		TerenskeJedinice terenskeJedinice = homePage.navigateOnPage(TerenskeJedinice.class, "Šifarnici", "Terenske jedinice");
		terenskeJedinice.verifikujTerenskeJedinice();
		FizickeLokacije fizickeLokacije = homePage.navigateOnPage(FizickeLokacije.class, "Šifarnici", "Fizičke lokacije");
		fizickeLokacije.verifikujFizickeLokacije();
		Snabdjevaci snabdjevaci = homePage.navigateOnPage(Snabdjevaci.class, "Šifarnici", "Snabdjevači");
		snabdjevaci.verifikujSnabdjevaci();
		Citaci citaci = homePage.navigateOnPage(Citaci.class, "Šifarnici", "Čitači");
		citaci.verifikujCitaci();
		Entiteti entiteti = homePage.navigateOnPage(Entiteti.class, "Šifarnici", "Entiteti");
		entiteti.verifikujEntitete();
		Opstine opstine = homePage.navigateOnPage(Opstine.class, "Šifarnici", "Opštine");
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = homePage.navigateOnPage(NaseljenaMjesta.class, "Šifarnici", "Naseljena mjesta");
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = homePage.navigateOnPage(Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		Ulice ulice = homePage.navigateOnPage(Ulice.class, "Šifarnici", "Ulice");
		ulice.verifikujUlice();
		Monteri monteri = homePage.navigateOnPage(Monteri.class, "Šifarnici", "Monteri");
		monteri.verifikujMonteri();
		LokacijeMontera lokacije = homePage.navigateOnPage(LokacijeMontera.class, "Šifarnici", "Lokacije montera");
		lokacije.verifikujLokacijeMontera();
		Trafostanice trafostanice = homePage.navigateOnPage(Trafostanice.class, "Šifarnici", "Trafostanice");
		trafostanice.verifikujTrafostanice();
		Vlasnistva vlasnistva = homePage.navigateOnPage(Vlasnistva.class, "Šifarnici", "Vlasništva");
		vlasnistva.verifikujVlasnistva();
		VrstePodrucja vrstePodrucja = homePage.navigateOnPage(VrstePodrucja.class, "Šifarnici", "Vrste područja");
		vrstePodrucja.verifikujVrstePodrucja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije SIFARNICI ZA ZAPISNIKE i verifikuje ih")
	public void px_dist_003_02_verifikacije_sekcije_sifarnici_za_zapisnike_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		VrsteObjekata vrsteObjekata = homePage.navigirajNaVrsteObjekata();
		vrsteObjekata.verifikujVrsteObjekata();
		LokacijeMjernihMjesta lokacijeMjernihMjesta = homePage.navigirajNaLokacijeMjernihMjesta();
		lokacijeMjernihMjesta.verifikujLokacijeMjernihMjesta();
		MjestaPrikljucenja mjestaPrikljucenja = homePage.navigirajNaMjestaPrikljucenja();
		mjestaPrikljucenja.verifikujMjestaPrikljucenja();
		NaciniPolaganjaInstalacija naciniPolaganjaInstalacija = homePage.navigirajNaNaciniPolaganjaInstalacija();
		naciniPolaganjaInstalacija.verifikujNaciniPolaganjaInstalacija();
		TipoviPrikljucnogVoda tipoviPrikljucnogVoda = homePage.navigirajNaTipoviPrikljucnogVoda();
		tipoviPrikljucnogVoda.verifikujTipoviPrikljucnogVoda();
		PresjeciPrikljucnogVoda presjeciPrikljucnogVoda = homePage.navigirajNaPresjeciPrikljucnogVoda();
		presjeciPrikljucnogVoda.verifikujPresjeciPrikljucnogVoda();
		TipoviPrikljucka tipoviPrikljucka = homePage.navigirajNaTipoviPrikljucka();
		tipoviPrikljucka.verifikujTipoviPrikljucka();
		PrikljucneSnage prikljucneSnage = homePage.navigirajNaPrikljucneSnage();
		prikljucneSnage.verifikujPrikljucneSnage();
		NazivneStruje nazivneStruje = homePage.navigirajNaNazivneStruje();
		nazivneStruje.verifikujNazivneStruje();
		MaterijaliProvodnika materijaliProvodnika = homePage.navigirajNaMaterijaliProvodnika();
		materijaliProvodnika.verifikujMaterijaliProvodnika();
		TipoviIzolacija tipoviIzolacija = homePage.navigirajNaTipoviIzolacija();
		tipoviIzolacija.verifikujTipoviIzolacija();
		TipoviMjernihMostova tipoviMjernihMostova = homePage.navigirajNaTipoviMjernihMostova();
		tipoviMjernihMostova.verifikujTipoviMjernihMostova();
		MaterijaliOrmaricaBrojila materijaliOrmaricaBrojila = homePage.navigirajNaMaterijaliOrmaricaBrojila();
		materijaliOrmaricaBrojila.verifikujMaterijaliOrmaricaBrojila();
		KlaseTacnostiBrojila klaseTacnostiBrojila = homePage.navigirajNaKlaseTacnostiBrojila();
		klaseTacnostiBrojila.verifikujKlaseTacnostiBrojila();
		NazivneStrujeBrojila nazivneStrujeBrojila = homePage.navigirajNaNazivneStrujeBrojila();
		nazivneStrujeBrojila.verifikujNazivneStrujeBrojila();
		KlaseTacnostiStrujnogTransformatora klaseTacnostiStrujnogTransformatora = homePage
				.navigirajNaKlaseTacnostiStrujnogTransformatora();
		klaseTacnostiStrujnogTransformatora.verifikujKlaseTacnostiStrujnogTransformatora();
		StrujniPrenosniOdnos strujniPrenosniOdnos = homePage.navigirajNaStrujniPrenosniOdnos();
		strujniPrenosniOdnos.verifikujStrujniPrenosniOdnos();
		NazivneStrujeOsiguraca nazivneStrujeOsiguraca = homePage.navigirajNaNazivneStrujeOsiguraca();
		nazivneStrujeOsiguraca.verifikujNazivneStrujeOsiguraca();
		KlaseTacnostiNaponskogTransformatora klaseTacnostiNaponskogTransformatora = homePage
				.navigirajNaKlaseTacnostiNaponskogTransformatora();
		klaseTacnostiNaponskogTransformatora.verifikujKlaseTacnostiNaponskogTransformatora();
		NaponskiPrenosniOdnos naponskiPrenosniodnos = homePage.navigirajNaNaponskiPrenosniOdnos();
		naponskiPrenosniodnos.verifikujNaponskiPrenosniOdnos();
		NaciniUpravljanjaPotrosnjom naciniUpravljanjaPotrosnjom = homePage.navigirajNaNaciniUpravljanjaPotrosnjom();
		naciniUpravljanjaPotrosnjom.verifikujNaciniUpravljanjaPotrosnjom();
		VrsteUpravljackihUredjaja vrsteUpravljackihUredjaja = homePage.navigirajNaVrsteUpravljackihUredjaja();
		vrsteUpravljackihUredjaja.verifikujVrsteUpravljackihUredjaja();
		VrsteImpulsnihUredjaja vrsteImpulsnihUredjaja = homePage.navigirajNaVrsteImpulsnihUredjaja();
		vrsteImpulsnihUredjaja.verifikujVrsteImpulsnihUredjaja();
		VrsteZastitnihUredjaja vrsteZastitnihUredjaja = homePage.navigirajNaVrsteZastitnihUredjaja();
		vrsteZastitnihUredjaja.verifikujVrsteZastitnihUredjaja();
		SistemiZastiteOdIndDodira sistemiZastiteOdIndDodira = homePage.navigirajNaSistemiZastiteOdIndDodira();
		sistemiZastiteOdIndDodira.verifikujSistemiZastiteOdIndDodira();
		SistemiZastiteOdPrenapona sistemiZastiteOdPrenapona = homePage.navigirajNaSistemiZastiteOdPrenapona();
		sistemiZastiteOdPrenapona.verifikujSistemiZastiteOdPrenapona();
		RokoviVazenja rokoviVazenja = homePage.navigirajNaRokoviVazenja();
		rokoviVazenja.verifikujRokoviVazenja();
		NaciniPlacanja naciniPlacanja = homePage.navigirajNaNaciniPlacanja();
		naciniPlacanja.verifikujNaciniPlacanja();
		UsloviPlacanja usloviPlacanja = homePage.navigirajNaUsloviPlacanja();
		usloviPlacanja.verifikujUsloviPlacanja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_dist_003_03_verifikacija_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		TarifneNadgrupe tarifneNadgrupe = homePage.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		ObracunskaSnaga obracunskaSnaga = homePage.navigirajNaObracunskaSnaga();
		obracunskaSnaga.verifikujObracunskaSnaga();
		CjenovnikMrezarine cjenovnik = homePage.navigirajNaCjenovnikMrezarine();
		cjenovnik.verifikujCjenovnikMrezarine();
		CjenovnikNeovlastenePotrosnje cjenovnikNeovlastenePotrosnje = homePage
				.navigirajNaCjenovnikNeovlastenePotrosnje();
		cjenovnikNeovlastenePotrosnje.verifikujCjenovnikNeovlastenePotrosnje();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_dist_003_04_verifikacije_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = homePage.navigateOnPage(MjernaMjesta.class, "Mjerna mjesta", "Mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		ZbirnaKontrolnaMjernaMjesta zbirnaMjernaMjesta = homePage.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		EnergetskaKartica kartica = homePage.navigirajNaEnergetskaKartica();
		kartica.verifikujEnergetskaKartica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavu = homePage.navigirajNaZahtjeviZaDostavuPodataka();
		zahtjeviZaDostavu.verifikujZahtjeviZaDostavuPodataka();
		ZahtjeviZaIskljucenja zahtjeviZaIskljucenja = homePage.navigirajNaZahtjeviZaIskljucenja();
		zahtjeviZaIskljucenja.verifikujZahtjeviZaIskljucenja();
		ZahtjeviZaUkljucenja zahtjeviZaUkljucenja = homePage.navigirajNaZahtjeviZaUkljucenja();
		zahtjeviZaUkljucenja.verifikujZahtjeviZaUkljucenja();
		RazlogNeizvrsavanjaZahtjeva razlogNeizvrsavanjaZahtjeva = homePage.navigirajNaRazlogNeizvrsavanjaZahtjeva();
		razlogNeizvrsavanjaZahtjeva.verifikujRazlogNeizvrsavanjaZahtjeva();
		AktivnaIskljucenjaMjernihMjesta aktivnaIskljucenjaMjernihMjesta = homePage
				.navigirajNaAktivnaIskljucenjaMjernihMjesta();
		aktivnaIskljucenjaMjernihMjesta.verifikujAktivnaIskljucenjaMjernihMjesta();
		IndirektnaMjernaMjesta indirektnaMjernaMjesta = homePage.navigirajNaIndirektnaMjernaMjesta();
		indirektnaMjernaMjesta.verifikujIndirektnaMjernaMjesta();
		KontrolaMjernogMjesta kontrolaMjernogMjesta = homePage.navigirajNaKontrolaMjernogMjesta();
		kontrolaMjernogMjesta.verifikujKontrolaMjernogMjesta();
//		TODO Saglasnost na lokaciju
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		UgovorOPrikljucenju ugovorOPrikljucenju = homePage.navigirajNaUgovorOPrikljucenju();
		ugovorOPrikljucenju.verifikujUgovorOPrikljucenju();
		DeklaracijaOPrikljucku deklaracijaOPrikljucku = homePage.navigirajNaDeklaracijaOPrikljucku();
		deklaracijaOPrikljucku.verifikujDeklaracijaOPrikljucku();
//		TODO Registar plombi
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_dist_003_05_verifikacije_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = homePage.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		ZahtjeviZaDostavuPodatakaKUPCI zahtjeviZaDostavuPodatakaKupci = homePage
				.navigirajNaZahtjeviZaDostavuPodatakaKUPCI();
		zahtjeviZaDostavuPodatakaKupci.verifikujZahtjeviZaDostavuPodatakaKUPCI();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije BROJILA i verifikuje ih")
	public void px_dist_003_06_verifikacija_sekcije_brojila_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
//		KoristenaBrojila koristenaBrojila = pocetna.navigirajNaKoristenaBrojila();
//	    koristenaBrojila.verifikujKoristenaBrojila();
		TipoviBrojila tipoviBrojila = homePage.navigirajNaTipoviBrojila();
		tipoviBrojila.verifikujTipoviBrojila();
		RegistarBrojila registarBrojila = homePage.navigirajNaRegistarBrojila();
		registarBrojila.verifikujRegistarBrojila();
		IzvorNapajanjaBrojila izvorNapajanjaBrojila = homePage.navigirajNaIzvoriNapajanjaBrojila();
		izvorNapajanjaBrojila.verifikujIzvorNapajanjaBrojila();
		ProizvodjaciBrojila proizvodjaciBrojila = homePage.navigirajNaProizvodjaciBrojila();
		proizvodjaciBrojila.verifikujProizvodjaciBrojila();
		SposobnostPrikljucenjaBrojila sposobnostPrikljucenjaBrojila = homePage
				.navigirajNaSposobnostiPrikljucenaBrojila();
		sposobnostPrikljucenjaBrojila.verifikujSposobnostPrikljucenjaBrojila();
		MogucnostDaljinskogPristupa mogucnostDaljinskogPristupa = homePage.navigirajNaMogucnostDaljinskogPristupa();
		mogucnostDaljinskogPristupa.verifikujMogucnostDaljinskogPristupa();
		LokacijaBrojila lokacijaBrojila = homePage.navigirajNaLokacijeBrojila();
		lokacijaBrojila.verifikujLokacijaBrojila();
		RelokacijeBrojila relokacijeBrojila = homePage.navigirajNaRelokacijeBrojila();
		relokacijeBrojila.verifikujRelokacijeBrojila();
		RazlogPromjeneLokacije razlogPromjeneLokacije = homePage.navigirajNaRazloziPromjeneLokacije();
		razlogPromjeneLokacije.verifikujRazlogPromjeneLokacije();
		NaponskiNivoi naponskiNivoi = homePage.navigirajNaNaponskiNivoi();
		naponskiNivoi.verifikujNaponskiNivoi();
		StrujniNivoi strujniNivoi = homePage.navigirajNaStrujniNivoi();
		strujniNivoi.verifikujStrujniNivoi();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OBRACUNSKI UGOVORI i verifikuje ih")
	public void px_dist_003_07_verifikacija_sekcije_obracunski_ugovori_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskiUgovori obracunskiUgovori = homePage.navigirajNaObracunskiUgovori();
		obracunskiUgovori.verifikujObracunskiUgovori();
		ZahtjeviZaObracunskeUgovore zahtjeviZaObracunskeUgovore = homePage.navigirajNaZahtjeviZaObracunskeUgovore();
		zahtjeviZaObracunskeUgovore.verifikujZahtjeviZaObracunskeUgovore();
		ZahtjeviZaRaskidUgovora zahtjeviZaRaskidUgovora = homePage.navigirajNaZahtjeviZaRaskidUgovora();
		zahtjeviZaRaskidUgovora.verifikujZahtjeviZaRaskidUgovora();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OCITANJA i verifikuje ih")
	public void px_dist_003_08_verifikacija_sekcije_ocitanja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		OcitanjaBrojila ocitanjabrojila = homePage.navigirajNaOcitanjaBrojila();
		ocitanjabrojila.verifikujOcitanjaBrojila();
		KorekcijeOcitanja korekcijeocitanja = homePage.navigirajNaKorekcijeOcitanja();
		korekcijeocitanja.verifikujKorekcijeOcitanja();
		ImportiOcitanja importiocitanja = homePage.navigirajNaImportiOcitanja();
		importiocitanja.verifikujImportiOcitanja();
		IzmijenjenaOcitanja izmijenjenaocitanja = homePage.navigirajNaIzmijenjenaOcitanja();
		izmijenjenaocitanja.verifikujIzmijenjenaOcitanja();
		NevalidnaOcitanja nevalidnaocitanja = homePage.navigirajNaNevalidnaOcitanja();
		nevalidnaocitanja.verifikujNevalidnaOcitanja();
		CitackiHodovi citackihodovi = homePage.navigirajNaCitackiHodovi();
		citackihodovi.verifikujCitackiHodovi();
		CitackeListe citackeliste = homePage.navigirajNaCitackeListe();
		citackeliste.verifikujCitackeListe();
		CitaciPoCitackimHodovima citaciPoCitackimHodovima = homePage.navigirajNaCitaciPoCitackimHodovima();
		citaciPoCitackimHodovima.verifikujCitaciPoCitackimHodovima();
		ZbirnaKontrolnaOcitanja zbirnaKontrolnaOcitanja = homePage.navigirajNaZbirnaKontrolnaOcitanja();
		zbirnaKontrolnaOcitanja.verifikujZbirnaKontrolnaOcitanja();
		ZbirnaKontrolnaPotrosnja zbirnaKontrolnaPotrosnja = homePage.navigirajNaZbirnaKontrolnaPotrosnja();
		zbirnaKontrolnaPotrosnja.verifikujZbirnaKontrolnaPotrosnja();
//		TODO ProcjenaOcitanja
		MonitoringOcitanja monitoringOcitanja = homePage.navigirajNaMonitoringOcitanja();
		monitoringOcitanja.verifikujMonitoringOcitanja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije NEOVLASTENA POTROSNJA i verifikuje ih")
	public void px_dist_003_09_verifikacija_sekcije_neovlastena_potrosnja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NeovlastenaPotrosnja neovlastenaPotrosnja = homePage.navigirajNaNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
//		TODO Racuni NP
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OBRACUN i verifikuje ih")
	public void px_dist_003_10_verifikacija_sekcije_obracun_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NaloziZaObracun naloziZaObracun = homePage.navigirajNaNaloziZaObracun();
		naloziZaObracun.verifikujNaloziZaObracun();
		KorekcijeEnergetskihObracuna korekcijeEnergetskihObracuna = homePage.navigirajNaKorekcijeEnergetskihObracuna();
		korekcijeEnergetskihObracuna.verifikujKorekcijeEnergetskihObracuna();
		MjesecnaOdobrenjaZaduzenja mjesecnaOdobrenjaZaduzenja = homePage.navigirajNaMjesecnaOdobrenjaZaduzenja();
		mjesecnaOdobrenjaZaduzenja.verifikujMjesecnaOdobrenjaZaduzenja();
		KorekcionaOdobrenjaZaduzenja korekcionaOdobrenjaZaduzenja = homePage.navigirajNaKorekcionaOdobrenjaZaduzenja();
		korekcionaOdobrenjaZaduzenja.verifikujKorekcionaOdobrenjaZaduzenja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije ADMINISTRACIJA i verifikuje ih")
	public void px_dist_003_11_verifikacija_sekcije_administracija_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Korisnici korisnici = homePage.navigateOnPage(Korisnici.class, "Administracija", "Korisnici");
		korisnici.verifikujKorisnici();
		Poruke poruke = homePage.navigateOnPage(Poruke.class, "Administracija", "Poruke");
		poruke.verifikujPoruke();
		DnevnikIzmjena dnevnikIzmjena = homePage.navigateOnPage(DnevnikIzmjena.class, "Administracija", "Dnevnik izmjena");
		dnevnikIzmjena.verifikujDnevnikIzmjena();
//		PozadinskiProcesi pozadinskiProcesi = homePage.navigirajNaPozadinskiProcesi();
//		pozadinskiProcesi.verifikujPozadinskiProcesi();
	}

}