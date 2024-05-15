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
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();

		// Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		// Nova implementacija za navigaciju:
		Organizacije organizacije = pocetna.navigateOnPage(Organizacije.class, "Šifarnici", "Organizacije");

		organizacije.verifikujOrganizacije();
		TerenskeJedinice terenskeJedinice = pocetna.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		FizickeLokacije fizickeLokacije = pocetna.navigirajNaFizickeLokacije();
		fizickeLokacije.verifikujFizickeLokacije();
		Snabdjevaci snabdjevaci = pocetna.navigirajNaSnabdjevaci();
		snabdjevaci.verifikujSnabdjevaci();
		Citaci citaci = pocetna.navigirajNaCitaci();
		citaci.verifikujCitaci();
		Entiteti entiteti = pocetna.navigirajNaEntiteti();
		entiteti.verifikujEntitete();
		Opstine opstine = pocetna.navigirajNaOpstine();
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		Monteri monteri = pocetna.navigirajNaMonteri();
		monteri.verifikujMonteri();
		LokacijeMontera lokacije = pocetna.navigirajNaLokacijeMontera();
		lokacije.verifikujLokacijeMontera();
		Trafostanice trafostanice = pocetna.navigirajNaTrafostanice();
		trafostanice.verifikujTrafostanice();
		Vlasnistva vlasnistva = pocetna.navigirajNaVlasnistva();
		vlasnistva.verifikujVlasnistva();
		VrstePodrucja vrstePodrucja = pocetna.navigirajNaVrstePodrucja();
		vrstePodrucja.verifikujVrstePodrucja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije SIFARNICI ZA ZAPISNIKE i verifikuje ih")
	public void px_dist_003_02_verifikacije_sekcije_sifarnici_za_zapisnike_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		VrsteObjekata vrsteObjekata = pocetna.navigirajNaVrsteObjekata();
		vrsteObjekata.verifikujVrsteObjekata();
		LokacijeMjernihMjesta lokacijeMjernihMjesta = pocetna.navigirajNaLokacijeMjernihMjesta();
		lokacijeMjernihMjesta.verifikujLokacijeMjernihMjesta();
		MjestaPrikljucenja mjestaPrikljucenja = pocetna.navigirajNaMjestaPrikljucenja();
		mjestaPrikljucenja.verifikujMjestaPrikljucenja();
		NaciniPolaganjaInstalacija naciniPolaganjaInstalacija = pocetna.navigirajNaNaciniPolaganjaInstalacija();
		naciniPolaganjaInstalacija.verifikujNaciniPolaganjaInstalacija();
		TipoviPrikljucnogVoda tipoviPrikljucnogVoda = pocetna.navigirajNaTipoviPrikljucnogVoda();
		tipoviPrikljucnogVoda.verifikujTipoviPrikljucnogVoda();
		PresjeciPrikljucnogVoda presjeciPrikljucnogVoda = pocetna.navigirajNaPresjeciPrikljucnogVoda();
		presjeciPrikljucnogVoda.verifikujPresjeciPrikljucnogVoda();
		TipoviPrikljucka tipoviPrikljucka = pocetna.navigirajNaTipoviPrikljucka();
		tipoviPrikljucka.verifikujTipoviPrikljucka();
		PrikljucneSnage prikljucneSnage = pocetna.navigirajNaPrikljucneSnage();
		prikljucneSnage.verifikujPrikljucneSnage();
		NazivneStruje nazivneStruje = pocetna.navigirajNaNazivneStruje();
		nazivneStruje.verifikujNazivneStruje();
		MaterijaliProvodnika materijaliProvodnika = pocetna.navigirajNaMaterijaliProvodnika();
		materijaliProvodnika.verifikujMaterijaliProvodnika();
		TipoviIzolacija tipoviIzolacija = pocetna.navigirajNaTipoviIzolacija();
		tipoviIzolacija.verifikujTipoviIzolacija();
		TipoviMjernihMostova tipoviMjernihMostova = pocetna.navigirajNaTipoviMjernihMostova();
		tipoviMjernihMostova.verifikujTipoviMjernihMostova();
		MaterijaliOrmaricaBrojila materijaliOrmaricaBrojila = pocetna.navigirajNaMaterijaliOrmaricaBrojila();
		materijaliOrmaricaBrojila.verifikujMaterijaliOrmaricaBrojila();
		KlaseTacnostiBrojila klaseTacnostiBrojila = pocetna.navigirajNaKlaseTacnostiBrojila();
		klaseTacnostiBrojila.verifikujKlaseTacnostiBrojila();
		NazivneStrujeBrojila nazivneStrujeBrojila = pocetna.navigirajNaNazivneStrujeBrojila();
		nazivneStrujeBrojila.verifikujNazivneStrujeBrojila();
		KlaseTacnostiStrujnogTransformatora klaseTacnostiStrujnogTransformatora = pocetna
				.navigirajNaKlaseTacnostiStrujnogTransformatora();
		klaseTacnostiStrujnogTransformatora.verifikujKlaseTacnostiStrujnogTransformatora();
		StrujniPrenosniOdnos strujniPrenosniOdnos = pocetna.navigirajNaStrujniPrenosniOdnos();
		strujniPrenosniOdnos.verifikujStrujniPrenosniOdnos();
		NazivneStrujeOsiguraca nazivneStrujeOsiguraca = pocetna.navigirajNaNazivneStrujeOsiguraca();
		nazivneStrujeOsiguraca.verifikujNazivneStrujeOsiguraca();
		KlaseTacnostiNaponskogTransformatora klaseTacnostiNaponskogTransformatora = pocetna
				.navigirajNaKlaseTacnostiNaponskogTransformatora();
		klaseTacnostiNaponskogTransformatora.verifikujKlaseTacnostiNaponskogTransformatora();
		NaponskiPrenosniOdnos naponskiPrenosniodnos = pocetna.navigirajNaNaponskiPrenosniOdnos();
		naponskiPrenosniodnos.verifikujNaponskiPrenosniOdnos();
		NaciniUpravljanjaPotrosnjom naciniUpravljanjaPotrosnjom = pocetna.navigirajNaNaciniUpravljanjaPotrosnjom();
		naciniUpravljanjaPotrosnjom.verifikujNaciniUpravljanjaPotrosnjom();
		VrsteUpravljackihUredjaja vrsteUpravljackihUredjaja = pocetna.navigirajNaVrsteUpravljackihUredjaja();
		vrsteUpravljackihUredjaja.verifikujVrsteUpravljackihUredjaja();
		VrsteImpulsnihUredjaja vrsteImpulsnihUredjaja = pocetna.navigirajNaVrsteImpulsnihUredjaja();
		vrsteImpulsnihUredjaja.verifikujVrsteImpulsnihUredjaja();
		VrsteZastitnihUredjaja vrsteZastitnihUredjaja = pocetna.navigirajNaVrsteZastitnihUredjaja();
		vrsteZastitnihUredjaja.verifikujVrsteZastitnihUredjaja();
		SistemiZastiteOdIndDodira sistemiZastiteOdIndDodira = pocetna.navigirajNaSistemiZastiteOdIndDodira();
		sistemiZastiteOdIndDodira.verifikujSistemiZastiteOdIndDodira();
		SistemiZastiteOdPrenapona sistemiZastiteOdPrenapona = pocetna.navigirajNaSistemiZastiteOdPrenapona();
		sistemiZastiteOdPrenapona.verifikujSistemiZastiteOdPrenapona();
		RokoviVazenja rokoviVazenja = pocetna.navigirajNaRokoviVazenja();
		rokoviVazenja.verifikujRokoviVazenja();
		NaciniPlacanja naciniPlacanja = pocetna.navigirajNaNaciniPlacanja();
		naciniPlacanja.verifikujNaciniPlacanja();
		UsloviPlacanja usloviPlacanja = pocetna.navigirajNaUsloviPlacanja();
		usloviPlacanja.verifikujUsloviPlacanja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_dist_003_03_verifikacija_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = pocetna.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		Sezone sezone = pocetna.navigirajNaSezone();
		sezone.verifikujSezone();
		TarifneNadgrupe tarifneNadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = pocetna.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		ObracunskaSnaga obracunskaSnaga = pocetna.navigirajNaObracunskaSnaga();
		obracunskaSnaga.verifikujObracunskaSnaga();
		CjenovnikMrezarine cjenovnik = pocetna.navigirajNaCjenovnikMrezarine();
		cjenovnik.verifikujCjenovnikMrezarine();
		CjenovnikNeovlastenePotrosnje cjenovnikNeovlastenePotrosnje = pocetna
				.navigirajNaCjenovnikNeovlastenePotrosnje();
		cjenovnikNeovlastenePotrosnje.verifikujCjenovnikNeovlastenePotrosnje();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_dist_003_04_verifikacije_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = pocetna.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		ZbirnaKontrolnaMjernaMjesta zbirnaMjernaMjesta = pocetna.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		EnergetskaKartica kartica = pocetna.navigirajNaEnergetskaKartica();
		kartica.verifikujEnergetskaKartica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavu = pocetna.navigirajNaZahtjeviZaDostavuPodataka();
		zahtjeviZaDostavu.verifikujZahtjeviZaDostavuPodataka();
		ZahtjeviZaIskljucenja zahtjeviZaIskljucenja = pocetna.navigirajNaZahtjeviZaIskljucenja();
		zahtjeviZaIskljucenja.verifikujZahtjeviZaIskljucenja();
		ZahtjeviZaUkljucenja zahtjeviZaUkljucenja = pocetna.navigirajNaZahtjeviZaUkljucenja();
		zahtjeviZaUkljucenja.verifikujZahtjeviZaUkljucenja();
		RazlogNeizvrsavanjaZahtjeva razlogNeizvrsavanjaZahtjeva = pocetna.navigirajNaRazlogNeizvrsavanjaZahtjeva();
		razlogNeizvrsavanjaZahtjeva.verifikujRazlogNeizvrsavanjaZahtjeva();
		AktivnaIskljucenjaMjernihMjesta aktivnaIskljucenjaMjernihMjesta = pocetna
				.navigirajNaAktivnaIskljucenjaMjernihMjesta();
		aktivnaIskljucenjaMjernihMjesta.verifikujAktivnaIskljucenjaMjernihMjesta();
		IndirektnaMjernaMjesta indirektnaMjernaMjesta = pocetna.navigirajNaIndirektnaMjernaMjesta();
		indirektnaMjernaMjesta.verifikujIndirektnaMjernaMjesta();
		KontrolaMjernogMjesta kontrolaMjernogMjesta = pocetna.navigirajNaKontrolaMjernogMjesta();
		kontrolaMjernogMjesta.verifikujKontrolaMjernogMjesta();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = pocetna.navigirajNaElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		UgovorOPrikljucenju ugovorOPrikljucenju = pocetna.navigirajNaUgovorOPrikljucenju();
		ugovorOPrikljucenju.verifikujUgovorOPrikljucenju();
		DeklaracijaOPrikljucku deklaracijaOPrikljucku = pocetna.navigirajNaDeklaracijaOPrikljucku();
		deklaracijaOPrikljucku.verifikujDeklaracijaOPrikljucku();
