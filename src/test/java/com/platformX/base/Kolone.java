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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'ID']")
	public WebElement kolonaIdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv']")
	public WebElement kolonaNazivWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Pošta']")
	public WebElement kolonaPostaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjesto']")
	public WebElement kolonaMjestoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Adresa']")
	public WebElement kolonaAdresaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Telefon']")
	public WebElement kolonaTelefonWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Fax']")
	public WebElement kolonaFaxWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Email']")
	public WebElement kolonaEmailWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Internet adresa']")
	public WebElement kolonaInternetAdresaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Call centar']")
	public WebElement kolonaCallCentarWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Call center']") // typo: center
	public WebElement kolonaCallCenterWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Žiro račun']")
	public WebElement kolonaZiroRacunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kod']")
	public WebElement kolonaKodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Eic']")
	public WebElement kolonaEicWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'EIC']")
	public WebElement kolonaEic2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'E-mail']")
	public WebElement kolonaEmail2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Sap mjesto troška']")
	public WebElement kolonaSapMjestoTroskaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'ODS']")
	public WebElement kolonaOdsWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Telefon za prijavu kvara']")
	public WebElement kolonaTelefonZaPrijavuKvaraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Telefon za informacije o uslugama']")
	public WebElement kolonaTelefonZaInformacijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Telefon za prigovore na račun']")
	public WebElement kolonaTelefonZaPrigovoreWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Šifra djelatnosti']")
	public WebElement kolonaSifraDjelatnostiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Entitet']")
	public WebElement kolonaEntitetWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Opština']")
	public WebElement kolonaOpstinaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Štampani naziv']")
	public WebElement kolonaStampaniNazivWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Štampani naziv na dokumentima']")
	public WebElement kolonaStampaniNazivNaDokWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Validna šifra ulice']")
	public WebElement kolonaValidnaSifraUliceWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj mjeseci']")
	public WebElement kolonaBrojMjeseciWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Procenat (%)']")
	public WebElement kolonaProcenatWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Grupa obrasca broja ugovora']")
	public WebElement kolonaGrupaObrascaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nadgrupa']")
	public WebElement kolonaNadgrupaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kategorija']")
	public WebElement kolonaKategorijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta brojila']")
	public WebElement kolonaVrstaBrojilaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Maxigraf']") //typo x-ks
	public WebElement kolonaMaxigrafWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivna']")
	public WebElement kolonaReaktivnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Od']")
	public WebElement kolonaOdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Do']")
	public WebElement kolonaDoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tarifna grupa']")
	public WebElement kolonaTarifnaGrupaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum od']")
	public WebElement kolonaDatumOdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum do']")
	public WebElement kolonaDatumDoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'kW']")
	public WebElement kolonakWWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjerenje']")
	public WebElement kolonaMjerenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Validna']")
	public WebElement kolonaValidnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kategorija mrežarine']")
	public WebElement kolonaKategorijaMrezarineWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tenderska cijena']")
	public WebElement kolonaTenderskaCijenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vremenski ograničena']")
	public WebElement kolonaVremenskiOgranicenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kategorija cijene']")
	public WebElement kolonaKategorijaCijeneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta tarife']")
	public WebElement kolonaVrstaTarifeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Sezona']")
	public WebElement kolonaSezonaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Cijena']")
	public WebElement kolonaCijenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PDV (%)']")
	public WebElement kolonaPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PDV']")
	public WebElement kolonaPdv1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Cijena mrežarine']")
	public WebElement kolonaCijenaMrezarineWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivan']")
	public WebElement kolonaAktivanWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Akt.']")
	public WebElement kolonaAktWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odgovorni ODS']")
	public WebElement kolonaOdgovorniODSWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odgovorno lice']")
	public WebElement kolonaOdgovornoLiceWE;

	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'JIB']")
	public WebElement kolonaJIBWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'IB']")
	public WebElement kolonaIBWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PDV obveznik']")
	public WebElement kolonaPdvObveznikWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ime i Prezime']") // P-p
	public WebElement kolonaImeIPrezimeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ime i prezime']")
	public WebElement kolonaImeIprezimeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj lične karte']")
	public WebElement kolonaBrojLicneKarteWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PIB']")
	public WebElement kolonaPIBWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ulica']")
	public WebElement kolonaUlicaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'SAP šifra']")
	public WebElement kolonaSAPSifraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum slanja']")
	public WebElement kolonaDatumSlanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog odbijanja']")
	public WebElement kolonaRazlogOdbijanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Inicirao snabdjevač']")
	public WebElement kolonaIniciraoSnabdjevacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odbijeno']")
	public WebElement kolonaOdbijenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Realizovano']")
	public WebElement kolonaRealizovanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj']")
	public WebElement kolonaBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kupac ID']")
	public WebElement kolonaKupacIdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv kupca']")
	public WebElement kolonaNazivKupcaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv mjm.']")
	public WebElement kolonaNazivMjmWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'T.G.']")
	public WebElement kolonaTGWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip']")
	public WebElement kolonaTipWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Počinje']")
	public WebElement kolonaPocinjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Završava']")
	public WebElement kolonaZavrsavaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Važi od']")
	public WebElement kolonaVaziOdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Važi do']")
	public WebElement kolonaVaziDoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Priprema']")
	public WebElement kolonaPripremaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Potpisan']")
	public WebElement kolonaPotpisanWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Potp.']")
	public WebElement kolonaPotpWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Serijski broj']")
	public WebElement kolonaSerijskiBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ugovor']")
	public WebElement kolonaUgovorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kupac']")
	public WebElement kolonaKupacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjerno mjesto (EIC)']")
	public WebElement kolonaMjernoMjestoEicWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum kreiranja']")
	public WebElement kolonaDatumKreiranjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum IOS-a']")
	public WebElement kolonaDatumIOSaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Očekivani datum završetka']")
	public WebElement kolonaOcekivaniDatumZavrsetkaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum završetka']")
	public WebElement kolonaDatumZavrsetkaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Realizovan']")
	public WebElement kolonaRealizovanWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period od']")
	public WebElement kolonaPeriodOdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period do']")
	public WebElement kolonaPeriodDoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Procenat (%)']")
	public WebElement kolonaProcenat2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Napomena']")
	public WebElement kolonaNapomenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prereg.']")
	public WebElement kolonaPreregWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Adresa dostave']")
	public WebElement kolonaAdresaDostaveWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odbačen']")
	public WebElement kolonaOdbacenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta zahtjeva']")
	public WebElement kolonaVrstaZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Br. protokola']")
	public WebElement kolonaBrProtokolaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum prijave']")
	public WebElement kolonaDatumPrijaveWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum rješenja']")
	public WebElement kolonaDatumRjesenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Opis zahtjeva']")
	public WebElement kolonaOpisZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zaključeno']")
	public WebElement kolonaZakljucenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Opis']")
	public WebElement kolonaOpisWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip mjenice']")
	public WebElement kolonaTipMjeniceWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum aktiviranja']")
	public WebElement kolonaDatumAktiviranjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'U centrali']")
	public WebElement kolonaUCentraliWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vraćena kupcu']")
	public WebElement kolonaVracenaKupcuWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Važeća']")
	public WebElement kolonaVazecaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Inicirao ODS']")
	public WebElement kolonaIniciraoOdsWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Brojilo']")
	public WebElement kolonaBrojiloWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum']")
	public WebElement kolonaDatumWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AVT']")
	public WebElement kolonaAvtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AMT']")
	public WebElement kolonaAmtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'RVT']")
	public WebElement kolonaRvtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'RMT']")
	public WebElement kolonaRmtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obrač. snaga']")
	public WebElement kolonaObracSnagaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'A. konstanta']")
	public WebElement kolonaAKonstantaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'R. konstanta']")
	public WebElement kolonaRKonstantaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Konst. snage']")
	public WebElement kolonaKonstSnageWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period']")
	public WebElement kolonaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip ugovora']")
	public WebElement kolonaTipUgovoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna energija (kWh)']")
	public WebElement kolonaAktivnaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktvina energija (kWh)']") // typo: reaktvina
	public WebElement kolonaReaktivnaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga (kW)']")
	public WebElement kolonaSnagaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga']")
	public WebElement kolonaSnaga1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mrežarina (KM)']")
	public WebElement kolonaMrezarinaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Rok plaćanja']")
	public WebElement kolonaRokPlacanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj kupaca']")
	public WebElement kolonaBrojKupacaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj mj. mjesta']")
	public WebElement kolonaBrojMjMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj računa']")
	public WebElement kolonaBrojRacunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupno bez PDV']")
	public WebElement kolonaUkupnoBezPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupno sa PDV']")
	public WebElement kolonaUkupnoSaPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zaključen']")
	public WebElement kolonaZakljucenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poziv na broj']")
	public WebElement kolonaPozivNaBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos bez PDV']")
	public WebElement kolonaIznosBezPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos sa PDV']")
	public WebElement kolonaIznosSaPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kamata']")
	public WebElement kolonaKamataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupno']")
	public WebElement kolonaUkupnoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Plaćen']")
	public WebElement kolonaPlacenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip Korekcije']") // K
	public WebElement kolonaTipKorekcijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Energija']")
	public WebElement kolonaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'En.']")
	public WebElement kolonaEnWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obnovljivi izvori']")
	public WebElement kolonaObnovljiviIzvoriWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obn. izvori']")
	public WebElement kolonaObnIzvoriWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naknada za snabdijevanje']")
	public WebElement kolonaNaknadaZaSnabdijevanjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naknada za snabd.']")
	public WebElement kolonaNaknadaZaSnabdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupan iznos']")
	public WebElement kolonaUkupanIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Uk. iznos']")
	public WebElement kolonaUkIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Proknjiženo']")
	public WebElement kolonaProknjizenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Proknj.']")
	public WebElement kolonaProknjWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mrežarina']")
	public WebElement kolonaMrezarina2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mrež.']")
	public WebElement kolonaMrezWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Osnovica']")
	public WebElement kolonaOsnovicaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Dana kašnjenja']")
	public WebElement kolonaDanaKasnjenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos']")
	public WebElement kolonaIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PDV stopa']")
	public WebElement kolonaPdvStopaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poreski obveznik']")
	public WebElement kolonaPoreskiObveznikWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Storno']")
	public WebElement kolonaStornoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj telefona']")
	public WebElement kolonaBrojTelefonaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj mobilnog telefona']")
	public WebElement kolonaBrojMobilnogTelefonaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum knjiženja']")
	public WebElement kolonaDatumKnjizenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Duguje']")
	public WebElement kolonaDugujeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Potražuje']")
	public WebElement kolonaPotrazujeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Preostalo']")
	public WebElement kolonaPreostaloWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Banka']")
	public WebElement kolonaBankaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj izvoda']")
	public WebElement kolonaBrojIzvodaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum izvoda']")
	public WebElement kolonaDatumIzvodaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj uplata']")
	public WebElement kolonaBrojUplataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos uplata']")
	public WebElement kolonaIznosUplataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj neraspoređenih uplata']")
	public WebElement kolonaBrojNerasporedjenihUplataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos neraspoređenih uplata']")
	public WebElement kolonaIznosNerasporedjenihUplataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Za zaključenje']")
	public WebElement kolonaZaZakljucenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Povrat sredstava']")
	public WebElement kolonaPovratSredstavaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Uplatilac']")
	public WebElement kolonaUplatilacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zadnja izmjena']")
	public WebElement kolonaZadnjaIzmjenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zaključena']")
	public WebElement kolonaZakljucenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Preknjižavanje']")
	public WebElement kolonaPreknjizavanjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Uplatio']") // imamo kolonu Uplatilac
	public WebElement kolonaUplatioWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Cjelokupan iznos']")
	public WebElement kolonaCjelokupanIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Neiskorišteni iznos']")
	public WebElement kolonaNeiskoristeniIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kupac ne želi prebacivanje avansa na druga mjm.']")
	public WebElement kolonaKupacNeZeliWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'U dugu na drugom mjm.']")
	public WebElement kolonaUDuguNaDrugaMjmWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj ugovora']")
	public WebElement kolonaBrojUgovoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum potpisa']")
	public WebElement kolonaDatumPotpisaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Rok za plaćanje prve rate']")
	public WebElement kolonaRokZaPlacanjePrveRateWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Glavnica']")
	public WebElement kolonaGlavnicaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj rata']")
	public WebElement kolonaBrojRataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos rate']")
	public WebElement kolonaIznosRateWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos prve rate']")
	public WebElement kolonaIznosPrveRateWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Otkazano']")
	public WebElement kolonaOtkazanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Početne cifre žiro računa']")
	public WebElement kolonaPocetneCifreZiroRacunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'E-mail za trajni nalog']")
	public WebElement kolonaEmailZaTrajniNalogWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Email za trajni nalog']")
	public WebElement kolonaEmailZaTrajniNalog1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna']")
	public WebElement kolonaAktivnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv banke']")
	public WebElement kolonaNazivBankeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj žiro računa']")
	public WebElement kolonaBrojZiroRacunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period generisanja']")
	public WebElement kolonaPeriodGenerisanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period duga od']")
	public WebElement kolonaPeriodDugaOdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period duga do']")
	public WebElement kolonaPeriodDugaDoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Rok za izmirenje (dana)']")
	public WebElement kolonaRokZaIzmirenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Dug plaćen']")
	public WebElement kolonaDugPlacenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Štampa uz račun']")
	public WebElement kolonaStampaUzRacunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period opominjanja']")
	public WebElement kolonaPeriodOpominjanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj protokola']")
	public WebElement kolonaBrojProtokolaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zahtijevani datum isključenja']")
	public WebElement kolonaZahtjevaniDatumIskljucenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj stavki']")
	public WebElement kolonaBrojStavkiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj prihvaćenih stavki']")
	public WebElement kolonaBrojPrihvacenihStavkiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj osporenih stavki']")
	public WebElement kolonaBrojOsporenihStavkiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj djelimično osporenih stavki']")
	public WebElement kolonaBrojDjelimicnoOsporenihStavkiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Sve stavke zahtjeva poslane']")
	public WebElement kolonaSveStavkePoslaneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum isključenja']")
	public WebElement kolonaDatumIskljucenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum uključenja']")
	public WebElement kolonaDatumUkljucenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog isključenja']")
	public WebElement kolonaRazlogIskljucenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zahtijevani datum uključenja']")
	public WebElement kolonaZahtjevaniDatumUkljucenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum početka obračuna kamate']")
	public WebElement kolonaDatumPocetkaObracunaKamateWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos tužbenog zahtjeva']")
	public WebElement kolonaIznosTuzbenogZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Presudbeni iznos']")
	public WebElement kolonaPresudbeniIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ostalo neutuženo']")
	public WebElement kolonaOstaloNeutuzenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'U toku']")
	public WebElement kolonaUTokuWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum zahtjeva']")
	public WebElement kolonaDatumZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Dug po rješenju']")
	public WebElement kolonaDugPoRjesenjuWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Uvaženo po rješenju']")
	public WebElement kolonaUvazenoPoRjesenjuWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog otpisa potraživanja']")
	public WebElement kolonaRazlogOtpisaPotrazivanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj obrasca']")
	public WebElement kolonaBrojObrascaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Planirani datum isključenja od']")
	public WebElement kolonaPlaniraniDatumIskljucenjaOdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Planirani datum isključenja do']")
	public WebElement kolonaPlaniraniDatumIskljucenjaDoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog neizvršavanja']")
	public WebElement kolonaRazlogNeizvrsavanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Plaćeni dugovi']")
	public WebElement kolonaPlaceniDugoviWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poslano']")
	public WebElement kolonaPoslanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Isključen']")
	public WebElement kolonaIskljucenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjerno mjesto']")
	public WebElement kolonaMjernoMjestoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prefiks']")
	public WebElement kolonaPrefiksWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Sektor djelatnosti']")
	public WebElement kolonaSektorDjelatnostiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Država']")
	public WebElement kolonaDrzavaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Organizacija']")
	public WebElement kolonaOrganizacijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Šifra']")
	public WebElement kolonaSifraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Terenska jedinica']")
	public WebElement kolonaTerenskaJedinicaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ime']")
	public WebElement kolonaImeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Korisničko ime']")
	public WebElement kolonaKorisnickoImeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'ODS ograničenje']")
	public WebElement kolonaOdsOgranicenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prezime']")
	public WebElement kolonaPrezimeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Fizička lokacija']")
	public WebElement kolonaFizickaLokacijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Monter']")
	public WebElement kolonaMonterWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vlasnik']")
	public WebElement kolonaVlasnikWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prenosni odnos']")
	public WebElement kolonaPrenosniOdnosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Omjer prenosa']")
	public WebElement kolonaOmjerPrenosaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ebix šifra']")
	public WebElement kolonaEbixSifraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ugovoreni naziv']")
	public WebElement kolonaUgovoreniNazivWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivni ugovor']")
	public WebElement kolonaAktivniUgovorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trafostanica']")
	public WebElement kolonaTrafoStanicaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Čitački hod']")
	public WebElement kolonaCitackiHodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Pod naponom']")
	public WebElement kolonaPodNaponomWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivan ugovor']")
	public WebElement kolonaAktivanUgovorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Redni broj']")
	public WebElement kolonaRedniBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Redni broj izlaza na trafostanici']")
	public WebElement kolonaRedniBrojIzlazaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kontrolno mjerno mjesto']")
	public WebElement kolonaKontrolnoMjernoMjestoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv mjernog mjesta']")
	public WebElement kolonaNazivMjernogMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obračunski ugovor']")
	public WebElement kolonaObracunskiUgovorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta zapisa']")
	public WebElement kolonaVrstaZapisaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Konstanta']")
	public WebElement kolonaKonstantaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stanje AVT']")
	public WebElement kolonaStanjeAVTWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Utrošak AVT']")
	public WebElement kolonaUtrosakAVTWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stanje AMT']")
	public WebElement kolonaStanjeAMTWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Utrošak AMT']")
	public WebElement kolonaUtrosakAMTWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stanje RVT']")
	public WebElement kolonaStanjeRVTWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Utrošak RVT']")
	public WebElement kolonaUtrosakRVTWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stanje RMT']")
	public WebElement kolonaStanjeRMTWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Utrošak RMT']")
	public WebElement kolonaUtrosakRMTWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stanje snage']")
	public WebElement kolonaStanjeSnageWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Utrošak snage']")
	public WebElement kolonaUtrosakSnageWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Cjenovna kat.']")
	public WebElement kolonaCjenovnaKatWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Preregistracija']")
	public WebElement kolonaPreregistracijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Dopuna']")
	public WebElement kolonaDopunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Potvrđen']")
	public WebElement kolonaPotvrdjenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Potvr.']")
	public WebElement kolonaPotvrWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Otkazan']")
	public WebElement kolonaOtkazanWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Proknjižen']")
	public WebElement kolonaProknjizenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poslan']")
	public WebElement kolonaPoslanWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zahtijevani datum završetka']")
	public WebElement kolonaZahtjevaniDatumZavrsetkaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog zahtjeva za raskid ugovora']")
	public WebElement kolonaRazlogZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odbijen']")
	public WebElement kolonaOdbijenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nosilac - kupac']")
	public WebElement kolonaNosilacKupacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nosilac - mjerno mjesto (EIC)']")
	public WebElement kolonaNosilacMjernoMjestoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj aktivnih članova']")
	public WebElement kolonaBrojAktivnihClanovaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kupac - nosilac']")
	public WebElement kolonaKupacNosilacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjerno mjesto - nosilac']")
	public WebElement kolonaMjernoMjestoNosilacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obrazac']")
	public WebElement kolonaObrazacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Primaoci']")
	public WebElement kolonaPrimaociWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrijeme obavještenja']")
	public WebElement kolonaVrijemeObavjestenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snabdjevač']")
	public WebElement kolonaSnabdjevacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Realiz.']")
	public WebElement kolonaRealizWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odb.']")
	public WebElement kolonaOdbWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Otk.']")
	public WebElement kolonaOtkWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Posl.']")
	public WebElement kolonaPoslWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Inicirao snabdj.']")
	public WebElement kolonaIniciraoSnabdjWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obavj. kupac']")
	public WebElement kolonaObavjKupacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zavr.']")
	public WebElement kolonaZavrWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Isklj. realiz.']")
	public WebElement kolonaIskljRealizWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zahtjev završen']")
	public WebElement kolonaZahtjevZavrsenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Uključenje realizovano']")
	public WebElement kolonaUkljucenjeRealizovanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ebix kod']")
	public WebElement kolonaEbixKodWE;
	
	@FindBy(xpath =  "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj brojila']")
	public WebElement kolonaBrojBrojilaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj državne plombe']")
	public WebElement kolonaBrojDrzavnePlombeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip brojila']")
	public WebElement kolonaTipBrojilaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Godina isteka žiga']")
	public WebElement kolonaGodinaIstekaZigaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Godina proizvodnje']")
	public WebElement kolonaGodinaProizvodnjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vlasništvo']")
	public WebElement kolonaVlasnistvoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj faza']")
	public WebElement kolonaBrojFazaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj tarifa']")
	public WebElement kolonaBrojTarifaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Redni broj u registru']")
	public WebElement kolonaRedniBrojURegistruWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nivo struje']")
	public WebElement kolonaNivoStrujeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj skala']")
	public WebElement kolonaBrojSkalaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj cifara']")
	public WebElement kolonaBrojCifaraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj dec. cifara']")
	public WebElement kolonaBrojDecCifaraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj cifara maksigrafa']")
	public WebElement kolonaBrojCifaraMaksigrafaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj dec. cifara maksigrafa']")
	public WebElement kolonaBrojDecCifaraMaksigrafaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Klasa tačnosti aktivne en.']")
	public WebElement kolonaKlasaTacnostiAktivneEnWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Klasa tačnosti reaktivne en.']")
	public WebElement kolonaKlasaTacnostiReaktivneEnWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Klasa tačnosti snage']")
	public WebElement kolonaKlasaTacnostiSnageWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjeri aktivnu en.']")
	public WebElement kolonaMjeriAktivnuEnWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjeri reaktivnu en.']")
	public WebElement kolonaMjeriReaktivnuEnWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjeri snagu']")
	public WebElement kolonaMjeriSnaguWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Validan']")
	public WebElement kolonaValidanWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AMM integrisano']")
	public WebElement kolonaAmmIntegrisanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'DLMS integrisano']")
	public WebElement kolonaDlmsIntegrisanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Lokacija']")
	public WebElement kolonaLokacijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog promjene lokacije']")
	public WebElement kolonaRazlogPromjeneLokacijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Validnost']")
	public WebElement kolonaValidnostWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nivo trafostanice']")
	public WebElement kolonaNivoTrafostaniceWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta očitanja']")
	public WebElement kolonaVrstaOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Čitač']")
	public WebElement kolonaCitacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Korisnik']")
	public WebElement kolonaKorisnikWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Procijenjeno']")
	public WebElement kolonaProcijenjenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum korigovanog očitanja']")
	public WebElement kolonaDatumKorigovanogOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stari AVT -> Novi AVT']")
	public WebElement kolonaStariNoviAvtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stari AMT -> Novi AMT']")
	public WebElement kolonaStariNoviAmtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stari RVT -> Novi RVT']")
	public WebElement kolonaStariNoviRvtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stari RMT -> Novi RMT']")
	public WebElement kolonaStariNoviRmtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stara snaga -> Nova snaga']")
	public WebElement kolonaStaraNovaSnagaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum prvog očitanja']")
	public WebElement kolonaDatumPrvogOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum zadnjeg očitanja']")
	public WebElement kolonaDatumZadnjegOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Izvor očitanja']")
	public WebElement kolonaIzvorOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Uspješno importovano']")
	public WebElement kolonaUspjesnoImportovanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj pogrešnih unosa']")
	public WebElement kolonaBrojPogresnihUnosaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj unosa bez vrijednosti sa napomenom']")
	public WebElement kolonaBrojUnosaBezVrijednostiSaNapomenomWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broja unosa bez vrijednosti i bez napomene']")
	public WebElement kolonaBrojUnosaBezVrijednostBezNapomeneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nevalidna očitanja']")
	public WebElement kolonaNevalidnaOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog']")
	public WebElement kolonaRazlogWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poruka čitača']")
	public WebElement kolonaPorukaCitacaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zbirno/kontrolno očitanje']")
	public WebElement kolonaZbirnoKontrolnoOcitanjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Riješeno']")
	public WebElement kolonaRijesenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period očitanja']")
	public WebElement kolonaPeriodOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupan broj stavki']")
	public WebElement kolonaUkupanBrojStavkiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj očitanih stavki']")
	public WebElement kolonaBrojOcitanihStavkiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Neočitani sa porukom']")
	public WebElement kolonaNeocitaniSaPorukomWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Neočitani']")
	public WebElement kolonaNeocitaniWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Od rednog broja']")
	public WebElement kolonaOdRedgnoBrojaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Do rednog broja']")
	public WebElement kolonaDoRednogBrojaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kvalifikovani čitač']")
	public WebElement kolonaKvalifikovaniCitacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zbirno/kontrolno mjerno mjesto']")
	public WebElement kolonaZbirnoKontrolnoMjernoMjestoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna obračun']")
	public WebElement kolonaAktivnaObracunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivna obračun']")
	public WebElement kolonaReaktivnaObracunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlika aktivna']")
	public WebElement kolonaRazlikaAktivnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlika aktivna %']")
	public WebElement kolonaRazlikaAktivna1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlika reaktivna']")
	public WebElement kolonaRazlikaReaktivnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlika reaktivna %']")
	public WebElement kolonaRazlikaReaktivna1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna-Korekcije u periodu']")
	public WebElement kolonaAktivnaKorekcijeUPerioduWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivna-Korekcije u periodu']")
	public WebElement kolonaReaktivnaKorekcijeUPerioduWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna-Korekcije za periodu']")
	public WebElement kolonaAktivnaKorekcijeZaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivna-Korekcije u periodu']")
	public WebElement kolonaReaktivnaKorekcijeZaPeriodWE;
	
	
	// test comment
	// test comment 2
	
	
	
}