package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.base.PageBase;
import com.platformX.page.PocetnaStranica;

public class PocetnaStranicaPXD extends PageBase {

	public PocetnaStranicaPXD(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	protected WebDriverWait wait = new WebDriverWait(driver, 20);
	
	@FindBy(xpath = "//a[@href='/']")
	protected WebElement pocetnaStranicaWE;
	
	@FindBy(xpath = "//div[1]/div/div/div/div/div/div[2]/input[1]")
	protected WebElement filterKupacWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div/div/div[2]/input[1]")
	protected WebElement filterMjernoMjestoWE;

	@FindBy(xpath = "//div[contains(text(), 'Odjavi se')]")
	protected WebElement izlogujSeWE;
	
	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement submitBtnWE;													// submit - DODAJ/UREDI button na formama za dodavanje/ureÄ‘ivanje Å ifarnika
	
	@FindBy(xpath = "//div[contains(@class, 'menuable__content__active')]")
	protected WebElement aktivniLookupWE;
	
	@FindBy(xpath = "(//button[contains(@aria-label, 'prepended action') and contains(@class, 'fa-calendar-alt')])[1]")
	protected WebElement datumBtn1WE;
	
	@FindBy(xpath = "(//button[contains(@aria-label, 'prepended action') and contains(@class, 'fa-calendar-alt')])[2]")
	protected WebElement datumBtn2WE;
	
	@FindBy(xpath = "(//button[contains(@aria-label, 'prepended action') and contains(@class, 'fa-calendar-alt')])[3]")
	protected WebElement datumBtn3WE;
	
	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table--date')])[1]")  
	protected WebElement datumKalendar1WE;
	
	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table--date')])[2]")  
	protected WebElement datumKalendar2WE;
	
//	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table--date')])[3]")  
//	protected WebElement datumKalendar3WE;
	
	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table__current')])[1]")  
	protected WebElement trenutniDatum1WE;
	
	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table__current')])[2]")  
	protected WebElement trenutniDatum2WE;
	
//	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table__current')])[3]")  
//	protected WebElement trenutniDatum3WE;
		
	@FindBy(xpath = "//i[contains(@class, 'mdi-chevron-right')]")
	public static WebElement strelicaDesnoWE;
	
	@FindBy(xpath = "//i[contains(@class, 'mdi-chevron-left')]")
	public static WebElement strelicaLijevoWE;
	

//	 Sekcije

	@FindBy(xpath = "//*[contains(text(),'Šifarnici') and @class='v-btn__content']")
	protected WebElement sifarniciWE;

	@FindBy(xpath = "//*[contains(text(),'Tarifni sistem') and @class='v-btn__content']")
	protected WebElement tarifniSistemWE;

	@FindBy(xpath = "//*[contains(text(),'Mjerna mjesta') and @class='v-btn__content']")
	protected WebElement mjernaMjestaWE;

	@FindBy(xpath = "//*[contains(text(),'Kupci') and @class='v-btn__content']")
	protected WebElement kupciWE;

	@FindBy(xpath = "//*[contains(text(),'Brojila') and @class='v-btn__content']")
	protected WebElement brojilaWE;

	@FindBy(xpath = "//*[contains(text(),'Obračunski ugovori') and @class='v-btn__content']")
	protected WebElement obracunskiUgovoriWE;
	
	@FindBy(xpath = "//*[contains(text(),'Očitanja') and @class='v-btn__content']")
	protected WebElement ocitanjaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Neovlaštena potrošnja') and @class='v-btn__content']")
	protected WebElement neovlastenaPotrosnjaWE;

	@FindBy(xpath = "//*[text()='Obračun' and @class='v-btn__content']")
	protected WebElement obracunWE;
	
	@FindBy(xpath = "//*[contains(text(),'Administracija') and @class='v-btn__content']")
	protected WebElement administracijaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Izvještaji') and @class='v-btn__content']")
	protected WebElement izvjestajiWE;

	@FindBy(xpath = "(//i[contains(@class, 'fa-user')])[1]")
	protected WebElement profilWE;

//	 Stranice

	@FindBy(xpath = "//div[contains(text(), 'Mjerna mjesta') and @class='v-list-item__title']")
	protected WebElement mjernaMjestaStrWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zbirna/kontrolna mjerna mjesta') and @class='v-list-item__title']")
	protected WebElement zbirnaMjernaMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Energetska kartica') and @class='v-list-item__title']")
	protected WebElement energetskaKarticaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za dostavu podataka') and @class='v-list-item__title']")
	protected WebElement zahtjeviZaDostavuPodatakaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za isključenja') and @class='v-list-item__title']")
	protected WebElement zahtjeviZaIskljucenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za uključenja') and @class='v-list-item__title']")
	protected WebElement zahtjeviZaUkljucenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Razlog neizvršavanja zahtjeva') and @class='v-list-item__title']")
	protected WebElement razlogNeizvrsavanjaZahtjevaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Aktivna isključenja mjernih mjesta') and @class='v-list-item__title']")
	protected WebElement aktivnaIskljucenjaMjernihMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Indirektna mjerna mjesta') and @class='v-list-item__title']")
	protected WebElement indirektnaMjernaMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Kontrola mjernog mjesta') and @class='v-list-item__title']")
	protected WebElement kontrolaMjernogMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Elektroenergetske saglasnosti') and @class='v-list-item__title']")
	protected WebElement elektroenergetskeSaglasnostiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Ugovor o priključenju') and @class='v-list-item__title']")
	protected WebElement ugovorOPrikljucenjuWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Deklaracija o priključku') and @class='v-list-item__title']")
	protected WebElement deklaracijaOPrikljuckuWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Pravna lica') and @class='v-list-item__title']")
	protected WebElement pravnaLicaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Fizička lica') and @class='v-list-item__title']")
	protected WebElement fizickaLicaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za dostavu podataka') and @class='v-list-item__title']")
	protected WebElement zahtjeviZaDostavuPodatakaKupciWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korištena brojila') and @class='v-list-item__title']")
	protected WebElement koristenaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi brojila') and @class='v-list-item__title']")
	protected WebElement tipoviBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Registar brojila') and @class='v-list-item__title']")
	protected WebElement registarBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Izvori napajanja brojila') and @class='v-list-item__title']")
	protected WebElement izvoriNapajanjaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Proizvođači brojila') and @class='v-list-item__title']")
	protected WebElement proizvodjaciBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Sposobnosti priključenja brojila') and @class='v-list-item__title']")
	protected WebElement sposobnostiPrikljucenjaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mogućnost daljinskog pristupa') and @class='v-list-item__title']")
	protected WebElement mogucnostDaljinskogPristupaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Lokacije brojila') and @class='v-list-item__title']")
	protected WebElement lokacijeBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Relokacije brojila') and @class='v-list-item__title']")
	protected WebElement relokacijeBrojilaWE;

	@FindBy(xpath = "//div[contains(text(), 'Razlozi promjene lokacije') and @class='v-list-item__title']")
	protected WebElement razloziPromjeneLokacijeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Naponski nivoi') and @class='v-list-item__title']")
	protected WebElement naponskiNivoiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Strujni nivoi') and @class='v-list-item__title']")
	protected WebElement strujniNivoiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Obračunski ugovori') and @class='v-list-item__title']")
	protected WebElement obracunskiUgovoriStrWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za obračunske ugovore') and @class='v-list-item__title']")
	protected WebElement zahtjeviZaObracunskeUgovoreWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za raskid ugovora') and @class='v-list-item__title']")
	protected WebElement zahtjeviZaRaskidUgovoraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Očitanja brojila') and @class='v-list-item__title']")
    protected WebElement ocitanjaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekcije očitanja') and @class='v-list-item__title']")
    protected WebElement korekcijeOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Importi očitanja') and @class='v-list-item__title']")
    protected WebElement importiOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Izmijenjena očitanja') and @class='v-list-item__title']")
    protected WebElement izmijenjenaOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nevalidna očitanja') and @class='v-list-item__title']")
    protected WebElement nevalidnaOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Čitački hodovi') and @class='v-list-item__title']")
    protected WebElement citackiHodoviWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Čitačke liste') and @class='v-list-item__title']")
    protected WebElement citackeListeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Čitači po čitačkim hodovima') and @class='v-list-item__title']")
    protected WebElement citaciPoCitackimHodovimaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zbirna/kontrolna očitanja') and @class='v-list-item__title']")
    protected WebElement zbirnaKontrolnaOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zbirna/kontrolna potrošnja') and @class='v-list-item__title']")
    protected WebElement zbirnaKontrolnaPotrosnjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Monitoring očitanja') and @class='v-list-item__title']")
    protected WebElement monitoringOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Neovlaštena potrošnja') and @class='v-list-item__title']")
	protected WebElement neovlastenaPotrosnjaStrWE;
	
	@FindBy(xpath = "//*[contains(text(),'Zapisnici o utvrđenoj neovlaštenoj potrošnji') and @class='v-list-item__title']")
	protected WebElement zapisniciOUtvrdjenojNeovlastenojPotrosnjiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nalozi za obračun') and @class='v-list-item__title']")
    protected WebElement naloziZaObracunWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekcije energetskih obračuna') and @class='v-list-item__title']")
    protected WebElement korekcijeEnergetskihObracunaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjesečna odobrenja/zaduženja') and @class='v-list-item__title']")
    protected WebElement mjesecnaOdobrenjaZaduzenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekciona odobrenja/zaduženja') and @class='v-list-item__title']")
    protected WebElement korekcionaOdobrenjaZaduzenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korisnici') and @class='v-list-item__title']")
    protected WebElement korisniciWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Poruke') and @class='v-list-item__title']")
    protected WebElement porukeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Dnevnik izmjena') and @class='v-list-item__title']")
    protected WebElement dnevnikIzmjenaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Pozadinski procesi') and @class='v-list-item__title']")
    protected WebElement pozadinskiProcesiWE;
	
	
	public void verifikujPocetnuStranicu() throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriWE));
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		wait.until(ExpectedConditions.elementToBeClickable(strelicaDesnoWE));
		strelicaDesnoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		wait.until(ExpectedConditions.elementToBeClickable(strelicaLijevoWE));
		strelicaLijevoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(filterMjernoMjestoWE));
		wait.until(ExpectedConditions.elementToBeClickable(filterKupacWE));
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}

	public void logOut() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		profilWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izlogujSeWE));
		izlogujSeWE.click();
	}
	
	public PocetnaStranica navigirajNaPocetnaStranica() throws FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(pocetnaStranicaWE));
		pocetnaStranicaWE.click();
		return new PocetnaStranica(driver);
	}
	
