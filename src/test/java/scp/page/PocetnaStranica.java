package scp.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.base.PageBase;

public class PocetnaStranica extends PageBase {

	public PocetnaStranica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 30);

	@FindBy(xpath = "//div[contains(text(), 'Izloguj se')]")
	protected WebElement izlogujSeWE;
	
	@FindBy(xpath = "//ul/button[1]")
	protected WebElement sekcijaBtnWE;

	@FindBy(xpath = "//ul/button[2]")
	protected WebElement stranicaBtnWE;
	
	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement submitBtnWE;

//	@FindBy(xpath = "//header/div/button[1]")
//	protected WebElement preuzmiExcelBtnWE;
//
//	@FindBy(xpath = "//header/div/button[2]")
//	protected WebElement ukloniFiltereBtnWE;
//
//	@FindBy(xpath = "//header/div/button[3]")
//	protected WebElement osvjeziBtnWE;
//
//	@FindBy(xpath = "//header/div/a")
//	protected WebElement dodajBtnWE;
	
	@FindBy(xpath = "//span[text()='Uspješno završeno.']")
	public WebElement porukaWE;

	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	public WebElement filterKolona2WE;
	
	@FindBy(xpath = "//td[3]/div/div/div/div[1]/input")
	public WebElement filterKolona3WE;
	
	@FindBy(xpath = "//td[4]/div/div/div/div[1]/input")
	public WebElement filterKolona4WE;
	
	@FindBy(xpath = "//td[6]/div/div[1]/div/div/div/div[1]/input")
	public WebElement filterKolona6WE;
	
	@FindBy(xpath = "//tr/td[8]/div/div/div/div[1]/input")
	public WebElement filterKolona8WE;
	
	@FindBy(xpath = "//tr/td[9]/div/div/div/div[1]/input")
	public WebElement filterKolona9WE;
	
	@FindBy(xpath = "//div[1]/nav/div/div[1]")
	public WebElement naslovStraniceWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr[1]/td[2]")
	public WebElement podatak2TabelaWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr[1]/td[3]")
	public WebElement podatak3TabelaWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr[1]/td[4]")
	public WebElement podatak4TabelaWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr[1]/td[6]")
	public WebElement podatak6TabelaWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr[1]/td[8]")
	public WebElement podatak8TabelaWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr[1]/td[9]")
	public WebElement podatak9TabelaWE;
	
	@FindBy(xpath = "//div[@class='v-card__title title mb-0 word-break']")
	private WebElement brisanjePopUpWE;
	
	@FindBy(xpath = "(//i[@aria-hidden = 'true' and contains(@class, 'fa-calendar-alt')])[1]")
    protected WebElement datumBtn1WE;
	
	@FindBy(xpath = "(//i[@aria-hidden = 'true' and contains(@class, 'fa-calendar-alt')])[2]")
	protected WebElement datumBtn2WE;
	
	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table--date')])[1]")  
    protected WebElement datumKalendar1WE;
    
    @FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table--date')])[2]")  
    protected WebElement datumKalendar2WE;
    
    @FindBy(xpath = "(//*[contains(@class, 'v-btn--floating v-btn--outline')])")  
    protected WebElement trenutniDatum1WE;
    
    @FindBy(xpath = "(//*[contains(@class, 'v-btn--floating v-btn--outline')])[2]")  
    protected WebElement trenutniDatum2WE;

