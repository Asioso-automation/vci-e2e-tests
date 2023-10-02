package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.Bonifikacije;
import scp.page.CitackeKnjige;
import scp.page.Cjenovnik;
import scp.page.Drzave;
import scp.page.Entiteti;
import scp.page.IndirektniVodomjeri;
import scp.page.Kupci;
import scp.page.KupciBezUgovora;
import scp.page.LogIn;
import scp.page.MjesneZajednice;
import scp.page.NalogZaOcitanja;
import scp.page.NaseljenaMjesta;
import scp.page.NeregularnaOcitanja;
import scp.page.NestandardneUsluge;
import scp.page.Objekti;
import scp.page.Ocitanja;
import scp.page.Organizacije;
import scp.page.PocetnaStranica;
import scp.page.Poste;
import scp.page.ProfiliVodomjera;
import scp.page.ProizvodjaciVodomjera;
import scp.page.Prostori;
import scp.page.RadniStatusi;
import scp.page.Reoni;
import scp.page.TarifneGrupe;
import scp.page.TarifneNadgrupe;
import scp.page.TarifnePodgrupe;
import scp.page.TarifniModeli;
import scp.page.TipoviPotrosaca;
import scp.page.Ugovori;
import scp.page.Ulice;
import scp.page.Usluge;
import scp.page.Vodomjeri;
import scp.page.VrsteVodomjera;
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
		IndirektniVodomjeri indirektni = pocetna.navigirajNaIndirektneVodomjere();
		indirektni.verifikujIndirektneVodomjeri();
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
		ugovori.verifikujUgovore();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije OČITANJA i verifikuje ih")
	public void scp_004_verifikacija_ocitanja_vodovod_test() throws Exception{
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
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
	}
}
