package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Vodomjeri extends PocetnaStranica{

	public Vodomjeri(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Serijski broj']") 
	private WebElement srBrWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Početno očitanje vodomjera']") 
	private WebElement pocetnoOcitanjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Zona očitanja']") 
	private WebElement zoneOcitanjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Tip očitanja']") 
	private WebElement tipOcitanjaWE;
	
	@FindBy(xpath = "//div[1]/div[4]/div[3]/div[1]/div/div[1]/div[2]/input") 
	private WebElement datumInstalacijeWE;

	
	public void verifikujVodomjere()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Vodomjeri')]")));
		verifikacijaZajednickihElemenata("KUPCI", "VODOMJERI", "Vodomjeri", 15, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrUZoniOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSrBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOznakaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProfilWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProizvodjacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIstekaBazdarenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaModulWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
	}
	
	public String dodajVodomjere() throws InterruptedException{
		String srBroj = "SrBr" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(srBrWE));
		srBrWE.sendKeys(srBroj);
		wait.until(ExpectedConditions.elementToBeClickable(zoneOcitanjaWE));
		zoneOcitanjaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		Thread.sleep(1000);
		zoneOcitanjaWE.sendKeys(Keys.ARROW_DOWN);
		zoneOcitanjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(pocetnoOcitanjeWE));
		pocetnoOcitanjeWE.sendKeys("0");
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn2WE));
		datumBtn2WE.click();
		wait.until(ExpectedConditions.invisibilityOf(datumKalendar1WE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipOcitanjaWE));
		tipOcitanjaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		Thread.sleep(700);
		tipOcitanjaWE.sendKeys(Keys.ARROW_DOWN);
		tipOcitanjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumInstalacijeWE));
		datumInstalacijeWE.sendKeys("08.11.2023.");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return srBroj;
	}
	
	
}
