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
		VrsteObjekata vrsteObjekata = new VrsteObjekata(driver);
		vrsteObjekata.navigirajVerifikujVrsteObjekata();
		LokacijeMjernihMjesta lokacijeMjernihMjesta = new LokacijeMjernihMjesta(driver);
		lokacijeMjernihMjesta.navigirajVerifikujLokacijeMjernihMjesta();
		MjestaPrikljucenja mjestaPrikljucenja = new MjestaPrikljucenja(driver);
		mjestaPrikljucenja.navigirajVerifikujMjestaPrikljucenja();
		NaciniPolaganjaInstalacija naciniPolaganjaInstalacija = new NaciniPolaganjaInstalacija(driver);
		naciniPolaganjaInstalacija.navigirajVerifikujNaciniPolaganjaInstalacija();		
		TipoviPrikljucnogVoda tipoviPrikljucnogVoda = new TipoviPrikljucnogVoda(driver);
		tipoviPrikljucnogVoda.navigirajVerifikujTipoviPrikljucnogVoda();		
		PresjeciPrikljucnogVoda presjeciPrikljucnogVoda = new PresjeciPrikljucnogVoda(driver);
		presjeciPrikljucnogVoda.navigirajVerifikujPresjeciPrikljucnogVoda();		
		TipoviPrikljucka tipoviPrikljucka = new TipoviPrikljucka(driver);
		tipoviPrikljucka.navigirajVerifikujTipoviPrikljucka();		
		PrikljucneSnage prikljucneSnage = new PrikljucneSnage(driver);
		prikljucneSnage.navigirajVerifikujPrikljucneSnage();		
		MaterijaliProvodnika materijaliProvodnika = new MaterijaliProvodnika(driver);
		materijaliProvodnika.navigirajVerifikujMaterijaliProvodnika();	
		TipoviIzolacija tipoviIzolacija = new TipoviIzolacija(driver);
		tipoviIzolacija.navigirajVerifikujTipoviIzolacija();		
		TipoviMjernihMostova tipoviMjernihMostova = new TipoviMjernihMostova(driver);
		tipoviMjernihMostova.navigirajVerifikujTipoviMjernihMostova();	
		MaterijaliOrmaricaBrojila materijaliOrmaricaBrojila = new MaterijaliOrmaricaBrojila(driver);
		materijaliOrmaricaBrojila.navigirajVerifikujMaterijaliOrmaricaBrojila();			
		KlaseTacnostiBrojila klaseTacnostiBrojila = new KlaseTacnostiBrojila(driver);
		klaseTacnostiBrojila.navigirajVerifikujKlaseTacnostiBrojila();		
		NazivneStrujeBrojila nazivneStrujeBrojila = new NazivneStrujeBrojila(driver);
		nazivneStrujeBrojila.navigirajVerifikujNazivneStrujeBrojila();		
		KlaseTacnostiTransformatora klaseTacnostiStrujnogTransformatora = new KlaseTacnostiTransformatora(driver);
		klaseTacnostiStrujnogTransformatora.navigirajVerifikujKlaseTacnostiTransformatora();		
		StrujniPrenosniOdnos strujniPrenosniOdnos = new StrujniPrenosniOdnos(driver);
		strujniPrenosniOdnos.navigirajVerifikujStrujniPrenosniOdnos();		
		NazivneStrujeOsiguraca nazivneStrujeOsiguraca = new NazivneStrujeOsiguraca(driver);
		nazivneStrujeOsiguraca.navigirajVerifikujNazivneStrujeOsiguraca();			
		NaponskiPrenosniOdnos naponskiPrenosniodnos = new NaponskiPrenosniOdnos(driver);
		naponskiPrenosniodnos.navigirajVerifikujNaponskiPrenosniOdnos();	
		NaciniUpravljanjaPotrosnjom naciniUpravljanjaPotrosnjom = new NaciniUpravljanjaPotrosnjom(driver);
		naciniUpravljanjaPotrosnjom.navigirajVerifikujNaciniUpravljanjaPotrosnjom();	
		VrsteUpravljackihUredjaja vrsteUpravljackihUredjaja = new VrsteUpravljackihUredjaja(driver);
		vrsteUpravljackihUredjaja.navigirajVerifikujVrsteUpravljackihUredjaja();		
		VrsteImpulsnihUredjaja vrsteImpulsnihUredjaja = new VrsteImpulsnihUredjaja(driver);
		vrsteImpulsnihUredjaja.navigirajVerifikujVrsteImpulsnihUredjaja();	
		VrsteZastitnihUredjaja vrsteZastitnihUredjaja = new VrsteZastitnihUredjaja(driver);
		vrsteZastitnihUredjaja.navigirajVerifikujVrsteZastitnihUredjaja();		
		SistemiZastiteOdIndDodira sistemiZastiteOdIndDodira = new SistemiZastiteOdIndDodira(driver);
		sistemiZastiteOdIndDodira.navigirajVerifikujSistemiZastiteOdIndDodira();		
		RokoviVazenja rokoviVazenja = new RokoviVazenja(driver);
		rokoviVazenja.navigirajVerifikujRokoviVazenja();
		NaciniPlacanja naciniPlacanja = new NaciniPlacanja(driver);
		naciniPlacanja.navigirajVerifikujNaciniPlacanja();
		UsloviPlacanja usloviPlacanja = new UsloviPlacanja(driver);
		usloviPlacanja.navigirajVerifikujUsloviPlacanja();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz podsekcije MJERNI SIFARNICI i verifikuje ih")
	public void px_dist_003_01_verifikacija_sekcije_sifarnici_test3() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Trafostanice trafostanice = new Trafostanice(driver);
		trafostanice.navigirajVerifikujTrafostanice();
