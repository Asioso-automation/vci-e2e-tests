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
	
	@FindBy(xpath = "//*[@class='v-btn__content' and text()='Finansije']")
	protected WebElement finansijeWE;
	
	@FindBy(xpath = "//*[contains(text(),'Administracija') and @class='v-btn__content']")
	protected WebElement administracijaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Izvještaji') and @class='v-btn__content']")
	protected WebElement izvjestajiWE;

	@FindBy(xpath = "(//i[contains(@class, 'fa-user')])[1]")
	protected WebElement profilWE;
	
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
	
	public void strelicaDesnoNavigate() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(strelicaDesnoWE));
		strelicaDesnoWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(finansijeWE));
		wait.until(ExpectedConditions.visibilityOf(administracijaWE));		
	}
	
}