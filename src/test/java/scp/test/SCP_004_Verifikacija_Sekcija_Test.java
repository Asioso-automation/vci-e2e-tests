package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.Banke;
import scp.page.Bonifikacije;
import scp.page.CitackeKnjige;
import scp.page.Cjenovnik;
import scp.page.DnevniciUplata;
import scp.page.Drzave;
import scp.page.Entiteti;
import scp.page.FinansijskeKartice;
import scp.page.IndirektnaPotrosnja;
import scp.page.KorekcijeRacuna;
import scp.page.Kupci;
import scp.page.KupciBezUgovora;
import scp.page.KupciSaNeiskoristenimAvansom;
import scp.page.LogIn;
import scp.page.MjesneZajednice;
import scp.page.MonitoringOcitanja;
import scp.page.NalogZaObracun;
import scp.page.NalogZaOcitanja;
import scp.page.NaloziZaIskljucenje;
import scp.page.NaseljenaMjesta;
import scp.page.NeregularnaOcitanja;
import scp.page.Objekti;
import scp.page.Ocitanja;
import scp.page.Opomene;
import scp.page.OpomenePredIskljucenje;
import scp.page.Organizacije;
import scp.page.OslobadjanjeOdKamate;
import scp.page.PocetnaStranica;
import scp.page.Poste;
import scp.page.PrenosSaldaPoStavkama;
import scp.page.Presude;
import scp.page.ProfiliVodomjera;
import scp.page.ProizvodjaciVodomjera;
import scp.page.Prostori;
import scp.page.Racuni;
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
import scp.page.TipoviPotrosaca;
import scp.page.Tuzbe;
import scp.page.Ugovori;
import scp.page.Ulice;
import scp.page.Usluge;
import scp.page.Vodomjeri;
import scp.page.VrstePresuda;
import scp.page.VrsteVodomjera;
import scp.page.ZbirniRacuni;
import scp.page.ZiroRacuni;
import scp.page.Zone;
import scp.page.ZoneDma;
import scp.page.ZoneOcitanja;

public class SCP_004_Verifikacija_Sekcija_Test extends BaseTest{

