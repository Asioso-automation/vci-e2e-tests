package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.AdministracijaKorisnika;
import scp.page.AvansneFakture;
import scp.page.Banke;
import scp.page.Bonifikacije;
import scp.page.CitackeKnjige;
import scp.page.Cjenovnik;
import scp.page.DaniISatiGrijanja;
import scp.page.DnevniciUplata;
import scp.page.DnevnikIzmjena;
import scp.page.Drzave;
import scp.page.Entiteti;
import scp.page.FinansijskeKartice;
import scp.page.GrejneSezone;
import scp.page.IndirektnaPotrosnja;
import scp.page.KategorijeObjekata;
import scp.page.KorekcijeRacuna;
import scp.page.Kupci;
import scp.page.KupciBezUgovora;
import scp.page.KupciSaNeiskoristenimAvansom;
import scp.page.LogIn;
import scp.page.Mjerila;
import scp.page.MjesneZajednice;
import scp.page.MonitoringOcitanja;
import scp.page.NalogZaObracun;
import scp.page.NalogZaOcitanja;
import scp.page.NaloziZaIskljucenje;
import scp.page.NaseljenaMjesta;
import scp.page.NeregularnaOcitanja;
import scp.page.NestandardneUsluge;
import scp.page.Objekti;
import scp.page.Ocitanja;
import scp.page.Opomene;
import scp.page.OpomenePredIskljucenje;
import scp.page.Organizacije;
import scp.page.OslobadjanjeOdKamate;
import scp.page.ParametriObracuna;
import scp.page.Plombe;
import scp.page.PocetnaStranica;
import scp.page.Poruke;
import scp.page.Poste;
import scp.page.PrenosSaldaPoStavkama;
import scp.page.Presude;
import scp.page.ProfiliMjerila;
import scp.page.ProizvodjaciMjerila;
import scp.page.Prostori;
import scp.page.Racuni;
import scp.page.RacuniZaNestandardneUsluge;
import scp.page.RadniStatusi;
import scp.page.Reoni;
import scp.page.Reprogrami;
import scp.page.RokoviPlacanja;
import scp.page.StatusiNalogaZaIskljucenje;
import scp.page.SveUplate;
import scp.page.TarifneGrupe;
import scp.page.TarifneNadgrupe;
import scp.page.TarifnePodgrupe;
import scp.page.TarifniModeli;
import scp.page.TefObrasci;
import scp.page.TipoviMjerila;
import scp.page.TipoviPotrosaca;
import scp.page.ToplotneStanice;
import scp.page.ToplotniReoni;
import scp.page.Toplovodi;
import scp.page.Tuzbe;
import scp.page.Ugovori;
import scp.page.Ulice;
import scp.page.Usluge;
import scp.page.VrsteMjerila;
import scp.page.VrstePresuda;
import scp.page.ZbirniRacuni;
import scp.page.ZiroRacuni;
import scp.page.Zone;
import scp.page.ZoneDma;
import scp.page.ZoneOcitanja;

public class SCP_004_Verifikacija_Sekcija_Test extends BaseTest {

	public SCP_004_Verifikacija_Sekcija_Test() throws IOException, FileNotFoundException {
		super();
	}

	// VODOVOD

