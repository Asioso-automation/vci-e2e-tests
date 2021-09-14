package com.platformX.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Kolone extends PageBase {
	

	public Kolone(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//*[contains(text(), 'ID')]")
	public WebElement kolonaIdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Naziv')]")
	public WebElement kolonaNazivWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Pošta')]")
	public WebElement kolonaPostaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mjesto')]")
	public WebElement kolonaMjestoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Adresa')]")
	public WebElement kolonaAdresaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Telefon')]")
	public WebElement kolonaTelefonWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Fax')]")
	public WebElement kolonaFaxWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Email')]")
	public WebElement kolonaEmailWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Internet adresa')]")
	public WebElement kolonaInternetAdresaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Call centar')]")
	public WebElement kolonaCallCentarWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Call center')]") // typo: center
	public WebElement kolonaCallCenterWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Žiro račun')]")
	public WebElement kolonaZiroRacunWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kod')]")
	public WebElement kolonaKodWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Eic')]")
	public WebElement kolonaEicWE;
	
	@FindBy(xpath = "//*[contains(text(), 'EIC')]")
	public WebElement kolonaEic2WE;
	
	@FindBy(xpath = "//*[contains(text(), 'E-mail')]")
	public WebElement kolonaEmail2WE;
	
	@FindBy(xpath = "//*[contains(text(), 'Sap mjesto troska')]") //typo: troska
	public WebElement kolonaSapMjestoTroskaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'ODS')]")
	public WebElement kolonaOdsWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Telefon za prijavu kvara')]")
	public WebElement kolonaTelefonZaPrijavuKvaraWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Telefon za informacije o uslugama')]")
	public WebElement kolonaTelefonZaInformacijeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Telefon za prigovore na račun')]")
	public WebElement kolonaTelefonZaPrigovoreWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Šifra djelatnosti')]")
	public WebElement kolonaSifraDjelatnostiWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Entitet')]")
	public WebElement kolonaEntitetWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Opština')]")
	public WebElement kolonaOpstinaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Štampani naziv')]")
	public WebElement kolonaStampaniNazivWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Validna šifra ulice')]")
	public WebElement kolonaValidnaSifraUliceWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj mjeseci')]")
	public WebElement kolonaBrojMjeseciWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Procenat')]")
	public WebElement kolonaProcenatWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Grupa obrasca broja ugovora')]")
	public WebElement kolonaGrupaObrascaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Nadgrupa')]")
	public WebElement kolonaNadgrupaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kategorija')]")
	public WebElement kolonaKategorijaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Vrsta brojila')]")
	public WebElement kolonaVrstaBrojilaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Maxigraf')]") //typo x-ks
	public WebElement kolonaMaxigrafWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Reaktivna')]")
	public WebElement kolonaReaktivnaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Od')]")
	public WebElement kolonaOdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Do')]")
	public WebElement kolonaDoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Tarifna grupa')]")
	public WebElement kolonaTarifnaGrupaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum od')]")
	public WebElement kolonaDatumOdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum do')]")
	public WebElement kolonaDatumDoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'kW')]")
	public WebElement kolonakWWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mjerenje')]")
	public WebElement kolonaMjerenjeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Validna')]")
	public WebElement kolonaValidnaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kategorija mrežarine')]")
	public WebElement kolonaKategorijaMrezarineWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Tenderska cijena')]")
	public WebElement kolonaTenderskaCijenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Vremenski ograničena')]")
	public WebElement kolonaVremenskiOgranicenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kategorija cijene')]")
	public WebElement kolonaKategorijaCijeneWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Vrsta tarife')]")
	public WebElement kolonaVrstaTarifeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Sezona')]")
	public WebElement kolonaSezonaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Cijena')]")
	public WebElement kolonaCijenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'PDV')]")
	public WebElement kolonaPdvWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Cijena mrežarine')]")
	public WebElement kolonaCijenaMrezarineWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Aktivan')]")
	public WebElement kolonaAktivanWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Odgovorni ODS')]")
	public WebElement kolonaOdgovorniODSWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Odgovorno lice')]")
	public WebElement kolonaOdgovornoLiceWE;

	@FindBy(xpath = "//*[contains(text(), 'JIB')]")
	public WebElement kolonaJIBWE;
	
	@FindBy(xpath = "//*[contains(text(), 'IB')]")
	public WebElement kolonaIBWE;
	
	@FindBy(xpath = "//*[contains(text(), 'PDV obveznik')]")
	public WebElement kolonaPdvObveznikWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ime i Prezime')]") // P-p
	public WebElement kolonaImeIPrezimeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj lične karte')]")
	public WebElement kolonaBrojLicneKarteWE;
	
	@FindBy(xpath = "//*[contains(text(), 'PIB')]")
	public WebElement kolonaPIBWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ulica')]")
	public WebElement kolonaUlicaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'SAP šifra')]")
	public WebElement kolonaSAPSifraWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum slanja')]")
	public WebElement kolonaDatumSlanjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Razlog odbijanja')]")
	public WebElement kolonaRazlogOdbijanjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Inicirao snabdjevač')]")
	public WebElement kolonaIniciraoSnabdjevacWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Odbijeno')]")
	public WebElement kolonaOdbijenoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Realizovano')]")
	public WebElement kolonaRealizovanoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj')]")
	public WebElement kolonaBrojWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kupac ID')]")
	public WebElement kolonaKupacIdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Naziv kupca')]")
	public WebElement kolonaNazivKupcaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Naziv mjm.')]")
	public WebElement kolonaNazivMjmWE;
	
	@FindBy(xpath = "//*[contains(text(), 'T.G.')]")
	public WebElement kolonaTGWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Tip')]")
	public WebElement kolonaTipWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Počinje')]")
	public WebElement kolonaPocinjeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Završava')]")
	public WebElement kolonaZavrsavaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Važi od')]")
	public WebElement kolonaVaziOdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Važi do')]")
	public WebElement kolonaVaziDoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Priprema')]")
	public WebElement kolonaPripremaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Potpisan')]")
	public WebElement kolonaPotpisanWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Serijski broj')]")
	public WebElement kolonaSerijskiBrojWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ugovor')]")
	public WebElement kolonaUgovorWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kupac')]")
	public WebElement kolonaKupacWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mjerno mjesto (EIC)')]")
	public WebElement kolonaMjernoMjestoEicWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum kreiranja')]")
	public WebElement kolonaDatumKreiranjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Očekivani datum završetka')]")
	public WebElement kolonaOcekivaniDatumZavrsetkaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum završetka')]")
	public WebElement kolonaDatumZavrsetkaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Realizovan')]")
	public WebElement kolonaRealizovanWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Period od')]")
	public WebElement kolonaPeriodOdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Period do')]")
	public WebElement kolonaPeriodDoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Procenat (%)')]")
	public WebElement kolonaProcenat2WE;
	
	@FindBy(xpath = "//*[contains(text(), 'Napomena')]")
	public WebElement kolonaNapomenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Adresa dostave')]")
	public WebElement kolonaAdresaDostaveWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Odbačen')]")
	public WebElement kolonaOdbacenWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Vrsta zahtjeva')]")
	public WebElement kolonaVrstaZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Br. protokola')]")
	public WebElement kolonaBrProtokolaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum prijave')]")
	public WebElement kolonaDatumPrijaveWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum rješenja')]")
	public WebElement kolonaDatumRjesenjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Opis zahtjeva')]")
	public WebElement kolonaOpisZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Zaključeno')]")
	public WebElement kolonaZakljucenoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Opis')]")
	public WebElement kolonaOpisWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Tip mjenice')]")
	public WebElement kolonaTipMjeniceWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum aktiviranja')]")
	public WebElement kolonaDatumAktiviranjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'U centrali')]")
	public WebElement kolonaUCentraliWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Vraćena kupcu')]")
	public WebElement kolonaVracenaKupcuWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Važeća')]")
	public WebElement kolonaVazecaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Inicirao ODS')]")
	public WebElement kolonaIniciraoOdsWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Brojilo')]")
	public WebElement kolonaBrojiloWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum')]")
	public WebElement kolonaDatumWE;
	
	@FindBy(xpath = "//*[contains(text(), 'AVT')]")
	public WebElement kolonaAvtWE;
	
	@FindBy(xpath = "//*[contains(text(), 'AMT')]")
	public WebElement kolonaAmtWE;
	
	@FindBy(xpath = "//*[contains(text(), 'RVT')]")
	public WebElement kolonaRvtWE;
	
	@FindBy(xpath = "//*[contains(text(), 'RMT')]")
	public WebElement kolonaRmtWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Obrač. snaga')]")
	public WebElement kolonaObracSnagaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'A. konstanta')]")
	public WebElement kolonaAKonstantaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'R. konstanta')]")
	public WebElement kolonaRKonstantaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Konst. snage')]")
	public WebElement kolonaKonstSnageWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Period')]")
	public WebElement kolonaPeriodWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Tip ugovora')]")
	public WebElement kolonaTipUgovoraWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Aktivna energija(kWh)')]")
	public WebElement kolonaAktivnaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Reaktvina energija(kWh)')]") // typo: reaktvina
	public WebElement kolonaReaktivnaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Snaga(kW)')]")
	public WebElement kolonaSnagaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mrežarina(KM)')]")
	public WebElement kolonaMrezarinaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Rok plaćanja')]")
	public WebElement kolonaRokPlacanjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj kupaca')]")
	public WebElement kolonaBrojKupacaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj mj. mjesta')]")
	public WebElement kolonaBrojMjMjestaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj računa')]")
	public WebElement kolonaBrojRacunaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ukupno bez PDV')]")
	public WebElement kolonaUkupnoBezPdvWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ukupno sa PDV')]")
	public WebElement kolonaUkupnoSaPdvWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Zaključen')]")
	public WebElement kolonaZakljucenWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Poziv na broj')]")
	public WebElement kolonaPozivNaBrojWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Iznos bez PDV')]")
	public WebElement kolonaIznosBezPdvWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Iznos sa PDV')]")
	public WebElement kolonaIznosSaPdvWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kamata')]")
	public WebElement kolonaKamataWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ukupno')]")
	public WebElement kolonaUkupnoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Plaćen')]")
	public WebElement kolonaPlacenWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Tip Korekcije')]") // K
	public WebElement kolonaTipKorekcijeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Energija')]")
	public WebElement kolonaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Obnovljivi izvori')]")
	public WebElement kolonaObnovljiviIzvoriWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Naknada za snabdijevanje')]")
	public WebElement kolonaNaknadaZaSnabdijevanjeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ukupan iznos')]")
	public WebElement kolonaUkupanIznosWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Proknjiženo')]")
	public WebElement kolonaProknjizenoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mrežarina')]")
	public WebElement kolonaMrezarina2WE;
	
	@FindBy(xpath = "//*[contains(text(), 'Osnovica')]")
	public WebElement kolonaOsnovicaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Dana kašnjenja')]")
	public WebElement kolonaDanaKasnjenjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Iznos')]")
	public WebElement kolonaIznosWE;
	
	@FindBy(xpath = "//*[contains(text(), 'PDV stopa')]")
	public WebElement kolonaPdvStopaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Poreski obveznik')]")
	public WebElement kolonaPoreskiObveznikWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Storno')]")
	public WebElement kolonaStornoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj telefona')]")
	public WebElement kolonaBrojTelefonaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum knjiženja')]")
	public WebElement kolonaDatumKnjizenjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Duguje')]")
	public WebElement kolonaDugujeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Potražuje')]")
	public WebElement kolonaPotrazujeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Preostalo')]")
	public WebElement kolonaPreostaloWE;
}