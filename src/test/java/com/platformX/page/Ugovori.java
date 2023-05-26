package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Ugovori extends PocetnaStranica {

	@FindBy(xpath = "//main/div/div/div[1]/div[3]/div/div/div") 
	protected WebElement porukaUgovorWE;
	
	@FindBy(xpath = "//div[3]/div/div/div/div[1]/input[1]")
	private WebElement pretraziMjernaMjestaWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[1]/input[1]")
	private WebElement pretraziEicWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[1]/input[1]")
	private WebElement pretraziKupcaWE;

	@FindBy(xpath = "//td[3]/a")
	private WebElement kupacTabelaWE;

	@FindBy(xpath = "//tr[2]/td[5]")
	private WebElement mjernoMjestoTabelaWE;
	
	@FindBy(xpath = "//td[4]/a")
	private WebElement eicTabelaWE;
	
	@FindBy(xpath = "//tr[2]/td[10]")
	private WebElement zavrsavaTabelaWE;
	
	@FindBy(xpath = "//td[9]")
	private WebElement pocinjeOdTabelaWE;

	@FindBy(xpath = "//tr[2]/td[7]")
	private WebElement kategorijaTabelaWE;

	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediBtnWE;

	@FindBy(xpath = "//div[contains(text(), 'Pogledaj')]")
	private WebElement pogledajBtnWE;

	@FindBy(xpath = "//div[contains(text(), 'Deaktiviraj')]")
	private WebElement deaktivirajBtnWE;

	@FindBy(xpath = "//div[2]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumDeaktivacijeWE;

	@FindBy(xpath = "//div[contains(text(), 'Datum deaktivacije mora biti')]")
	private WebElement deaktivacijaPorukaWE;
	
	@FindBy(xpath = "//div[2]/div/div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement razlogDeaktivacijeWE;
	
	@FindBy(xpath = "//span[contains(text(), '1 - Test 1')]")
	private WebElement odaberiRazlogWE;

	@FindBy(xpath = "//form/div/div[3]/button[2]")
	private WebElement potvrdiDeaktivacijuBtnWE;

	@FindBy(xpath = "//textarea")
	private WebElement napomenaWE;

	@FindBy(xpath = "//td")
	private WebElement porukaNaPraznojStraniciWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., 'Isklju')]")
	private WebElement iskljuciBtnWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., 'Uklju')]")
	private WebElement ukljuciBtnWE;

	@FindBy(xpath = "//div[2]/div/div[1]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumIskljucenjaWE;

	@FindBy(xpath = "//form/div/div[3]/button[2]")
	private WebElement potvrdiIskljucivanjeWE;

	@FindBy(xpath = "//div[9]/div/form/div/div[2]/div/div/div[1]/div/div[1]/div[2]/input")
	private WebElement datumUkljucenjaWE;

	@FindBy(xpath = "//div[9]/div/form/div/div[3]/button[2]")
	private WebElement potvrdiUkljucivanjeWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., 'Odbaci')]")
	private WebElement odbaciUgovorBtnWE;
	
	@FindBy(xpath = "//button[@class='v-btn v-btn--text theme--light v-size--default primary--text']")  //div[5]/div/div/div[4]/button[2]
	private WebElement potvrdiOdbacivanjeBtnWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., 'Preregistruj')]")
	private WebElement preregistrujUgovorBtnWE;
	
	@FindBy(xpath = "//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']")
	private WebElement potvrdiPreregistracijuBtnWE;

	// Dodaj ugovor elementi

	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement kupacWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '11')]")
	private WebElement odaberiKupcaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., kupac)]")
	private WebElement odaberiKupca1WE;

	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/div[1]/div/button")
	private WebElement obrisiKupcaWE;

	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement tarifnaGrupaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '19 ')] ")
	private WebElement odaberiTarifnuGrupuWE;

	@FindBy(xpath = "//div[2]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement cjenovnaKategorijaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '7 - Kate')] ") // 7 - Kategorija cijene 2
	private WebElement odaberiCjenovnuKategoriju1WE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1 - Kate')] ") // 1 - Kategorija cijene 1
	private WebElement odaberiCjenovnuKategoriju2WE;

	@FindBy(xpath = "//div[2]/div[5]/div/div/div[1]/div[1]/input[1]")
	private WebElement cjenovnaKategorijaZaMrezuWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '20 - Kategorija mrezarine')]")
	private WebElement odaberiKategorijuMrezarineWE;

	@FindBy(xpath = "//div[2]/div[6]/div/div/div[1]/div/input")
	private WebElement procenatUmanjenjaPDVaWE;

	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement tipUgovoraWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1 - Tip 1')]")
	private WebElement tipUgovora1WE;

	@FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div/div")
	private WebElement potpisanCBWE;

	@FindBy(xpath = "//div[1]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumPotpisaWE;

	@FindBy(xpath = "//div[2]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumPocetkaWE;

	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/input")
	private WebElement vaziOdWE;

	@FindBy(xpath = "//div[7]/div/div/div[1]/div/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement mjernoMjestoWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-input--has-state v-input--is-focused v-input--dense')]")
	private WebElement odaberiMjernoMjestoWE;

//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1514BASD99')]")
//	private WebElement odaberiMjernoMjesto1WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36Z03800001H')]")
//	private WebElement odaberiMjernoMjesto2WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., 'AMOSA542A')]")
//	private WebElement odaberiMjernoMjesto3WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '151414')]")
//	private WebElement odaberiMjernoMjesto4WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36K085053')]")
//	private WebElement odaberiMjernoMjesto5WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36Z1SB1200027N')]")
//	private WebElement odaberiMjernoMjesto6WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36Z0100154X')]")
//	private WebElement odaberiMjernoMjesto7WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., 'dfsf56456')]")
//	private WebElement odaberiMjernoMjesto8WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '3PD53B2W')]")
//	private WebElement odaberiMjernoMjesto9WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., 'SK009281150R')]")
//	private WebElement odaberiMjernoMjesto10WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36Z0SK009')]")
//	private WebElement odaberiMjernoMjesto11WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36066699C')]")
//	private WebElement odaberiMjernoMjesto12WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36Z0SK085O')]")
//	private WebElement odaberiMjernoMjesto13WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36Z0S501070Z')]")
//	private WebElement odaberiMjernoMjesto14WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '36SK08501E')]")
//	private WebElement odaberiMjernoMjesto15WE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., 'K009151661R')]")
//	private WebElement odaberiMjernoMjesto16WE;

	@FindBy(xpath = "//div/div/div[1]/div/div[2]/div/div/div[1]/div/input")
	private WebElement nazivMjernogMjestaWE;

	@FindBy(xpath = "//div/div/div[1]/div/div[3]/div/div/div[1]/div/input")
	private WebElement nazivNaStampanimDokumentimaWE;

	@FindBy(xpath = "//div/div/div[1]/div/div[4]/div/div/div[1]/div/input")
	private WebElement aktivnoBrojiloWE;

	@FindBy(xpath = "//div/div/div[1]/div/div[5]/div/div/div[1]/div/input")
	private WebElement reaktivnoBrojiloWE;
	
	@FindBy(xpath = "//div/div/div[1]/div/div[6]/div/div/div[1]/div/input")
	private WebElement ugovorenaPrikljucnaSnagaWE;

	@FindBy(xpath = "//div/div/div[1]/div/div[7]/div/div/div[1]/div/input")
	private WebElement aktivnaKonstantaWE;
	@FindBy(xpath = "//div[11]/div/div/div[1]/div[1]/input[1]")
	private WebElement postaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '78000 - Banja Luka')]")
	private WebElement odaberiPostuWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '71420')]")
	private WebElement odaberiPostu1WE;

	@FindBy(xpath = "//div[12]/div/div/div[1]/div[1]/input[1]")
	private WebElement mjestoWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1 - Ba')]")
	private WebElement odaberiMjestoWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '3 - Pale')]")
	private WebElement odaberiMjesto1WE;

	@FindBy(xpath = "//div[13]/div/div/div[1]/div[1]/input[1]")
	private WebElement ulicaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '6 - Nikole Tesle')]")
	private WebElement odaberiUlicuWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '2 - Dr')]")
	private WebElement odaberiUlicu1WE;

	@FindBy(xpath = "//div[14]/div/div/div[1]/div/input")
	private WebElement brojUliceWE;

	@FindBy(xpath = "//div[17]/div/div/div[1]/div/div")
	private WebElement eMailDostavaWE;

	@FindBy(xpath = "//div[18]/div/div/div[1]/div/input")
	private WebElement eMailWE;

	@FindBy(xpath = "//div[9]/div[1]/div/div/div[1]/div/input")
	private WebElement imeIPrezimeWE;

	@FindBy(xpath = "//div[9]/div[2]/div/div/div[1]/div/input")
	private WebElement telefonWE;

	@FindBy(xpath = "//div[9]/div[3]/div/div/div[1]/div/input")
	private WebElement eMailOsobeWE;

	// Validacione poruke na poljima za dodavanje ugovora

	@FindBy(xpath = "//div[2]/div[1]/div/div/div[2]/div/div/div")
	private WebElement kupacPorukaWE;

	@FindBy(xpath = "//div[2]/div[2]/div/div/div[2]/div/div/div")
	private WebElement tarifnaGrupaPorukaWE;

	@FindBy(xpath = "//div[2]/div[4]/div/div/div[2]/div/div/div")
	private WebElement cjenovnaKategorijaPorukaWE;

	@FindBy(xpath = "//div[2]/div[4]/div/div/div[2]/div/div/div")
	private WebElement kategorijaZaMrezuPorukaWE;

	@FindBy(xpath = "//div[2]/div[6]/div/div/div[2]/div/div/div")
	private WebElement procenatUmanjenjaPDVaPorukaWE;

	@FindBy(xpath = "//div[5]/div[2]/div[1]/div/div[2]/div/div/div")
	private WebElement datumPocetkaPorukaWE;

	@FindBy(xpath = "//div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div")
	private WebElement mjernoMjestoPorukaWE;

	@FindBy(xpath = "//div[4]/div/div/div[2]/div/div/div")
	private WebElement aktivnoBrojiloPorukaWE;

	@FindBy(xpath = "//div[5]/div/div/div[2]/div/div/div")
	private WebElement reaktivnoBrojiloPorukaWE;

	@FindBy(xpath = "//div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div")
	private WebElement nazivMjernogMjestaPorukaWE;

	@FindBy(xpath = "//div/div/div[1]/div/div[3]/div/div/div[2]/div/div/div")
	private WebElement nazivNaStampanimDokumentimaPorukaWE;

	@FindBy(xpath = "//div[11]/div/div/div[2]/div/div/div")
	private WebElement postaPorukaWE;

	@FindBy(xpath = "//div[12]/div/div/div[2]/div/div/div")
	private WebElement mjestoPorukaWE;

	@FindBy(xpath = "//div[13]/div/div/div[2]/div/div/div")
	private WebElement ulicaPorukaWE;

	@FindBy(xpath = "//div[14]/div/div/div[2]/div/div/div")
	private WebElement brojUlicePorukaWE;

	@FindBy(xpath = "//div[8]/div/div/div[2]/div/div/div")
	private WebElement eMailPorukaWE;

	@FindBy(xpath = "//div[9]/div[2]/div/div/div[2]/div/div/div")
	private WebElement telefonPorukaWE;

	@FindBy(xpath = "//div[9]/div[3]/div/div/div[2]/div/div/div")
	private WebElement eMailOsobePorukaWE;

	@FindBy(xpath = "//div[5]/div[3]/div[1]/div/div[2]/div/div/div")
	private WebElement vaziOdPorukaWE;

	// Uredi ugovor elementi

	@FindBy(xpath = "//div[2]/div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement djelatnostWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1 - D1 - Djelatnost 1')]")
	private WebElement odaberiDjelatnostWE;
	
	@FindBy(xpath = "//div[1]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumPotpisaUrediWE;

	@FindBy(xpath = "//div[3]/div[3]/div/div/div[1]/div/div")
	private WebElement rekapitulacijaWE;

	@FindBy(xpath = "//div[8]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement urediPostaWE;
	
	@FindBy(xpath = "//div[6]/div[3]/div/div/div[1]/div/input")
	private WebElement urediNazivNaStampanimDokumentimaWE;
	
	@FindBy(xpath = "//div[8]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement urediMjestoWE;
	
	@FindBy(xpath = "//div[8]/div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement urediUlicuWE;
	
	@FindBy(xpath = "//div[8]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement urediBrojUliceWE;
	
	@FindBy(xpath = "//div[7]/div/div/div[1]/div/div")
	private WebElement urediEmailDostavaWE;
	
	@FindBy(xpath = "//div[8]/div[8]/div/div/div[1]/div/input")
	private WebElement urediEmailWE;
	
	@FindBy(xpath = "//div[10]/div[1]/div/div/div[1]/div/input")
	private WebElement urediImeIPrezimeWE;
	
	@FindBy(xpath = "//div[8]/div[4]/div/div/div[2]/div/div/div")
	private WebElement urediBrojUlicePorukaWE;

	// Pogledaj ugovor elementi

	@FindBy(xpath = "//div[3]/div[4]/div/div/div[1]/div/input")
	private WebElement pogledajDjelatnostWE;
	
	// Preregistruj ugovor elementi
	
	@FindBy(xpath = "//div[7]/div[2]/div/div/div[1]/div/input")
	private WebElement nazivMjMjestaWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumPreregistracijeWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumVaziOdWE;
	
	@FindBy(xpath = "//div[7]/div[3]/div/div/div[1]/div/input")
	private WebElement nazivMjMjestaNaDokWE;
	
	@FindBy(xpath = "//div[9]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement postaPreregistracijeWE;
	
	@FindBy(xpath = "//div[9]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement mjestoPreregistracijeWE;
	
	@FindBy(xpath = "//div[9]/div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement ulicaPreregistracijeWE;
	
	@FindBy(xpath = "//div[9]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement brojUUliciWE;
	
	@FindBy(xpath = "//div[9]/div[1]/div/div/div[2]/div/div")
	private WebElement postaValidacijaWE;
	
	@FindBy(xpath = "//div[9]/div[2]/div/div/div[2]/div/div")
	private WebElement mjestoValidacijaWE;
	
	@FindBy(xpath = "//div[9]/div[3]/div/div/div[2]/div/div")
	private WebElement ulicaValidacijaWE;
	
	@FindBy(xpath = "//div[9]/div[4]/div/div/div[2]/div/div")
	private WebElement brojValidacijaWE;
	
	@FindBy(xpath = "//div[7]/div[2]/div/div/div[2]/div/div")
	private WebElement nazivMjernogMjestaValidacijaWE;
	
	@FindBy(xpath = "//div[7]/div[3]/div/div/div[2]/div/div")
	private WebElement nazivMjernogMjestaNaDokumentimaValidacijaWE;
	
	@FindBy(xpath = "//div[5]/div[3]/div[1]/div/div[2]/div/div/div")
	private WebElement vaziOdValidacijaWE;
	
	@FindBy(xpath = "//div[5]/div[2]/div[1]/div/div[2]/div/div/div")
	private WebElement datumPreregistracijeValidacijaWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[2]/div/div")
	private WebElement kupacValidacijaWE;

	public Ugovori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujUgovori() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Ugovori')]")));
		verifikacijaZajednickihElemenata("Kupci", "Ugovori", "Ugovori", 16, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivKupcaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjmWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTGWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPocinjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZavrsavaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotpWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktWE));
	}

	public String dodajUgovor(String kupac, String kategorijaCijene, String datumPocetka, String datumOd,
			String mjernoMjesto, boolean reaktivnoBrojilo) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String nazivMjernogMjesta = "Mjerno mjesto " + Helper.getRandomString(5);
		String aktivnoBrojilo = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(kupac);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaGrupaWE));
		tarifnaGrupaWE.sendKeys("19 - Tarifna grupa 2, T1");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTarifnuGrupuWE));
		odaberiTarifnuGrupuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnaKategorijaWE));
		cjenovnaKategorijaWE.sendKeys(kategorijaCijene);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		if (kategorijaCijene == "1 - Kategorija cijene 1") {
			wait.until(ExpectedConditions.elementToBeClickable(odaberiCjenovnuKategoriju2WE));
			odaberiCjenovnuKategoriju2WE.click();
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(odaberiCjenovnuKategoriju1WE));
			odaberiCjenovnuKategoriju1WE.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnaKategorijaZaMrezuWE));
		cjenovnaKategorijaZaMrezuWE.sendKeys("20 - Kategorija mrezarine");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiKategorijuMrezarineWE));
		odaberiKategorijuMrezarineWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipUgovoraWE));
		tipUgovoraWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipUgovora1WE));
		tipUgovora1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumPocetkaWE));
		datumPocetkaWE.clear();
		datumPocetkaWE.sendKeys(datumPocetka);
		wait.until(ExpectedConditions.elementToBeClickable(vaziOdWE));
		vaziOdWE.sendKeys(datumOd);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", datumPocetkaWE);
		wait.until(ExpectedConditions.elementToBeClickable(mjernoMjestoWE));
		mjernoMjestoWE.sendKeys(mjernoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")).click();
		// TODO: Ovaj dio mozda refaktorisati da prima 'ID - EIC' a da dinamicki uzima mjm
		wait.until(ExpectedConditions.elementToBeClickable(nazivMjernogMjestaWE));
		nazivMjernogMjestaWE.sendKeys(nazivMjernogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(nazivNaStampanimDokumentimaWE));
		nazivNaStampanimDokumentimaWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(aktivnoBrojiloWE));
		aktivnoBrojiloWE.sendKeys(aktivnoBrojilo);
		wait.until(ExpectedConditions.elementToBeClickable(reaktivnoBrojiloWE));
		reaktivnoBrojiloWE.sendKeys(aktivnoBrojilo);
		wait.until(ExpectedConditions.elementToBeClickable(ugovorenaPrikljucnaSnagaWE));
		ugovorenaPrikljucnaSnagaWE.sendKeys(aktivnoBrojilo);
		wait.until(ExpectedConditions.elementToBeClickable(aktivnaKonstantaWE));
		aktivnaKonstantaWE.sendKeys(Helper.getRandomNumber(1)); // random num
		js.executeScript("arguments[0].scrollIntoView(true);", postaWE);
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.sendKeys("78000 - Banja Luka");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.visibilityOf(odaberiPostuWE));
		odaberiPostuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.sendKeys("1 - Banja Luka");
		wait.until(ExpectedConditions.visibilityOf(odaberiMjestoWE));
		odaberiMjestoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.sendKeys("6 - Nikole Tesle");
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojUliceWE));
		brojUliceWE.sendKeys("7"); // random num
		if (reaktivnoBrojilo == false) {
			wait.until(ExpectedConditions.elementToBeClickable(reaktivnoBrojiloWE));
			js.executeScript("arguments[0].scrollIntoView(true);", datumPocetkaWE);
			reaktivnoBrojiloWE.click();
			reaktivnoBrojiloWE.clear();
			reaktivnoBrojiloWE.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		}
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return nazivMjernogMjesta;
	}

	public void verifikujUgovor(String mjernoMjesto) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziMjernaMjestaWE));
		Thread.sleep(1000);
		pretraziMjernaMjestaWE.click();
		pretraziMjernaMjestaWE.clear();
		pretraziMjernaMjestaWE.sendKeys(mjernoMjesto);
		pretraziMjernaMjestaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela5WE));
		assertTrue(podatakTabela5WE.getText().contains(mjernoMjesto), "Ugovori: Naziv mjernog mjesta nije dobar!");
		assertTrue(podatakTabela7WE.getText().contains("7 - Kategorija cijene 2"),
				"Ugovori: Naziv kategorije nije dobar!");
	}
	
	public void pronadjiUgovor(String mjernoMjesto) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziMjernaMjestaWE));
		Thread.sleep(1000);
		pretraziMjernaMjestaWE.click();
		pretraziMjernaMjestaWE.clear();
		pretraziMjernaMjestaWE.sendKeys(mjernoMjesto);
		pretraziMjernaMjestaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela5WE));
		Thread.sleep(1000);
		assertTrue(podatakTabela5WE.getText().contains(mjernoMjesto), "Ugovori: Naziv mjernog mjesta nije dobar!");
	}
	
	public void pronadjiUgovorPoEic(String eic) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziMjernaMjestaWE));
		Thread.sleep(1000);
		pretraziMjernaMjestaWE.click();
		pretraziMjernaMjestaWE.clear();
		pretraziMjernaMjestaWE.sendKeys(eic);
		Thread.sleep(2000);
		pretraziMjernaMjestaWE.sendKeys(Keys.DOWN);
		pretraziMjernaMjestaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela4WE));
		Thread.sleep(1000);
		assertTrue(podatakTabela4WE.getText().contains(eic), "Ugovori: Naziv EIC nije dobar!");
	}
	
	public void pronadjiUgovorPravnoLice(String pravnoLice) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziEicWE));
		pretraziKupcaWE.click();
		pretraziKupcaWE.clear();
		pretraziKupcaWE.sendKeys(pravnoLice);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list v-select-list v-sheet theme--light v-list--dense theme--light') and contains(., '" + pravnoLice + "')]")));
		pretraziKupcaWE.sendKeys(Keys.DOWN);
		pretraziKupcaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela3WE));
		assertTrue(podatakTabela3WE.getText().contains(pravnoLice), "Ugovori: Naziv pravnog lica nije dobar!");
	}
	
	public void verifikujPreregistrovanUgovor(String eic, String kupac) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziMjernaMjestaWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(pretraziKupcaWE));
		pretraziKupcaWE.click();
		pretraziKupcaWE.clear();
		pretraziKupcaWE.sendKeys(kupac);
		Thread.sleep(2000);
		pretraziKupcaWE.sendKeys(Keys.DOWN);
		pretraziKupcaWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela4WE));
		assertTrue(podatakTabela4WE.getText().contains(eic), "Ugovori: Naziv EIC nije dobar!");
		assertTrue(podatakTabela9WE.getText().contains("15.07.2020."), "Ugovori: Datum pocetka nije dobar!");
	}

	public void verifikujOdbaceniUgovor(String kupac) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziKupcaWE));
		Thread.sleep(2000);
		pretraziKupcaWE.click();
		pretraziKupcaWE.clear();
		pretraziKupcaWE.sendKeys(kupac);
		pretraziKupcaWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaNaPraznojStraniciWE));
		assertTrue(porukaNaPraznojStraniciWE.getText().contains("Nema podataka"),
				"Ugovori: Poruka na praznoj stranici nije dobra!");
	}

	public void verifikujPoruku(String poruka) throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaUgovorWE));
		assertTrue(porukaUgovorWE.getText().trim().equals(poruka), "Ugovori: Poruka upozorenja nije dobra!");
	}
	
	public void verifikujPorukuForme(String poruka) throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().trim().contains(poruka), "Ugovori: Poruka upozorenja nije dobra!");
	}

	public void obrisiReaktivnoBrojilo() {
		wait.until(ExpectedConditions.elementToBeClickable(reaktivnoBrojiloWE));
		reaktivnoBrojiloWE.clear();
	}

	public void verifikujObaveznaPolja() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(procenatUmanjenjaPDVaWE));
		procenatUmanjenjaPDVaWE.click();
		Thread.sleep(500);
		procenatUmanjenjaPDVaWE.clear();
		procenatUmanjenjaPDVaWE.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", postaWE);