	@Test(description = "test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		Drzave drzave = pocetna.navigirajNaDrzave();
		drzave.verifikujDrzave();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntiteti();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		MjesneZajednice mjesneZajednice = pocetna.navigirajNaMjesneZajednice();
		mjesneZajednice.verifikujMjesneZajednice();
		Reoni reoni = pocetna.navigirajNaReone();
		reoni.verifikujReone();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		Zone zone = pocetna.navigirajNaZone();
		zone.verifikujZone();
		ZoneDma zoneDma = pocetna.navigirajNaZoneDma();
		zoneDma.verifikujZoneDma();
		KategorijeObjekata kategorijeObjekata = pocetna.navigirajNaKategorijeObjekata();
		kategorijeObjekata.verifikujKategorijeObjekata();
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadniStatusi();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneNadgrupe nadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		nadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe grupe = pocetna.navigirajNaTarifneGrupe();
		grupe.verifikujTarifneGrupe();
		TarifnePodgrupe podgrupe = pocetna.navigirajNaTarifnePodgrupe();
		podgrupe.verifikujTarifnePodgrupe();
		TarifniModeli modeli = pocetna.navigirajNaTarifneModele();
		modeli.verifikujTarifneModele();
		TipoviPotrosaca tipovi = pocetna.navigirajNaTipovePotrosaca();
		tipovi.verifikujTipovePotrosaca();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
		NestandardneUsluge nestandardne = pocetna.navigirajNaNestandardneUsluge();
		nestandardne.verifikujNestandardneUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		KupciBezUgovora kupciBezUgovora = pocetna.navigirajNaKupceBezUgovora();
		kupciBezUgovora.verifikujKupceBezUgovora();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreVodovod();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	

	@Test(description = "test prolazi kroz sve stranice iz sekcije MJERILA i verifikuje ih")
	public void scp_004_verifikacija_mjerila_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Mjerila mjerila = pocetna.navigirajNaMjerila();
		mjerila.verifikujMjerilaVodovod();
		VrsteMjerila vrsteMjerila = pocetna.navigirajNaVrsteMjerila();
		vrsteMjerila.verifikujVrsteMjerila();
		TipoviMjerila tipoviMjerila = pocetna.navigirajNaTipoveMjerila();
		tipoviMjerila.verifikujTipoviMjerila();
		ProfiliMjerila profiliMjerila = pocetna.navigirajNaProfileMjerila();
		profiliMjerila.verifikujProfileMjerila();
		ProizvodjaciMjerila proizvodjaciMjerila = pocetna.navigirajNaProizvodjaceMjerila();
		proizvodjaciMjerila.verifikujProizvodjaceMjerila();
		Plombe plombe = pocetna.navigirajNaPlombe();
		plombe.verifikujPlombe();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije OČITANJA i verifikuje ih")
	public void scp_004_verifikacija_ocitanja_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		ZoneOcitanja zoneOcitanja = pocetna.navigirajNaZoneOcitanja();
		zoneOcitanja.verifikujZoneOcitanja();
		NalogZaOcitanja nalogOcitanja = pocetna.navigirajNaNalogeZaOcitanja();
		nalogOcitanja.verifikujNalogZaOcitanjaMjerila();
		Ocitanja ocitanja = pocetna.navigirajNaOcitanja();
		ocitanja.verifikujOcitanjaVodovod();
		MonitoringOcitanja monitoring = pocetna.navigirajNaMonitoringOcitanja();
		monitoring.verifikujMonitoringOcitanjaVodovod();
		CitackeKnjige citackeKnjige = pocetna.navigirajNaCitackeKnjige();
		citackeKnjige.verifikujCitackeKnjige();
		NeregularnaOcitanja neregOcitanja = pocetna.navigirajNaNeregularnaOcitanja();
		neregOcitanja.verifikujNeregularnaOcitanja();	
		IndirektnaPotrosnja indirektnaPotrosnja = pocetna.navigirajNaIndirektnuPotrosnju();
		indirektnaPotrosnja.verifikujIndirektnuPotrosnju();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije OBRAČUN i FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija_obracuna_i_finansija_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Racuni racuni = pocetna.navigirajNaRacune();
		racuni.verifikujRacune();
		ZbirniRacuni zbirni = pocetna.navigirajNaZbirneRacune();
		zbirni.verifikujZbirneRacune();
		RacuniZaNestandardneUsluge racuniNest = pocetna.navigirajNaRacuneZaNestandardneUsluge();
		racuniNest.verifikujRacuneZaNestandardneUsluge();
		KorekcijeRacuna korekcije = pocetna.navigirajNaKorekcijeRacuna();
		korekcije.verifikujKorekcijeRacuna();
		FinansijskeKartice finKartice = pocetna.navigirajNaFinansijskeKartice();
		finKartice.verifikujFinansijskeKartice();
		NaloziZaIskljucenje nalozi = pocetna.navigirajNaNalogeZaIskljucenja();
		nalozi.verifikujNalogeZaIskljucenjaVodovod();
	}
	
