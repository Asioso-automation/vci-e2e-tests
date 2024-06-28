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
	
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'E-mail']")
	public WebElement kolonaEmail2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Internet adresa']")
	public WebElement kolonaInternetAdresaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Call centar']")
	public WebElement kolonaCallCentarWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Žiro račun']")
	public WebElement kolonaZiroRacunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kod']")
	public WebElement kolonaKodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'EIC']")
	public WebElement kolonaEicWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Sap mjesto troška']")
	public WebElement kolonaSapMjestoTroskaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mj. mjesto (EIC)']")
	public WebElement kolonaMjMjestoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'ODS']")
	public WebElement kolonaOdsWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum importa']")
	public WebElement kolonaDatumImportaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv fajla']")
	public WebElement kolonaNazivFajlaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Telefon za prijavu kvara']")
	public WebElement kolonaTelefonZaPrijavuKvaraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Telefon za informacije o uslugama']")
	public WebElement kolonaTelefonZaInformacijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Telefon za prigovore na račun']")
	public WebElement kolonaTelefonZaPrigovoreWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Šifra djelatnosti']")
	public WebElement kolonaSifraDjelatnostiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Grupa djelatnosti']")
	public WebElement kolonaGrupaDjelatnostiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Entitet']")
	public WebElement kolonaEntitetWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Opština']")
	public WebElement kolonaOpstinaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Štampani naziv']")
	public WebElement kolonaStampaniNazivWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Štampani naziv na dokumentima']")
	public WebElement kolonaStampaniNazivNaDokWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivna preuzeta']")
	public WebElement kolonaReaktivnaPreuzetaWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip obračuna']")
	public WebElement kolonaTipObracunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta mrežarine']")
	public WebElement kolonaVrstaMrezarineWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Opseg potrošnje']")
	public WebElement kolonaOpsegPotrosnjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Cijena']")
	public WebElement kolonaCijenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Fiksna cijena']")
	public WebElement kolonaFiksnaCijenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PDV (%)']")
	public WebElement kolonaPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PDV']")
	public WebElement kolonaPdv1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Cijena mrežarine']")
	public WebElement kolonaCijenaMrezarineWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Cijena energije']")
	public WebElement kolonaCijenaEnergijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Cijena snage']")
	public WebElement kolonaCijenaSnageWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'U stečaju']")
	public WebElement kolonaUStecajuWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ime i Prezime']")
	public WebElement kolonaImeIPrezimeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ime i prezime']")
	public WebElement kolonaImeIprezimeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj lične karte']")
	public WebElement kolonaBrojLicneKarteWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PIB']")
	public WebElement kolonaPIBWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'SAP šifra']")
	public WebElement kolonaSAPSifraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum slanja']")
	public WebElement kolonaDatumSlanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum odbijanja']")
	public WebElement kolonaDatumOdbijanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog odbijanja']")
	public WebElement kolonaRazlogOdbijanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Inicirao snabdjevač']")
	public WebElement kolonaIniciraoSnabdjevacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Novi snabdjevač']")
	public WebElement kolonaNoviSnabdjevacWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv mj. mjesta']")
	public WebElement kolonaNazivMjMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'T.G.']")
	public WebElement kolonaTGWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trenutna t.g.']")
	public WebElement kolonaTrenutnaTGWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trenutno brojilo']")
	public WebElement kolonaTrenutnoBrojiloWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trenutna konst.']")
	public WebElement kolonaTrenutnaKonstWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Adresa mj. mjesta']")
	public WebElement kolonaAdresaMjMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip']")
	public WebElement kolonaTipWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Početak primjene']")
	public WebElement kolonaPocetakPrimjeneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Završetak primjene']")
	public WebElement kolonaZavrsetakPrimjeneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Važi od']")
	public WebElement kolonaVaziOdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Važi do']")
	public WebElement kolonaVaziDoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Potp.']")
	public WebElement kolonaPotpWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'ODS aneks.']")
	public WebElement kolonaOdsAneksWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Serijski broj']")
	public WebElement kolonaSerijskiBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ugovor']")
	public WebElement kolonaUgovorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kupac']")
	public WebElement kolonaKupacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjerno mjesto (EIC)']")
	public WebElement kolonaMjernoMjestoEicWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjerno mjesto']")
	public WebElement kolonaMjernoMjestoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nedostupno mjm.']")
	public WebElement kolonaNedostupnoMjmWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kontrola očitanja']")
	public WebElement kolonaKontrolaOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum kreiranja']")
	public WebElement kolonaDatumKreiranjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum završavanja']")
	public WebElement kolonaDatumZavrsavanjaWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta zahtjeva']")
	public WebElement kolonaVrstaZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Br. protokola']")
	public WebElement kolonaBrProtokolaWE;

	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj sudskog predmeta']")
	public WebElement kolonaBrojSudskogPredmetaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Referent']")
	public WebElement kolonaReferentWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos sudskih taksi']")
	public WebElement kolonaIznosSudskihTaksiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Sudski broj']")
	public WebElement kolonaSudskiBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vanbilansni tip']")
	public WebElement kolonaVanbilansniTipWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Finansijske izmjene']")
	public WebElement kolonaFinasijskeIzmjeneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum prijave']")
	public WebElement kolonaDatumPrijaveWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum presude']")
	public WebElement kolonaDatumPresudeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum rješenja']")
	public WebElement kolonaDatumRjesenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta isporuke']")
	public WebElement kolonaVrstaIsporukeWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Inicirao kupac']")
	public WebElement kolonaIniciraoKupacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Brojilo']")
	public WebElement kolonaBrojiloWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum']")
	public WebElement kolonaDatumWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum apliciranja']")
	public WebElement kolonaDatumApliciranjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AVT']")
	public WebElement kolonaAvtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AMT']")
	public WebElement kolonaAmtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'RVT']")
	public WebElement kolonaRvtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'RMT']")
	public WebElement kolonaRmtWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trenutni tip ugovora']")
	public WebElement kolonaTrenutniTipUgovoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Način slanja']")
	public WebElement kolonaNacinSlanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kreirao']")
	public WebElement kolonaKreiraoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obrisan']")
	public WebElement kolonaObrisanWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip ugovora - domaćinstvo']")
	public WebElement kolonaTipUgovoraDomacinstvoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip ugovora - privreda']")
	public WebElement kolonaTipUgovoraPrivredaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna energija (kWh)']")
	public WebElement kolonaAktivnaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktvina energija (kWh)']") // typo: reaktvina
	public WebElement kolonaReaktivnaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga (kW)']")
	public WebElement kolonaSnagaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga']")
	public WebElement kolonaSnaga1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Priključna snaga (kW)']")
	public WebElement kolonaPrikljucnaSnagaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga preuzeta']")
	public WebElement kolonaSnagaPreuzetaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga pretvarača']")
	public WebElement kolonaSnagaPretvaracaWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Arhivirano']")
	public WebElement kolonaArhiviranoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Analiziran']")
	public WebElement kolonaAnaliziranWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poziv na broj']")
	public WebElement kolonaPozivNaBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos bez PDV']")
	public WebElement kolonaIznosBezPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos sa PDV']")
	public WebElement kolonaIznosSaPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Očekivani datum početka ugovora']")
	public WebElement kolonaOcekivaniDatumPocetkaUgovoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Očekivani datum završetka obračunskog ugovora']")
	public WebElement kolonaOcekivaniDatumZavrsetkaUgovoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum završetka obračunskog ugovora']")
	public WebElement kolonaDatumZavrsetkaUgovoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prom. snabd.']")
	public WebElement kolonaPromSnabdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Preth. snabd. obav.']")
	public WebElement kolonaPrethSnabObavWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Preth. snabd. potvr.']")
	public WebElement kolonaPrethSnabPotvrWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Preth. snabd. odbio']")
	public WebElement kolonaPrethSnabOdbioWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prom. tarifne grupe']")
	public WebElement kolonaPromTarifneGrupeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kamata']")
	public WebElement kolonaKamataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupno']")
	public WebElement kolonaUkupnoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Plaćen']")
	public WebElement kolonaPlacenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip Korekcije']") // K
	public WebElement kolonaTipKorekcijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'En.']")
	public WebElement kolonaEnWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obn. izvori']")
	public WebElement kolonaObnIzvoriWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trenutni snabd.']")
	public WebElement kolonaTrenutniSnabdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naknada za snabd.']")
	public WebElement kolonaNaknadaZaSnabdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zaj. potr.']")
	public WebElement kolonaZajPotrWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupan iznos']")
	public WebElement kolonaUkupanIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Uk. iznos']")
	public WebElement kolonaUkIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Proknjiženo']")
	public WebElement kolonaProknjizenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Proknj.']")
	public WebElement kolonaProknjWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prouzrokovana']")
	public WebElement kolonaProuzrokovanaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Sporna']")
	public WebElement kolonaSpornaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Promjena članova ZP']")
	public WebElement kolonaPromjenaClanovaZpWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stopa PDV-a']")
	public WebElement kolonaStopaPdvWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Otkazano']")
	public WebElement kolonaOtkazanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Početne cifre žiro računa']")
	public WebElement kolonaPocetneCifreZiroRacunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'E-mail za trajni nalog']")
	public WebElement kolonaEmailZaTrajniNalog1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna']")
	public WebElement kolonaAktivnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna preuzeta']")
	public WebElement kolonaAktivnaPreuzetaWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Po radnom nalogu']")
	public WebElement kolonaPoRadnomNaloguWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip mjerenja']")
	public WebElement kolonaTipMjerenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta objekta']")
	public WebElement kolonaVrstaObjektaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrsta područja']")
	public WebElement kolonaVrstaPodrucjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip EES']")
	public WebElement kolonaTipEesWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog EES']")
	public WebElement kolonaRazlogEesWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Elektroenergetska saglasnost']")
	public WebElement kolonaElektroenergetskaSaglasnostWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'EES']")
	public WebElement kolonaEesWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kategorija priključka']")
	public WebElement kolonaKategorijaPrikljuckaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trofazni priključak']")
	public WebElement kolonaTrofazniPrikljucakWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Deklaracija za ugovor']")
	public WebElement kolonaDeklaracijaZaUgovorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivirana']")
	public WebElement kolonaAktiviranaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktiviran']")
	public WebElement kolonaAktiviranWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum pravosnažnosti']")
	public WebElement kolonaDatumPravosnaznostiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Iznos tužbenog zahtjeva']")
	public WebElement kolonaIznosTuzbenogZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Presudbeni iznos']")
	public WebElement kolonaPresudbeniIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ostalo neutuženo']")
	public WebElement kolonaOstaloNeutuzenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'U toku']")
	public WebElement kolonaUTokuWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Status']")
	public WebElement kolonaStatusWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Status reklamacije']")
	public WebElement kolonaStatusReklamacijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tip vrste reklamacije']")
	public WebElement kolonaTipVrsteReklamacijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupan broj fajlova']")
	public WebElement kolonaUkupanBrojFajlovaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj generisanih fajlova']")
	public WebElement kolonaBrojGenerisanihFajlovaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Štampanje izvoda otvorenih stavki']")
	public WebElement kolonaStampanjeIzvodaOtvorenihStavkiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Štampanje obavještenja o prestanku važenja ugovora']")
	public WebElement kolonaStampanjeObavjestenjaOPrestankuVazenjaUgovoraWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Postoji zahtjev za uključenje']")
	public WebElement kolonaPostojiZahtjevZaUkljucenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zahtjev za isključenje']")
	public WebElement kolonaZahtjevZaIskljucenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog neizvršavanja']")
	public WebElement kolonaRazlogNeizvrsavanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Plaćeni dugovi']")
	public WebElement kolonaPlaceniDugoviWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poslano']")
	public WebElement kolonaPoslanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poslana']")
	public WebElement kolonaPoslanaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Isključen']")
	public WebElement kolonaIskljucenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prefiks']")
	public WebElement kolonaPrefiksWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Država']")
	public WebElement kolonaDrzavaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Organizacija']")
	public WebElement kolonaOrganizacijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Šifra/ED broj']")
	public WebElement kolonaSifraEdBrojWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Fizička lokacija mjm.']")
	public WebElement kolonaFizickaLokacijaMjmWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Indirektno mjerno mjesto (EIC)']")
	public WebElement kolonaIndirektnoMjernoMjestoEICWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv indirektnog mjm.']")
	public WebElement kolonaNazivIndirektnogMjmWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Fizička lokacija indirektnog mjm.']")
	public WebElement kolonaFizickaLokacijaIndirektnogMjmWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog kontrole']")
	public WebElement kolonaRazlogKontroleWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Završena']")
	public WebElement kolonaZavrsenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivno']")
	public WebElement kolonaAktivnoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Monter']")
	public WebElement kolonaMonterWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vlasnik']")
	public WebElement kolonaVlasnikWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prenosni odnos']")
	public WebElement kolonaPrenosniOdnosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj transformatora (komada)']")
	public WebElement kolonaBrojTransformatoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ebix šifra']")
	public WebElement kolonaEbixSifraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ugovoreni naziv']")
	public WebElement kolonaUgovoreniNazivWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trafostanica']")
	public WebElement kolonaTrafostanicaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Redni broj izlaza na trafostanici']")
	public WebElement kolonaRedniBrojIzlazaNaTrafostaniciWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Čitački hod']")
	public WebElement kolonaCitackiHodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zona']")
	public WebElement kolonaZonaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Sektor']")
	public WebElement kolonaSektorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Pod naponom']")
	public WebElement kolonaPodNaponomWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivan ugovor']")
	public WebElement kolonaAktivanUgovorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Redni broj']")
	public WebElement kolonaRedniBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kontrolno mjerno mjesto']")
	public WebElement kolonaKontrolnoMjernoMjestoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv mjernog mjesta']")
	public WebElement kolonaNazivMjernogMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trenutni naziv mj. mjesta']")
	public WebElement kolonaTrenutniNazivMjernogMjestaWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zahtijevani datum završetka']")
	public WebElement kolonaZahtjevaniDatumZavrsetkaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog zahtjeva za raskid ugovora']")
	public WebElement kolonaRazlogZahtjevaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odbijen']")
	public WebElement kolonaOdbijenWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odbijena']")
	public WebElement kolonaOdbijenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kvar uklopnog sata']")
	public WebElement kolonaKvarUklopnogSataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Odbačen']")
	public WebElement kolonaOdbacenWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrijeme unosa']")
	public WebElement kolonaVrijemeUnosaWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Inicijalni unos']")
	public WebElement kolonaInicijalniUnosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Korisnik']")
	public WebElement kolonaKorisnikWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Izmjena']")
	public WebElement kolonaIzmjenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ima korekciju']")
	public WebElement kolonaImaKorekcijuWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stari AVT- -> Novi AVT-']")
	public WebElement kolonaStariNoviAvtMinusWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stari AMT- -> Novi AMT-']")
	public WebElement kolonaStariNoviAmtMinusWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj unosa bez vrijednosti i bez napomene']")
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupan broj redova']")
	public WebElement kolonaUkupanBrojRedovaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Redova sa greškom']")
	public WebElement kolonaRedovaSaGreskomWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Fajl grešaka']")
	public WebElement kolonaFajlGresakaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Fajl neproknjiženih korekcija']")
	public WebElement kolonaFajlNeproknjizenihKorekcijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obrađena']")
	public WebElement kolonaObradjenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Postoje korekcije sa nepoznatim računom']")
	public WebElement kolonaPostojeKorekcijeSaNepoznatimRacunomWE;
	
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
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna obračun za period']")
	public WebElement kolonaAktivnaObracunZaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivna obračun za period']")
	public WebElement kolonaReaktivnaObracunZaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlika aktivna']")
	public WebElement kolonaRazlikaAktivnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlika aktivna (%)']")
	public WebElement kolonaRazlikaAktivna1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlika reaktivna']")
	public WebElement kolonaRazlikaReaktivnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna - sa korekcijama za period']")
	public WebElement kolonaAktivnaSaKorekcijamaZaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivna - Korekcije za period']")
	public WebElement kolonaAktivnaKorekcijeZaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivna - Korekcije za period']")
	public WebElement kolonaReaktivnaKorekcijeZaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum prvog očitanja za period']")
	public WebElement kolonaDatumPrvogOcitanjaZaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum posljednjeg očitanja za period']")
	public WebElement kolonaDatumPosljednjegOcitanjaZaPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Adresa mjernog mjesta']")
	public WebElement kolonaAdresaMjernogMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Godišnja potrošnja (kWh)']")
	public WebElement kolonaGodisnjaPotrosnjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj mjernih mjesta']")
	public WebElement kolonaBrojMjernihMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj obračunatih ugovora']")
	public WebElement kolonaBrojObracunatihUgovoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ukupna energija']")
	public WebElement kolonaUkupnaEnergijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Korigovani period']")
	public WebElement kolonaKorigovaniPeriodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Energetski obračun']")
	public WebElement kolonaEnergetskiObracunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naslov']")
	public WebElement kolonaNaslovWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prioritet']")
	public WebElement kolonaPrioritetWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tabela']")
	public WebElement kolonaTabelaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'ID entiteta']")
	public WebElement kolonaIdEntitetaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Izmijenio']")
	public WebElement kolonaIzmijenioWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Vrijednost']")
	public WebElement kolonaVrijednostWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nestandardna usluga']")
	public WebElement kolonaNestandardnaUslugaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nestandardna']")
	public WebElement kolonaNestandardnaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'PDV na nestand. uslugu']")
	public WebElement kolonaPdvNaNestandUsluguWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum realizacije']")
	public WebElement kolonaDatumRealizacijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Razlog uključenja']")
	public WebElement kolonaRazlogUkljucenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum potvrde']")
	public WebElement kolonaDatumPotvrdeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period potvrde']")
	public WebElement kolonaPeriodPotvrdeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Period zaključivanja']")
	public WebElement kolonaPeriodZakljucivanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poziv na plaćanje']")
	public WebElement kolonaPozivNaPlacanjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Potvrđena']")
	public WebElement kolonaPotvrdjenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Predložena za utuženje']")
	public WebElement kolonaPredlozenaZaUtuzenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Finansijske izmjene']")
	public WebElement kolonaFinansijskeIzmjeneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Rok plaćanja (dana)']")
	public WebElement kolonaRokPlacanjaDanaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Ima napomenu']")
	public WebElement kolonaImaNapomenuWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Titula']")
	public WebElement kolonaTitulaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Uslužni centar']")
	public WebElement kolonaUsluzniCentarWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poeni']")
	public WebElement kolonaPoeniWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Anketar']")
	public WebElement kolonaAnketarWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Servisni centar']")
	public WebElement kolonaServisniCentarWE;

	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prijava podnijeta']")
	public WebElement kolonaPrijavaPodnijetaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Tužba']")
	public WebElement tuzbaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum unosa']")
	public WebElement datumUnosaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Količina (kWh)']")
	public WebElement kolonaKolicinaKwhWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj zapisnika']")
	public WebElement kolonaBrojZapisnikaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Datum zapisnika']")
	public WebElement kolonaDatumZapisnikaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Kategorija naponskog nivoa']")
	public WebElement kolonaKategorijaNaponskogNivoaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prikaži prethodno očitanje']")
	public WebElement kolonaPrikaziPrethodnoOcitanjeWE;
	
	// Kolone MONITORING
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjerno mjesto (EIC)']")
	public WebElement kolonaMonMjernoMjestoEicWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'AVT']")
	public WebElement kolonaMonAvtWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'AMT']")
	public WebElement kolonaMonAmtWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'RVT']")
	public WebElement kolonaMonRvtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'RMT']")
	public WebElement kolonaMonRmtWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga']")
	public WebElement kolonaMonSnaga1WE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trafostanica']")
	public WebElement kolonaMonTrafostanicaWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv mjernog mjesta']")
	public WebElement kolonaMonNazivMjernogMjestaWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obračunski ugovor']")
	public WebElement kolonaMonObracunskiUgovorWE;
		
	@FindBy(xpath =  "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj brojila']")
	public WebElement kolonaMonBrojBrojilaWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Čitač']")
	public WebElement kolonaMonCitacWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Adresa mjernog mjesta']")
	public WebElement kolonaMonAdresaMjernogMjestaWE;
		
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AVT neočitano']")
	public WebElement kolonaMonAvtNeocitanoWE;
		
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AMT neočitano']")
	public WebElement kolonaMonAmtNeocitanoWE;
		
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'RVT neočitano']")
	public WebElement kolonaMonRvtNeocitanoWE;
		
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'RMT neočitano']")
	public WebElement kolonaMonRmtNeocitanoWE;
		
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga neočitana']")
	public WebElement kolonaMonSnagaNeocitanaWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stara VT']")
	public WebElement kolonaMonStaraVtWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nova VT']")
	public WebElement kolonaMonNovaVtWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stara MT']")
	public WebElement kolonaMonStaraMtWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nova MT']")
	public WebElement kolonaMonNovaMtWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivno brojilo']")
	public WebElement kolonaMonAktivnoBrojiloWE;
		
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivno brojilo']")
	public WebElement kolonaMonReaktivnoBrojiloWE;
		
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'VT']")
	public WebElement kolonaMonVtWE;
		
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'MT']")
	public WebElement kolonaMonMtWE;
		
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'VT resetovana']")
	public WebElement kolonaMonVtResetovanaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'MT resetovana']")
	public WebElement kolonaMonMtResetovanaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nova potrošnja']")
	public WebElement kolonaMonNovaPotrosnjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prosječna potrošnja']")
	public WebElement kolonaMonProsjecnaPotrosnjaWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Zbirno mjerno mjesto (EIC)']")
	public WebElement kolonaMonZbirnoMjernoMjestoEicWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Brojilo']")
	public WebElement kolonaMonBrojiloWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Terenska jedinica']")
	public WebElement kolonaMonTerenskaJedinicaWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Fizička lokacija']")
	public WebElement kolonaMonFizickaLokacijaWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Poruka čitača']")
	public WebElement kolonaMonPorukaCitacaWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Procenat odstupanja']")
	public WebElement kolonaMonProcenatOdstupanjaWE;
	
	
	// Kolone SCP
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'ID']")
	public WebElement kolonaId1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Naziv']")
	public WebElement kolonaNaziv1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Pošta']")
	public WebElement kolonaPosta1WE;

	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Mjesto']")
	public WebElement kolonaMjesto1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Kategorija']")
	public WebElement kolonaKategorija1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Adresa']")
	public WebElement kolonaAdresa1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Telefon']")
	public WebElement kolonaTelefon1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Fax']")
	public WebElement kolonaFax1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Email']")
	public WebElement kolonaEmail1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Država']")
	public WebElement kolonaDrzava1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Entitet']")
	public WebElement kolonaEntitet1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Šifra']")
	public WebElement kolonaSifra1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ulazi u obračun']")
	public WebElement kolonaUlaziUObracunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Spremna za obračun']")
	public WebElement kolonaSpremnaZaObracunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Atmosferski pritisak']")
	public WebElement kolonaAtmosferskiPritisakWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Pritisak atmosferski']")
	public WebElement kolonaPritisakAtmosferskiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Pritisak pogonski']")
	public WebElement kolonaPritisakPognoskiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Način obračuna korekcije']")
	public WebElement kolonaNacinObracunaKorekcijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Kontakt']")
	public WebElement kolonaKontaktWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Oznaka']")
	public WebElement kolonaOznakaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Naknada za obračun bez PDV']")
	public WebElement kolonaNaknadaZaObracunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Naknada za odvodjenje bez PDV']")
	public WebElement kolonaNaknadaZaOdvodjenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Naziv vodomjera']")
	public WebElement kolonaNazivVodomjeraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vodomjer potrosnja']")
	public WebElement kolonaVodomjerPotrosnjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Indirektni vodomjer']")
	public WebElement kolonaIndirektniVodomjerWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Indirektni vodomjer potrosnja']")
	public WebElement kolonaIndirektniVodomjerPotrosnjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Zona očitanja']")
	public WebElement kolonaZonaOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Zona očitanja ID']")
	public WebElement kolonaZonaOcitanjaIdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Početak Grijanja']")
	public WebElement kolonaPocetakGrijanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Kraj Grijanja']")
	public WebElement kolonaKrajGrijanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Grejna sezona naziv']")
	public WebElement kolonaGrejnaSezonaNazivWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Zona očitanja naziv']")
	public WebElement kolonaZonaOcitanjaNazivWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj stavki']")
	public WebElement kolonaBrojStavki1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj mjerila']")
	public WebElement kolonaBrojMjerilaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Očitano stavki']")
	public WebElement kolonaOcitanoStavkiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Br. u zoni']")
	public WebElement kolonaBrUZoniWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Sr. Broj']")
	public WebElement kolonaSrBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Instalisana snaga']")
	public WebElement kolonaInstalisanaSnagaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Toplotni reon']")
	public WebElement kolonaToplotniReonWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Toplovod']")
	public WebElement kolonaToplovodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Toplotni Izvor']")
	public WebElement kolonaToplotniIzvorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Grupa']")
	public WebElement kolonaGrupaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Podgrupa']")
	public WebElement kolonaPodgrupaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Osnov za plaćanje']")
	public WebElement kolonaOsnovZaPlacanjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Pravno/Fizičko']")
	public WebElement kolonaPravnoFizickoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable v-table')]//*[text() = 'Oznaka modela']")
	public WebElement kolonaOznakaModelaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable v-table')]//*[text() = 'Osnova za obračun']")
	public WebElement kolonaOsnovaZaObracunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Količina']")
	public WebElement kolonaKolicinaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Grejna sezona']")
	public WebElement kolonaGrejnaSezonaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Godina']")
	public WebElement kolonaGodinaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Redni broj u godini']")
	public WebElement kolonaRedniBrojUGodiniWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Mjesec']")
	public WebElement kolonaMjesecWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj dana']")
	public WebElement kolonaBrojDanaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Sati']")
	public WebElement kolonaSatiWE;

	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vrsta stavke']")
	public WebElement kolonaVrstaStavkeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Jedinica mjere']")
	public WebElement kolonaJedinicaMjereWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Predložena cijena']")
	public WebElement kolonaPredlozenaCijenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ulazi u KIF']")
	public WebElement kolonaUlaziUKifWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ulazi u opomene']")
	public WebElement kolonaUlaziUOpomeneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Način obračuna']")
	public WebElement kolonaNacinObracunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tarifni stav']")
	public WebElement kolonaTarifniStavWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Usluga']")
	public WebElement kolonaUslugaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Matični broj']")
	public WebElement kolonaMaticniBrojWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ulica']")
	public WebElement kolonaUlicaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'JIB']")
	public WebElement kolonaJibWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Korisnik izmijenio']")
	public WebElement kolonaKorisnikIzmijenioWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum izmjene']")
	public WebElement kolonaDatumIzmjeneWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Korisnik portala']")
	public WebElement kolonaKorisnikPortalaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Oslobođen PDV-a']")
	public WebElement kolonaOslobodjenPdvaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Prezime (ime oca) ime']")
	public WebElement kolonaPrezimeImeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'JMBG']")
	public WebElement kolonaJmbgWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tip obračuna']")
	public WebElement kolonaTipObracuna1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'PDV stopa (%)']")
	public WebElement kolonaPdvStopa1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'PDV stopa']")
	public WebElement kolonaPdvStopa2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos bez PDV']")
	public WebElement kolonaIznosBezPdv1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Važeća']")
	public WebElement kolonaVazeca1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Od']")
	public WebElement kolonaOd1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Do']")
	public WebElement kolonaDo1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable v-table')]//*[text() = 'Aktivno']")
	public WebElement kolonaAktivno1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj cifara']")
	public WebElement kolonaBrojCifara1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Nadgrupa']")
	public WebElement kolonaNadgrupa1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj']")
	public WebElement kolonaBroj1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ukupan broj prostora']")
	public WebElement kolonaUkupanBrojProstoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Period od']")
	public WebElement kolonaPeriodOd1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Period Od']")
	public WebElement kolonaPeriodOd2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Period do']")
	public WebElement kolonaPeriodDo1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Period Do']")
	public WebElement kolonaPeriodDo2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tarifna grupa']")
	public WebElement kolonaTarifnaGrupa1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum rješenja']")
	public WebElement kolonaDatumRjesenja1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Br. članova']")
	public WebElement kolonaBrClanovaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Cijena']")
	public WebElement kolonaCijena1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'JIB/JMBG']")
	public WebElement kolonaJibJmbgWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tip kupca']")
	public WebElement kolonaTipKupcaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Testni obračun']")
	public WebElement kolonaTestniObracunWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'PDV obveznik']")
	public WebElement kolonaPdvObveznik1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Storno']")
	public WebElement kolonaStorno1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'M.Z. šifra']")
	public WebElement kolonaMZSifraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'M.Z. naziv']")
	public WebElement kolonaMZNazivWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'M.Z. kontakt']")
	public WebElement kolonaMZKontaktWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Šifra reona']")
	public WebElement kolonaSifraReonaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Reon']")
	public WebElement kolonaReonWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vrsta']")
	public WebElement kolonaVrstaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tip']")
	public WebElement kolonaTip1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tip očitanja']")
	public WebElement kolonaTipOcitanja1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Modul']")
	public WebElement kolonaModulWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Plomba']")
	public WebElement kolonaPlombaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Aktivan']")
	public WebElement kolonaAktivan1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Proizvođač']")
	public WebElement kolonaProizvodjacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Istek baždarenja']")
	public WebElement kolonaIstekBazdarenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Kupac']")
	public WebElement kolonaKupac1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Prostor']")
	public WebElement kolonaProstorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Prostori']")
	public WebElement kolonaProstoriWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Kuće']")
	public WebElement kolonaKuceWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Stanovi']")
	public WebElement kolonaStanoviWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Poslovni prostori']")
	public WebElement kolonaPoslovniProstoriWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Garaže']")
	public WebElement kolonaGarazeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Nestandardna usluga']")
	public WebElement kolonaNestandardnaUsluga1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Neiskorišteni iznos']")
	public WebElement kolonaNeiskoristeniIznos1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Mjerilo']")
	public WebElement kolonaMjeriloWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum početka']")
	public WebElement kolonaDatumPocetkaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum prestanka']")
	public WebElement kolonaDatumPrestankaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum izdavanja dokumenta']")
	public WebElement kolonaDatumIzdavanjaDokumentaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum postavljanja plombe']")
	public WebElement kolonaDatumPostavljanjaPlombeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum uklanjanja plombe']")
	public WebElement kolonaDatumUklanjanjaPlombeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Isključen']")
	public WebElement kolonaIskljucen1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Paušal']")
	public WebElement kolonaPausalWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Period']")
	public WebElement kolonaPeriod1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Naziv organizacije']")
	public WebElement kolonaNazivOrganizacijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Serijski broj']")
	public WebElement kolonaSerijskiBroj1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum kreiranja']")
	public WebElement kolonaDatumKreiranja1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Objekat']")
	public WebElement kolonaObjekatWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Napomena']")
	public WebElement kolonaNapomena1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Zaključeno']")
	public WebElement kolonaZakljuceno1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Procenat (%)']")
	public WebElement kolonaProcenat1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos']")
	public WebElement kolonaIznos1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tip vodomjera']")
	public WebElement kolonaTipVodomjeraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Profil']")
	public WebElement kolonaProfilWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tip očitanja']")
	public WebElement kolonaTipOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum']")
	public WebElement kolonaDatum1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Status']")
	public WebElement kolonaStatus1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Rok plaćanja']")
	public WebElement kolonaRokPlacanja1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Procenat popusta']")
	public WebElement kolonaProcenatPopustaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Progres']")
	public WebElement kolonaProgresWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Organizacija']")
	public WebElement kolonaOrganizacija1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Nalog']")
	public WebElement kolonaNalogWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'T.G.']")
	public WebElement kolonaTG1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos (+PDV)']")
	public WebElement kolonaIznosPdvWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Kamata']")
	public WebElement kolonaKamata1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos sa kamatom']")
	public WebElement kolonaIznosSaKamatomWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Poziv na broj']")
	public WebElement kolonaPozivNaBroj1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Aktivna tužba']")
	public WebElement kolonaAktivnaTuzbaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Plaćen']")
	public WebElement kolonaPlacen1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'ID Računa']")
	public WebElement kolonaIdRacunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj računa']")
	public WebElement kolonaBrojRacuna1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Zaključen']")
	public WebElement kolonaZakljucen1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vrsta korekcije']")
	public WebElement kolonaVrstaKorekcijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ugovor']")
	public WebElement kolonaUgovor1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum knjiženja']")
	public WebElement kolonaDatumKnjizenja1WE;

	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Duguje']")
	public WebElement kolonaDuguje1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Potražuje']")
	public WebElement kolonaPotrazuje1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Preostalo']")
	public WebElement kolonaPreostalo1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tuženo']")
	public WebElement kolonaTuzenoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Opis']")
	public WebElement kolonaOpis1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj dokumenta']")
	public WebElement kolonaBrojDokumentaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Banka']")
	public WebElement kolonaBanka1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vrsta knjiženja']")
	public WebElement kolonaVrstaKnjizenjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Izvod']")
	public WebElement kolonaIzvodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum izvoda']")
	public WebElement kolonaDatumIzvoda1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Br. neprepoznatih uplata']")
	public WebElement kolonaBrNeprepoznatihUplataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos neprepoznatih uplata']")
	public WebElement kolonaIznosNeprepoznatihUplataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Br. uplata']")
	public WebElement kolonaBrUplataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ukupan iznos uplata']")
	public WebElement kolonaUkupanIznosUplataWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj izvoda']")
	public WebElement kolonaBrojIzvoda1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vrijeme unosa']")
	public WebElement kolonaVrijemeUnosa1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vrsta unosa']")
	public WebElement kolonaVrstaUnosaWE;

	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Uplatilac']")
	public WebElement kolonaUplatilac1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos uplate']")
	public WebElement kolonaIznosUplateWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos avansa']")
	public WebElement kolonaIznosAvansaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Zaključena']")
	public WebElement kolonaZakljucena1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Avans']")
	public WebElement kolonaAvansWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Email trajnog naloga']")
	public WebElement kolonaEmailTrajnogNalogaWE;

	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Aktivna']")
	public WebElement kolonaAktivna1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vrsta žiro računa']")
	public WebElement kolonaVrstaZiroRacunaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Email pošiljaoca']")
	public WebElement kolonaEmailPosiljaocaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos reprograma']")
	public WebElement kolonaIznosReprogramaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Nalog za isključenje']")
	public WebElement kolonaNalogzaIskljucenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Period generisanja']")
	public WebElement kolonaPeriodGenerisanja1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Rok']")
	public WebElement kolonaRokWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ukupan broj tužbi']")
	public WebElement kolonaUkupanBrojTuzbiWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Štampa uz račun']")
	public WebElement kolonaStampaUzRacun1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Postoji nalog']")
	public WebElement kolonaPostojiNalogWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum isteka']")
	public WebElement kolonaDatumIstekaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Opomenuti iznos']")
	public WebElement kolonaOpomenutiIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj naloga']")
	public WebElement kolonaBrojNalogaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Opomena pred isklj.']")
	public WebElement kolonaOpomenaPredIskljWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Naloženi iznos']")
	public WebElement kolonaNalozeniIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Preostali iznos']")
	public WebElement kolonaPreostaliIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ukupni troškovi tužbe']")
	public WebElement kolonaUkupniTroskoviTuzbeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Naplaćeni troškovi tužbe']")
	public WebElement kolonaNaplaceniTroskoviTuzbeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Isključenje']")
	public WebElement kolonaIskljucenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj tužbe']")
	public WebElement kolonaBrojTuzbeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tip tužbe']")
	public WebElement kolonaTipTuzbeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Opomena']")
	public WebElement kolonaOpomenaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Utuženi iznos']")
	public WebElement kolonaUtuzeniIznosWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Broj presude']")
	public WebElement kolonaBrojPresudeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Status presude']")
	public WebElement kolonaStatusPresudeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum presude']")
	public WebElement kolonaDatumPresude1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Iznos presude']")
	public WebElement kolonaIznosPresudeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tužba']")
	public WebElement kolonaTuzbaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Prethodno']")
	public WebElement kolonaPrethodnoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Trenutno']")
	public WebElement kolonaTrenutnoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Potrošnja']")
	public WebElement kolonaPotrosnjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Suma potrošnje indirektnih mjerila']")
	public WebElement kolonaSumaPotrosnjeIndirektnihMjerilaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Odobrenje']")
	public WebElement kolonaOdobrenjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Razlika']")
	public WebElement kolonaRazlikaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Pogonski pritisak']")
	public WebElement kolonaPogonskiPritisakWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Vodomjer']")
	public WebElement kolonaVodomjerWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Kalorimetar']")
	public WebElement kolonaKalorimetarWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Zone očitanja']")
	public WebElement kolonaZoneOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Izmijenio korisnik']")
	public WebElement kolonaIzmijenioKorisnikWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Način unosa']")
	public WebElement kolonaNacinUnosaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Nalog za očitanje']")
	public WebElement kolonaNalogZaOcitanjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Resetovan']")
	public WebElement kolonaResetovanWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum očitanja']")
	public WebElement kolonaDatumOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Datum prethodnog očitanja']")
	public WebElement kolonaDatumPrethodnogOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Novo']")
	public WebElement kolonaNovoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Postoji redovno očitanje']")
	public WebElement kolonaPostojiRedovnoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Postoji ispravka prethodnog očitanja']")
	public WebElement kolonaPostojiIspravkaPrethodnogOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'PDV']")
	public WebElement kolonaPdv2WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Koeficijent Hd']")
	public WebElement kolonaKoeficijentHdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Pritisak gasa']")
	public WebElement kolonaPritisakGasaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Standardna temperatura']")
	public WebElement kolonaStandardnaTemperaturaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Radna temperatura']")
	public WebElement kolonaRadnaTemperaturaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Ime']")
	public WebElement kolonaIme1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Prezime']")
	public WebElement kolonaPrezime1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Korisničko ime']")
	public WebElement kolonaKorisnickoIme1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Admin']")
	public WebElement kolonaAdminWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Naslov']")
	public WebElement kolonaNaslov1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Prikaži od']")
	public WebElement kolonaPrikaziOdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Prikaži do']")
	public WebElement kolonaPrikaziDoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Korisnik']")
	public WebElement kolonaKorisnik1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Prioritet']")
	public WebElement kolonaPrioritet1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Tabela']")
	public WebElement kolonaTabela1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'ID entiteta']")
	public WebElement kolonaIdEntiteta1WE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable')]//*[text() = 'Izmijenio']")
	public WebElement kolonaIzmijenio1WE;
}