//		Thread.sleep(500);
//		wait.until(ExpectedConditions.elementToBeClickable(eMailDostavaWE));
//		eMailDostavaWE.click;
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		Thread.sleep(500);
		assertTrue(kupacPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Kupac nije dobra!");
		assertTrue(tarifnaGrupaPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Tarifna grupa nije dobra!");
		assertTrue(cjenovnaKategorijaPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Cjenovna kategorija nije dobra!");
		assertTrue(datumPocetkaPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Datum pocetka nije dobra!");
		assertTrue(mjernoMjestoPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Mjerno mjesto nije dobra!");
		assertTrue(aktivnoBrojiloPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Aktivno brojilo nije dobra!");
		assertTrue(nazivMjernogMjestaPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Naziv mjernog mjesta nije dobra!");
		assertTrue(nazivNaStampanimDokumentimaPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Naziv mjernog mjesta na stampanim dokumentimanije nije dobra!");
		assertTrue(postaPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Posta nije dobra!");
		assertTrue(mjestoPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Mjesto nije dobra!");
		assertTrue(mjestoPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Mjesto nije dobra!");
		assertTrue(ulicaPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Ulica nije dobra!");
		assertTrue(brojUlicePorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Broj u ulici nije dobra!");
//		assertTrue(eMailPorukaWE.getText().trim().equals("Obavezno polje"),							
//				"Dodavanje ugovora: Validaciona poruka na polju E-mail nije dobra!");
		// TODO: trenutno na UI fali validacija za polje eMailWE - otkomentarisati sve linije u ovoj metodi kada ponovo bude validacija
		assertTrue(procenatUmanjenjaPDVaPorukaWE.getText().trim().equals("Obavezno polje"),
				"Dodavanje ugovora: Validaciona poruka na polju Procenat umanjenja PDV-a nije dobra!");
	}
	
	public void verifikujValidacijePolja() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(datumPocetkaWE));
		datumPocetkaWE.clear();
		datumPocetkaWE.sendKeys("15.06.2020.");
		wait.until(ExpectedConditions.elementToBeClickable(vaziOdWE));
		vaziOdWE.sendKeys("15.07.2020.");
		driver.findElement(By.xpath("//form/div/div[1]/div[6]/div/div[1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivMjernogMjestaWE));
		nazivMjernogMjestaWE.sendKeys(UUID.randomUUID().toString().substring(0, 35)
				+ UUID.randomUUID().toString().substring(0, 35) + UUID.randomUUID().toString().substring(0, 31));
		nazivNaStampanimDokumentimaWE.sendKeys(UUID.randomUUID().toString().substring(0, 35)
				+ UUID.randomUUID().toString().substring(0, 35) + UUID.randomUUID().toString().substring(0, 31));
		wait.until(ExpectedConditions.elementToBeClickable(aktivnoBrojiloWE));
		aktivnoBrojiloWE.sendKeys(
				UUID.randomUUID().toString().substring(0, 30) + UUID.randomUUID().toString().substring(0, 21));
		reaktivnoBrojiloWE.sendKeys(
				UUID.randomUUID().toString().substring(0, 30) + UUID.randomUUID().toString().substring(0, 21));
		wait.until(ExpectedConditions.elementToBeClickable(brojUliceWE));
		brojUliceWE.sendKeys(
				UUID.randomUUID().toString().substring(0, 30) + UUID.randomUUID().toString().substring(0, 21));
		telefonWE.sendKeys(UUID.randomUUID().toString().substring(0, 31));
		eMailOsobeWE.sendKeys(UUID.randomUUID().toString().substring(0, 4));
		wait.until(ExpectedConditions.visibilityOf(vaziOdPorukaWE));
		assertTrue(vaziOdPorukaWE.getText().trim().equals("Datum početka mora biti veći ili jednak datumu Važi od."),
				"Dodavanje ugovora: Validaciona poruka na polju Vazi od nije dobra!");
		wait.until(ExpectedConditions.visibilityOf(aktivnoBrojiloPorukaWE));
		assertTrue(aktivnoBrojiloPorukaWE.getText().trim().equals("Maksimalno 50 karaktera"),
				"Dodavanje ugovora: Validaciona poruka na polju Aktivno brojilo nije dobra!");
		wait.until(ExpectedConditions.visibilityOf(reaktivnoBrojiloPorukaWE));
		assertTrue(reaktivnoBrojiloPorukaWE.getText().trim().equals("Maksimalno 50 karaktera"),
				"Dodavanje ugovora: Validaciona poruka na polju Reaktivno brojilo nije dobra!");
		wait.until(ExpectedConditions.visibilityOf(nazivMjernogMjestaPorukaWE));
		assertTrue(nazivMjernogMjestaPorukaWE.getText().trim().equals("Maksimalno 100 karaktera"),
				"Dodavanje ugovora: Validaciona poruka na polju Naziv mjernog mjesta nije dobra!");		
		wait.until(ExpectedConditions.visibilityOf(nazivNaStampanimDokumentimaPorukaWE));
		assertTrue(nazivNaStampanimDokumentimaPorukaWE.getText().trim().equals("Maksimalno 100 karaktera"),
				"Dodavanje ugovora: Validaciona poruka na polju Naziv mjernog mjesta na stampanim dokumentima nije dobra!");		
		wait.until(ExpectedConditions.visibilityOf(brojUlicePorukaWE));
		assertTrue(brojUlicePorukaWE.getText().trim().equals("Maksimalno 50 karaktera"),
				"Dodavanje ugovora: Validaciona poruka na polju Broj u ulici nije dobra!");
		wait.until(ExpectedConditions.visibilityOf(telefonPorukaWE));
		assertTrue(telefonPorukaWE.getText().trim().equals("Maksimalno 30 karaktera"),
				"Dodavanje ugovora: Validaciona poruka na polju Telefon nije dobra!");
		wait.until(ExpectedConditions.visibilityOf(eMailOsobePorukaWE));
		assertTrue(eMailOsobePorukaWE.getText().trim().equals("Email nije validan"),
				"Dodavanje ugovora: Validaciona poruka na polju E-mail osobe nije dobra!");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();		
	}

	public void izmjeniUgovor() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBtnWE));
		urediBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(djelatnostWE));
		djelatnostWE.sendKeys("1 - D1 - Djelatnost 1");
		wait.until(ExpectedConditions.visibilityOf(odaberiDjelatnostWE));
		odaberiDjelatnostWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(rekapitulacijaWE));
		rekapitulacijaWE.click();
		urediNazivNaStampanimDokumentimaWE.sendKeys(Helper.getRandomString(5));
		urediPostaWE.sendKeys("71420 - Pale");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.visibilityOf(odaberiPostu1WE));
		odaberiPostu1WE.click();
		urediMjestoWE.sendKeys("3 - Pale");
		wait.until(ExpectedConditions.visibilityOf(odaberiMjesto1WE));
		odaberiMjesto1WE.click();
		urediUlicuWE.sendKeys("2 - Dr Mladena Stojanovica");
		wait.until(ExpectedConditions.visibilityOf(odaberiUlicu1WE));
		odaberiUlicu1WE.click();
		urediBrojUliceWE.click();
		urediBrojUliceWE.clear();
		urediBrojUliceWE.sendKeys("5");
		wait.until(ExpectedConditions.elementToBeClickable(urediImeIPrezimeWE));
		urediImeIPrezimeWE.sendKeys("Name " + Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(urediEmailDostavaWE));
		urediEmailDostavaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediEmailWE));
		urediEmailWE.sendKeys(Helper.getRandomString(5) + "@" + Helper.getRandomString(5) + ".com");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(pogledajBtnWE));
		pogledajBtnWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(pogledajDjelatnostWE));
		// System.out.println(pogledajDjelatnostWE.getText());
		// assertTrue(pogledajDjelatnostWE.getText().trim().equals("1 - D1 - Djelatnost
		// 1"),
		// "Pregled ugovora: Djelatnost nije dobra!");
	}

	public String dodajPotpisanUgovor(String mjernoMjesto, String kupac) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String nazivMjernogMjesta = "Mjerno mjesto " + Helper.getRandomString(5);
		String aktivnoBrojilo = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(kupac);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]"))
				.click();
		
//		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
//		kupacWE.sendKeys("1100001 - Zanatska radionica 6");
//		Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOf(odaberiKupcaWE));
//		odaberiKupcaWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaGrupaWE));
		tarifnaGrupaWE.sendKeys("19 - Tarifna grupa 2, T1");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTarifnuGrupuWE));
		odaberiTarifnuGrupuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnaKategorijaWE));
		cjenovnaKategorijaWE.sendKeys("7 - Kategorija cijene 2");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiCjenovnuKategoriju1WE));
		odaberiCjenovnuKategoriju1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnaKategorijaZaMrezuWE));
		cjenovnaKategorijaZaMrezuWE.sendKeys("20 - Kategorija mrezarine");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		cjenovnaKategorijaZaMrezuWE.sendKeys(Keys.DOWN);
		cjenovnaKategorijaZaMrezuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(potpisanCBWE));
		potpisanCBWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumPotpisaWE));
		datumPocetkaWE.clear();
		datumPotpisaWE.sendKeys("30.12.2020.");
		wait.until(ExpectedConditions.elementToBeClickable(datumPocetkaWE));
		datumPocetkaWE.clear();
		datumPocetkaWE.sendKeys("30.12.2020.");
		wait.until(ExpectedConditions.elementToBeClickable(vaziOdWE));
		vaziOdWE.sendKeys("30.12.2020.");
		wait.until(ExpectedConditions.elementToBeClickable(tipUgovoraWE));
		tipUgovoraWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipUgovora1WE));
		tipUgovora1WE.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", datumPocetkaWE);
		wait.until(ExpectedConditions.elementToBeClickable(mjernoMjestoWE));
		mjernoMjestoWE.sendKeys(mjernoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")).click();
		// TODO: Ovaj dio mozda refaktorisati da prima 'ID - EIC' a da dinamicki uzima mjm
		wait.until(ExpectedConditions.elementToBeClickable(nazivMjernogMjestaWE));
		nazivMjernogMjestaWE.sendKeys(nazivMjernogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(nazivNaStampanimDokumentimaWE));
		nazivNaStampanimDokumentimaWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(aktivnoBrojiloWE));
		aktivnoBrojiloWE.sendKeys(aktivnoBrojilo);
		wait.until(ExpectedConditions.elementToBeClickable(reaktivnoBrojiloWE));
		reaktivnoBrojiloWE.sendKeys(aktivnoBrojilo);
		wait.until(ExpectedConditions.elementToBeClickable(ugovorenaPrikljucnaSnagaWE));
		ugovorenaPrikljucnaSnagaWE.sendKeys(aktivnoBrojilo);
		wait.until(ExpectedConditions.elementToBeClickable(aktivnaKonstantaWE));
		aktivnaKonstantaWE.sendKeys(Helper.getRandomNumber(1));
		js.executeScript("arguments[0].scrollIntoView(true);", postaWE);
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.sendKeys("78000 - Banja Luka");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.visibilityOf(odaberiPostuWE));
		odaberiPostuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.sendKeys("1 - Banja Luka");
		wait.until(ExpectedConditions.visibilityOf(odaberiMjestoWE));
		odaberiMjestoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.sendKeys("6 - Nikole Tesle");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.visibilityOf(odaberiUlicuWE));
		ulicaWE.sendKeys(Keys.DOWN);
		ulicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojUliceWE));
		brojUliceWE.sendKeys("7");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return nazivMjernogMjesta;
	}

	public void izmjeniPotpisanUgovor() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBtnWE));
		urediBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potpisanCBWE));
		Thread.sleep(2000);
		potpisanCBWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		Thread.sleep(1000);
	}

	protected List<WebElement> brojNecekiranihKolona() {
		return driver.findElements(By.xpath(
				"//*[contains(@class, 'v-icon notranslate fa fa-times theme--light red--text text--darken-2')]"));
	}

	public void verifikujBrojNecekiranihKolona(int n) throws Exception {
		Thread.sleep(2000);
		assertTrue(brojNecekiranihKolona().size() == n, "Broj necekiranih kolona nije dobar! ");
	}

	public void verifikujObaveznaPoljaIzmjenaUgovora() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBtnWE));
		urediBtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(procenatUmanjenjaPDVaWE));
		procenatUmanjenjaPDVaWE.click();
		procenatUmanjenjaPDVaWE.clear();
		procenatUmanjenjaPDVaWE.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		wait.until(ExpectedConditions.elementToBeClickable(urediBrojUliceWE));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", urediMjestoWE);
		Thread.sleep(1000);
		urediBrojUliceWE.click();
		urediBrojUliceWE.clear();
		urediBrojUliceWE.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		Thread.sleep(500);
		// assertTrue(procenatUmanjenjaPDVaPorukaWE.getText().trim().equals("Obavezno polje"),
		//		"Izmjena ugovora: Validaciona poruka na polju Procenat umanjenja PDV-a nije dobra!");
		assertTrue(urediBrojUlicePorukaWE.getText().trim().equals("Obavezno polje"),
				"Izmjena ugovora: Validaciona poruka na polju Broj u ulici nije dobra!");
		//TODO Dodati verifikacije ostalih validacija
		Thread.sleep(1000);
	}

	public void deaktivirajUgovor(String date) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(deaktivirajBtnWE));
		deaktivirajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(razlogDeaktivacijeWE));
		razlogDeaktivacijeWE.sendKeys("1 - Test 1");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiRazlogWE));
		odaberiRazlogWE.click();
		Thread.sleep(500);
		if (date != null) {
			datumDeaktivacijeWE.click();
			datumDeaktivacijeWE.clear();
			datumDeaktivacijeWE.sendKeys(date);
		}
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiDeaktivacijuBtnWE));
		potvrdiDeaktivacijuBtnWE.click();
		if (date != null) {
			wait.until(ExpectedConditions.visibilityOf(deaktivacijaPorukaWE));
			assertTrue(
					deaktivacijaPorukaWE.getText()
							.equals("Datum deaktivacije mora biti u aktivnom obračunskom periodu ili u budućnosti."),
					"Deaktivcija ugovora: Validaciona poruka nije dobra!");
		}
