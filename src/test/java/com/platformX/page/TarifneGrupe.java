package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class TarifneGrupe extends PocetnaStranica {
	
	public TarifneGrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	// Elementi sa forme za dodavanje tarifne grupe
	
	@FindBy(xpath = "//div[1]/div[1]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivTarifneGrupeWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement tipUgovoraWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1 - Tip 1')]")
	private WebElement tip1WE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div/input")
	private WebElement ebixSifraWE;
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div[1]/div[1]/input")
	private WebElement grupaObrascaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '1 - Grupa obrasca 1')]")
	private WebElement grupa1WE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/div[1]/input")
	private WebElement nadgrupaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '1 - Tarifna nadgrupa 1')]")
	private WebElement nadgrupa1WE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/div[1]")
	private WebElement kategorijaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '1 - Tarifna kategorija 1')]")
	private WebElement kategorija1WE;
	
	@FindBy(xpath = "//div[2]/div[3]/div/div/div[1]/div[1]/div[1]")
	private WebElement vrstaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '4 - T1')]")
	private WebElement odaberiBrojiloWE;

	public void verifikujTarifneGrupe() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Tarifne grupe')]")));
		verifikacijaZajednickihElemenata2("Tarifni Sistem", "Tarifne Grupe", "Tarifne grupe", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrupaObrascaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNadgrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMaxigrafWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaWE));
	}
	
	public String dodajTarifnuGrupu(String tarifnaGrupa) {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneGrupeWE));
		nazivTarifneGrupeWE.sendKeys(tarifnaGrupa);
		wait.until(ExpectedConditions.elementToBeClickable(tipUgovoraWE));
		tipUgovoraWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tip1WE));
		tip1WE.click();
		ebixSifraWE.sendKeys(Helper.getRandomString(5));
		grupaObrascaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(grupa1WE));
		grupa1WE.click();
		nadgrupaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nadgrupa1WE));
		nadgrupa1WE.click();
		kategorijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kategorija1WE));
		kategorija1WE.click();
		vrstaBrojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBrojiloWE));
		odaberiBrojiloWE.click();
		submitBtnWE.click();
		return tarifnaGrupa;
	}
	
	public String urediTarifnuGrupu(String tarifnaGrupa) {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneGrupeWE));
		nazivTarifneGrupeWE.click();
		nazivTarifneGrupeWE.clear();
		nazivTarifneGrupeWE.sendKeys(tarifnaGrupa);
		submitBtnWE.click();
		return tarifnaGrupa;
	}

}