	// TOPLANA
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		Drzave drzave = pocetna.navigirajNaDrzave();
		drzave.verifikujDrzave();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntiteti();
		NaseljenaMjesta mjesta = pocetna.navigirajNaNaseljenaMjesta();
		mjesta.verifikujNaseljenaMjesta();
		MjesneZajednice mjesne = pocetna.navigirajNaMjesneZajednice();
		mjesne.verifikujMjesneZajednice();
		Reoni reoni = pocetna.navigirajNaReone();
		reoni.verifikujReone();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		Zone zone = pocetna.navigirajNaZone();
		zone.verifikujZone();
		KategorijeObjekata kategorijeObjekata = pocetna.navigirajNaKategorijeObjekata();
		kategorijeObjekata.verifikujKategorijeObjekata();
		RadniStatusi radni = pocetna.navigirajNaRadneStatuse();
		radni.verifikujRadniStatusi();
		ToplotneStanice stanice = pocetna.navigirajNaToplotneStanice();
		stanice.verifikujToplotneStanice();
		ToplotniReoni topReoni = pocetna.navigirajNaToplotneReone();
		topReoni.verifikujToplotneReone();
		Toplovodi toplovodi = pocetna.navigirajNaToplovode();
		toplovodi.verifikujToplovode();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneNadgrupe nadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		nadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe grupe = pocetna.navigirajNaTarifneGrupe();
		grupe.verifikujTarifneGrupe();
		TarifnePodgrupe podgrupe = pocetna.navigirajNaTarifnePodgrupe();
		podgrupe.verifikujTarifnePodgrupe();
		TarifniModeli modeli = pocetna.navigirajNaTarifneModele();
		modeli.verifikujTarifneModele();
		DaniISatiGrijanja dani = pocetna.navigirajNaDaneISateGrijanja();
		dani.verifikujDaneISateGrijanja();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		KupciBezUgovora bezUgovora = pocetna.navigirajNaKupceBezUgovora();
		bezUgovora.verifikujKupceBezUgovora();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreToplana();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije MJERILA i verifikuje ih")
	public void scp_004_verifikacija_mjerila_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Mjerila mjerila = pocetna.navigirajNaMjerila();
		mjerila.verifikujMjerila();
		VrsteMjerila vrsteMjerila = pocetna.navigirajNaVrsteMjerila();
		vrsteMjerila.verifikujVrsteMjerila();
		TipoviMjerila tipoviMjerila = pocetna.navigirajNaTipoveMjerila();
		tipoviMjerila.verifikujTipoviMjerila();
		ProizvodjaciMjerila proizvodjaciMjerila = pocetna.navigirajNaProizvodjaceMjerila();
		proizvodjaciMjerila.verifikujProizvodjaceMjerila();
		Plombe plombe = pocetna.navigirajNaPlombe();
		plombe.verifikujPlombe();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije OČITANJA i verifikuje ih")
	public void scp_004_verifikacija_ocitanja_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		ZoneOcitanja zone = pocetna.navigirajNaZoneOcitanja();
		zone.verifikujZoneOcitanja();
		NalogZaOcitanja nalog = pocetna.navigirajNaNalogeZaOcitanja();
		nalog.verifikujNalogZaOcitanjaMjerila();
		Ocitanja ocitanja = pocetna.navigirajNaOcitanja();
		ocitanja.verifikujOcitanjaToplana();
		MonitoringOcitanja monitoring = pocetna.navigirajNaMonitoringOcitanja();
		monitoring.verifikujMonitoringOcitanjaToplama();
		CitackeKnjige knjige = pocetna.navigirajNaCitackeKnjige();
		knjige.verifikujCitackeKnjige();
		NeregularnaOcitanja neregularnaOcitanja = pocetna.navigirajNaNeregularnaOcitanja();
		neregularnaOcitanja.verifikujNeregularnaOcitanja();
		GrejneSezone sezone = pocetna.navigirajNaGrejneSezone();
		sezone.verifikujGrejneSezone();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije OBRAČUN i verifikuje ih")
	public void scp_004_verifikacija_obracun_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Racuni racuni = pocetna.navigirajNaRacune();
		racuni.verifikujRacune();
		ZbirniRacuni zbirni = pocetna.navigirajNaZbirneRacune();
		zbirni.verifikujZbirneRacune();
		KorekcijeRacuna korekcije = pocetna.navigirajNaKorekcijeRacuna();
		korekcije.verifikujKorekcijeRacuna();
		AvansneFakture avansneFakture = pocetna.navigirajNaAvansneFakture();
		avansneFakture.verifikujAvansneFakture();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i ISKLJUČENJA verifikuje ih")
	public void scp_004_verifikacija_finansije_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		FinansijskeKartice finKartice = pocetna.navigirajNaFinansijskeKartice();
		finKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevnici = pocetna.navigirajNaDnevnikeUplata();
		dnevnici.verifikujDnevnikeUplata();
		PrenosSaldaPoStavkama prenos = pocetna.navigirajNaPrenosSaldaPoStavkama();
		prenos.verifikujPrenosSaldaPoStavkama();
		SveUplate sve = pocetna.navigirajNaSveUplate();
		sve.verifikujSveUplate();
		Banke banke = pocetna.navigirajNaBanke();
		banke.verifikujBanke();
		ZiroRacuni ziro = pocetna.navigirajNaZiroRacune();
		ziro.verifikujZiroRacune();
		KupciSaNeiskoristenimAvansom kupciAvans = pocetna.navigirajNaKupceSaNeiskoristenimAvansom();
		kupciAvans.verifikujKupceSaNeiskoristenimAvansom();
		Reprogrami reprogrami = pocetna.navigirajNaReprograme();
		reprogrami.verifikujReprograme();
		NaloziZaIskljucenje nalozi = pocetna.navigirajNaNalogeZaIskljucenja();
		nalozi.verifikujNalogeZaIskljucenjaVodovod();
	}
	
	// CISTOCA

	@Test(description = "test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_cistoca_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		Drzave drzave = pocetna.navigirajNaDrzave();
		drzave.verifikujDrzave();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntiteti();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		MjesneZajednice mjesneZajednice = pocetna.navigirajNaMjesneZajednice();
		mjesneZajednice.verifikujMjesneZajednice();
		Reoni reoni = pocetna.navigirajNaReone();
		reoni.verifikujReone();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		Zone zone = pocetna.navigirajNaZone();
		zone.verifikujZone();
		KategorijeObjekata kategorijeObjekata = pocetna.navigirajNaKategorijeObjekata();
		kategorijeObjekata.verifikujKategorijeObjekata();
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadniStatusi();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_cistoca_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneNadgrupe nadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		nadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe grupe = pocetna.navigirajNaTarifneGrupe();
		grupe.verifikujTarifneGrupe();
		TarifnePodgrupe podgrupe = pocetna.navigirajNaTarifnePodgrupe();
		podgrupe.verifikujTarifnePodgrupe();
		TarifniModeli modeli = pocetna.navigirajNaTarifneModele();
		modeli.verifikujTarifneModele();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_cistoca_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		KupciBezUgovora kupciBezUgovora = pocetna.navigirajNaKupceBezUgovora();
		kupciBezUgovora.verifikujKupceBezUgovora();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstoreOpstinaCistoca();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreCistoca();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije OBRAČUN i FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija_obracuna_i_finansija_cistoca_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Racuni racuni = pocetna.navigirajNaRacune();
		racuni.verifikujRacune();
		ZbirniRacuni zbirni = pocetna.navigirajNaZbirneRacune();
		zbirni.verifikujZbirneRacune();
		KorekcijeRacuna korekcije = pocetna.navigirajNaKorekcijeRacuna();
		korekcije.verifikujKorekcijeRacuna();
		FinansijskeKartice finKartice = pocetna.navigirajNaFinansijskeKartice();
		finKartice.verifikujFinansijskeKartice();
	}
	
	// OPSTINA
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_opstina_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGradGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		Drzave drzave = pocetna.navigirajNaDrzave();
		drzave.verifikujDrzave();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntiteti();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		MjesneZajednice mjesneZajednice = pocetna.navigirajNaMjesneZajednice();
		mjesneZajednice.verifikujMjesneZajednice();
		Reoni reoni = pocetna.navigirajNaReone();
		reoni.verifikujReone();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		Zone zone = pocetna.navigirajNaZone();
		zone.verifikujZone();
		KategorijeObjekata kategorijeObjekata = pocetna.navigirajNaKategorijeObjekata();
		kategorijeObjekata.verifikujKategorijeObjekata();
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadniStatusi();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_opstina_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGradGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneNadgrupe nadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		nadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe grupe = pocetna.navigirajNaTarifneGrupe();
		grupe.verifikujTarifneGrupe();
		TarifnePodgrupe podgrupe = pocetna.navigirajNaTarifnePodgrupe();
		podgrupe.verifikujTarifnePodgrupe();
		TarifniModeli modeli = pocetna.navigirajNaTarifneModele();
		modeli.verifikujTarifneModele();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_opstina_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGradGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		KupciBezUgovora kupciBezUgovora = pocetna.navigirajNaKupceBezUgovora();
		kupciBezUgovora.verifikujKupceBezUgovora();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstoreOpstinaCistoca();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreOpstina();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije OBRAČUN i FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija_obracuna_i_finansija_opstina_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGradGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Racuni racuni = pocetna.navigirajNaRacune();
		racuni.verifikujRacune();
		ZbirniRacuni zbirni = pocetna.navigirajNaZbirneRacune();
		zbirni.verifikujZbirneRacune();
		KorekcijeRacuna korekcije = pocetna.navigirajNaKorekcijeRacuna();
		korekcije.verifikujKorekcijeRacuna();
		AvansneFakture avansneFakture = pocetna.navigirajNaAvansneFakture();
		avansneFakture.verifikujAvansneFakture();
		FinansijskeKartice finKartice = pocetna.navigirajNaFinansijskeKartice();
		finKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevnici = pocetna.navigirajNaDnevnikeUplata();
		dnevnici.verifikujDnevnikeUplata();
		PrenosSaldaPoStavkama prenosSalda = pocetna.navigirajNaPrenosSaldaPoStavkama();
		prenosSalda.verifikujPrenosSaldaPoStavkama();
		SveUplate uplate = pocetna.navigirajNaSveUplate();
		uplate.verifikujSveUplate();
		Banke banke = pocetna.navigirajNaBanke();
		banke.verifikujBanke();
		ZiroRacuni ziro = pocetna.navigirajNaZiroRacune();
		ziro.verifikujZiroRacune();
		KupciSaNeiskoristenimAvansom kupciAvanas = pocetna.navigirajNaKupceSaNeiskoristenimAvansom();
		kupciAvanas.verifikujKupceSaNeiskoristenimAvansom();
		Reprogrami reprogrami = pocetna.navigirajNaReprograme();
		reprogrami.verifikujReprograme();
	}
	
	// GAS
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		Drzave drzave = pocetna.navigirajNaDrzave();
		drzave.verifikujDrzave();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntiteti();
		NaseljenaMjesta mjesta = pocetna.navigirajNaNaseljenaMjesta();
		mjesta.verifikujNaseljenaMjestaGas();
		MjesneZajednice zajednice = pocetna.navigirajNaMjesneZajednice();
		zajednice.verifikujMjesneZajednice();
		Reoni reoni = pocetna.navigirajNaReone();
		reoni.verifikujReone();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		Zone zone = pocetna.navigirajNaZone();
		zone.verifikujZone();
		KategorijeObjekata kategorijeObjekata = pocetna.navigirajNaKategorijeObjekata();
		kategorijeObjekata.verifikujKategorijeObjekata();
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadniStatusi();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneNadgrupe nadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		nadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe grupe = pocetna.navigirajNaTarifneGrupe();
		grupe.verifikujTarifneGrupe();
		TarifnePodgrupe podgrupe = pocetna.navigirajNaTarifnePodgrupe();
		podgrupe.verifikujTarifnePodgrupe();
		TarifniModeli modeli = pocetna.navigirajNaTarifneModele();
		modeli.verifikujTarifneModele();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.navigirajNaCjenovnik();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		KupciBezUgovora bezUgovora = pocetna.navigirajNaKupceBezUgovora();
		bezUgovora.verifikujKupceBezUgovora();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreGas();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije MJERILA i verifikuje ih")
	public void scp_004_verifikacija_mjerila_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Mjerila mjerila = pocetna.navigirajNaMjerila();
		mjerila.verifikujMjerila();
		VrsteMjerila vrste = pocetna.navigirajNaVrsteMjerila();
		vrste.verifikujVrsteMjerila();
		TipoviMjerila tipovi = pocetna.navigirajNaTipoveMjerila();
		tipovi.verifikujTipoviMjerila();
		ProizvodjaciMjerila proizvodjaci = pocetna.navigirajNaProizvodjaceMjerila();
		proizvodjaci.verifikujProizvodjaceMjerila();
		Plombe plombe = pocetna.navigirajNaPlombe();
		plombe.verifikujPlombe();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije OČITANJA i verifikuje ih")
	public void scp_004_verifikacija_ocitanja_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		ZoneOcitanja zone = pocetna.navigirajNaZoneOcitanja();
		zone.verifikujZoneOcitanja();
		NalogZaOcitanja nalog = pocetna.navigirajNaNalogeZaOcitanja();
		nalog.verifikujNalogZaOcitanjaMjerila();
		Ocitanja ocitanja = pocetna.navigirajNaOcitanja();
		ocitanja.verifikujOcitanjaMjerila();
		MonitoringOcitanja monitoring = pocetna.navigirajNaMonitoringOcitanja();
		monitoring.verifikujMonitoringOcitanjaGas();
		CitackeKnjige knjige = pocetna.navigirajNaCitackeKnjige();
		knjige.verifikujCitackeKnjige();
		NeregularnaOcitanja neregularna = pocetna.navigirajNaNeregularnaOcitanja();
		neregularna.verifikujNeregularnaOcitanja();
	}
		
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije OBRAČUN i verifikuje ih")
	public void scp_004_verifikacija_obracuna_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Racuni racuni = pocetna.navigirajNaRacune();
		racuni.verifikujRacuneGas();
		ZbirniRacuni zbirni = pocetna.navigirajNaZbirneRacune();
		zbirni.verifikujZbirneRacune();
		KorekcijeRacuna korekcije = pocetna.navigirajNaKorekcijeRacuna();
		korekcije.verifikujKorekcijeRacuna();
		ParametriObracuna parametri = pocetna.navigirajNaParametreObracuna();
		parametri.navigirajNaParametreObracuna();
		AvansneFakture fakture = pocetna.navigirajNaAvansneFakture();
		fakture.verifikujAvansneFakture();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija_finansija_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		FinansijskeKartice finKartice = pocetna.navigirajNaFinansijskeKartice();
		finKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevnici = pocetna.navigirajNaDnevnikeUplata();
		dnevnici.verifikujDnevnikeUplata();
		PrenosSaldaPoStavkama prenos = pocetna.navigirajNaPrenosSaldaPoStavkama();
		prenos.verifikujPrenosSaldaPoStavkama();
		SveUplate sveUplate = pocetna.navigirajNaSveUplate();
		sveUplate.verifikujSveUplate();
		Banke banke = pocetna.navigirajNaBanke();
		banke.verifikujBanke();
		ZiroRacuni ziro = pocetna.navigirajNaZiroRacune();
		ziro.verifikujZiroRacune();
		Reprogrami reprogrami = pocetna.navigirajNaReprograme();
		reprogrami.verifikujReprograme();
	}
  
	// SON/ADMINISTRACIJA
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_son_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		Drzave drzave = pocetna.navigirajNaDrzave();
		drzave.verifikujDrzave();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntiteti();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		MjesneZajednice mjesneZajednice = pocetna.navigirajNaMjesneZajednice();
		mjesneZajednice.verifikujMjesneZajednice();
		Reoni reoni = pocetna.navigirajNaReone();
		reoni.verifikujReone();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		Zone zone = pocetna.navigirajNaZone();
		zone.verifikujZone();
		KategorijeObjekata kategorijeObjekata = pocetna.navigirajNaKategorijeObjekata();
		kategorijeObjekata.verifikujKategorijeObjekata();
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadniStatusi();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_son_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneNadgrupe nadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		nadgrupe.verifikujTarifneNadgrupeSon();
		TarifneGrupe grupe = pocetna.navigirajNaTarifneGrupe();
		grupe.verifikujTarifneGrupeSon();
		TarifnePodgrupe podgrupe = pocetna.navigirajNaTarifnePodgrupe();
		podgrupe.verifikujTarifnePodgrupeSon();
		TarifniModeli modeli = pocetna.navigirajNaTarifneModele();
		modeli.verifikujTarifneModeleSon();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUslugeSon();
		NestandardneUsluge nestUsluge = pocetna.navigirajNaNestandardneUsluge();
		nestUsluge.verifikujNestandardneUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnikSon();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_son_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstoreSon();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreSon();
		RokoviPlacanja rokovi = pocetna.navigirajNaRokovePlacanja();
		rokovi.verifikujRokovePlacanja();
		OslobadjanjeOdKamate kamate = pocetna.navigirajNaOslobadjanjeodKamate();
		kamate.verifikujOslobadjaneOdKamate();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije OBRAČUN i verifikuje ih")
	public void scp_004_verifikacija_obracuna_son_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		NalogZaObracun obracun = pocetna.navigirajNaNalogeZaObracun();
		obracun.verifikujNalogZaObracun();
		Racuni racuni = pocetna.navigirajNaRacune();
		racuni.verifikujRacune();
		ZbirniRacuni zbirni = pocetna.navigirajNaZbirneRacune();
		zbirni.verifikujZbirneRacune();
		RacuniZaNestandardneUsluge racuniNest = pocetna.navigirajNaRacuneZaNestandardneUsluge();
		racuniNest.verifikujRacuneZaNestandardneUsluge();
		KorekcijeRacuna korekcije = pocetna.navigirajNaKorekcijeRacuna();
		korekcije.verifikujKorekcijeRacunaSon();
		TefObrasci tef = pocetna.navigirajNaTefObrasce();
		tef.verifikujTefObrasce();
		AvansneFakture avansneFakture = pocetna.navigirajNaAvansneFakture();
		avansneFakture.verifikujAvansneFakture();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija__finansija_son_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		FinansijskeKartice finKartice = pocetna.navigirajNaFinansijskeKartice();
		finKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevnici = pocetna.navigirajNaDnevnikeUplata();
		dnevnici.verifikujDnevnikeUplata();
		PrenosSaldaPoStavkama prenos = pocetna.navigirajNaPrenosSaldaPoStavkama();
		prenos.verifikujPrenosSaldaPoStavkama();
		SveUplate uplate = pocetna.navigirajNaSveUplate();
		uplate.verifikujSveUplate();
		Banke banke = pocetna.navigirajNaBanke();
		banke.verifikujBanke();
		ZiroRacuni ziro = pocetna.navigirajNaZiroRacune();
		ziro.verifikujZiroRacune();
		KupciSaNeiskoristenimAvansom avans = pocetna.navigirajNaKupceSaNeiskoristenimAvansom();
		avans.verifikujKupceSaNeiskoristenimAvansom();
		Reprogrami reprogrami = pocetna.navigirajNaReprograme();
		reprogrami.verifikujReprograme();
	}


	@Test(description = "test prolazi kroz sve stranice iz sekcije ISKLUČENJA i PRAVNI ODNOSI i verifikuje ih")
	public void scp_004_verifikacija_iskljucenja_i_pravnih_odnosa_son_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		OpomenePredIskljucenje opomeneIskljucenje = pocetna.navigirajNaOpomenePredIskljucenja();
		opomeneIskljucenje.verifikujOpomenePredIskljucenje();
		NaloziZaIskljucenje nalozi = pocetna.navigirajNaNalogeZaIskljucenja();
		nalozi.verifikujNalogeZaIskljucenjaSon();
		StatusiNalogaZaIskljucenje statusi = pocetna.navigirajNaStatuseNaloga();
		statusi.verifikujStatuseNalogaZaIskljucenje();
		Opomene opomene = pocetna.navigirajNaOpomene();
		opomene.verifikujOpomene();
		Tuzbe tuzbe = pocetna.navigirajNaTuzbe();
		tuzbe.verifikujTuzbe();
		Presude presude = pocetna.navigirajNaPresude();
		presude.verifikujPresude();
		VrstePresuda vrste = pocetna.navigirajNaVrstePresuda();
		vrste.verifikujVrstePresuda();
	}


	@Test(description = "test prolazi kroz sve stranice iz sekcije ADMINISTRACIJA verifikuje ih")
	public void scp_004_verifikacija_administracija_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		AdministracijaKorisnika administracija = pocetna.navigirajNaAdministracijaKorisnika();
		administracija.verifikujAdministracijuKorisnika();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		DnevnikIzmjena dnevnik = pocetna.navigirajNaDnevnikIzmjena();
		dnevnik.verifikujDnevnikIzmjena();
	}

}
