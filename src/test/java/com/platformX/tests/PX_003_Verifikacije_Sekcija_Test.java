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
		Organizacije organizacije = pocetna.navigateOnPage("PX", Organizacije.class, "Šifarnici", "Organizacije");
		organizacije.verifikujOrganizacije();
		OperatoriDistributivnihSistema operatoriSistema = pocetna.navigateOnPage("PX", OperatoriDistributivnihSistema.class, "Šifarnici", "Operatori distributivnih sistema");
		operatoriSistema.verifikujOperatoriDistributivnihSistema();
		RadneJedinice radneJedinice = pocetna.navigateOnPage("PX", RadneJedinice.class, "Šifarnici", "Radne jedinice");
		radneJedinice.verifikujRadneJedinice();
		OperativnaPodrucja opertivnaPodrucja = pocetna.navigateOnPage("PX", OperativnaPodrucja.class, "Šifarnici", "Operativna područja");
		opertivnaPodrucja.verifikujOperativnaPodrucja();
		Djelatnosti djelatnosti = pocetna.navigateOnPage("PX", Djelatnosti.class, "Šifarnici", "Djelatnosti");
		djelatnosti.verifikujDjelatnosti();
		Entiteti entiteti = pocetna.navigateOnPage("PX", Entiteti.class, "Šifarnici", "Entiteti");
		entiteti.verifikujEntitete();
		Opstine opstine = pocetna.navigateOnPage("PX", Opstine.class, "Šifarnici", "Opštine");
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigateOnPage("PX", NaseljenaMjesta.class, "Šifarnici", "Naseljena mjesta");
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = pocetna.navigateOnPage("PX", Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigateOnPage("PX", Ulice.class, "Šifarnici", "Ulice");
		ulice.verifikujUlice();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_003_02_verifikacije_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = pocetna.navigateOnPage("PX", KategorijePotrosnje.class, "Tarifni sistem", "Kategorije potrošnje");
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		TarifneNadgrupe tarifneNadgrupe = pocetna.navigateOnPage("PX", TarifneNadgrupe.class, "Tarifni sistem", "Tarifne nadgrupe");
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = pocetna.navigateOnPage("PX", TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
		tarifneGrupe.verifikujTarifneGrupe();
		Sezone sezone = pocetna.navigateOnPage("PX", Sezone.class, "Tarifni sistem", "Sezone");
		sezone.verifikujSezone();
		ObracunskaSnaga obracunskaSnaga = pocetna.navigateOnPage("PX", ObracunskaSnaga.class, "Tarifni sistem", "Obračunska snaga");
		obracunskaSnaga.verifikujObracunskaSnaga();
		KategorijeCijena kategorijeCijena = pocetna.navigateOnPage("PX", KategorijeCijena.class, "Tarifni sistem", "Kategorije cijena");
		kategorijeCijena.verifikujKategorijeCijena();
		Cjenovnik cjenovnik = pocetna.navigateOnPage("PX", Cjenovnik.class, "Tarifni sistem", "Cjenovnik");
		cjenovnik.verifikujCjenovnik();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_003_03_verifikacija_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = pocetna.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = pocetna.navigateOnPage("PX", FizickaLica.class, "Kupci", "Fizička lica");
		fizickaLica.verifikujFizickaLica();
		PovezanaPravnaLica povezanaPravnaLica = pocetna.navigateOnPage("PX", PovezanaPravnaLica.class, "Kupci", "Povezana pravna lica");
		povezanaPravnaLica.verifikujPovezanaPravnaLica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavuPodataka = pocetna.navigateOnPage("PX", ZahtjeviZaDostavuPodataka.class, "Kupci", "Zahtjevi za dostavu podataka");
		zahtjeviZaDostavuPodataka.verifikujZahtjeveZaDostavuPodataka();
		ZahtjeviZaUgovore zahtjeviZaUgovore = pocetna.navigateOnPage("PX", ZahtjeviZaUgovore.class, "Kupci", "Zahtjevi za ugovore");
		zahtjeviZaUgovore.verifikujZahtjeviZaUgovore();
		Ugovori ugovori = pocetna.navigateOnPage("PX", Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ZahtjeviZaRaskidUgovora zahtjeviZaRaskid = pocetna.navigateOnPage("PX", ZahtjeviZaRaskidUgovora.class, "Kupci", "Zahtjevi za raskid ugovora");
		zahtjeviZaRaskid.verifikujZahtjeviZaRaskidUgovora();
		ObavjestenjaOPromjeniSnabdjevaca obavjestenja = pocetna.navigateOnPage("PX", ObavjestenjaOPromjeniSnabdjevaca.class, "Kupci", "Obavještenja o promjeni snabdjevača");
		obavjestenja.verifikujObavjestenjaOPromjeniSnabdjevaca();
		ZajednickaPotrosnja zajednickaPotrosnja = pocetna.navigateOnPage("PX", ZajednickaPotrosnja.class, "Kupci", "Zajednička potrošnja");
		zajednickaPotrosnja.verifikujZajednickaPotrosnja();
		ClanoviZajednickePotrosnje clanovi = pocetna.navigateOnPage("PX", ClanoviZajednickePotrosnje.class, "Kupci", "Članovi zajedničke potrošnje");
		clanovi.verifikujClanoviZajednickePotrosnje();
		UgovoreniPopusti ugovoreniPopusti = pocetna.navigateOnPage("PX", UgovoreniPopusti.class, "Kupci", "Ugovoreni popusti");
		ugovoreniPopusti.verifikujUgovoreniPopusti();
		OdbaceniUgovori odbaceniUgovori = pocetna.navigateOnPage("PX", OdbaceniUgovori.class, "Kupci", "Odbačeni ugovori");
		odbaceniUgovori.verifikujOdbaceniUgovori();
		Reklamacije reklamacije = pocetna.navigateOnPage("PX", Reklamacije.class, "Kupci", "Reklamacije");
		reklamacije.verifikujReklamacije();
		VrsteZahtjeva vrsteZahtjeva = pocetna.navigateOnPage("PX", VrsteZahtjeva.class, "Kupci", "Vrste zahtjeva");
		vrsteZahtjeva.verifikujVrsteZahtjeva();
//		VrsteIsporukeReklamacija vrsteIsporuke = pocetna.navigirajNaVrsteIsporukeReklamacija();
//		vrsteIsporuke.verifikujVrsteIsporukeReklamacija();
		ObrasciBrojaUgovora obrasciBrojaUgovora = pocetna.navigateOnPage("PX", ObrasciBrojaUgovora.class, "Kupci", "Obrasci broja ugovora");
		obrasciBrojaUgovora.verifikujObrasciBrojaUgovora();
		GrupeObrazacaBrojaUgovora grupeObrazacaBrojaUgovora = pocetna.navigateOnPage("PX", GrupeObrazacaBrojaUgovora.class, "Kupci", "Grupe obrazaca broja ugovora");
		grupeObrazacaBrojaUgovora.verifikujGrupeObrazaca();
		Mjenice mjenice = pocetna.navigateOnPage("PX", Mjenice.class, "Kupci", "Mjenice");
		mjenice.verifikujMjenice();
		TipoviMjenica tipovi = pocetna.navigateOnPage("PX", TipoviMjenica.class, "Kupci", "Tipovi mjenica");
		tipovi.verifikujTipoveMjenica();
		IzvodiOtvorenihStavkiPoODSu izvodiOtvorenihStavki = pocetna.navigateOnPage("PX", IzvodiOtvorenihStavkiPoODSu.class, "Kupci", "Izvodi otvorenih stavki po ODS-u");
		izvodiOtvorenihStavki.verifikujIzvodiOtvorenihStavki();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije KUPCI-PROIZVOĐAČI i verifikuje ih")
	public void px_003_04_verifikacija_sekcije_kupci_proizvodjaci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Prijave prijave = pocetna.navigateOnPage("PX", Prijave.class, "Kupci-proizvođači", "Prijave");
		prijave.verifikujPrijave();
		Dokumenti dokumenti = pocetna.navigateOnPage("PX", Dokumenti.class, "Kupci-proizvođači", "Dokumenti");
		dokumenti.verifikujDokumenti();
		Anketari anketari = pocetna.navigateOnPage("PX", Anketari.class, "Kupci-proizvođači", "Anketari");
		anketari.verifikujAnketari();
		Ankete ankete = pocetna.navigateOnPage("PX", Ankete.class, "Kupci-proizvođači", "Ankete");
		ankete.verifikujAnkete();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_003_05_verifikacija_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = pocetna.navigateOnPage("PX", MjernaMjesta.class, "Mjerna mjesta", "Mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		ZahtjeviZaDostavuPodatakaOMjernimMjestima zahtjeviZaDostavuPodataka = pocetna.navigateOnPage("PX", ZahtjeviZaDostavuPodatakaOMjernimMjestima.class, "Mjerna mjesta", "Zahtjevi za dostavu podataka o mjm");	// da bi ispravno navigiralo preko url
		zahtjeviZaDostavuPodataka.verifikujZahtjeviZaDostavuPodataka();
		OcitanjaBrojila ocitanjaBrojila = pocetna.navigateOnPage("PX", OcitanjaBrojila.class, "Mjerna mjesta", "Očitanja brojila");
		ocitanjaBrojila.verifikujOcitanjaBrojila();
		EnergetskiObracun energetskiObracun = pocetna.navigateOnPage("PX", EnergetskiObracun.class, "Mjerna mjesta", "Energetski obračun");
		energetskiObracun.verifikujEnergetskiObracun();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije OBRAČUN i verifikuje ih")
	public void px_003_06_verifikacija_sekcije_obracun_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		NaloziZaObracun naloziZaObracun = pocetna.navigateOnPage("PX", NaloziZaObracun.class, "Obračun", "Nalozi za obračun");
		naloziZaObracun.verifikujNaloziZaObracun();
		Racuni racuni = pocetna.navigateOnPage("PX", Racuni.class, "Obračun", "Računi");
		racuni.verifikujRacuni();
		MasovnoGenerisanjeRacuna masovnoGenerisanjeRacuna = pocetna.navigateOnPage("PX", MasovnoGenerisanjeRacuna.class, "Obračun", "Masovno generisanje računa");
		masovnoGenerisanjeRacuna.verifikujMasovnoGenerisanjeRacuna();
		KorekcijeRacuna korekcijeRacuna = pocetna.navigateOnPage("PX", KorekcijeRacuna.class, "Obračun", "Korekcije računa");
		korekcijeRacuna.verifikujKorekcijeRacuna();
		ImportiKorekcija importiKorekcija = pocetna.navigateOnPage("PX", ImportiKorekcija.class, "Obračun", "Importi korekcija");
		importiKorekcija.verifikujImporteKorekcija();
		Kamate kamate = pocetna.navigateOnPage("PX", Kamate.class, "Obračun", "Kamate");
		kamate.verifikujKamate();
		KorekcijeKamate korekcijeKamatePage = pocetna.navigateOnPage("PX", KorekcijeKamate.class, "Obračun", "Korekcije kamate");
		korekcijeKamatePage.verifikujKorekcijeKamate();
		AvansneFakture avansneFakture = pocetna.navigateOnPage("PX", AvansneFakture.class, "Obračun", "Avansne fakture");
		avansneFakture.verifikujAvansneFakture();
		UmanjenjaCijene umanjenjaCijene = pocetna.navigateOnPage("PX", UmanjenjaCijene.class, "Obračun", "Umanjenja cijene");
		umanjenjaCijene.verifikujUmanjenjaCijene();
		TefObrazac tef = pocetna.navigateOnPage("PX", TefObrazac.class, "Obračun", "TEF obrazac");
		tef.verifikujTefObrazac();
		KupciZaTestneRacune kupciZaTestneRacune = pocetna.navigateOnPage("PX", KupciZaTestneRacune.class, "Obračun", "Kupci za testne račune");
		kupciZaTestneRacune.verifikujKupciZaTestneRacune();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcije NESTANDARDNE USLUGE i verifikuje ih")
	public void px_003_07_verifikacija_sekcije_nestandardne_usluge_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		NaloziZaObracunNestandardnihUsluga naloziZaObracunNSU = pocetna.navigateOnPage("PX", NaloziZaObracunNestandardnihUsluga.class, "Nestandardne usluge", "Nalozi za obračun NSU");
		naloziZaObracunNSU.verifikujNaloziZaObracunNestandardnihUsluga();
		RacuniZaNestandardneUsluge racuniZaNSU = pocetna.navigateOnPage("PX", RacuniZaNestandardneUsluge.class, "Nestandardne usluge", "Računi NSU");
		racuniZaNSU.verifikujRacuniZaNestandardneUsluge();
		KorekcijeRacunaZaNestandardneUsluge korekcijeRacunaZaNSU = pocetna.navigateOnPage("PX", KorekcijeRacunaZaNestandardneUsluge.class, "Nestandardne usluge", "Korekcije računa NSU");
		korekcijeRacunaZaNSU.verifikujKorekcijeRacunaZaNestandardneUsluge();
		Predracuni predracuni = pocetna.navigateOnPage("PX", Predracuni.class, "Nestandardne usluge", "Predračuni");
		predracuni.verifikujPredracuni();
		ObrasciBrojaProtokolaPredracuna obrasciBrojaProtokolaPredracuna = pocetna.navigateOnPage("PX", ObrasciBrojaProtokolaPredracuna.class, "Nestandardne usluge", "Obrasci broja protokola predračuna");
		obrasciBrojaProtokolaPredracuna.verifikujObrasciBrojaProtokolaPredracuna();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih")
	public void px_003_08_verifikacija_sekcije_finansije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		FinansijskeKartice finansijskeKartice = pocetna.navigateOnPage("PX", FinansijskeKartice.class, "Finansije", "Finansijske kartice");
		finansijskeKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevniciUplata = pocetna.navigateOnPage("PX", DnevniciUplata.class, "Finansije", "Dnevnici uplata");
		dnevniciUplata.verifikujDnevniciUplata();
		PreknjizavanjaUplata preknjizavanja = pocetna.navigateOnPage("PX", PreknjizavanjaUplata.class, "Finansije", "Preknjižavanja uplata");
		preknjizavanja.verifikujPreknjizavanjaUplata();
		SveUplate sveUplate = pocetna.navigateOnPage("PX", SveUplate.class, "Finansije", "Sve uplate");
		sveUplate.verifikujSveUplate();
		NerasporedjeneUplate nerasporedjeneUplate = pocetna.navigateOnPage("PX", NerasporedjeneUplate.class, "Finansije", "Neraspoređene uplate");
		nerasporedjeneUplate.verifikujNerasporedjeneUplate();
		Avansi avansi = pocetna.navigateOnPage("PX", Avansi.class, "Finansije", "Avansi");
		avansi.verifikujAvansi();
		Reprogrami reprogrami = pocetna.navigateOnPage("PX", Reprogrami.class, "Finansije", "Reprogrami");
		reprogrami.verifikujReprogrami();
//		TODO SudskaPoravnanja
		ObrasciBrojaUgovoraReprograma obrasciBrojaUgovoraReprograma = pocetna.navigateOnPage("PX", ObrasciBrojaUgovoraReprograma.class, "Finansije", "Obrasci broja ugovora reprograma");
		obrasciBrojaUgovoraReprograma.verifikujObrasciBrojaUgovoraReprograma();
		Banke banke = pocetna.navigateOnPage("PX", Banke.class, "Finansije", "Banke");
		banke.verifikujBanke();
		ZiroRacuni ziroRacuni = pocetna.navigateOnPage("PX", ZiroRacuni.class, "Finansije", "Žiro računi");
		ziroRacuni.verifikujZiroRacuni();
		VrsteKnjizenja vrsteKnjizenja = pocetna.navigateOnPage("PX", VrsteKnjizenja.class, "Finansije", "Vrste knjiženja");
		vrsteKnjizenja.verifikujVrsteKnjizenja();
		VrsteFinansijskihKartica vrsteFinansijskihKartica = pocetna.navigateOnPage("PX", VrsteFinansijskihKartica.class, "Finansije", "Vrste finansijskih kartica");
		vrsteFinansijskihKartica.verifikujVrsteFinansijskihKartica();
		VrsteStavkiFinansijskeKartice vrsteStavkiFinansijskeKartice = pocetna.navigateOnPage("PX", VrsteStavkiFinansijskeKartice.class, "Finansije", "Vrste stavki finansijske kartice");
		vrsteStavkiFinansijskeKartice.verifikujVrsteStavkiFinansijskeKartice();
		Sap sap = pocetna.navigateOnPage("PX", Sap.class, "Finansije", "SAP");
		sap.verifikujSap();
		Uino uino = pocetna.navigateOnPage("PX", Uino.class, "Finansije", "UINO");
		uino.verifikujUino();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcija PRAVNI ODNOSI i verifikuje ih")
	public void px_003_09_verifikacija_sekcije_pravni_odnosi_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Opomene opomene = pocetna.navigateOnPage("PX", Opomene.class, "Pravni odnosi", "Opomene");
		opomene.verifikujOpomene();
		ZahtjeviZaIskljucenje zahtjeviZaIskljucenje = pocetna.navigateOnPage("PX", ZahtjeviZaIskljucenje.class, "Pravni odnosi", "Zahtjevi za isključenje");
		zahtjeviZaIskljucenje.verifikujZahtjeviZaIskljucenje();
		StavkeZahtjevaZaIskljucenja stavke = pocetna.navigateOnPage("PX", StavkeZahtjevaZaIskljucenja.class, "Pravni odnosi", "Stavke zahtjeva za isključenja");
		stavke.verifikujStavkeZahtjevaZaIskljucenja();
		IskljucenjaOdStraneODSa iskljucenjaOdStraneODSa = pocetna.navigateOnPage("PX", IskljucenjaOdStraneODSa.class, "Pravni odnosi", "Isključenja od strane ODS-a");
		iskljucenjaOdStraneODSa.verifikujIskljucenjaOdStraneODSa();
		IskljucenjaPoZahtjevuKupca iskljucenjaPoZahtjevuKupca = pocetna.navigateOnPage("PX", IskljucenjaPoZahtjevuKupca.class, "Pravni odnosi", "Isključenja po zahtjevu kupca");
		iskljucenjaPoZahtjevuKupca.verifikujIskljucenjaPoZahtjevuKupca();
		AktivnaIskljucenja aktivnaIskljucenja = pocetna.navigateOnPage("PX", AktivnaIskljucenja.class, "Pravni odnosi", "Aktivna isključenja");
		aktivnaIskljucenja.verifikujAktivnaIskljucenja();
		ZahtjeviZaUkljucenje zahtjeviZaUkljucenje = pocetna.navigateOnPage("PX", ZahtjeviZaUkljucenje.class, "Pravni odnosi", "Zahtjevi za uključenje");
		zahtjeviZaUkljucenje.verifikujZahtjeviZaUkljucenje();
		StavkeZahtjevaZaUkljucenja stavkeUkljucenja = pocetna.navigateOnPage("PX", StavkeZahtjevaZaUkljucenja.class, "Pravni odnosi", "Stavke zahtjeva za uključenja");
		stavkeUkljucenja.verifikujStavkeZahtjevaZaUkljucenja();
		UkljucenjaOdStraneODSa ukljucenjaOdStraneODSa = pocetna.navigateOnPage("PX", UkljucenjaOdStraneODSa.class, "Pravni odnosi", "Uključenja od strane ODS-a");
		ukljucenjaOdStraneODSa.verifikujUkljucenaOdStraneODSa();
		UkljucenjaPoZahtjevuKupca ukljucenjaPoZahtjevuKupca = pocetna.navigateOnPage("PX", UkljucenjaPoZahtjevuKupca.class, "Pravni odnosi", "Uključenja po zahtjevu kupca");
		ukljucenjaPoZahtjevuKupca.verifikujUkljucenaPoZahtjevuKupca();
		OpomenePredUtuzenje opomenePredUtuzenje = pocetna.navigateOnPage("PX", OpomenePredUtuzenje.class, "Pravni odnosi", "Opomene pred utuženje");
		opomenePredUtuzenje.verifikujOpomenePredUtuzenje();
		ObrasciBrojaProtokolaOpomenaPredUtuzenje obrasciBrojaProtokolaOpomenaPredUtuzenje = pocetna.navigateOnPage("PX", ObrasciBrojaProtokolaOpomenaPredUtuzenje.class, "Pravni odnosi", "Obrasci broja protokola opomena pred utuženje");
		obrasciBrojaProtokolaOpomenaPredUtuzenje.verifikujObrasciBrojaProtokolaOpomenaPredUtuzenje();
		Tuzbe tuzbe = pocetna.navigateOnPage("PX", Tuzbe.class, "Pravni odnosi", "Tužbe");
		tuzbe.verifikujTuzbe();
//		dodati verifikaciju stranice IzvrsniPostupak
		StecajeviLikvidacije stecajevi = pocetna.navigateOnPage("PX", StecajeviLikvidacije.class, "Pravni odnosi", "Stečajevi/Likvidacije");
		stecajevi.verifikujStecajeviLikvidacije();
		Medijacije medijacije = pocetna.navigateOnPage("PX", Medijacije.class, "Pravni odnosi", "Medijacije");
		medijacije.verifikujMedijacije();
		OtpisiPotrazivanja otpisiPotrazivanja = pocetna.navigateOnPage("PX", OtpisiPotrazivanja.class, "Pravni odnosi", "Otpisi potraživanja");
		otpisiPotrazivanja.verifikujOtpisiPotrazivanja();
		Sudovi sudovi = pocetna.navigateOnPage("PX", Sudovi.class, "Pravni odnosi", "Sudovi");
		sudovi.verifikujSudovi();
		VanbilansnaEvidencijaTroskovaSudskihPostupaka vanbilansnaEvidencija = pocetna.navigateOnPage("PX", VanbilansnaEvidencijaTroskovaSudskihPostupaka.class, "Pravni odnosi", "Vanbilansna evidencija troškova sudskih postupaka");
		vanbilansnaEvidencija.verifikujVanbilansnaEvidencijaTroskovaSudskihPostupaka();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, description="test prolazi kroz sve stranice iz sekcija ADMINISTRACIJA i IZVJESTAJI i verifikuje ih")
	public void px_003_10_verifikacija_sekcija_administracija_izvjestaji_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Korisnici korisnici = pocetna.navigateOnPage("PX", Korisnici.class, "Administracija", "Korisnici");
		korisnici.verifikujKorisnici();
		Poruke poruke = pocetna.navigateOnPage("PX", Poruke.class, "Administracija", "Poruke");
		poruke.verifikujPoruke();
		EmailObavjestenja emailObavjestenja = pocetna.navigateOnPage("PX", EmailObavjestenja.class, "Administracija", "E-mail obavještenja");
		emailObavjestenja.verifikujEmailObavjestenja();
//	    DnevnikIzmjena dnevnikIzmjena = pocetna.navigirajNaDnevnikIzmjena();
//		dnevnikIzmjena.verifikujDnevnikIzmjena();
//		Izvjestaji izvjestaji = pocetna.navigirajNaIzvjestaji();
//		izvjestaji.verifikujIzvjestaji();
	}
	
}