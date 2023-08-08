package scp.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
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

	
	@FindBy(xpath = "//div[1]/nav/div/div[1]")
	protected WebElement naslovStraniceWE;

//	 Sekcije

	@FindBy(xpath = "//*[contains(text(),'Šifarnici') and @class='v-btn__content']")
	protected WebElement sifarniciWE;

	@FindBy(xpath = "//*[contains(text(),'Tarifni sistem') and @class='v-btn__content']")
	protected WebElement tarifniSistemWE;

	@FindBy(xpath = "//*[contains(text(),'Mjerna mjesta') and @class='v-btn__content']")
	protected WebElement mjernaMjestaWE;

	@FindBy(xpath = "//*[contains(text(),'Kupci') and @class='v-btn__content']")
	protected WebElement kupciWE;
	
	@FindBy(xpath = "//*[contains(text(),'Očitanja') and @class='v-btn__content']")
	protected WebElement ocitanjaWE;

	@FindBy(xpath = "//*[contains(text(),'Obračun') and @class='v-btn__content']")
	protected WebElement obracunWE;
	
	@FindBy(xpath = "//*[contains(text(),'Izvještaji') and @class='v-btn__content']")
	protected WebElement izvjestajiWE;

	@FindBy(xpath = "//div[contains(text(), 'admin admin (Admin)')]")
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
	
	@FindBy(xpath = "//div[contains(text(), 'Zone')]")
	protected WebElement zoneWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zone DMA')]")
	protected WebElement zoneDmaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Radni statusi')]")
	protected WebElement radniStatusiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Proizvođači vodomjera')]")
	protected WebElement proizvodjaciVodomjeraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Profili vodomjera')]")
	protected WebElement profiliVodomjeraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste vodomjera')]")
	protected WebElement vrsteVodomjeraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Indirektni vodomjeri')]")
	protected WebElement indirektniVodomjeriWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Objekti')]")
	protected WebElement objektiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tarfine nadgrupe')]")
	protected WebElement tarifneNadgrupeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tarifne grupe')]")
	protected WebElement tarifneGrupeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tarifne podgrupe')]")
	protected WebElement tarifnePodgrupeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tarifni modeli')]")
	protected WebElement tarifniModeliWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi potrošača')]")
	protected WebElement tipoviPotrosacaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Usluge')]")
	protected WebElement uslugeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nestandardne usluge')]")
	protected WebElement nesUslugeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Cjenovnik')]")
	protected WebElement cjenovnikWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Kupci')]")
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
	
	@FindBy(xpath = "//div[contains(text(), 'Monitoring očitanja')]")
	protected WebElement monitoringOcitanjaWE;
	
	
	
