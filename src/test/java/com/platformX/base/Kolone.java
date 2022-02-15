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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj lične karte']")
	public WebElement kolonaBrojLicneKarteWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PIB']")
	public WebElement kolonaPIBWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ulica']")
	public WebElement kolonaUlicaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'SAP šifra']")
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
	
	@FindBy(xpath = "//*[contains(text(), 'En')]")
	public WebElement kolonaEnWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Obnovljivi izvori')]")
	public WebElement kolonaObnovljiviIzvoriWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Obn. izvori')]")
	public WebElement kolonaObnIzvoriWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Naknada za snabdijevanje')]")
	public WebElement kolonaNaknadaZaSnabdijevanjeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Naknada za snabd.')]")
	public WebElement kolonaNaknadaZaSnabdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ukupan iznos')]")
	public WebElement kolonaUkupanIznosWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Uk. iznos')]")
	public WebElement kolonaUkIznosWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Proknjiženo')]")
	public WebElement kolonaProknjizenoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Proknj.')]")
	public WebElement kolonaProknjWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mrežarina')]")
	public WebElement kolonaMrezarina2WE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mrež.')]")
	public WebElement kolonaMrezWE;
	
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
	
	@FindBy(xpath = "//*[contains(text(), 'Banka')]")
	public WebElement kolonaBankaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj izvoda')]")
	public WebElement kolonaBrojIzvodaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum izvoda')]")
	public WebElement kolonaDatumIzvodaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj uplata')]")
	public WebElement kolonaBrojUplataWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Iznos uplata')]")
	public WebElement kolonaIznosUplataWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj neraspoređenih uplata')]")
	public WebElement kolonaBrojNerasporedjenihUplataWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Iznos neraspoređenih uplata')]")
	public WebElement kolonaIznosNerasporedjenihUplataWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Za zaključenje')]")
	public WebElement kolonaZaZakljucenjeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Povrat sredstava')]")
	public WebElement kolonaPovratSredstavaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Uplatilac')]")
	public WebElement kolonaUplatilacWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Zadnja izmjena')]")
	public WebElement kolonaZadnjaIzmjenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Zaključena')]")
	public WebElement kolonaZakljucenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Preknjižavanje')]")
	public WebElement kolonaPreknjizavanjeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Uplatio')]") // imamo kolonu Uplatilac
	public WebElement kolonaUplatioWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Cjelokupan iznos')]")
	public WebElement kolonaCjelokupanIznosWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Neiskorišteni iznos')]")
	public WebElement kolonaNeiskoristeniIznosWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kupac ne želi prebacivanje avansa na druga mjm.')]")
	public WebElement kolonaKupacNeZeliWE;
	
	@FindBy(xpath = "//*[contains(text(), 'U dugu na drugom mjm.')]")
	public WebElement kolonaUDuguNaDrugaMjmWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj ugovora')]")
	public WebElement kolonaBrojUgovoraWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum potpisa')]")
	public WebElement kolonaDatumPotpisaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Rok za plaćanje prve rate')]")
	public WebElement kolonaRokZaPlacanjePrveRateWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Glavnica')]")
	public WebElement kolonaGlavnicaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj rata')]")
	public WebElement kolonaBrojRataWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Iznos rate')]")
	public WebElement kolonaIznosRateWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Iznos prve rate')]")
	public WebElement kolonaIznosPrveRateWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Otkazano')]")
	public WebElement kolonaOtkazanoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Početne cifre žiro računa')]")
	public WebElement kolonaPocetneCifreZiroRacunaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'E-mail za trajni nalog')]")
	public WebElement kolonaEmailZaTrajniNalogWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Email za trajni nalog')]")
	public WebElement kolonaEmailZaTrajniNalog1WE;
	
	@FindBy(xpath = "//*[contains(text(), 'Aktivna')]")
	public WebElement kolonaAktivnaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Naziv banke')]")
	public WebElement kolonaNazivBankeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj žiro računa')]")
	public WebElement kolonaBrojZiroRacunaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Period generisanja')]")
	public WebElement kolonaPeriodGenerisanjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Period duga od')]")
	public WebElement kolonaPeriodDugaOdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Period duga do')]")
	public WebElement kolonaPeriodDugaDoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Rok za izmirenje (dana)')]")
	public WebElement kolonaRokZaIzmirenjeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Dug plaćen')]")
	public WebElement kolonaDugPlacenWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Štampa uz račun')]")
	public WebElement kolonaStampaUzRacunWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Period opominjanja')]")
	public WebElement kolonaPeriodOpominjanjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj protokola')]")
	public WebElement kolonaBrojProtokolaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Zahtjevani datum isključenja')]")
	public WebElement kolonaZahtjevaniDatumIskljucenjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj stavki')]")
	public WebElement kolonaBrojStavkiWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Sve stavke zahtjeva poslane')]")
	public WebElement kolonaSveStavkePoslaneWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum isključenja')]")
	public WebElement kolonaDatumIskljucenjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum uključenja')]")
	public WebElement kolonaDatumUkljucenjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Razlog isključenja')]")
	public WebElement kolonaRazlogIskljucenjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Zahtjevani datum uključenja')]")
	public WebElement kolonaZahtjevaniDatumUkljucenjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum početka obračuna kamate')]")
	public WebElement kolonaDatumPocetkaObracunaKamateWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Iznos tužbenog zahtjeva')]")
	public WebElement kolonaIznosTuzbenogZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Presudbeni iznos')]")
	public WebElement kolonaPresudbeniIznosWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Ostalo neutuženo')]")
	public WebElement kolonaOstaloNeutuzenoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'U toku')]")
	public WebElement kolonaUTokuWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum zahtjeva')]")
	public WebElement kolonaDatumZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Dug po rješenju')]")
	public WebElement kolonaDugPoRjesenjuWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Uvaženo po rješenju')]")
	public WebElement kolonaUvazenoPoRjesenjuWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Razlog otpisa potraživanja')]")
	public WebElement kolonaRazlogOtpisaPotrazivanjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Broj obrasca')]")
	public WebElement kolonaBrojObrascaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Planirani datum isključenja od')]")
	public WebElement kolonaPlaniraniDatumIskljucenjaOdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Planirani datum isključenja do')]")
	public WebElement kolonaPlaniraniDatumIskljucenjaDoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Razlog neizvršavanja')]")
	public WebElement kolonaRazlogNeizvrsavanjaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Plaćeni dugovi')]")
	public WebElement kolonaPlaceniDugoviWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Poslano')]")
	public WebElement kolonaPoslanoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Isključen')]")
	public WebElement kolonaIskljucenWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mjerno mjesto')]")
	public WebElement kolonaMjernoMjestoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Prefiks')]")
	public WebElement kolonaPrefiksWE;
	
}