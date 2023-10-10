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

public class Kupci extends PocetnaStranica{

	public Kupci(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//i[contains(@class, 'fa-filter')]")
	protected WebElement filterBtnWE;
	
	// Elemnti forme za dodavanje fizickog lica
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Prezime (ime oca) ime']")
	public WebElement imePrezimeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Naziv']")
	public WebElement nazivWE;
	
	@FindBy(xpath = "//div[2]/div[2]/button[1]")
	public WebElement dodajUgovorWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr/td[2]")
	public WebElement imePrezimeTabelaWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tipKupcaWE;
	
	@FindBy(xpath = "//div[2]/form/div[2]/div[1]/div[3]/div[1]/div/div/div[1]/div[1]/input")
	public WebElement ulicaWE;
	
	@FindBy(xpath = "/html/body/div/div[12]/main/div/div/div/div[2]/form/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div/input")
	public WebElement brojWE;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/a/div/div")
	public WebElement fizickoLiceWE;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[1]/a/div")
	public WebElement pravnoLiceWE;
	
	public void verifikujKupce()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Kupci')]")));
	    verifikacijaZajednickihElemenata("KUPCI", "KUPCI", "Kupci", 12, false, false, true, true, true, true, false);
	    wait.until(ExpectedConditions.elementToBeClickable(filterBtnWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJibJmbgWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifra1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipKupcaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTestniObracunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvObveznik1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikPortalaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOslobodjenPdvaWE));
	}
	
	public String dodajFizickoLiceKupci() throws InterruptedException {
		String ime = Helper.getRandomString(5) + " (" + Helper.getRandomString(5) + ") " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipKupcaWE));
		tipKupcaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizickoLiceWE));
		fizickoLiceWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(imePrezimeWE));
		imePrezimeWE.click();
		imePrezimeWE.sendKeys(ime);
		// TODO Napraviti kolekciju enuma za imena
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		ulicaWE.sendKeys(Keys.ARROW_DOWN);
		ulicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojWE));
		brojWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(dodajUgovorWE));
		dodajUgovorWE.click();
		return ime;
	}
	
	public String dodajPravnoLiceKupci() throws InterruptedException {
		String ime = Helper.getRandomString(5) + " (" + Helper.getRandomString(5) + ") " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipKupcaWE));
		tipKupcaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(pravnoLiceWE));
		pravnoLiceWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.sendKeys(ime);
		// TODO Napraviti kolekciju enuma za imena
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(500);
		ulicaWE.sendKeys(Keys.ARROW_DOWN);
		ulicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojWE));
		brojWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(dodajUgovorWE));
		dodajUgovorWE.click();
		return ime;
	}
	
}