//		TODO Registar plombi
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_dist_003_05_verifikacije_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = pocetna.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = pocetna.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		ZahtjeviZaDostavuPodatakaKUPCI zahtjeviZaDostavuPodatakaKupci = pocetna
				.navigirajNaZahtjeviZaDostavuPodatakaKUPCI();
		zahtjeviZaDostavuPodatakaKupci.verifikujZahtjeviZaDostavuPodatakaKUPCI();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije BROJILA i verifikuje ih")
	public void px_dist_003_06_verifikacija_sekcije_brojila_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
//		KoristenaBrojila koristenaBrojila = pocetna.navigirajNaKoristenaBrojila();
//	    koristenaBrojila.verifikujKoristenaBrojila();
		TipoviBrojila tipoviBrojila = pocetna.navigirajNaTipoviBrojila();
		tipoviBrojila.verifikujTipoviBrojila();
		RegistarBrojila registarBrojila = pocetna.navigirajNaRegistarBrojila();
		registarBrojila.verifikujRegistarBrojila();
		IzvorNapajanjaBrojila izvorNapajanjaBrojila = pocetna.navigirajNaIzvoriNapajanjaBrojila();
		izvorNapajanjaBrojila.verifikujIzvorNapajanjaBrojila();
		ProizvodjaciBrojila proizvodjaciBrojila = pocetna.navigirajNaProizvodjaciBrojila();
		proizvodjaciBrojila.verifikujProizvodjaciBrojila();
		SposobnostPrikljucenjaBrojila sposobnostPrikljucenjaBrojila = pocetna
				.navigirajNaSposobnostiPrikljucenaBrojila();
		sposobnostPrikljucenjaBrojila.verifikujSposobnostPrikljucenjaBrojila();
		MogucnostDaljinskogPristupa mogucnostDaljinskogPristupa = pocetna.navigirajNaMogucnostDaljinskogPristupa();
		mogucnostDaljinskogPristupa.verifikujMogucnostDaljinskogPristupa();
		LokacijaBrojila lokacijaBrojila = pocetna.navigirajNaLokacijeBrojila();
		lokacijaBrojila.verifikujLokacijaBrojila();
		RelokacijeBrojila relokacijeBrojila = pocetna.navigirajNaRelokacijeBrojila();
		relokacijeBrojila.verifikujRelokacijeBrojila();
		RazlogPromjeneLokacije razlogPromjeneLokacije = pocetna.navigirajNaRazloziPromjeneLokacije();
		razlogPromjeneLokacije.verifikujRazlogPromjeneLokacije();
		NaponskiNivoi naponskiNivoi = pocetna.navigirajNaNaponskiNivoi();
		naponskiNivoi.verifikujNaponskiNivoi();
		StrujniNivoi strujniNivoi = pocetna.navigirajNaStrujniNivoi();
		strujniNivoi.verifikujStrujniNivoi();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OBRACUNSKI UGOVORI i verifikuje ih")
	public void px_dist_003_07_verifikacija_sekcije_obracunski_ugovori_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		ObracunskiUgovori obracunskiUgovori = pocetna.navigirajNaObracunskiUgovori();
		obracunskiUgovori.verifikujObracunskiUgovori();
		ZahtjeviZaObracunskeUgovore zahtjeviZaObracunskeUgovore = pocetna.navigirajNaZahtjeviZaObracunskeUgovore();
		zahtjeviZaObracunskeUgovore.verifikujZahtjeviZaObracunskeUgovore();
		ZahtjeviZaRaskidUgovora zahtjeviZaRaskidUgovora = pocetna.navigirajNaZahtjeviZaRaskidUgovora();
		zahtjeviZaRaskidUgovora.verifikujZahtjeviZaRaskidUgovora();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OCITANJA i verifikuje ih")
	public void px_dist_003_08_verifikacija_sekcije_ocitanja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		OcitanjaBrojila ocitanjabrojila = pocetna.navigirajNaOcitanjaBrojila();
		ocitanjabrojila.verifikujOcitanjaBrojila();
		KorekcijeOcitanja korekcijeocitanja = pocetna.navigirajNaKorekcijeOcitanja();
		korekcijeocitanja.verifikujKorekcijeOcitanja();
		ImportiOcitanja importiocitanja = pocetna.navigirajNaImportiOcitanja();
		importiocitanja.verifikujImportiOcitanja();
		IzmijenjenaOcitanja izmijenjenaocitanja = pocetna.navigirajNaIzmijenjenaOcitanja();
		izmijenjenaocitanja.verifikujIzmijenjenaOcitanja();
		NevalidnaOcitanja nevalidnaocitanja = pocetna.navigirajNaNevalidnaOcitanja();
		nevalidnaocitanja.verifikujNevalidnaOcitanja();
		CitackiHodovi citackihodovi = pocetna.navigirajNaCitackiHodovi();
		citackihodovi.verifikujCitackiHodovi();
		CitackeListe citackeliste = pocetna.navigirajNaCitackeListe();
		citackeliste.verifikujCitackeListe();
		CitaciPoCitackimHodovima citaciPoCitackimHodovima = pocetna.navigirajNaCitaciPoCitackimHodovima();
		citaciPoCitackimHodovima.verifikujCitaciPoCitackimHodovima();
		ZbirnaKontrolnaOcitanja zbirnaKontrolnaOcitanja = pocetna.navigirajNaZbirnaKontrolnaOcitanja();
		zbirnaKontrolnaOcitanja.verifikujZbirnaKontrolnaOcitanja();
		ZbirnaKontrolnaPotrosnja zbirnaKontrolnaPotrosnja = pocetna.navigirajNaZbirnaKontrolnaPotrosnja();
		zbirnaKontrolnaPotrosnja.verifikujZbirnaKontrolnaPotrosnja();
