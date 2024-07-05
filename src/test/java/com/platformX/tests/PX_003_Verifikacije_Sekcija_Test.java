package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.*;

public class PX_003_Verifikacije_Sekcija_Test extends BaseTest {

	public PX_003_Verifikacije_Sekcija_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije ŠIFARNICI i verifikuje ih")
	public void px_003_01_verifikacije_sekcije_sifarnici_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigateOnPagePX(Organizacije.class, "Šifarnici", "Organizacije");
		organizacije.verifikujOrganizacije();
		OperatoriDistributivnihSistema operatoriSistema = pocetna.navigateOnPagePX(OperatoriDistributivnihSistema.class, "Šifarnici", "Operatori distributivnih sistema");
		operatoriSistema.verifikujOperatoriDistributivnihSistema();
		RadneJedinice radneJedinice = pocetna.navigateOnPagePX(RadneJedinice.class, "Šifarnici", "Radne jedinice");
		radneJedinice.verifikujRadneJedinice();
		OperativnaPodrucja opertivnaPodrucja = pocetna.navigateOnPagePX(OperativnaPodrucja.class, "Šifarnici", "Operativna područja");
		opertivnaPodrucja.verifikujOperativnaPodrucja();
		Djelatnosti djelatnosti = pocetna.navigateOnPagePX(Djelatnosti.class, "Šifarnici", "Djelatnosti");
		djelatnosti.verifikujDjelatnosti();
		Entiteti entiteti = pocetna.navigateOnPagePX(Entiteti.class, "Šifarnici", "Entiteti");
		entiteti.verifikujEntitete();
		Opstine opstine = pocetna.navigateOnPagePX(Opstine.class, "Šifarnici", "Opštine");
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigateOnPagePX(NaseljenaMjesta.class, "Šifarnici", "Naseljena mjesta");
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = pocetna.navigateOnPagePX(Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigateOnPagePX(Ulice.class, "Šifarnici", "Ulice");
		ulice.verifikujUlice();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_003_02_verifikacije_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = pocetna.navigateOnPagePX(KategorijePotrosnje.class, "Tarifni sistem", "Kategorije potrošnje");
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		TarifneNadgrupe tarifneNadgrupe = pocetna.navigateOnPagePX(TarifneNadgrupe.class, "Tarifni sistem", "Tarifne nadgrupe");
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = pocetna.navigateOnPagePX(TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
		tarifneGrupe.verifikujTarifneGrupe();
		Sezone sezone = pocetna.navigateOnPagePX(Sezone.class, "Tarifni sistem", "Sezone");
		sezone.verifikujSezone();
		ObracunskaSnaga obracunskaSnaga = pocetna.navigateOnPagePX(ObracunskaSnaga.class, "Tarifni sistem", "Obračunska snaga");
		obracunskaSnaga.verifikujObracunskaSnaga();
		KategorijeCijena kategorijeCijena = pocetna.navigateOnPagePX(KategorijeCijena.class, "Tarifni sistem", "Kategorije cijena");
		kategorijeCijena.verifikujKategorijeCijena();
		Cjenovnik cjenovnik = pocetna.navigateOnPagePX(Cjenovnik.class, "Tarifni sistem", "Cjenovnik");
		cjenovnik.verifikujCjenovnik();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_003_03_verifikacija_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = pocetna.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = pocetna.navigateOnPagePX(FizickaLica.class, "Kupci", "Fizička lica");
		fizickaLica.verifikujFizickaLica();
		PovezanaPravnaLica povezanaPravnaLica = pocetna.navigateOnPagePX(PovezanaPravnaLica.class, "Kupci", "Povezana pravna lica");
		povezanaPravnaLica.verifikujPovezanaPravnaLica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavuPodataka = pocetna.navigateOnPagePX(ZahtjeviZaDostavuPodataka.class, "Kupci", "Zahtjevi za dostavu podataka");
		zahtjeviZaDostavuPodataka.verifikujZahtjeveZaDostavuPodataka();
		ZahtjeviZaUgovore zahtjeviZaUgovore = pocetna.navigateOnPagePX(ZahtjeviZaUgovore.class, "Kupci", "Zahtjevi za ugovore");
		zahtjeviZaUgovore.verifikujZahtjeviZaUgovore();
		Ugovori ugovori = pocetna.navigateOnPagePX(Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ZahtjeviZaRaskidUgovora zahtjeviZaRaskid = pocetna.navigateOnPagePX(ZahtjeviZaRaskidUgovora.class, "Kupci", "Zahtjevi za raskid ugovora");
		zahtjeviZaRaskid.verifikujZahtjeviZaRaskidUgovora();
		ObavjestenjaOPromjeniSnabdjevaca obavjestenja = pocetna.navigateOnPagePX(ObavjestenjaOPromjeniSnabdjevaca.class, "Kupci", "Obavještenja o promjeni snabdjevača");
		obavjestenja.verifikujObavjestenjaOPromjeniSnabdjevaca();
		ZajednickaPotrosnja zajednickaPotrosnja = pocetna.navigateOnPagePX(ZajednickaPotrosnja.class, "Kupci", "Zajednička potrošnja");
		zajednickaPotrosnja.verifikujZajednickaPotrosnja();
		ClanoviZajednickePotrosnje clanovi = pocetna.navigateOnPagePX(ClanoviZajednickePotrosnje.class, "Kupci", "Članovi zajedničke potrošnje");
		clanovi.verifikujClanoviZajednickePotrosnje();
		UgovoreniPopusti ugovoreniPopusti = pocetna.navigateOnPagePX(UgovoreniPopusti.class, "Kupci", "Ugovoreni popusti");
		ugovoreniPopusti.verifikujUgovoreniPopusti();
		OdbaceniUgovori odbaceniUgovori = pocetna.navigateOnPagePX(OdbaceniUgovori.class, "Kupci", "Odbačeni ugovori");
		odbaceniUgovori.verifikujOdbaceniUgovori();
		Reklamacije reklamacije = pocetna.navigateOnPagePX(Reklamacije.class, "Kupci", "Reklamacije");
		reklamacije.verifikujReklamacije();
		VrsteZahtjeva vrsteZahtjeva = pocetna.navigateOnPagePX(VrsteZahtjeva.class, "Kupci", "Vrste zahtjeva");
		vrsteZahtjeva.verifikujVrsteZahtjeva();
//		VrsteIsporukeReklamacija vrsteIsporuke = pocetna.navigirajNaVrsteIsporukeReklamacija();
//		vrsteIsporuke.verifikujVrsteIsporukeReklamacija();
		ObrasciBrojaUgovora obrasciBrojaUgovora = pocetna.navigateOnPagePX(ObrasciBrojaUgovora.class, "Kupci", "Obrasci broja ugovora");
		obrasciBrojaUgovora.verifikujObrasciBrojaUgovora();
		GrupeObrazacaBrojaUgovora grupeObrazacaBrojaUgovora = pocetna.navigateOnPagePX(GrupeObrazacaBrojaUgovora.class, "Kupci", "Grupe obrazaca broja ugovora");
		grupeObrazacaBrojaUgovora.verifikujGrupeObrazaca();
		Mjenice mjenice = pocetna.navigateOnPagePX(Mjenice.class, "Kupci", "Mjenice");
		mjenice.verifikujMjenice();
		TipoviMjenica tipovi = pocetna.navigateOnPagePX(TipoviMjenica.class, "Kupci", "Tipovi mjenica");
		tipovi.verifikujTipoveMjenica();
		IzvodiOtvorenihStavkiPoODSu izvodiOtvorenihStavki = pocetna.navigateOnPagePX(IzvodiOtvorenihStavkiPoODSu.class, "Kupci", "Izvodi otvorenih stavki po ODS-u");
		izvodiOtvorenihStavki.verifikujIzvodiOtvorenihStavki();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije KUPCI-PROIZVOĐAČI i verifikuje ih")
	public void px_003_04_verifikacija_sekcije_kupci_proizvodjaci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Prijave prijave = pocetna.navigateOnPagePX(Prijave.class, "Kupci-proizvođači", "Prijave");
		prijave.verifikujPrijave();
		Dokumenti dokumenti = pocetna.navigateOnPagePX(Dokumenti.class, "Kupci-proizvođači", "Dokumenti");
		dokumenti.verifikujDokumenti();
		Anketari anketari = pocetna.navigateOnPagePX(Anketari.class, "Kupci-proizvođači", "Anketari");
		anketari.verifikujAnketari();
		Ankete ankete = pocetna.navigateOnPagePX(Ankete.class, "Kupci-proizvođači", "Ankete");
		ankete.verifikujAnkete();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_003_05_verifikacija_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = pocetna.navigateOnPagePX(MjernaMjesta.class, "Mjerna mjesta", "Mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		ZahtjeviZaDostavuPodatakaOMjernimMjestima zahtjeviZaDostavuPodataka = pocetna.navigateOnPagePX(ZahtjeviZaDostavuPodatakaOMjernimMjestima.class, "Mjerna mjesta", "Zahtjevi za dostavu podataka o mjm");	// da bi ispravno navigiralo preko url
		zahtjeviZaDostavuPodataka.verifikujZahtjeviZaDostavuPodataka();
		OcitanjaBrojila ocitanjaBrojila = pocetna.navigateOnPagePX(OcitanjaBrojila.class, "Mjerna mjesta", "Očitanja brojila");
		ocitanjaBrojila.verifikujOcitanjaBrojila();
		EnergetskiObracun energetskiObracun = pocetna.navigateOnPagePX(EnergetskiObracun.class, "Mjerna mjesta", "Energetski obračun");
		energetskiObracun.verifikujEnergetskiObracun();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije OBRAČUN i verifikuje ih")
	public void px_003_06_verifikacija_sekcije_obracun_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		NaloziZaObracun naloziZaObracun = pocetna.navigateOnPagePX(NaloziZaObracun.class, "Obračun", "Nalozi za obračun");
		naloziZaObracun.verifikujNaloziZaObracun();
		Racuni racuni = pocetna.navigateOnPagePX(Racuni.class, "Obračun", "Računi");
		racuni.verifikujRacuni();
		MasovnoGenerisanjeRacuna masovnoGenerisanjeRacuna = pocetna.navigateOnPagePX(MasovnoGenerisanjeRacuna.class, "Obračun", "Masovno generisanje računa");
		masovnoGenerisanjeRacuna.verifikujMasovnoGenerisanjeRacuna();
		KorekcijeRacuna korekcijeRacuna = pocetna.navigateOnPagePX(KorekcijeRacuna.class, "Obračun", "Korekcije računa");
		korekcijeRacuna.verifikujKorekcijeRacuna();
		ImportiKorekcija importiKorekcija = pocetna.navigateOnPagePX(ImportiKorekcija.class, "Obračun", "Importi korekcija");
		importiKorekcija.verifikujImporteKorekcija();
		Kamate kamate = pocetna.navigateOnPagePX(Kamate.class, "Obračun", "Kamate");
		kamate.verifikujKamate();
		KorekcijeKamate korekcijeKamatePage = pocetna.navigateOnPagePX(KorekcijeKamate.class, "Obračun", "Korekcije kamate");
		korekcijeKamatePage.verifikujKorekcijeKamate();
		AvansneFakture avansneFakture = pocetna.navigateOnPagePX(AvansneFakture.class, "Obračun", "Avansne fakture");
		avansneFakture.verifikujAvansneFakture();
		UmanjenjaCijene umanjenjaCijene = pocetna.navigateOnPagePX(UmanjenjaCijene.class, "Obračun", "Umanjenja cijene");
		umanjenjaCijene.verifikujUmanjenjaCijene();
		TefObrazac tef = pocetna.navigateOnPagePX(TefObrazac.class, "Obračun", "TEF obrazac");
		tef.verifikujTefObrazac();
		KupciZaTestneRacune kupciZaTestneRacune = pocetna.navigateOnPagePX(KupciZaTestneRacune.class, "Obračun", "Kupci za testne račune");
		kupciZaTestneRacune.verifikujKupciZaTestneRacune();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije NESTANDARDNE USLUGE i verifikuje ih")
	public void px_003_07_verifikacija_sekcije_nestandardne_usluge_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		NaloziZaObracunNestandardnihUsluga naloziZaObracunNSU = pocetna.navigateOnPagePX(NaloziZaObracunNestandardnihUsluga.class, "Nestandardne usluge", "Nalozi za obračun NSU");
		naloziZaObracunNSU.verifikujNaloziZaObracunNestandardnihUsluga();
		RacuniZaNestandardneUsluge racuniZaNSU = pocetna.navigateOnPagePX(RacuniZaNestandardneUsluge.class, "Nestandardne usluge", "Računi NSU");
		racuniZaNSU.verifikujRacuniZaNestandardneUsluge();
		KorekcijeRacunaZaNestandardneUsluge korekcijeRacunaZaNSU = pocetna.navigateOnPagePX(KorekcijeRacunaZaNestandardneUsluge.class, "Nestandardne usluge", "Korekcije računa NSU");
		korekcijeRacunaZaNSU.verifikujKorekcijeRacunaZaNestandardneUsluge();
		Predracuni predracuni = pocetna.navigateOnPagePX(Predracuni.class, "Nestandardne usluge", "Predračuni");
		predracuni.verifikujPredracuni();
		ObrasciBrojaProtokolaPredracuna obrasciBrojaProtokolaPredracuna = pocetna.navigateOnPagePX(ObrasciBrojaProtokolaPredracuna.class, "Nestandardne usluge", "Obrasci broja protokola predračuna");
		obrasciBrojaProtokolaPredracuna.verifikujObrasciBrojaProtokolaPredracuna();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih")
	public void px_003_08_verifikacija_sekcije_finansije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		FinansijskeKartice finansijskeKartice = pocetna.navigateOnPagePX(FinansijskeKartice.class, "Finansije", "Finansijske kartice");
		finansijskeKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevniciUplata = pocetna.navigateOnPagePX(DnevniciUplata.class, "Finansije", "Dnevnici uplata");
		dnevniciUplata.verifikujDnevniciUplata();
		PreknjizavanjaUplata preknjizavanja = pocetna.navigateOnPagePX(PreknjizavanjaUplata.class, "Finansije", "Preknjižavanja uplata");
		preknjizavanja.verifikujPreknjizavanjaUplata();
		SveUplate sveUplate = pocetna.navigateOnPagePX(SveUplate.class, "Finansije", "Sve uplate");
		sveUplate.verifikujSveUplate();
		NerasporedjeneUplate nerasporedjeneUplate = pocetna.navigateOnPagePX(NerasporedjeneUplate.class, "Finansije", "Neraspoređene uplate");
		nerasporedjeneUplate.verifikujNerasporedjeneUplate();
		Avansi avansi = pocetna.navigateOnPagePX(Avansi.class, "Finansije", "Avansi");
		avansi.verifikujAvansi();
		Reprogrami reprogrami = pocetna.navigateOnPagePX(Reprogrami.class, "Finansije", "Reprogrami");
		reprogrami.verifikujReprogrami();
//		TODO SudskaPoravnanja
		ObrasciBrojaUgovoraReprograma obrasciBrojaUgovoraReprograma = pocetna.navigateOnPagePX(ObrasciBrojaUgovoraReprograma.class, "Finansije", "Obrasci broja ugovora reprograma");
		obrasciBrojaUgovoraReprograma.verifikujObrasciBrojaUgovoraReprograma();
		Banke banke = pocetna.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		banke.verifikujBanke();
		ZiroRacuni ziroRacuni = pocetna.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ziroRacuni.verifikujZiroRacuni();
		VrsteKnjizenja vrsteKnjizenja = pocetna.navigateOnPagePX(VrsteKnjizenja.class, "Finansije", "Vrste knjiženja");
		vrsteKnjizenja.verifikujVrsteKnjizenja();
		VrsteFinansijskihKartica vrsteFinansijskihKartica = pocetna.navigateOnPagePX(VrsteFinansijskihKartica.class, "Finansije", "Vrste finansijskih kartica");
		vrsteFinansijskihKartica.verifikujVrsteFinansijskihKartica();
		VrsteStavkiFinansijskeKartice vrsteStavkiFinansijskeKartice = pocetna.navigateOnPagePX(VrsteStavkiFinansijskeKartice.class, "Finansije", "Vrste stavki finansijske kartice");
		vrsteStavkiFinansijskeKartice.verifikujVrsteStavkiFinansijskeKartice();
		Sap sap = pocetna.navigateOnPagePX(Sap.class, "Finansije", "SAP");
		sap.verifikujSap();
		Uino uino = pocetna.navigateOnPagePX(Uino.class, "Finansije", "UINO");
		uino.verifikujUino();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcija PRAVNI ODNOSI i verifikuje ih")
	public void px_003_09_verifikacija_sekcije_pravni_odnosi_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Opomene opomene = pocetna.navigateOnPagePX(Opomene.class, "Pravni odnosi", "Opomene");
		opomene.verifikujOpomene();
		ZahtjeviZaIskljucenje zahtjeviZaIskljucenje = pocetna.navigateOnPagePX(ZahtjeviZaIskljucenje.class, "Pravni odnosi", "Zahtjevi za isključenje");
		zahtjeviZaIskljucenje.verifikujZahtjeviZaIskljucenje();
		StavkeZahtjevaZaIskljucenja stavke = pocetna.navigateOnPagePX(StavkeZahtjevaZaIskljucenja.class, "Pravni odnosi", "Stavke zahtjeva za isključenja");
		stavke.verifikujStavkeZahtjevaZaIskljucenja();
		IskljucenjaOdStraneODSa iskljucenjaOdStraneODSa = pocetna.navigateOnPagePX(IskljucenjaOdStraneODSa.class, "Pravni odnosi", "Isključenja od strane ODS-a");
		iskljucenjaOdStraneODSa.verifikujIskljucenjaOdStraneODSa();
		IskljucenjaPoZahtjevuKupca iskljucenjaPoZahtjevuKupca = pocetna.navigateOnPagePX(IskljucenjaPoZahtjevuKupca.class, "Pravni odnosi", "Isključenja po zahtjevu kupca");
		iskljucenjaPoZahtjevuKupca.verifikujIskljucenjaPoZahtjevuKupca();
		AktivnaIskljucenja aktivnaIskljucenja = pocetna.navigateOnPagePX(AktivnaIskljucenja.class, "Pravni odnosi", "Aktivna isključenja");
		aktivnaIskljucenja.verifikujAktivnaIskljucenja();
		ZahtjeviZaUkljucenje zahtjeviZaUkljucenje = pocetna.navigateOnPagePX(ZahtjeviZaUkljucenje.class, "Pravni odnosi", "Zahtjevi za uključenje");
		zahtjeviZaUkljucenje.verifikujZahtjeviZaUkljucenje();
		StavkeZahtjevaZaUkljucenja stavkeUkljucenja = pocetna.navigateOnPagePX(StavkeZahtjevaZaUkljucenja.class, "Pravni odnosi", "Stavke zahtjeva za uključenja");
		stavkeUkljucenja.verifikujStavkeZahtjevaZaUkljucenja();
		UkljucenjaOdStraneODSa ukljucenjaOdStraneODSa = pocetna.navigateOnPagePX(UkljucenjaOdStraneODSa.class, "Pravni odnosi", "Uključenja od strane ODS-a");
		ukljucenjaOdStraneODSa.verifikujUkljucenaOdStraneODSa();
		UkljucenjaPoZahtjevuKupca ukljucenjaPoZahtjevuKupca = pocetna.navigateOnPagePX(UkljucenjaPoZahtjevuKupca.class, "Pravni odnosi", "Uključenja po zahtjevu kupca");
		ukljucenjaPoZahtjevuKupca.verifikujUkljucenaPoZahtjevuKupca();
		OpomenePredUtuzenje opomenePredUtuzenje = pocetna.navigateOnPagePX(OpomenePredUtuzenje.class, "Pravni odnosi", "Opomene pred utuženje");
		opomenePredUtuzenje.verifikujOpomenePredUtuzenje();
		ObrasciBrojaProtokolaOpomenaPredUtuzenje obrasciBrojaProtokolaOpomenaPredUtuzenje = pocetna.navigateOnPagePX(ObrasciBrojaProtokolaOpomenaPredUtuzenje.class, "Pravni odnosi", "Obrasci broja protokola opomena pred utuženje");
		obrasciBrojaProtokolaOpomenaPredUtuzenje.verifikujObrasciBrojaProtokolaOpomenaPredUtuzenje();
		Tuzbe tuzbe = pocetna.navigateOnPagePX(Tuzbe.class, "Pravni odnosi", "Tužbe");
		tuzbe.verifikujTuzbe();
//		dodati verifikaciju stranice IzvrsniPostupak
		StecajeviLikvidacije stecajevi = pocetna.navigateOnPagePX(StecajeviLikvidacije.class, "Pravni odnosi", "Stečajevi/Likvidacije");
		stecajevi.verifikujStecajeviLikvidacije();
		Medijacije medijacije = pocetna.navigateOnPagePX(Medijacije.class, "Pravni odnosi", "Medijacije");
		medijacije.verifikujMedijacije();
		OtpisiPotrazivanja otpisiPotrazivanja = pocetna.navigateOnPagePX(OtpisiPotrazivanja.class, "Pravni odnosi", "Otpisi potraživanja");
		otpisiPotrazivanja.verifikujOtpisiPotrazivanja();
		Sudovi sudovi = pocetna.navigateOnPagePX(Sudovi.class, "Pravni odnosi", "Sudovi");
		sudovi.verifikujSudovi();
		VanbilansnaEvidencijaTroskovaSudskihPostupaka vanbilansnaEvidencija = pocetna.navigateOnPagePX(VanbilansnaEvidencijaTroskovaSudskihPostupaka.class, "Pravni odnosi", "Vanbilansna evidencija troškova sudskih postupaka");
		vanbilansnaEvidencija.verifikujVanbilansnaEvidencijaTroskovaSudskihPostupaka();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcija ADMINISTRACIJA i IZVJESTAJI i verifikuje ih")
	public void px_003_10_verifikacija_sekcija_administracija_izvjestaji_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Korisnici korisnici = pocetna.navigateOnPagePX(Korisnici.class, "Administracija", "Korisnici");
		korisnici.verifikujKorisnici();
		Poruke poruke = pocetna.navigateOnPagePX(Poruke.class, "Administracija", "Poruke");
		poruke.verifikujPoruke();
		EmailObavjestenja emailObavjestenja = pocetna.navigateOnPagePX(EmailObavjestenja.class, "Administracija", "E-mail obavještenja");
		emailObavjestenja.verifikujEmailObavjestenja();
//	    DnevnikIzmjena dnevnikIzmjena = pocetna.navigirajNaDnevnikIzmjena();
//		dnevnikIzmjena.verifikujDnevnikIzmjena();
//		Izvjestaji izvjestaji = pocetna.navigirajNaIzvjestaji();
//		izvjestaji.verifikujIzvjestaji();
	}
	
}