//	public ObracunskiUgovori navigirajNaObracunskiUgovori() throws Exception {
//		try {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriWE));
//		obracunskiUgovoriWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriStrWE));
//		obracunskiUgovoriStrWE.click();
//		}
//		catch (Exception e) {
//			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("OBRACUNSKI.UGOVORI"));
//		}
//		return new ObracunskiUgovori(driver);
//	}
   
    public NeovlastenaPotrosnja navigirajNaNeovlastenaPotrosnja() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(neovlastenaPotrosnjaWE));
		neovlastenaPotrosnjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(neovlastenaPotrosnjaStrWE));
		neovlastenaPotrosnjaStrWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NEOVLASTENA.POTROSNJA"));
		}
    	return new NeovlastenaPotrosnja(driver);
    }
    
    public Poruke navigirajNaPoruke () throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(strelicaDesnoWE));
    	strelicaDesnoWE.click();
    	wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(porukeWE));
	    porukeWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("PORUKE"));
		}
		return new Poruke(driver);
    }
    
//    public DnevnikIzmjena navigirajNaDnevnikIzmjena () throws Exception {
//    	try {
//    	WebDriverWait wait = new WebDriverWait(driver, 10);
//    	wait.until(ExpectedConditions.elementToBeClickable(strelicaDesnoWE));
//    	strelicaDesnoWE.click();
//    	wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
//		administracijaWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(dnevnikIzmjenaWE));
//	    dnevnikIzmjenaWE.click();
//    	}
//    	catch (Exception e) {
//			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("DNEVNIK.IZMJENA"));
//		}
//		return new DnevnikIzmjena(driver);
//    }
    
//    public PozadinskiProcesi navigirajNaPozadinskiProcesi() throws FileNotFoundException, IOException {
//    	try {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//    	wait.until(ExpectedConditions.elementToBeClickable(strelicaDesnoWE));
//    	strelicaDesnoWE.click();
//        wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
//    	administracijaWE.click();
//    	wait.until(ExpectedConditions.elementToBeClickable(pozadinskiProcesiWE));
//    	pozadinskiProcesiWE.click();
//        }
//        catch (Exception e) {
//    		driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("POZADINSKI.PROCESI"));
//    	}
//    	return new PozadinskiProcesi(driver);
//    }
        
}