//	 Sekcije

	@FindBy(xpath = "//*[contains(text(),'Šifarnici') and @class='v-btn__content']")
	protected WebElement sifarniciWE;

	@FindBy(xpath = "//*[contains(text(),'Tarifni sistem') and @class='v-btn__content']")
	protected WebElement tarifniSistemWE;

	@FindBy(xpath = "//*[contains(text(),'Mjerna mjesta') and @class='v-btn__content']")
	protected WebElement mjernaMjestaWE;

	@FindBy(xpath = "//*[contains(text(),'Kupci') and @class='v-btn__content']")
	protected WebElement kupciWE;
	
	@FindBy(xpath = "//*[contains(text(),'Mjerila') and @class='v-btn__content']")
	protected WebElement mjerilaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Očitanja') and @class='v-btn__content']")
	protected WebElement ocitanjaWE;

	@FindBy(xpath = "//*[contains(text(),'Obračun') and @class='v-btn__content']")
	protected WebElement obracunWE;
	
	@FindBy(xpath = "//*[contains(text(),'Finansije') and @class='v-btn__content']")
	protected WebElement finansijeWE;
	
	@FindBy(xpath = "//*[contains(text(),'Isključenja') and @class='v-btn__content']")
	protected WebElement iskljucenjaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Pravni odnosi') and @class='v-btn__content']")
	protected WebElement pravniOdnosiWE;
	
	@FindBy(xpath = "//*[contains(text(),'Izvještaji') and @class='v-btn__content']")
	protected WebElement izvjestajiWE;
	
	@FindBy(xpath = "//*[contains(text(),'Administracija') and @class='v-btn__content']")
	protected WebElement administracijaWE;

	@FindBy(xpath = "//i[contains(@class, 'iconPosition fa fa-user')]")
	protected WebElement profilWE;
	
	
	
	// Stranice
	
	@FindBy(xpath = "//div[contains(text(), 'Organizacije')]")
	protected WebElement organizacijeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Fizička lica')]")
	protected WebElement fizikaLicaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Države')]")
	protected WebElement drzaveWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Entiteti')]")
	protected WebElement entitetiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Naseljena mjesta')]")
	protected WebElement naseljenaMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjesne zajednice')]")
	protected WebElement mjesneZajedniceWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Reoni')]")
	protected WebElement reoniWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Pošte')]")
	protected WebElement posteWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Ulice')]")
	protected WebElement uliceWE;
	
	@FindBy(xpath = "//div[@class='v-list__tile__content' and text()='Zone']")
	protected WebElement zoneWE;
	
	@FindBy(xpath = "//div[@class='v-list__tile__content' and text()='Zone DMA']")
	protected WebElement zoneDmaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Radni statusi')]")
	protected WebElement radniStatusiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Toplotne stanice')]")
	protected WebElement toplotneStaniceWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Toplotni reoni')]")
	protected WebElement toplotniReoniWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Toplovodi')]")
	protected WebElement toplovodiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi kalorimetara')]")
	protected WebElement tipoviKalorimetaraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Proizvođači kalorimetara')]")
	protected WebElement proizvodjaciKalorimetaraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjerila')]")
	protected WebElement mjerila1WE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korektori')]")
	protected WebElement korektoriWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi')]")
	protected WebElement tipoviWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Proizvođači')]")
	protected WebElement proizvodjaciWE;
	
	@FindBy(xpath = "//div[@class='v-list__tile__content' and text()='Vrste']")
	protected WebElement vrsteWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste kalorimetara')]")
	protected WebElement vrsteKalorimetaraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Proizvođači vodomjera')]")
	protected WebElement proizvodjaciVodomjeraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Profili mjerila')]")
	protected WebElement profiliMjerilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste vodomjera')]")
	protected WebElement vrsteVodomjeraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Indirektna potrošnja')]")
	protected WebElement indirektnaPotrosnjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Objekti')]")
	protected WebElement objektiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tarifne nadgrupe')]")
	protected WebElement tarifneNadgrupeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tarifne grupe')]")
	protected WebElement tarifneGrupeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tarifne podgrupe')]")
	protected WebElement tarifnePodgrupeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tarifni modeli')]")
	protected WebElement tarifniModeliWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Dani i sati grijanja')]")
	protected WebElement daniISatiGrijanjaWE;
	
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi potrošača')]")
	protected WebElement tipoviPotrosacaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Usluge')]")
	protected WebElement uslugeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nestandardne usluge')]")
	protected WebElement nesUslugeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Cjenovnik')]")
	protected WebElement cjenovnikWE;
	
	@FindBy(xpath = "//div[@class='v-list__tile__content' and text()='Kupci']")
	protected WebElement kupci1WE;
	
	@FindBy(xpath = "//div[contains(text(), 'Kupci bez ugovora')]")
	protected WebElement kupciBezUgovoraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Prostori')]")
	protected WebElement prostoriWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjerni instrumenti')]")
	protected WebElement mjerniInstrumentiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Ugovori')]")
	protected WebElement ugovoriWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Bonifikacije')]")
	protected WebElement bonifikacijeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zone očitanja')]")
	protected WebElement zoneOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nalog za očitanja')]")
	protected WebElement nalogZaOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Očitanja')]")
	protected WebElement ocitanja1WE;
	
	@FindBy(xpath = "//div[contains(text(), 'Neregularna očitanja')]")
	protected WebElement neregularnaOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Čitačke knjige')]")
	protected WebElement citackeKnjigeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Grejne sezone')]")
	protected WebElement grejneSezoneWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Monitoring očitanja')]")
	protected WebElement monitoringOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Računi')]")
	protected WebElement racuniWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zbirni računi')]")
	protected WebElement zbirniRacuniWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekcije računa')]")
	protected WebElement korekcijeRacunaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Parametri obračuna')]")
	protected WebElement parametriObracunaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Avansne fakture')]")
	protected WebElement avansneFaktureWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Računi za nestandardne usluge')]")
	protected WebElement racuniZaNestandardneUslugeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Finansijske kartice')]")
	protected WebElement finansijskeKarticeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Dnevnici uplata')]")
	protected WebElement dnevniciUplataWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Sve uplate')]")
	protected WebElement sveUplateWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Banke')]")
	protected WebElement bankeWE;

	@FindBy(xpath = "//div[contains(text(), 'Žiro računi')]")
	protected WebElement ziroRacuniWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Rokovi plaćanja')]")
	protected WebElement rokoviPlacanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Oslobađanje od kamate')]")
	protected WebElement oslobadjanjeOdKamateWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nalozi za isključenje')]")
	protected WebElement naloziZaIskljucenjeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Opomene pred isključenje')]")
	protected WebElement opomenePredIskljucenjeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Opomene')]")
	protected WebElement opomeneWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Presude')]")
	protected WebElement presudeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tužbe')]")
	protected WebElement tuzbeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste presuda')]")
	protected WebElement vrstePresudaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Statusi naloga za isključenje')]")
	protected WebElement statusiNalogaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nalozi za obračun')]")
	protected WebElement naloziZaObracunWE;
	
	@FindBy(xpath = "//div[contains(text(), 'TEF obrasci')]")
	protected WebElement tefObrasciWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Prenos salda po stavkama')]")
	protected WebElement prenosSaldaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Kupci sa neiskorištenim avansom')]")
	protected WebElement kupciSaNeiskoristenimAvansomWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Reprogrami')]")
	protected WebElement reprogramiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Administracija korisnika')]")
	protected WebElement administracijaKorisnikaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Poruke')]")
	protected WebElement porukeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Dnevnik izmjena')]")
	protected WebElement dnevnikIzmjenaWE;
	
