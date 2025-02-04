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

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test1() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Organizacije organizacije = new Organizacije(driver);
		organizacije.navigirajVerifikujOrganizacije();
		TerenskeJedinice terenskeJedinice = new TerenskeJedinice(driver);
		terenskeJedinice.navigirajVerifikujTerenskeJedinice();
		FizickeLokacije fizickeLokacije = new FizickeLokacije(driver);
		fizickeLokacije.navigirajVerifikujFizickeLokacije();
		Snabdjevaci snabdjevaci = new Snabdjevaci(driver);
		snabdjevaci.navigirajVerifikujSnabdjevaci();
		Citaci citaci = new Citaci(driver);
		citaci.navigirajVerifikujCitaci();
		Entiteti entiteti = new Entiteti(driver);
		entiteti.navigirajVerifikujEntiteti();
		Opstine opstine = new Opstine(driver);
		opstine.navigirajVerifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = new NaseljenaMjesta(driver);
		naseljenaMjesta.navigirajVerifikujNaseljenaMjesta();
		Poste poste = new Poste(driver);
		poste.navigirajVerifikujPoste();
		Ulice ulice = new Ulice(driver);
		ulice.navigirajVerifikujUlice();
		Monteri monteri = new Monteri(driver);
		monteri.navigirajVerifikujMonteri();	
		LokacijeMontera lokacije = new LokacijeMontera(driver);
		lokacije.navigirajVerifikujLokacijeMontera();
		VrstePodrucja vrstePodrucja = new VrstePodrucja(driver);
		vrstePodrucja.navigirajVerifikujVrstePodrucja();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz podsekcije SIFARNICI ZA ZAPISNIKE i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test2() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		VrsteObjekata vrsteObjekata = homePage.navigateOnPage(VrsteObjekata.class, "Šifarnici", "Vrste objekata");
		vrsteObjekata.verifikujVrsteObjekata();
		LokacijeMjernihMjesta lokacijeMjernihMjesta = homePage.navigateOnPage(LokacijeMjernihMjesta.class, "Šifarnici", "Lokacije mjernih mjesta");
		lokacijeMjernihMjesta.verifikujLokacijeMjernihMjesta();
		MjestaPrikljucenja mjestaPrikljucenja = homePage.navigateOnPage(MjestaPrikljucenja.class, "Šifarnici", "Mjesta priključenja");
		mjestaPrikljucenja.verifikujMjestaPrikljucenja();
		NaciniPolaganjaInstalacija naciniPolaganjaInstalacija = homePage.navigateOnPage(NaciniPolaganjaInstalacija.class, "Šifarnici", "Načini polaganja instalacija");
		naciniPolaganjaInstalacija.verifikujNaciniPolaganjaInstalacija();
		TipoviPrikljucnogVoda tipoviPrikljucnogVoda = homePage.navigateOnPage(TipoviPrikljucnogVoda.class, "Šifarnici", "Tipovi priključnog voda");
		tipoviPrikljucnogVoda.verifikujTipoviPrikljucnogVoda();
		PresjeciPrikljucnogVoda presjeciPrikljucnogVoda = homePage.navigateOnPage(PresjeciPrikljucnogVoda.class, "Šifarnici", "Presjeci priključnog voda");
		presjeciPrikljucnogVoda.verifikujPresjeciPrikljucnogVoda();
		TipoviPrikljucka tipoviPrikljucka = homePage.navigateOnPage(TipoviPrikljucka.class, "Šifarnici", "Tipovi priključka");
		tipoviPrikljucka.verifikujTipoviPrikljucka();
		PrikljucneSnage prikljucneSnage = homePage.navigateOnPage(PrikljucneSnage.class, "Šifarnici", "Priključne snage");
		prikljucneSnage.verifikujPrikljucneSnage();
		MaterijaliProvodnika materijaliProvodnika = homePage.navigateOnPage(MaterijaliProvodnika.class, "Šifarnici", "Materijali provodnika");
		materijaliProvodnika.verifikujMaterijaliProvodnika();
		TipoviIzolacija tipoviIzolacija = homePage.navigateOnPage(TipoviIzolacija.class, "Šifarnici", "Tipovi izolacija");
		tipoviIzolacija.verifikujTipoviIzolacija();
		TipoviMjernihMostova tipoviMjernihMostova = homePage.navigateOnPage(TipoviMjernihMostova.class, "Šifarnici", "Tipovi mjernih mostova");
		tipoviMjernihMostova.verifikujTipoviMjernihMostova();
		MaterijaliOrmaricaBrojila materijaliOrmaricaBrojila = homePage.navigateOnPage(MaterijaliOrmaricaBrojila.class, "Šifarnici", "Materijali ormarića brojila");
		materijaliOrmaricaBrojila.verifikujMaterijaliOrmaricaBrojila();
		KlaseTacnostiBrojila klaseTacnostiBrojila = homePage.navigateOnPage(KlaseTacnostiBrojila.class, "Šifarnici", "Klase tačnosti brojila");
		klaseTacnostiBrojila.verifikujKlaseTacnostiBrojila();
		NazivneStrujeBrojila nazivneStrujeBrojila = homePage.navigateOnPage(NazivneStrujeBrojila.class, "Šifarnici", "Nazivne struje brojila");
		nazivneStrujeBrojila.verifikujNazivneStrujeBrojila();
		KlaseTacnostiTransformatora klaseTacnostiStrujnogTransformatora = homePage
				.navigateOnPage(KlaseTacnostiTransformatora.class, "Šifarnici", "Klase tačnosti transformatora");
		klaseTacnostiStrujnogTransformatora.verifikujKlaseTacnostiTransformatora();
		StrujniPrenosniOdnos strujniPrenosniOdnos = homePage.navigateOnPage(StrujniPrenosniOdnos.class, "Šifarnici", "Strujni prenosni odnos");
		strujniPrenosniOdnos.verifikujStrujniPrenosniOdnos();
		NazivneStrujeOsiguraca nazivneStrujeOsiguraca = homePage.navigateOnPage(NazivneStrujeOsiguraca.class, "Šifarnici", "Nazivne struje osigurača");
		nazivneStrujeOsiguraca.verifikujNazivneStrujeOsiguraca();		
		NaponskiPrenosniOdnos naponskiPrenosniodnos = homePage.navigateOnPage(NaponskiPrenosniOdnos.class, "Šifarnici", "Naponski prenosni odnos");
		naponskiPrenosniodnos.verifikujNaponskiPrenosniOdnos();
		NaciniUpravljanjaPotrosnjom naciniUpravljanjaPotrosnjom = homePage.navigateOnPage(NaciniUpravljanjaPotrosnjom.class, "Šifarnici", "Načini upravljanja potrošnjom");
		naciniUpravljanjaPotrosnjom.verifikujNaciniUpravljanjaPotrosnjom();
		VrsteUpravljackihUredjaja vrsteUpravljackihUredjaja = homePage.navigateOnPage(VrsteUpravljackihUredjaja.class, "Šifarnici", "Vrste upravljačkih uređaja");
		vrsteUpravljackihUredjaja.verifikujVrsteUpravljackihUredjaja();
		VrsteImpulsnihUredjaja vrsteImpulsnihUredjaja = homePage.navigateOnPage(VrsteImpulsnihUredjaja.class, "Šifarnici", "Vrste impulsnih uređaja");
		vrsteImpulsnihUredjaja.verifikujVrsteImpulsnihUredjaja();
		VrsteZastitnihUredjaja vrsteZastitnihUredjaja = homePage.navigateOnPage(VrsteZastitnihUredjaja.class, "Šifarnici", "Vrste zaštitnih uređaja");
		vrsteZastitnihUredjaja.verifikujVrsteZastitnihUredjaja();
		SistemiZastiteOdIndDodira sistemiZastiteOdIndDodira = homePage.navigateOnPage(SistemiZastiteOdIndDodira.class, "Šifarnici", "Sistemi zaštite od ind. dodira");
		sistemiZastiteOdIndDodira.verifikujSistemiZastiteOdIndDodira();
		RokoviVazenja rokoviVazenja = homePage.navigateOnPage(RokoviVazenja.class, "Šifarnici", "Rokovi važenja");
		rokoviVazenja.verifikujRokoviVazenja();
		NaciniPlacanja naciniPlacanja = homePage.navigateOnPage(NaciniPlacanja.class, "Šifarnici", "Načini plaćanja");
		naciniPlacanja.verifikujNaciniPlacanja();
		UsloviPlacanja usloviPlacanja = homePage.navigateOnPage(UsloviPlacanja.class, "Šifarnici", "Uslovi plaćanja");
		usloviPlacanja.verifikujUsloviPlacanja();		
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz podsekcije MJERNI SIFARNICI i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test3() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Trafostanice trafostanice = homePage.navigateOnPage(Trafostanice.class, "Šifarnici", "Trafostanice");
		trafostanice.verifikujTrafostanice();
		Vlasnistva vlasnistva = homePage.navigateOnPage(Vlasnistva.class, "Šifarnici", "Vlasništva");
		vlasnistva.verifikujVlasnistva();
		IzvorNapajanjaBrojila izvorNapajanjaBrojila = homePage.navigateOnPage(IzvorNapajanjaBrojila.class, "Šifarnici", "Izvori napajanja brojila");
		izvorNapajanjaBrojila.verifikujIzvorNapajanjaBrojila();
		ProizvodjaciBrojila proizvodjaciBrojila = homePage.navigateOnPage(ProizvodjaciBrojila.class, "Šifarnici", "Proizvođači brojila");
		proizvodjaciBrojila.verifikujProizvodjaciBrojila();
		SposobnostPrikljucenjaBrojila sposobnostPrikljucenjaBrojila = homePage
				.navigateOnPage(SposobnostPrikljucenjaBrojila.class, "Šifarnici", "Sposobnosti priključenja brojila");
		sposobnostPrikljucenjaBrojila.verifikujSposobnostPrikljucenjaBrojila();
		MogucnostDaljinskogPristupa mogucnostDaljinskogPristupa = homePage.navigateOnPage(MogucnostDaljinskogPristupa.class, "Šifarnici", "Mogućnost daljinskog pristupa");
		mogucnostDaljinskogPristupa.verifikujMogucnostDaljinskogPristupa();
		LokacijaBrojila lokacijaBrojila = homePage.navigateOnPage(LokacijaBrojila.class, "Šifarnici", "Lokacije brojila");
		lokacijaBrojila.verifikujLokacijaBrojila();
		RazlogPromjeneLokacije razlogPromjeneLokacije = homePage.navigateOnPage(RazlogPromjeneLokacije.class, "Šifarnici", "Razlozi promjene lokacije");
		razlogPromjeneLokacije.verifikujRazlogPromjeneLokacije();
		NaponskiNivoi naponskiNivoi = homePage.navigateOnPage(NaponskiNivoi.class, "Šifarnici", "Naponski nivoi");
		naponskiNivoi.verifikujNaponskiNivoi();
		StrujniNivoi strujniNivoi = homePage.navigateOnPage(StrujniNivoi.class, "Šifarnici", "Strujni nivoi");
		strujniNivoi.verifikujStrujniNivoi();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz podsekcije SIFARNICI MJERNIH UREDJAJA i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test4() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TipoviBrojila tipoviBrojila = new TipoviBrojila(driver);
		tipoviBrojila.navigirajVerifikujTipoviBrojila();
		TipoviTransformatora tipoviTransformatora = new TipoviTransformatora(driver);
		tipoviTransformatora.navigirajVerifikujTipoviTransformatora();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz podsekcije FINANSIJSKI SIFARNICI i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test5() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = new Banke(driver);
		banke.navigirajVerifikujBanke();
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.navigirajVerifikujZiroRacuni();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_dist_003_02_verifikacija_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = new KategorijePotrosnje(driver);
		kategorijePotrosnje.navigirajVerifikujKategorijePotrosnje();
		Sezone sezone = new Sezone(driver);
		sezone.navigirajVerifikujSezone();
		TarifneNadgrupe tarifneNadgrupe = new TarifneNadgrupe(driver);
		tarifneNadgrupe.navigirajVerifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = new TarifneGrupe(driver);
		tarifneGrupe.navigirajVerifikujTarifneGrupe();
		ObracunskaSnaga obracunskaSnaga = new ObracunskaSnaga(driver);
		obracunskaSnaga.navigirajVerifikujObracunskaSnaga();
		CjenovnikMrezarine cjenovnik = new CjenovnikMrezarine(driver);
		cjenovnik.navigirajVerifikujCjenovnikMrezarine();
		CjenovnikNeovlastenePotrosnje cjenovnikNeovlastenePotrosnje = new CjenovnikNeovlastenePotrosnje(driver);
		cjenovnikNeovlastenePotrosnje.navigirajVerifikujCjenovnikNeovlastenePotrosnje();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_dist_003_03_verifikacija_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskaMjernaMjesta mjernaMjesta = homePage.navigateOnPage(ObracunskaMjernaMjesta.class, "Mjerna mjesta", "Obračunska mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		ZbirnaKontrolnaMjernaMjesta zbirnaMjernaMjesta = homePage.navigateOnPage(ZbirnaKontrolnaMjernaMjesta.class, "Mjerna mjesta", "Zbirna/kontrolna mjerna mjesta");
		zbirnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		IndirektnaMjernaMjesta indirektnaMjernaMjesta = homePage.navigateOnPage(IndirektnaMjernaMjesta.class, "Mjerna mjesta", "Indirektna mjerna mjesta");
		indirektnaMjernaMjesta.verifikujIndirektnaMjernaMjesta();
		EnergetskeKartice kartica = homePage.navigateOnPage(EnergetskeKartice.class, "Mjerna mjesta", "Energetske kartice");
		kartica.verifikujEnergetskaKartica();
		LokacijskeSaglasnosti lokacijskeSaglasnosti = homePage.navigateOnPage(LokacijskeSaglasnosti.class, "Mjerna mjesta", "Lokacijske saglasnosti");
		lokacijskeSaglasnosti.verifikujLokacijskeSaglasnosti();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = homePage.navigateOnPage(ElektroenergetskeSaglasnosti.class, "Mjerna mjesta", "Elektroenergetske saglasnosti");
		elektroenergetskeSaglasnosti.verifikujElektroenergetskeSaglasnosti();
//		TODO Promjene EES - kreirati novu klasu
		UgovoriOPrikljucenju ugovoriOPrikljucenju = homePage.navigateOnPage(UgovoriOPrikljucenju.class, "Mjerna mjesta", "Ugovori o priključenju");
		ugovoriOPrikljucenju.verifikujUgovoriOPrikljucenju();		
		DeklaracijeOPrikljucku deklaracijeOPrikljucku = homePage.navigateOnPage(DeklaracijeOPrikljucku.class, "Mjerna mjesta", "Deklaracije o priključku");
		deklaracijeOPrikljucku.verifikujDeklaracijeOPrikljucku();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavu = homePage.navigateOnPage(ZahtjeviZaDostavuPodataka.class, "Mjerna mjesta", "Zahtjevi za dostavu podataka");
		zahtjeviZaDostavu.verifikujZahtjeviZaDostavuPodataka();
		ZahtjeviZaIskljucenja zahtjeviZaIskljucenja = homePage.navigateOnPage(ZahtjeviZaIskljucenja.class, "Mjerna mjesta", "Zahtjevi za isključenja");
		zahtjeviZaIskljucenja.verifikujZahtjeviZaIskljucenja();
		ZahtjeviZaUkljucenja zahtjeviZaUkljucenja = homePage.navigateOnPage(ZahtjeviZaUkljucenja.class, "Mjerna mjesta", "Zahtjevi za uključenja");
		zahtjeviZaUkljucenja.verifikujZahtjeviZaUkljucenja();
//		TODO Importi obavjestenja o isklj. - kreirati novu klasu
		AktivnaIskljucenjaMjernihMjesta aktivnaIskljucenjaMjernihMjesta = homePage
				.navigateOnPage(AktivnaIskljucenjaMjernihMjesta.class, "Mjerna mjesta", "Aktivna isključenja MM");
		aktivnaIskljucenjaMjernihMjesta.verifikujAktivnaIskljucenjaMjernihMjesta();
		RazloziNeizvrsavanjaZahtjeva razloziNeizvrsavanjaZahtjeva = homePage.navigateOnPage(RazloziNeizvrsavanjaZahtjeva.class, "Mjerna mjesta", "Razlozi neizvršavanja zahtjeva");
		razloziNeizvrsavanjaZahtjeva.verifikujRazloziNeizvrsavanjaZahtjeva();
		KontroleMjernihMjesta kontroleMjernihMjesta = homePage.navigateOnPage(KontroleMjernihMjesta.class, "Mjerna mjesta", "Kontrole mjernih mjesta");
		kontroleMjernihMjesta.verifikujKontroleMjernihMjesta();	
		RegistarPlombi registarPlombi = homePage.navigateOnPage(RegistarPlombi.class, "Mjerna mjesta", "Registar plombi");
		registarPlombi.verifikujRegistarPlombi();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_dist_003_04_verifikacija_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = new PravnaLica(driver);
		pravnaLica.navigirajVerifikujPravnaLica();
		FizickaLica fizickaLica = new FizickaLica(driver);
		fizickaLica.navigirajVerifikujFizickaLica();
		ZahtjeviZaDostavuPodatakaKUPCI zahtjeviZaDostavuPodatakaKupci = new ZahtjeviZaDostavuPodatakaKUPCI(driver);
		zahtjeviZaDostavuPodatakaKupci.navigirajVerifikujZahtjeviZaDostavuPodatakaKUPCI();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije BROJILA i verifikuje ih")
	public void px_dist_003_05_verifikacija_sekcije_brojila_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KoristenaBrojila koristenaBrojila = new KoristenaBrojila(driver);
		koristenaBrojila.navigirajVerifikujKoristenaBrojila();
		ZamjeneBrojila zamjeneBrojila = new ZamjeneBrojila(driver);
		zamjeneBrojila.navigirajVerifikujZamjeneBrojila();
		RegistarBrojila registarBrojila = new RegistarBrojila(driver);
		registarBrojila.navigirajVerifikujRegistarBrojila();
		RelokacijeBrojila relokacijeBrojila = new RelokacijeBrojila(driver);
		relokacijeBrojila.navigirajVerifikujRelokacijeBrojila();
		StrujniMjerniTransformatori transformatori = new StrujniMjerniTransformatori(driver);
		transformatori.navigirajVerifikujStrujniMjerniTransformatori();
//		TODO NaponskiMjerniTransformatori
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OBRACUNSKI UGOVORI i verifikuje ih")
	public void px_dist_003_06_verifikacija_sekcije_obracunski_ugovori_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskiUgovori obracunskiUgovori = new ObracunskiUgovori(driver);
		obracunskiUgovori.navigirajVerifikujObracunskiUgovori();
		ZahtjeviZaObracunskeUgovore zahtjeviZaObracunskeUgovore = new ZahtjeviZaObracunskeUgovore(driver);
		zahtjeviZaObracunskeUgovore.navigirajVerifikujZahtjeviZaObracunskeUgovore();
		ZahtjeviZaRaskidUgovora zahtjeviZaRaskidUgovora = new ZahtjeviZaRaskidUgovora(driver);
		zahtjeviZaRaskidUgovora.navigirajVerifikujZahtjeviZaRaskidUgovora();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OCITANJA i verifikuje ih")
	public void px_dist_003_07_verifikacija_sekcije_ocitanja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		OcitanjaBrojila ocitanjabrojila = homePage.navigateOnPage(OcitanjaBrojila.class, "Očitanja", "Očitanja brojila");
		ocitanjabrojila.verifikujOcitanjaBrojila();
		KorekcijeOcitanja korekcijeocitanja = homePage.navigateOnPage(KorekcijeOcitanja.class, "Očitanja", "Korekcije očitanja");
		korekcijeocitanja.verifikujKorekcijeOcitanja();
		ImportiOcitanja importiocitanja = homePage.navigateOnPage(ImportiOcitanja.class, "Očitanja", "Importi očitanja");
		importiocitanja.verifikujImportiOcitanja();
		IzmijenjenaOcitanja izmijenjenaocitanja = homePage.navigateOnPage(IzmijenjenaOcitanja.class, "Očitanja", "Izmijenjena očitanja");
		izmijenjenaocitanja.verifikujIzmijenjenaOcitanja();
		NevalidnaOcitanja nevalidnaocitanja = homePage.navigateOnPage(NevalidnaOcitanja.class, "Očitanja", "Nevalidna očitanja");
		nevalidnaocitanja.verifikujNevalidnaOcitanja();
		CitackiHodovi citackihodovi = homePage.navigateOnPage(CitackiHodovi.class, "Očitanja", "Čitački hodovi");
		citackihodovi.verifikujCitackiHodovi();
		CitackeListe citackeliste = homePage.navigateOnPage(CitackeListe.class, "Očitanja", "Čitačke liste");
		citackeliste.verifikujCitackeListe();
		CitaciPoCitackimHodovima citaciPoCitackimHodovima = homePage.navigateOnPage(CitaciPoCitackimHodovima.class, "Očitanja", "Čitači po čitačkim hodovima");
		citaciPoCitackimHodovima.verifikujCitaciPoCitackimHodovima();
		ZbirnaKontrolnaOcitanja zbirnaKontrolnaOcitanja = homePage.navigateOnPage(ZbirnaKontrolnaOcitanja.class, "Očitanja", "Zbirna/kontrolna očitanja");
		zbirnaKontrolnaOcitanja.verifikujZbirnaKontrolnaOcitanja();
		ZbirnaKontrolnaPotrosnja zbirnaKontrolnaPotrosnja = homePage.navigateOnPage(ZbirnaKontrolnaPotrosnja.class, "Očitanja", "Zbirna/kontrolna potrošnja");
		zbirnaKontrolnaPotrosnja.verifikujZbirnaKontrolnaPotrosnja();
//		TODO ProcjenaOcitanja
		MonitoringOcitanja monitoringOcitanja = homePage.navigateOnPage(MonitoringOcitanja.class, "Očitanja", "Monitoring očitanja");
		monitoringOcitanja.verifikujMonitoringOcitanja();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije NEOVLASTENA POTROSNJA i verifikuje ih")
	public void px_dist_003_08_verifikacija_sekcije_neovlastena_potrosnja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NeovlastenaPotrosnja neovlastenaPotrosnja = new NeovlastenaPotrosnja(driver);
		neovlastenaPotrosnja.navigirajVerifikujNeovlastenaPotrosnja();
		RacuniNeovlastenePotrosnje racuni = new RacuniNeovlastenePotrosnje(driver);
		racuni.navigirajVerifikujRacuniNeovlastenePotrosnje();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije OBRACUN i verifikuje ih")
	public void px_dist_003_09_verifikacija_sekcije_obracun_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NaloziZaObracun naloziZaObracun = new NaloziZaObracun(driver);
		naloziZaObracun.navigirajVerifikujNaloziZaObracun();
//		TODO EnergetskiObracun
		KorekcijeEnergetskihObracuna korekcijeEnergetskihObracuna = new KorekcijeEnergetskihObracuna(driver);
		korekcijeEnergetskihObracuna.navigirajVerifikujKorekcijeEnergetskihObracuna();
		MjesecnaOdobrenjaZaduzenja mjesecnaOdobrenjaZaduzenja = new MjesecnaOdobrenjaZaduzenja(driver);
		mjesecnaOdobrenjaZaduzenja.navigirajVerifikujMjesecnaOdobrenjaZaduzenja();
		KorekcionaOdobrenjaZaduzenja korekcionaOdobrenjaZaduzenja = new KorekcionaOdobrenjaZaduzenja(driver);
		korekcionaOdobrenjaZaduzenja.navigirajVerifikujKorekcionaOdobrenjaZaduzenja();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih")
	public void px_dist_003_10_verifikacija_sekcije_finansije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.strelicaDesnoNavigate();
		FinansijskeKartice finansijskeKartice = new FinansijskeKartice(driver);
		finansijskeKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevniciUplata = new DnevniciUplata(driver);
		dnevniciUplata.verifikujDnevniciUplata();
		SveUplate sveUplate = new SveUplate(driver);
		sveUplate.verifikujSveUplate();
//		TODO verifikacija sekcije finansije
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije ADMINISTRACIJA i verifikuje ih")
	public void px_dist_003_11_verifikacija_sekcije_administracija_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.strelicaDesnoNavigate();
		Korisnici korisnici = new Korisnici(driver);
		korisnici.navigirajVerifikujKorisnici();
		Poruke poruke = new Poruke(driver);
		poruke.navigirajVerifikujPoruke();
		DnevnikIzmjena dnevnikIzmjena = new DnevnikIzmjena(driver);
		dnevnikIzmjena.navigirajVerifikujDnevnikIzmjena();
	}

}