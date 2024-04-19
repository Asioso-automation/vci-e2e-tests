package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Usluge extends PocetnaStranica{

	public Usluge(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input") 
	private WebElement sifraWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[2]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[3]/div[1]/div/div/div[1]/div/input") 
	private WebElement jedinicaMjereWE;
	
	@FindBy(xpath = "//div/div[1]/div[3]/div[3]/div/div/div[1]/div/input") 
	private WebElement tarifniStavWE;

	public void verifikujUsluge()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Usluge')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Usluge", "Usluge", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipObracuna1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNacinObracunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifniStavWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJedinicaMjereWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvStopa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVazeca1WE));
	}
	
	public void verifikujUslugeSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Usluge')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Usluge", "Usluge", 10, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipObracuna1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNacinObracunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifniStavWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJedinicaMjereWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvStopa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVazeca1WE));
	}
	
	public String dodajUsluge()throws InterruptedException{
		String usluga = "Usluga" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sifraWE));
		sifraWE.sendKeys(Helper.getRandomString(6));
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(usluga);
		wait.until(ExpectedConditions.elementToBeClickable(jedinicaMjereWE));
		jedinicaMjereWE.sendKeys(Helper.getRandomString(3));
		wait.until(ExpectedConditions.elementToBeClickable(tarifniStavWE));
		tarifniStavWE.sendKeys(Helper.getRandomString(3));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return usluga;
	}
	
}