//  ORGANIZACIJE
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'KP Gradska čistoća')]")
	public WebElement orgCistocaGradiskaWE;
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'Grad Gradiška')]")
	public WebElement orgGradGradiskaWE;
	    
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'KP Toplana')]")
	public WebElement orgToplanaGradiskaWE;
	    
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
		try {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		} catch (Exception e) {
			Thread.sleep(500);
		}
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
		try {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		} catch (Exception e) {
			Thread.sleep(1000);
//			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		}
	}

	public void izlogujSe() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		profilWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izlogujSeWE));
		izlogujSeWE.click();
	}
	
	public FizickaLica navigirajNaFizickaLica() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizikaLicaWE));
		fizikaLicaWE.click();
		return new FizickaLica(driver);
	}
	
	public Objekti navigirajNaObjekti() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(objektiWE));
		objektiWE.click();
		return new Objekti(driver);
	}

	public Organizacije navigirajNaOrganizacije()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(organizacijeWE));
		organizacijeWE.click();
		return new Organizacije(driver);
	}
	
	public Drzave navigirajNaDrzave()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(drzaveWE));
		drzaveWE.click();
		return new Drzave(driver);
	}
	
	public Entiteti navigirajNaEntitete()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(entitetiWE));
		entitetiWE.click();
		return new Entiteti(driver);
	}
	
	public NaseljenaMjesta navigirajNaNaseljenaMjesta()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naseljenaMjestaWE));
		naseljenaMjestaWE.click();
		return new NaseljenaMjesta(driver);
	}
	
	public MjesneZajednice navigirajNaMjesneZajednice()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjesneZajedniceWE));
		mjesneZajedniceWE.click();
		return new MjesneZajednice(driver);
	}
	
	public Reoni navigirajNaReone()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(reoniWE));
		reoniWE.click();
		return new Reoni(driver);
	}
	
	public Poste navigirajNaPoste()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(posteWE));
		posteWE.click();
		return new Poste(driver);
	}
	
	public Ulice navigirajNaUlice()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uliceWE));
		uliceWE.click();
		return new Ulice(driver);
	}
	
	public Zone navigirajNaZone()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zoneWE));
		zoneWE.click();
		return new Zone(driver);
	}
	
	public ZoneDma navigirajNaZoneDma()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zoneDmaWE));
		zoneDmaWE.click();
		return new ZoneDma(driver);
	}
	
	public RadniStatusi navigirajNaRadneStatuse ()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(radniStatusiWE));
		radniStatusiWE.click();
		return new RadniStatusi(driver);
	}
	
	public ProizvodjaciVodomjera navigirajNaProizvodjaceVodomjera()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(proizvodjaciVodomjeraWE));
		proizvodjaciVodomjeraWE.click();
		return new ProizvodjaciVodomjera(driver);
	}
	
	public ProfiliVodomjera navigirajNaProfileVodomjera()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(profiliVodomjeraWE));
		profiliVodomjeraWE.click();
		return new ProfiliVodomjera(driver);
	}
	
	public VrsteVodomjera navigirajNaVrsteVodomjera()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteVodomjeraWE));
		vrsteVodomjeraWE.click();
		return new VrsteVodomjera(driver);
	} 
	
	public IndirektniVodomjeri navigirajNaIndirektneVodomjere()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(indirektniVodomjeriWE));
		indirektniVodomjeriWE.click();
		return new IndirektniVodomjeri(driver);
	}
	
	public TarifneNadgrupe navigirajNaTarfineNadgrupe()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneNadgrupeWE));
		tarifneNadgrupeWE.click();
		return new TarifneNadgrupe(driver);
	}
	
	public TarifneGrupe navigirajNaTarifneGrupe()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneGrupeWE));
		tarifneGrupeWE.click();
		return new TarifneGrupe(driver);
	}
	
	public TarifnePodgrupe navigirajNaTarifnePodgrupe()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifnePodgrupeWE));
		tarifnePodgrupeWE.click();
		return new TarifnePodgrupe(driver);
	}
	
	public TarifniModeli navigirajNaTaifneModele()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifniModeliWE));
		tarifniModeliWE.click();
		return new TarifniModeli(driver);
	}
	
	public TipoviPotrosaca navigirajNaTipovePotrosaca()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviPotrosacaWE));
		tipoviPotrosacaWE.click();
		return new TipoviPotrosaca(driver);
	}
	
	public Usluge navigirajNaUsluge()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uslugeWE));
		uslugeWE.click();
		return new Usluge(driver);
	}
	
	public NestandardneUsluge navigirajNaNestandardneUsluge()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nesUslugeWE));
		nesUslugeWE.click();
		return new NestandardneUsluge(driver);
	}
	
	public Cjenovnik navigirajNaCjenovnik()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnikWE));
		cjenovnikWE.click();
		return new Cjenovnik(driver);
	}

	public Kupci navigirajNaKupce()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupci1WE));
		kupci1WE.click();
		return new Kupci(driver);
	}
	
	public KupciBezUgovora navigirajNaKupceBezUgovora()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupciBezUgovoraWE));
		kupciBezUgovoraWE.click();
		return new KupciBezUgovora(driver);
	}
	
	public Prostori navigirajNaProstore()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(prostoriWE));
		prostoriWE.click();
		return new Prostori(driver);
	}
	
	public Vodomjeri navigirajNaVodomjere()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjerniInstrumentiWE));
		mjerniInstrumentiWE.click();
		return new Vodomjeri(driver);
	}
	
	public Ugovori navigirajNaUgovore()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ugovoriWE));
		ugovoriWE.click();
		return new Ugovori(driver);
	}
	
	public Bonifikacije navigirajNaBonifikacije()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(bonifikacijeWE));
		bonifikacijeWE.click();
		return new Bonifikacije(driver);
	}
	
	public ZoneOcitanja navigirajNaZoneOcitanja()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zoneOcitanjaWE));
		zoneOcitanjaWE.click();
		return new ZoneOcitanja(driver);
	}
	
	public NalogZaOcitanja navigirajNaNalogeZaOcitanja()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nalogZaOcitanjaWE));
		nalogZaOcitanjaWE.click();
		return new NalogZaOcitanja(driver);
	}
	
	public Ocitanja navigirajNaOcitanja()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ocitanja1WE));
		ocitanja1WE.click();
		return new Ocitanja(driver);
	}
	
	public NeregularnaOcitanja navigirajNaNeregularnaOcitanja()throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(neregularnaOcitanjaWE));
		neregularnaOcitanjaWE.click();
		return new NeregularnaOcitanja(driver);
	}
}