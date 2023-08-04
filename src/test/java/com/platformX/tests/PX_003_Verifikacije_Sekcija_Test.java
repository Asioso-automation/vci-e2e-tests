package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.*;

public class PX_003_Verifikacije_Sekcija_Test extends BaseTest {

	public PX_003_Verifikacije_Sekcija_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcije ŠIFARNICI i verifikuje ih")
	public void px_003_01_verifikacije_sekcije_sifarnici_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		OperatoriDistributivnihSistema operatoriSistema = pocetna.navigirajNaOperatoriDistributivnihSistema();
		operatoriSistema.verifikujOperatoriDistributivnihSistema();
		RadneJedinice radneJedinice = pocetna.navigirajNaRadneJedinice();
		radneJedinice.verifikujRadneJedinice();
		OperativnaPodrucja opertivnaPodrucja = pocetna.navigirajNaOperativnaPodrucja();
		opertivnaPodrucja.verifikujOperativnaPodrucja();
		Djelatnosti djelatnosti = pocetna.navigirajNaDjelatnosti();
		djelatnosti.verifikujDjelatnosti();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntitete();
		Opstine opstine = pocetna.navigirajNaOpstine();
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_003_02_verifikacije_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = pocetna.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		TarifneNadgrupe tarifneNadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = pocetna.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		Sezone sezone = pocetna.navigirajNaSezone();
		sezone.verifikujSezone();
		ObracunskaSnaga obracunskaSnaga = pocetna.navigirajNaObracunskaSnaga();
		obracunskaSnaga.verifikujObracunskaSnaga();
		KategorijeCijena kategorijeCijena = pocetna.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_003_03_verifikacija_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = pocetna.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = pocetna.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		PovezanaPravnaLica povezanaPravnaLica = pocetna.navigirajNaPovezanaPravnaLica();
		povezanaPravnaLica.verifikujPovezanaPravnaLica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavuPodataka = pocetna.navigirajNaZahtjeviZaDostavuPodataka();
		zahtjeviZaDostavuPodataka.verifikujZahtjeveZaDostavuPodataka();
		ZahtjeviZaUgovore zahtjeviZaUgovore = pocetna.navigirajNaZahtjeviZaUgovore();
		zahtjeviZaUgovore.verifikujZahtjeviZaUgovore();
		Ugovori ugovori = pocetna.navigirajNaUgovori();
		ugovori.verifikujUgovori();
		ZahtjeviZaRaskidUgovora zahtjeviZaRaskid = pocetna.navigirajNaZahtjeviZaRaskidUgovora();
		zahtjeviZaRaskid.verifikujZahtjeviZaRaskidUgovora();
		ObavjestenjaOPromjeniSnabdjevaca obavjestenja = pocetna.navigirajNaObavjestenjaOPromjeniSnabdjevaca();
		obavjestenja.verifikujObavjestenjaOPromjeniSnabdjevaca();
		ZajednickaPotrosnja zajednickaPotrosnja = pocetna.navigirajNaZajednickaPotrosnja();
		zajednickaPotrosnja.verifikujZajednickaPotrosnja();
		ClanoviZajednickePotrosnje clanovi = pocetna.navigirajNaClanoviZajednickePotrosnje();
		clanovi.verifikujClanoviZajednickePotrosnje();
		UgovoreniPopusti ugovoreniPopusti = pocetna.navigirajNaUgovoreniPopusti();
		ugovoreniPopusti.verifikujUgovoreniPopusti();
		OdbaceniUgovori odbaceniUgovori = pocetna.navigirajNaOdbaceniUgovori();
		odbaceniUgovori.verifikujOdbaceniUgovori();
		Reklamacije reklamacije = pocetna.navigirajNaReklamacije();
		reklamacije.verifikujReklamacije();
		VrsteZahtjeva vrsteZahtjeva = pocetna.navigirajNaVrsteZahtjeva();
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		VrsteIsporukeReklamacija vrsteIsporuke = pocetna.navigirajNaVrsteIsporukeReklamacija();
		vrsteIsporuke.verifikujVrsteIsporukeReklamacija();
		ObrasciBrojaUgovora obrasciBrojaUgovora = pocetna.navigirajNaObrasciBrojaUgovora();
		obrasciBrojaUgovora.verifikujObrasciBrojaUgovora();
		GrupeObrazacaBrojaUgovora grupeObrazacaBrojaUgovora = pocetna.navigirajNaGrupeObrazacaBrojaUgovora();
		grupeObrazacaBrojaUgovora.verifikujGrupeObrazaca();
		Mjenice mjenice = pocetna.navigirajNaMjenice();
		mjenice.verifikujMjenice();
		TipoviMjenica tipovi = pocetna.navigirajNaTipoveMjenica();
		tipovi.verifikujTipoveMjenica();
		IzvodiOtvorenihStavkiPoODSu izvodiOtvorenihStavki = pocetna.navigirajNaIzvodiOtvorenihStavki();
		izvodiOtvorenihStavki.verifikujIzvodiOtvorenihStavki();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije KUPCI-PROIZVOĐAČI i verifikuje ih")
	public void px_003_04_verifikacija_sekcije_kupci_proizvodjaci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Prijave prijave = pocetna.navigirajNaPrijave();
		prijave.verifikujPrijave();
		Dokumenti dokumenti = pocetna.navigirajNaDokumenti();
		dokumenti.verifikujDokumenti();
		Anketari anketari = pocetna.navigirajNaAnketari();
		anketari.verifikujAnketari();
		Ankete ankete = pocetna.navigirajNaAnkete();
		ankete.verifikujAnkete();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_003_05_verifikacija_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = pocetna.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		ZahtjeviZaDostavuPodatakaOMjernimMjestima zahtjeviZaDostavuPodataka = pocetna.navigirajNaZahtjeviZaDostavuPodataka1();
		zahtjeviZaDostavuPodataka.verifikujZahtjeviZaDostavuPodataka();
		OcitanjaBrojila ocitanjaBrojila = pocetna.navigirajNaOcitanjaBrojila();
		ocitanjaBrojila.verifikujOcitanjaBrojila();
		EnergetskiObracun energetskiObracun = pocetna.navigirajNaEnergetskiObracun();
		energetskiObracun.verifikujEnergetskiObracun();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcije OBRAČUN i verifikuje ih")
	public void px_003_06_verifikacija_sekcije_obracun_test() throws Exception {
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
	
	@Test (description="test prolazi kroz sve stranice iz sekcije NESTANDARDNE USLUGE i verifikuje ih")
	public void px_003_07_verifikacija_sekcije_nestandardne_usluge_test() throws Exception {
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
		ObrasciBrojaProtokolaPredracuna obrasciBrojaProtokolaPredracuna = pocetna.navigirajNaObrasciBrojaProtokola();
		obrasciBrojaProtokolaPredracuna.verifikujObrasciBrojaProtokolaPredracuna();
	}
	
	@Test(description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih")
	public void px_003_08_verifikacija_sekcije_finansije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		FinansijskeKartice finansijskeKartice = pocetna.navigirajNaFinansijskeKartice();
		finansijskeKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevniciUplata = pocetna.navigirajNaDnevniciUplata();
		dnevniciUplata.verifikujDnevniciUplata();
		PreknjizavanjaUplata preknjizavanja = pocetna.navigirajNaPreknjizavanjaUplata();
		preknjizavanja.verifikujPreknjizavanjaUplata();
		SveUplate sveUplate = pocetna.navigirajNaSveUplate();
		sveUplate.verifikujSveUplate();
		NerasporedjeneUplate nerasporedjeneUplate = pocetna.navigirajNaNerasporedjeneUplate();
		nerasporedjeneUplate.verifikujNerasporedjeneUplate();
		Avansi avansi = pocetna.navigirajNaAvansi();
		avansi.verifikujAvansi();
		Reprogrami reprogrami = pocetna.navigirajNaReprogrami();
		reprogrami.verifikujReprogrami();
		ObrasciBrojaUgovoraReprograma obrasciBrojaUgovoraReprograma = pocetna.navigirajNaObrasciBrojaUgovoraReprograma();
		obrasciBrojaUgovoraReprograma.verifikujObrasciBrojaUgovoraReprograma();
		Banke banke = pocetna.navigirajNaBanke();
		banke.verifikujBanke();
		ZiroRacuni ziroRacuni = pocetna.navigirajNaZiroRacuni();
		ziroRacuni.verifikujZiroRacuni();
		VrsteKnjizenja vrsteKnjizenja = pocetna.navigirajNaVrsteKnjizenja();
		vrsteKnjizenja.verifikujVrsteKnjizenja();
		VrsteFinansijskihKartica vrsteFinansijskihKartica = pocetna.navigirajNaVrsteFinansijskihKartica();
		vrsteFinansijskihKartica.verifikujVrsteFinansijskihKartica();
		VrsteStavkiFinansijskeKartice vrsteStavkiFinansijskeKartice = pocetna.navigirajNaVrsteStavkiFinansijskeKartice();
		vrsteStavkiFinansijskeKartice.verifikujVrsteStavkiFinansijskeKartice();
		Sap sap = pocetna.navigirajNaSap();
		sap.verifikujSap();
		Uino uino = pocetna.navigirajNaUino();
		uino.verifikujUino();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcija PRAVNI ODNOSI i verifikuje ih")
	public void px_003_09_verifikacija_sekcije_pravni_odnosi_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Opomene opomene = pocetna.navigirajNaOpomene();
		opomene.verifikujOpomene();
		ZahtjeviZaIskljucenje zahtjeviZaIskljucenje = pocetna.navigirajNaZahtjeviZaIskljucenje();
		zahtjeviZaIskljucenje.verifikujZahtjeviZaIskljucenje();
		StavkeZahtjevaZaIskljucenja stavke = pocetna.navigirajNaStavkeZahtjevaZaIskljucenja();
		stavke.verifikujStavkeZahtjevaZaIskljucenja();
		IskljucenjaOdStraneODSa iskljucenjaOdStraneODSa = pocetna.navigirajNaIskljucenjaOdStraneODSa();
		iskljucenjaOdStraneODSa.verifikujIskljucenjaOdStraneODSa();
		IskljucenjaPoZahtjevuKupca iskljucenjaPoZahtjevuKupca = pocetna.navigirajNaIskljucenjaPoZahtjevuKupca();
		iskljucenjaPoZahtjevuKupca.verifikujIskljucenjaPoZahtjevuKupca();
		AktivnaIskljucenja aktivnaIskljucenja = pocetna.navigirajNaAktivnaIskljucenja();
		aktivnaIskljucenja.verifikujAktivnaIskljucenja();
		ZahtjeviZaUkljucenje zahtjeviZaUkljucenje = pocetna.navigirajNaZahtjeviZaUkljucenje();
		zahtjeviZaUkljucenje.verifikujZahtjeviZaUkljucenje();
		StavkeZahtjevaZaUkljucenja stavkeUkljucenja = pocetna.navigirajNaStavkeZahtjevaZaUkljucenja();
		stavkeUkljucenja.verifikujStavkeZahtjevaZaUkljucenja();
		UkljucenjaOdStraneODSa ukljucenjaOdStraneODSa = pocetna.navigirajNaUkljucenjaOdStraneODSa();
		ukljucenjaOdStraneODSa.verifikujUkljucenaOdStraneODSa();
		UkljucenjaPoZahtjevuKupca ukljucenjaPoZahtjevuKupca = pocetna.navigirajNaUkljucenjaPoZahtjevuKupca();
		ukljucenjaPoZahtjevuKupca.verifikujUkljucenaPoZahtjevuKupca();
		OpomenePredUtuzenje opomenePredUtuzenje = pocetna.navigirajNaOpomenePredUtuzenje();
		opomenePredUtuzenje.verifikujOpomenePredUtuzenje();
		ObrasciBrojaProtokolaOpomenaPredUtuzenje obrasciBrojaProtokolaOpomenaPredUtuzenje = pocetna.navigirajNaObrasciBrojaProtokolaOpomenaPredUtuzenje();
		obrasciBrojaProtokolaOpomenaPredUtuzenje.verifikujObrasciBrojaProtokolaOpomenaPredUtuzenje();
		Tuzbe tuzbe = pocetna.navigirajNaTuzbe();
		tuzbe.verifikujTuzbe();
//		dodati verifikaciju stranice IzvrsniPostupak
		StecajeviLikvidacije stecajevi = pocetna.navigirajNaStecajeviLikvidacije();
		stecajevi.verifikujStecajeviLikvidacije();
		Medijacije medijacije = pocetna.navigirajNaMedijacije();
		medijacije.verifikujMedijacije();
		OtpisiPotrazivanja otpisiPotrazivanja = pocetna.navigirajNaOtpisiPotrazivanja();
		otpisiPotrazivanja.verifikujOtpisiPotrazivanja();
		Sudovi sudovi = pocetna.navigirajNaSudovi();
		sudovi.verifikujSudovi();
		VanbilansnaEvidencijaTroskovaSudskihPostupaka vanbilansnaEvidencija = pocetna.navigirajNaVanbilansnaEvidencijaTroskovaSudskihPostupaka();
		vanbilansnaEvidencija.verifikujVanbilansnaEvidencijaTroskovaSudskihPostupaka();
	}
	
	@Test (description="test prolazi kroz sve stranice iz sekcija ADMINISTRACIJA i IZVJESTAJI i verifikuje ih")
	public void px_003_10_verifikacija_sekcija_administracija_izvjestaji_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Korisnici korisnici = pocetna.navigirajNaKorisnici();
		korisnici.verifikujKorisnici();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		EmailObavjestenja emailObavjestenja = pocetna.navigirajNaEmailObavjestenja();
		emailObavjestenja.verifikujEmailObavjestenja();
	    DnevnikIzmjena dnevnikIzmjena = pocetna.navigirajNaDnevnikIzmjena();
		dnevnikIzmjena.verifikujDnevnikIzmjena();
		Izvjestaji izvjestaji = pocetna.navigirajNaIzvjestaji();
		izvjestaji.verifikujIzvjestaji();
	}
	
}