	public SCP_004_Verifikacija_Sekcija_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_vodovod_test() throws Exception{
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
		entiteti.verifikujEntitete();
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
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadneStatuse();
		ProizvodjaciVodomjera proizvodjaci = pocetna.navigirajNaProizvodjaceVodomjera();
		proizvodjaci.verifikujProizvodjaceVodomjera();
		ProfiliVodomjera profili = pocetna.navigirajNaProfileVodomjera();
		profili.verifikujProfileVodomjera();
		VrsteVodomjera vrste = pocetna.navigirajNaVrsteVodomjera();
		vrste.verifikujVrsteVodomjera();
		IndirektnaPotrosnja indirektni = pocetna.navigirajNaIndirektnuPotrosnju();
		indirektni.verifikujIndirektnuPotrosnju();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_cistoca_test() throws Exception{
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
		entiteti.verifikujEntitete();
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
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadneStatuse();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_opstina_test() throws Exception{
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
		entiteti.verifikujEntitete();
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
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadneStatuse();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void scp_004_verifikacija_sifarnika_son_test() throws Exception{
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
		entiteti.verifikujEntitete();
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
		RadniStatusi radniStatusi = pocetna.navigirajNaRadneStatuse();
		radniStatusi.verifikujRadneStatuse();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_vodovod_test() throws Exception{
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
		TarifniModeli modeli = pocetna.navigirajNaTaifneModele();
		modeli.verifikujTarifneModele();
		TipoviPotrosaca tipovi = pocetna.navigirajNaTipovePotrosaca();
		tipovi.verifikujTipovePotrosaca();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
	//	NestandardneUsluge nesUsluge = pocetna.navigirajNaNestandardneUsluge();
	//	nesUsluge.verifikujNestandardneUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_cistoca_test() throws Exception{
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
		TarifniModeli modeli = pocetna.navigirajNaTaifneModele();
		modeli.verifikujTarifneModele();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_opstina_test() throws Exception{
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
		TarifniModeli modeli = pocetna.navigirajNaTaifneModele();
		modeli.verifikujTarifneModele();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void scp_004_verifikacija_tarifnog_sistema_son_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneNadgrupe nadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		nadgrupe.verifikujTarifneNadgrupeSon();
		TarifneGrupe grupe = pocetna.navigirajNaTarifneGrupe();
		grupe.verifikujTarifneGrupeSon();
		TarifnePodgrupe podgrupe = pocetna.navigirajNaTarifnePodgrupe();
		podgrupe.verifikujTarifnePodgrupeSon();
		TarifniModeli modeli = pocetna.navigirajNaTaifneModele();
		modeli.verifikujTarifneModeleSon();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUslugeSon();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnikSon();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_vodovod_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		KupciBezUgovora kupciBezUgovora = pocetna.navigirajNaKupceBezUgovora();
		kupciBezUgovora.verifikujKupceBezUgovora();
		Objekti objekti = pocetna.navigirajNaObjekti();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		Vodomjeri vodomjeri = pocetna.navigirajNaVodomjere();
		vodomjeri.verifikujVodomjere();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreVodovod();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_cistoca_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		KupciBezUgovora kupciBezUgovora = pocetna.navigirajNaKupceBezUgovora();
		kupciBezUgovora.verifikujKupceBezUgovora();
		Objekti objekti = pocetna.navigirajNaObjekti();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreCistoca();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	
	
	@Test (description="test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_opstina_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGradGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		KupciBezUgovora kupciBezUgovora = pocetna.navigirajNaKupceBezUgovora();
		kupciBezUgovora.verifikujKupceBezUgovora();
		Objekti objekti = pocetna.navigirajNaObjekti();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreOpstina();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void scp_004_verifikacija_kupaca_son_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		Objekti objekti = pocetna.navigirajNaObjekti();
		objekti.verifikujObjekte();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreSon();
		RokoviPlacanja rokovi = pocetna.navigirajNaRokovePlacanja();
		rokovi.verifikujRokovePlacanja();
		OslobadjanjeOdKamate kamate = pocetna.navigirajNaOslobadjanjeodKamate();
		kamate.verifikujOslobadjaneOdKamate();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije OČITANJA i verifikuje ih")
	public void scp_004_verifikacija_ocitanja_vodovod_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		ZoneOcitanja zoneOcitanja = pocetna.navigirajNaZoneOcitanja();
		zoneOcitanja.verifikujZoneOcitanja();
		NalogZaOcitanja nalogOcitanja = pocetna.navigirajNaNalogeZaOcitanja();
		nalogOcitanja.verifikujNalogZaOcitanjaVodomjera();
		Ocitanja ocitanja = pocetna.navigirajNaOcitanja();
		ocitanja.verifikujOcitanjaVodomjera();
		NeregularnaOcitanja neregOcitanja = pocetna.navigirajNaNeregularnaOcitanja();
		neregOcitanja.verifikujNeregularnaOcitanjaVodomjera();
		CitackeKnjige citackeKnjige = pocetna.navigirajNaCitackeKnjige();
		citackeKnjige.verifikujCitackeKnjige();
		MonitoringOcitanja monitoring = pocetna.navigirajNaMonitoringOcitanja();
		monitoring.verifikujMonitoringOcitanja();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije OBRAČUN i FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija_obracuna_i_finansija_vodovod_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Racuni racuni = pocetna.navigirajNaRacune();
		racuni.verifikujRacune();
		ZbirniRacuni zbirni = pocetna.navigirajNaZbirneRacune();
		zbirni.verifikujZbirneRacune();
		KorekcijeRacuna korekcije = pocetna.navigirajNaKorekcijeRacuna();
		korekcije.verifikujKorekcijeRacuna();
		FinansijskeKartice finKartice = pocetna.navigirajNaFinansijskeKartice();
		finKartice.verifikujFinansijskeKartice();	
		NaloziZaIskljucenje nalozi = pocetna.navigirajNaNalogeZaIskljucenja();
		nalozi.verifikujNalogeZaIskljucenjaVodovod();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije OBRAČUN i verifikuje ih")
	public void scp_004_verifikacija_obracuna_son_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		NalogZaObracun obracun = pocetna.navigirajNaNalogeZaObracun();
		obracun.verifikujNalogZaObracun();
		Racuni racuni = pocetna.navigirajNaRacune();
		racuni.verifikujRacune();
		ZbirniRacuni zbirni = pocetna.navigirajNaZbirneRacune();
		zbirni.verifikujZbirneRacune();
		KorekcijeRacuna korekcije = pocetna.navigirajNaKorekcijeRacuna();
		korekcije.verifikujKorekcijeRacuna();
		TefObrasci tef = pocetna.navigirajNaTefObrasce();
		tef.verifikujTefObrasce();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije OBRAČUN i FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija__finansija_son_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
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
	
	@Test (description="test prolazi kroz sve stranice iz sekcije OBRAČUN i FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija_obracuna_i_finansija_cistoca_test() throws Exception{
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
	
	@Test (description="test prolazi kroz sve stranice iz sekcije OBRAČUN i FINANSIJE i verifikuje ih")
	public void scp_004_verifikacija_obracuna_i_finansija_opstina_test() throws Exception{
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
		FinansijskeKartice finKartice = pocetna.navigirajNaFinansijskeKartice();
		finKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevnici = pocetna.navigirajNaDnevnikeUplata();
		dnevnici.verifikujDnevnikeUplata();
		SveUplate uplate = pocetna.navigirajNaSveUplate();
		uplate.verifikujSveUplate();
		Banke banke = pocetna.navigirajNaBanke();
		banke.verifikujBanke();
		ZiroRacuni ziro = pocetna.navigirajNaZiroRacune();
		ziro.verifikujZiroRacune();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije ISKLUČENJA i PRAVNI ODNOSI i verifikuje ih")
	public void scp_004_verifikacija_iskljucenja_i_pravnih_odnosa_son_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
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
}