//		TODO TipoviTrafostanica
		Vlasnistva vlasnistva = new Vlasnistva(driver);
		vlasnistva.navigirajVerifikujVlasnistva();		
		IzvorNapajanjaBrojila izvorNapajanjaBrojila = new IzvorNapajanjaBrojila(driver);
		izvorNapajanjaBrojila.navigirajVerifikujIzvorNapajanjaBrojila();		
		ProizvodjaciBrojila proizvodjaciBrojila = new ProizvodjaciBrojila(driver);
		proizvodjaciBrojila.navigirajVerifikujProizvodjaciBrojila();	
		SposobnostPrikljucenjaBrojila sposobnostPrikljucenjaBrojila = new SposobnostPrikljucenjaBrojila(driver);
		sposobnostPrikljucenjaBrojila.navigirajVerifikujSposobnostPrikljucenjaBrojila();		
		MogucnostDaljinskogPristupa mogucnostDaljinskogPristupa = new MogucnostDaljinskogPristupa(driver);
		mogucnostDaljinskogPristupa.navigirajVerifikujMogucnostDaljinskogPristupa();
		NaponskiNivoi naponskiNivoi = new NaponskiNivoi(driver);
		naponskiNivoi.navigirajVerifikujNaponskiNivoi();
		StrujniNivoi strujniNivoi = new StrujniNivoi(driver);
		strujniNivoi.navigirajVerifikujStrujniNivoi();
//		LokacijaBrojila lokacijaBrojila = new LokacijaBrojila(driver);
//		lokacijaBrojila.navigirajVerifikujLokacijaBrojila();
//		RazlogPromjeneLokacije razlogPromjeneLokacije = new RazlogPromjeneLokacije(driver);
//		razlogPromjeneLokacije.navigirajVerifikujRazlogPromjeneLokacije();
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
		ObracunskaMjernaMjesta mjernaMjesta = new ObracunskaMjernaMjesta(driver);
		mjernaMjesta.navigirajVerifikujMjernaMjesta();
		ZbirnaKontrolnaMjernaMjesta zbirnaMjernaMjesta = new ZbirnaKontrolnaMjernaMjesta(driver);
		zbirnaMjernaMjesta.navigirajVerifikujZbirnaKontrolnaMjernaMjesta();
		IndirektnaMjernaMjesta indirektnaMjernaMjesta = new IndirektnaMjernaMjesta(driver);
		indirektnaMjernaMjesta.navigirajVerifikujIndirektnaMjernaMjesta();
		EnergetskeKartice kartica = new EnergetskeKartice(driver);
		kartica.navigirajVerifikujEnergetskaKartica();
		LokacijskeSaglasnosti lokacijskeSaglasnosti = new LokacijskeSaglasnosti(driver);
		lokacijskeSaglasnosti.navigirajVerifikujLokacijskeSaglasnosti();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
