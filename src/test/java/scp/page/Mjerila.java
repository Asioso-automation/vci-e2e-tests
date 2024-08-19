package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Mjerila extends PocetnaStranica{

	public Mjerila(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	// Gas 
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Serijski broj']") 
	private WebElement srBrWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Početno očitanje mjerila']") 
	private WebElement pocetnoOcitanjeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Tip očitanja']") 
	private WebElement tipOcitanjaWE;
	
	@FindBy(xpath = "//div/div[1]/div[4]/div[1]/div/div/div[1]/div[1]/input") 
	private WebElement tipOcitanjaKorektorWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Šifra plombes']") 
	private WebElement sifraPlombeWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div") 
	private WebElement korektorBtnWE;
	
	// Vodovod
	
	@FindBy(xpath = "//div[1]/div[1]/div[1]/div/div/div[1]/div/input") 
	private WebElement srBr1WE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input") 
	private WebElement pocetnoOcitanje1WE;
	
	@FindBy(xpath = "//div[1]/div[4]/div[1]/div/div/div[1]/div[1]/input") 
	private WebElement tipOcitanja1WE;
	
	@FindBy(xpath = "//div[1]/div[6]/div/div[1]/div/div/div[1]/div/input") 
	private WebElement sifraPlombe1WE;
	
	@FindBy(xpath = "//div/div[1]/div[6]/div/div[2]/div[1]/div/div[1]/div[2]") 
	private WebElement datumPlombeWE;
	
	
	
	public void verifikujMjerila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Mjerila')]")));
		verifikacijaZajednickihElemenata("Mjerila", "Mjerila", "Mjerila", 13, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSrBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOznakaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaModulWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlombaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProizvodjacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIstekBazdarenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
		
	}
	

	public void verifikujMjerilaVodovod()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Mjerila')]")));
		verifikacijaZajednickihElemenata("Mjerila", "Mjerila", "Mjerila", 14, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSrBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOznakaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaModulWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlombaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProfilWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProizvodjacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIstekBazdarenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
	}
	
	
	public String dodajMjerilaGas() throws InterruptedException{
		String srBroj = "SrBr" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		Thread.sleep(1000);
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(srBrWE));
		srBrWE.sendKeys(srBroj);
		wait.until(ExpectedConditions.elementToBeClickable(pocetnoOcitanjeWE));
		pocetnoOcitanjeWE.sendKeys("0");
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipOcitanjaWE));
		tipOcitanjaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		Thread.sleep(700);
		tipOcitanjaWE.sendKeys(Keys.ARROW_DOWN);
		tipOcitanjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn3WE));
		datumBtn3WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sifraPlombeWE));
		sifraPlombeWE.sendKeys("Plomba" + Helper.getRandomNubmer1to8(5));
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn4WE));
		datumBtn4WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return srBroj;
	}
	
	public String dodajMjerilaVodovod() throws InterruptedException{
		String srBroj = "SrBr" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		Thread.sleep(1300);
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(srBr1WE));
		srBr1WE.sendKeys(srBroj);
		wait.until(ExpectedConditions.elementToBeClickable(pocetnoOcitanje1WE));
		pocetnoOcitanje1WE.sendKeys("0");
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipOcitanja1WE));
		tipOcitanja1WE.sendKeys(Helper.getRandomNubmer1to4(1));
		Thread.sleep(700);
		tipOcitanja1WE.sendKeys(Keys.ARROW_DOWN);
		tipOcitanja1WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn3WE));
		datumBtn3WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sifraPlombe1WE));
		sifraPlombe1WE.sendKeys("Plomba" + Helper.getRandomNubmer1to8(5));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");		
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn4WE));
		datumBtn4WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return srBroj;
	}
	
	public String dodajMjerila() throws InterruptedException{
		String srBroj = "SrBr" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		Thread.sleep(1000);
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(srBrWE));
		srBrWE.sendKeys(srBroj);
		wait.until(ExpectedConditions.elementToBeClickable(pocetnoOcitanjeWE));
		pocetnoOcitanjeWE.sendKeys("0");
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipOcitanjaWE));
		tipOcitanjaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		Thread.sleep(700);
		tipOcitanjaWE.sendKeys(Keys.ARROW_DOWN);
		tipOcitanjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn3WE));
		datumBtn3WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sifraPlombeWE));
		sifraPlombeWE.sendKeys("Plomba" + Helper.getRandomNubmer1to8(5));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn4WE));
		datumBtn4WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return srBroj;
	}
	
	public String dodajKorektore()throws InterruptedException{
		String srBroj = "SrBroj" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korektorBtnWE));
		korektorBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(srBrWE));
		srBrWE.sendKeys(srBroj);
		wait.until(ExpectedConditions.elementToBeClickable(tipOcitanjaKorektorWE));
		tipOcitanjaKorektorWE.sendKeys(Helper.getRandomNubmer1to4(1));
		Thread.sleep(700);
		tipOcitanjaKorektorWE.sendKeys(Keys.ARROW_DOWN);
		tipOcitanjaKorektorWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn2WE));
		datumBtn2WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return srBroj;
	}
	
}
