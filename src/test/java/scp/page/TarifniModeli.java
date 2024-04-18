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

public class TarifniModeli extends PocetnaStranica{

	public TarifniModeli(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//form/div/div[1]/div/div[1]/div/div/div[1]/div/input") 
	private WebElement idWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[2]/div/div/div[1]/div/input") 
	private WebElement oznakaModelaWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[3]/div/div/div[1]/div/input") 
	private WebElement osnovaZaObracunWE;
	
	public void verifikujTarifneModele()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tarifni modeli')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Tarifni Modeli", "Tarifni modeli", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOznakaModelaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOsnovaZaObracunWE));
	}
	
	public void verifikujTarifneModeleSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tarifni modeli')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Tarifni Modeli", "Tarifni modeli", 4, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOznakaModelaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOsnovaZaObracunWE));
	}
	
	public String dodajTarifniModeli()throws InterruptedException{
		String model = "TarifniModel" + Helper.getRandomString(3);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(Helper.getRandomString(3));
		wait.until(ExpectedConditions.elementToBeClickable(oznakaModelaWE));
		oznakaModelaWE.sendKeys(model);
		wait.until(ExpectedConditions.elementToBeClickable(osnovaZaObracunWE));
		osnovaZaObracunWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return model;
	}
	
}