//  ORGANIZACIJE
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'KP Gradska čistoća')]")
	public WebElement orgCistocaGradiskaWE;
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'Grad Gradiška')]")
	public WebElement orgGradGradiskaWE;
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'KP Toplana')]")
	public WebElement orgToplanaGradiskaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'Toplane - INS a.d. Istočno Sarajevo')]")
	public WebElement orgToplanaInsWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'Eko Toplane Banja Luka d.o.o.')]")
	public WebElement orgEkoToplanaWE;
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'KP Vodovod')]")
	public WebElement orgVodovodGradiskaWE;
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'SON')]")
	public WebElement orgSonWE;
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'Sarajevo-gas a.d. Istočno Sarajevo')]")
	public WebElement orgGasWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'Vodovod')]")
	public WebElement orgVodovodIsWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'KP \"VODOVOD I KANALIZACIJA\" A.D. ISTOČNO SARAJEVO')]")
	public WebElement orgSonISVodovodWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'Administracija')]")
	public WebElement orgAdministracijaWE;

	public void verifikujPocetnuStranicu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		Thread.sleep(1000);
	}
	
	public void verifikacijaZajednickihElemenata(String sekcija, String stranica, String naslovStranice, int brKolona,
			boolean importBtn, boolean dodajSve, boolean dodaj, boolean preuzmiExcel, boolean ukloniFiltere,
			boolean osvjezi, boolean info) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals(sekcija), stranica + ": Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals(stranica), stranica + ": Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals(naslovStranice), stranica + ": Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == brKolona, stranica + ": Broj kolona nije dobar!");
		if (importBtn == true) {
			wait.until(ExpectedConditions.elementToBeClickable(importujBtnWE));
		}
		if (dodajSve == true) {
			wait.until(ExpectedConditions.elementToBeClickable(dodajSveBtnWE));
		}
		if (dodaj == true) {
			wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		}
		if (preuzmiExcel == true) {
			wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		}
		if (ukloniFiltere == true) {
			wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		}
		if (osvjezi == true) {
			wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		}
		if (info == true) {
			wait.until(ExpectedConditions.elementToBeClickable(infoBtnWE));
		}
	}
	
		public void pretraziStavku(WebElement element, String value) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		element.clear();
		element.sendKeys(value);
		element.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
	}
		
	public void verifikujPoruku(String poruka) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().trim().equals(poruka), "Poruka upozorenja nije dobra!");
	}

	public void verifikujPraznuTabelu() {
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "PraznaTabela: Poruka prazne tabele nije dobra!");
	}
	
	public void verifikujStavku(String value, WebElement tableValue) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(tableValue));
		wait.until(ExpectedConditions.elementToBeClickable(tableValue));
		assertTrue(tableValue.getText().equals(value), "Verifikacija nije uspješna!");
	}
	
	public void obrisiStavku() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOf(brisanjePopUpWE));
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		potvrdiBrisanjeBtnWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public void izlogujSe() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		profilWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izlogujSeWE));
		izlogujSeWE.click();
	}
	
	public FizickaLica navigirajNaFizickaLica() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizikaLicaWE));
		fizikaLicaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("FIZICKA.LICA"));
			}
		return new FizickaLica(driver);
		}
	

 		public Objekti navigirajNaObjekte() throws Exception {
 		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(objektiWE));
		objektiWE.click();
 		}
 		catch (Exception e) {
 			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("OBJEKTI"));
 			}
		return new Objekti(driver);
	}

	public Organizacije navigirajNaOrganizacije()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(organizacijeWE));
		organizacijeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ORGANIZACIJE"));
			}
		return new Organizacije(driver);
	}
	
	public Drzave navigirajNaDrzave()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(drzaveWE));
		drzaveWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("DRZAVE"));
			}
		return new Drzave(driver);
	}
	
	public Entiteti navigirajNaEntitete()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(entitetiWE));
		entitetiWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ENTITETI"));
			}
		return new Entiteti(driver);
	}
	
	public NaseljenaMjesta navigirajNaNaseljenaMjesta()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naseljenaMjestaWE));
		naseljenaMjestaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("NASELJENA.MJESTA"));
			}
		return new NaseljenaMjesta(driver);
	}
	
	public MjesneZajednice navigirajNaMjesneZajednice()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjesneZajedniceWE));
		mjesneZajedniceWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("MJESNE.ZAJEDNICE"));
			}
		return new MjesneZajednice(driver);
	}
	
	public Reoni navigirajNaReone()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(reoniWE));
		reoniWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("REONI"));
			}
		return new Reoni(driver);
	}
	
	public Poste navigirajNaPoste()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(posteWE));
		posteWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("POSTE"));
			}
		return new Poste(driver);
	}
	
	public Ulice navigirajNaUlice()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uliceWE));
		uliceWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ULICE"));
			}
		return new Ulice(driver);
	}
	
	public Zone navigirajNaZone()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		//driver.findElement(By.linkText("Zone")).click();
		wait.until(ExpectedConditions.elementToBeClickable(zoneWE));
		zoneWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ZONE"));
			}
		return new Zone(driver);
	}
	
	public ZoneDma navigirajNaZoneDma()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		//driver.findElement(By.linkText("Zone DMA")).click();
		wait.until(ExpectedConditions.elementToBeClickable(zoneDmaWE));
		zoneDmaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ZONE.DMA"));
			}
		return new ZoneDma(driver);
	}
	
	public RadniStatusi navigirajNaRadneStatuse ()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(radniStatusiWE));
		radniStatusiWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("RADNI.STATUSI"));
			}
		return new RadniStatusi(driver);
	}
	
	public ToplotneStanice navigirajNaToplotneStanice()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(toplotneStaniceWE));
		toplotneStaniceWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TOPLOTNE.STANICE"));
			}
		return new ToplotneStanice(driver);
	}
	
	public ToplotniReoni navigirajNaToplotneReone()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(toplotniReoniWE));
		toplotniReoniWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TOPLOTNI.REONI"));
			}
		return new ToplotniReoni(driver);
	}
	
	public Toplovodi navigirajNaToplovode()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(toplovodiWE));
		toplovodiWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TOPLOVODI"));
			}
		return new Toplovodi(driver);
	}
	
	public TipoviKalorimetara navigirajNaTipoveKalorimetara()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviKalorimetaraWE));
		tipoviKalorimetaraWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TIPOVI.KALORIMETARA"));
			}
		return new TipoviKalorimetara(driver);
	}
	
	public ProizvodjaciKalorimetara navigirajNaProizvodjaceKalorimetara()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(proizvodjaciKalorimetaraWE));
		proizvodjaciKalorimetaraWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PROIZVODJACI.KALORIMETARA"));
			}
		return new ProizvodjaciKalorimetara(driver);
	}
	
	public Kalorimetri navigirajNaKalorimetre()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjerniInstrumentiWE));
		mjerniInstrumentiWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("MJERNI.INSTRUMENTI.TOPLANA"));
			}
		return new Kalorimetri(driver);
	}
	
	public Mjerila navigirajNaMjerila()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjerilaWE));
		mjerilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjerila1WE));
		mjerila1WE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("MJERILA"));
			}
		return new Mjerila(driver);
	}
	
	public Korektori navigirajNaKorektore()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korektoriWE));
		korektoriWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("KOREKTORI"));
			}
		return new Korektori(driver);
	}
	
	public TipoviMjerila navigirajNaTipoveMjerila()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjerilaWE));
		mjerilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviWE));
		tipoviWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TIPOVI.MJERILA"));
			}
		return new TipoviMjerila(driver);
	}
	
	public ProizvodjaciMjerila navigirajNaProizvodjaceMjerila()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjerilaWE));
		mjerilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(proizvodjaciWE));
		proizvodjaciWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PROIZVODJACI.MJERILA"));
			}
		return new ProizvodjaciMjerila(driver);
	}
	
	public VrsteMjerila navigirajNaVrsteMjerila()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjerilaWE));
		mjerilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteWE));
		vrsteWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("VRSTE.MJERILA"));
			}
		return new VrsteMjerila(driver);
	}
	
	public VrsteKalorimetara navigirajNaVrsteKalorimetara()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteKalorimetaraWE));
		vrsteKalorimetaraWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("VRSTE.KALORIMETARA"));
			}
		return new VrsteKalorimetara(driver);
	}
	
	public ProizvodjaciVodomjera navigirajNaProizvodjaceVodomjera()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(proizvodjaciVodomjeraWE));
		proizvodjaciVodomjeraWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PROIZVODJACI.VODOMJERA"));
			}
		return new ProizvodjaciVodomjera(driver);
	}
	
	public ProfiliMjerila navigirajNaProfileMjerila()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjerilaWE));
		mjerilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(profiliMjerilaWE));
		profiliMjerilaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PROFILI.MJERILA"));
			}
		return new ProfiliMjerila(driver);
	}
	
	public VrsteVodomjera navigirajNaVrsteVodomjera()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteVodomjeraWE));
		vrsteVodomjeraWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("VRSTE.VODOMJERA"));
			}
		return new VrsteVodomjera(driver);
	} 
	
	public IndirektnaPotrosnja navigirajNaIndirektnuPotrosnju()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(indirektnaPotrosnjaWE));
		indirektnaPotrosnjaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("INDIREKTNA.POTROSNJA"));
			}
		return new IndirektnaPotrosnja(driver);
	}
	
	public TarifneNadgrupe navigirajNaTarifneNadgrupe()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneNadgrupeWE));
		tarifneNadgrupeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TARIFNE.NADGRUPE"));
			}
		return new TarifneNadgrupe(driver);
	}
	
	public TarifneGrupe navigirajNaTarifneGrupe()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneGrupeWE));
		tarifneGrupeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TARIFNE.GRUPE"));
			}
		return new TarifneGrupe(driver);
	}
	
	public TarifnePodgrupe navigirajNaTarifnePodgrupe()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifnePodgrupeWE));
		tarifnePodgrupeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TARIFNE.PODGRUPE"));
			}
		return new TarifnePodgrupe(driver);
	}
	
	public TarifniModeli navigirajNaTarifneModele()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifniModeliWE));
		tarifniModeliWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TARIFNI.MODELI"));
			}
		return new TarifniModeli(driver);
	}
	
	public DaniISatiGrijanja navigirajNaDaneISateGrijanja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(daniISatiGrijanjaWE));
		daniISatiGrijanjaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("DANI.I.SATI.GRIJANJA"));
			}
		return new DaniISatiGrijanja(driver);
	}
	
	public TipoviPotrosaca navigirajNaTipovePotrosaca()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviPotrosacaWE));
		tipoviPotrosacaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TIPOVI.POTROSACA"));
			}
		return new TipoviPotrosaca(driver);
	}
	
	public Usluge navigirajNaUsluge()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uslugeWE));
		uslugeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("USLUGE"));
			}
		return new Usluge(driver);
	}
	
	public NestandardneUsluge navigirajNaNestandardneUsluge()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nesUslugeWE));
		nesUslugeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("NESTANDARDNE.USLUGE"));
			}
		return new NestandardneUsluge(driver);
	}
	
	public Cjenovnik navigirajNaCjenovnik()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnikWE));
		cjenovnikWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("CJENOVNIK"));
			}
		return new Cjenovnik(driver);
	}

	public Kupci navigirajNaKupce()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupci1WE));
		kupci1WE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("KUPCI"));
			}
		return new Kupci(driver);
	}
	
	public KupciBezUgovora navigirajNaKupceBezUgovora()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupciBezUgovoraWE));
		kupciBezUgovoraWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("KUPCI.BEZ.UGOVORA"));
			}
		return new KupciBezUgovora(driver);
	}
	
	public Prostori navigirajNaProstore()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(prostoriWE));
		prostoriWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PROSTORI"));
			}
		return new Prostori(driver);
	}
	
	public Vodomjeri navigirajNaVodomjere()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjerniInstrumentiWE));
		mjerniInstrumentiWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("MJERNI.INSTRUMENTI.VODOVOD"));
			}
		return new Vodomjeri(driver);
	}
	
	public Ugovori navigirajNaUgovore()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ugovoriWE));
		ugovoriWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("UGOVORI.VODOVOD"));
			}
		return new Ugovori(driver);
	}
	
	public Bonifikacije navigirajNaBonifikacije()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(bonifikacijeWE));
		bonifikacijeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("BONIFIKACIJE"));
			}
		return new Bonifikacije(driver);
	}
	
	public ZoneOcitanja navigirajNaZoneOcitanja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zoneOcitanjaWE));
		zoneOcitanjaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ZONE.OCITANJA"));
			}
		return new ZoneOcitanja(driver);
	}
	
	public NalogZaOcitanja navigirajNaNalogeZaOcitanja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nalogZaOcitanjaWE));
		nalogZaOcitanjaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("NALOG.ZA.OCITANJA"));
			}
		return new NalogZaOcitanja(driver);
	}
	
	public Ocitanja navigirajNaOcitanja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ocitanja1WE));
		ocitanja1WE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("OCITANJA"));
			}
		return new Ocitanja(driver);
	}
	
	public NeregularnaOcitanja navigirajNaNeregularnaOcitanja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(neregularnaOcitanjaWE));
		neregularnaOcitanjaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("NEREGULARNA.OCITANJA"));
			}
		return new NeregularnaOcitanja(driver);
	}
	
	public CitackeKnjige navigirajNaCitackeKnjige()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citackeKnjigeWE));
		citackeKnjigeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("CITACKE.KNJIGE"));
			}
		return new CitackeKnjige(driver);
	}
	
	public GrejneSezone navigirajNaGrejneSezone()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(grejneSezoneWE));
		grejneSezoneWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("GREJNE.SEZONE"));
			}
		return new GrejneSezone(driver);
	}
	
	public MonitoringOcitanja navigirajNaMonitoringOcitanja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monitoringOcitanjaWE));
		monitoringOcitanjaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("MONITORING.OCITANJA"));
			}
		return new MonitoringOcitanja(driver);
	}
	
	public Racuni navigirajNaRacune()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(racuniWE));
		racuniWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("RACUNI"));
			}
		return new Racuni(driver);
	}
	
	public ZbirniRacuni navigirajNaZbirneRacune()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zbirniRacuniWE));
		zbirniRacuniWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ZBIRNI.RACUNI"));
			}
		return new ZbirniRacuni(driver);
	}
	
	public RacuniZaNestandardneUsluge navigirajNaRacuneZaNestandardneUsluge()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(racuniZaNestandardneUslugeWE));
		racuniZaNestandardneUslugeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("RACUNI.ZA.NESTANDARDNE.USLUGE"));
			}
		return new RacuniZaNestandardneUsluge(driver);
	}
	
	public KorekcijeRacuna navigirajNaKorekcijeRacuna()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeRacunaWE));
		korekcijeRacunaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("KOREKCIJE.RACUNA"));
			}
		return new KorekcijeRacuna(driver);
	}
	
	public ParametriObracuna navigirajNaParametreObracuna()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(parametriObracunaWE));
		parametriObracunaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PARAMETRI.OBRACUN"));
			}
		return new ParametriObracuna(driver);
	}
	
	public AvansneFakture navigirajNaAvansneFakture()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(avansneFaktureWE));
		avansneFaktureWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("AVANSNE.FAKTURE"));
			}
		return new AvansneFakture(driver);
	}
	
	public FinansijskeKartice navigirajNaFinansijskeKartice()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(finansijskeKarticeWE));
		finansijskeKarticeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("FINASIJSKE.KARTICE"));
			}
		return new FinansijskeKartice(driver);
	}
	
	public DnevniciUplata navigirajNaDnevnikeUplata()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dnevniciUplataWE));
		dnevniciUplataWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("DNEVNICI.UPLATA"));
			}
		return new DnevniciUplata(driver);
	}
	
	public SveUplate navigirajNaSveUplate()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sveUplateWE));
		sveUplateWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("SVE.UPLATE"));
			}
		return new SveUplate(driver);
	}
	
	public Banke navigirajNaBanke()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(bankeWE));
		bankeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("BANKE"));
			}
		return new Banke(driver);
	}
	
	public ZiroRacuni navigirajNaZiroRacune()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacuniWE));
		ziroRacuniWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ZIRO.RACUNI"));
			}
		return new ZiroRacuni(driver);
	}
	
	public RokoviPlacanja navigirajNaRokovePlacanja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(rokoviPlacanjaWE));
		rokoviPlacanjaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ROKOVI.PLACANJA"));
			}
		return new RokoviPlacanja(driver);
	}
	
	public OslobadjanjeOdKamate navigirajNaOslobadjanjeodKamate()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(oslobadjanjeOdKamateWE));
		oslobadjanjeOdKamateWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("OSLOBADJANJE.OD.KAMATE"));
			}
		return new OslobadjanjeOdKamate(driver);
	}
	
	public NaloziZaIskljucenje navigirajNaNalogeZaIskljucenja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(iskljucenjaWE));
		iskljucenjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naloziZaIskljucenjeWE));
		naloziZaIskljucenjeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("NALOZI.ZA.ISKLJUCENJA.VODOVOD"));
			}
		return new NaloziZaIskljucenje(driver);
	}

	public OpomenePredIskljucenje navigirajNaOpomenePredIskljucenja()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(iskljucenjaWE));
		iskljucenjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opomenePredIskljucenjeWE));
		opomenePredIskljucenjeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("OPOMENE.PRED.ISKLJUCENJE"));
			}
		return new OpomenePredIskljucenje(driver);
	}
	
	public StatusiNalogaZaIskljucenje navigirajNaStatuseNaloga()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(iskljucenjaWE));
		iskljucenjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(statusiNalogaWE));
		statusiNalogaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("STATUSI.NALOGA.ZA.ISKLJUCENJE"));
			}
		return new StatusiNalogaZaIskljucenje(driver);
	}
	
	public Opomene navigirajNaOpomene()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opomeneWE));
		opomeneWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("OPOMENE"));
			}
		return new Opomene(driver);
	}
	
	public Tuzbe navigirajNaTuzbe()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tuzbeWE));
		tuzbeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TUZBE"));
			}
		return new Tuzbe(driver);
	}
	
	public Presude navigirajNaPresude()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(presudeWE));
		presudeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PRESUDE"));
			}
		return new Presude(driver);
	}
	
	public VrstePresuda navigirajNaVrstePresuda()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrstePresudaWE));
		vrstePresudaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("VRSTE.PRESUDA"));
			}
		return new VrstePresuda(driver);
	}
	
	public NalogZaObracun navigirajNaNalogeZaObracun()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naloziZaObracunWE));
		naloziZaObracunWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("NALOZI.ZA.OBRACUN"));
			}
		return new NalogZaObracun(driver);
	}

	public TefObrasci navigirajNaTefObrasce()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tefObrasciWE));
		tefObrasciWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("TEF.OBRASCI"));
			}
		return new TefObrasci(driver);
	}
	
	public PrenosSaldaPoStavkama navigirajNaPrenosSaldaPoStavkama()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(prenosSaldaWE));
		prenosSaldaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PRENOS.SALDA.PO.STAVKAMA"));
			}
		return new PrenosSaldaPoStavkama(driver);
	}
	
	public KupciSaNeiskoristenimAvansom navigirajNaKupceSaNeiskoristenimAvansom()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupciSaNeiskoristenimAvansomWE));
		kupciSaNeiskoristenimAvansomWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("KUPCI.SA.NEISKORISTENIM.AVANSOM"));
			}
		return new KupciSaNeiskoristenimAvansom(driver);
	}
	
	public Reprogrami navigirajNaReprograme()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(reprogramiWE));
		reprogramiWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("REPROGRAMI"));
			}
		return new Reprogrami(driver);
	}
	
	public AdministracijaKorisnika navigirajNaAdministracijaKorisnika()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(administracijaKorisnikaWE));
		administracijaKorisnikaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("ADMINISTRACIJA.KORISNIKA"));
			}
		return new AdministracijaKorisnika(driver);
	}
	
	public Poruke navigirajNaPoruke()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(porukeWE));
		porukeWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("PORUKE"));
			}
		return new Poruke(driver);
	}
	
	public DnevnikIzmjena navigirajNaDnevnikIzmjena()throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dnevnikIzmjenaWE));
		dnevnikIzmjenaWE.click();
		}
		catch (Exception e) {
			driver.get(scp_properties.getValue("URL.SCP") + scp_properties.getValue("DNEVNIK.IZMJENA"));
			}
		return new DnevnikIzmjena(driver);
	}
	
}