//		TODO Promjene EES - kreirati novu klasu
		UgovoriOPrikljucenju ugovoriOPrikljucenju = new UgovoriOPrikljucenju(driver);
		ugovoriOPrikljucenju.navigirajVerifikujUgovoriOPrikljucenju();		
		DeklaracijeOPrikljucku deklaracijeOPrikljucku = new DeklaracijeOPrikljucku(driver);
		deklaracijeOPrikljucku.navigirajVerifikujDeklaracijeOPrikljucku();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavu = new ZahtjeviZaDostavuPodataka(driver);
		zahtjeviZaDostavu.navigirajVerifikujZahtjeviZaDostavuPodataka();
		ZahtjeviZaIskljucenja zahtjeviZaIskljucenja = new ZahtjeviZaIskljucenja(driver);
		zahtjeviZaIskljucenja.navigirajVerifikujZahtjeviZaIskljucenja();
		ZahtjeviZaUkljucenja zahtjeviZaUkljucenja = new ZahtjeviZaUkljucenja(driver);
		zahtjeviZaUkljucenja.navigirajVerifikujZahtjeviZaUkljucenja();
//		TODO Importi obavjestenja o isklj. - kreirati novu klasu
		AktivnaIskljucenjaMjernihMjesta aktivnaIskljucenjaMjernihMjesta = new AktivnaIskljucenjaMjernihMjesta(driver);
		aktivnaIskljucenjaMjernihMjesta.navigirajVerifikujAktivnaIskljucenjaMjernihMjesta();
		RazloziNeizvrsavanjaZahtjeva razloziNeizvrsavanjaZahtjeva = new RazloziNeizvrsavanjaZahtjeva(driver);
		razloziNeizvrsavanjaZahtjeva.navigirajVerifikujRazloziNeizvrsavanjaZahtjeva();
		KontroleMjernihMjesta kontroleMjernihMjesta = new KontroleMjernihMjesta(driver);
		kontroleMjernihMjesta.navigirajVerifikujKontroleMjernihMjesta();	
		RegistarPlombi registarPlombi = new RegistarPlombi(driver);
		registarPlombi.navigirajVerifikujRegistarPlombi();
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
		OcitanjaBrojila ocitanjabrojila = new OcitanjaBrojila(driver);
		ocitanjabrojila.navigirajVerifikujOcitanjaBrojila();
		KorekcijeOcitanja korekcijeocitanja = new KorekcijeOcitanja(driver);
		korekcijeocitanja.navigirajVerifikujKorekcijeOcitanja();
		ImportiOcitanja importiocitanja = new ImportiOcitanja(driver);
		importiocitanja.navigirajVerifikujImportiOcitanja();
		IzmijenjenaOcitanja izmijenjenaocitanja = new IzmijenjenaOcitanja(driver);
		izmijenjenaocitanja.verifikujIzmijenjenaOcitanja();
		NevalidnaOcitanja nevalidnaocitanja = new NevalidnaOcitanja(driver);
		nevalidnaocitanja.verifikujNevalidnaOcitanja();
		CitackiHodovi citackiHodovi = new CitackiHodovi(driver);
		citackiHodovi.navigirajVerifikujCitackiHodovi();
		CitackeListe citackeListe = new CitackeListe(driver);
		citackeListe.navigirajVerifikujCitackeListe();
		CitaciPoCitackimHodovima citaciPoCitackimHodovima = new CitaciPoCitackimHodovima(driver);
		citaciPoCitackimHodovima.navigirajVerifikujCitaciPoCitackimHodovima();
		ZbirnaKontrolnaOcitanja zbirnaKontrolnaOcitanja = new ZbirnaKontrolnaOcitanja(driver);
		zbirnaKontrolnaOcitanja.navigirajVerifikujZbirnaKontrolnaOcitanja();
		ZbirnaKontrolnaPotrosnja zbirnaKontrolnaPotrosnja = new ZbirnaKontrolnaPotrosnja(driver);
		zbirnaKontrolnaPotrosnja.navigirajVerifikujZbirnaKontrolnaPotrosnja();
//		TODO ProcjenaOcitanja
		MonitoringOcitanja monitoringOcitanja = new MonitoringOcitanja(driver);
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