//		TODO ProcjenaOcitanja
		MonitoringOcitanja monitoringOcitanja = pocetna.navigirajNaMonitoringOcitanja();
		monitoringOcitanja.verifikujMonitoringOcitanja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije NEOVLASTENA POTROSNJA i verifikuje ih")
	public void px_dist_003_09_verifikacija_sekcije_neovlastena_potrosnja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		NeovlastenaPotrosnja neovlastenaPotrosnja = pocetna.navigirajNaNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
//		TODO Racuni NP
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OBRACUN i verifikuje ih")
	public void px_dist_003_10_verifikacija_sekcije_obracun_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		NaloziZaObracun naloziZaObracun = pocetna.navigirajNaNaloziZaObracun();
		naloziZaObracun.verifikujNaloziZaObracun();
		KorekcijeEnergetskihObracuna korekcijeEnergetskihObracuna = pocetna.navigirajNaKorekcijeEnergetskihObracuna();
		korekcijeEnergetskihObracuna.verifikujKorekcijeEnergetskihObracuna();
		MjesecnaOdobrenjaZaduzenja mjesecnaOdobrenjaZaduzenja = pocetna.navigirajNaMjesecnaOdobrenjaZaduzenja();
		mjesecnaOdobrenjaZaduzenja.verifikujMjesecnaOdobrenjaZaduzenja();
		KorekcionaOdobrenjaZaduzenja korekcionaOdobrenjaZaduzenja = pocetna.navigirajNaKorekcionaOdobrenjaZaduzenja();
		korekcionaOdobrenjaZaduzenja.verifikujKorekcionaOdobrenjaZaduzenja();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije ADMINISTRACIJA i verifikuje ih")
	public void px_dist_003_11_verifikacija_sekcije_administracija_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Korisnici korisnici = homePage.navigirajNaKorisnici();
		korisnici.verifikujKorisnici();
		Poruke poruke = homePage.navigirajNaPoruke();
		poruke.verifikujPoruke();
		DnevnikIzmjena dnevnikIzmjena = homePage.navigirajNaDnevnikIzmjena();
		dnevnikIzmjena.verifikujDnevnikIzmjena();
//		PozadinskiProcesi pozadinskiProcesi = homePage.navigirajNaPozadinskiProcesi();
//		pozadinskiProcesi.verifikujPozadinskiProcesi();
	}

}