//		try {
//			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		}
//		catch (Exception e) {
//			wait.until(ExpectedConditions.visibilityOf(deaktivacijaPorukaWE));
//			assertTrue(deaktivacijaPorukaWE.getText().equals("Datum deaktivacije mora biti u aktivnom obračunskom periodu ili u budućnosti."),
//					"Deaktivcija ugovora: Validaciona poruka nije dobra!");
//		}
	}

	public void iskljuciUgovor(String datumIskljucenja) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(iskljuciBtnWE));
		iskljuciBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(napomenaWE));
		napomenaWE.sendKeys("Test");
		wait.until(ExpectedConditions.elementToBeClickable(datumIskljucenjaWE));
		datumIskljucenjaWE.sendKeys(datumIskljucenja);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiIskljucivanjeWE));
		potvrdiIskljucivanjeWE.click();
		Thread.sleep(2000);
	}

	public void provjeraIskljucenostiUgovora(String akcija) {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		if (akcija == "Uključi") {
		wait.until(ExpectedConditions.elementToBeClickable(ukljuciBtnWE));
		assertTrue(ukljuciBtnWE.getText().trim().equals(akcija), "Ugovori: Ugovor nema odgovarajucu akciju!");
		}
		else {
			wait.until(ExpectedConditions.elementToBeClickable(iskljuciBtnWE));
			assertTrue(iskljuciBtnWE.getText().trim().equals(akcija), "Ugovori: Ugovor nema odgovarajucu akciju!");	
		}
	}

	public void ukljuciUgovor(String datumUkljucenja) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ukljuciBtnWE));
		ukljuciBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumUkljucenjaWE));
		datumUkljucenjaWE.sendKeys(datumUkljucenja);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiUkljucivanjeWE));
		potvrdiUkljucivanjeWE.click();
		Thread.sleep(2000);
	}
	
	public void odbaciUgovor() {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odbaciUgovorBtnWE));
		odbaciUgovorBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(napomenaWE));
		napomenaWE.sendKeys("Razlog odbacivanja ugovora");
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiOdbacivanjeBtnWE));
		potvrdiOdbacivanjeBtnWE.click();
	}
	
	public void otvoriPreregistraciju() {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(preregistrujUgovorBtnWE));
		preregistrujUgovorBtnWE.click();
	}
	
	public void verifikujObaveznaPoljaPreregistracijeUgovora() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiPreregistracijuBtnWE));
		potvrdiPreregistracijuBtnWE.click();
		Thread.sleep(500);
		assertTrue(postaValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Posta nije dobra!");
		assertTrue(mjestoValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Mjesto nije dobra!");
		assertTrue(ulicaValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Ulica nije dobra!");
		assertTrue(brojValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Broj u ulici nije dobra!");
		assertTrue(nazivMjernogMjestaValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Naziv mjernog mjesta nije dobra!");
		assertTrue(nazivMjernogMjestaNaDokumentimaValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Naziv mjernog mjesta na dokumentima nije dobra!");
		assertTrue(vaziOdValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Vazi od nije dobra!");
		assertTrue(datumPreregistracijeValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Datum preregistracije nije dobra!");
		assertTrue(kupacValidacijaWE.getText().trim().equals("Obavezno polje"),
				"Preregistracija ugovora: Validaciona poruka na polju Kupac nije dobra!");
	}
	
	public void preregistrujUgovor() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys("4100010 - Firma 2");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + "4100010 - Firma 2" + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + "4100010 - Firma 2" + "')]"))
				.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivMjMjestaWE));
		nazivMjMjestaWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(datumPreregistracijeWE));
		datumPreregistracijeWE.sendKeys("15.07.2020.");
		wait.until(ExpectedConditions.elementToBeClickable(datumVaziOdWE));
		datumVaziOdWE.sendKeys("15.07.2020.");
		wait.until(ExpectedConditions.elementToBeClickable(nazivMjMjestaNaDokWE));
		nazivMjMjestaNaDokWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(postaPreregistracijeWE));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", postaPreregistracijeWE);
		Thread.sleep(500);
		postaPreregistracijeWE.sendKeys("78000 - Banja Luka");
		wait.until(ExpectedConditions.visibilityOf(odaberiPostuWE));
		odaberiPostuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjestoPreregistracijeWE));
		mjestoPreregistracijeWE.sendKeys("1 - Banja Luka (Banja Luka)");
		wait.until(ExpectedConditions.visibilityOf(odaberiMjestoWE));
		odaberiMjestoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ulicaPreregistracijeWE));
		ulicaPreregistracijeWE.sendKeys("2 - Dr Mladena Stojanovica");
		wait.until(ExpectedConditions.visibilityOf(odaberiUlicu1WE));
		odaberiUlicu1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojUUliciWE));
		brojUUliciWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
	}

}