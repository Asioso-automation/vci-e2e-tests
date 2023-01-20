package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
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

public class UgovorOPrikljucenju extends PocetnaStranica {
	
	public UgovorOPrikljucenju(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement ElektroenergetskaSaglasnostWE;
	
	@FindBy(xpath = "//div[1]/div[1]/div/button")  
	 private WebElement datumBtnWE;
	
	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table__current')])")  
	 private WebElement datumWE;
	
	@FindBy(xpath = "//div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipStandardnogPrikljuckaWE;
	
	@FindBy(xpath = "//div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/div[1]/div/input")  
	 private WebElement brojPrikljucnihVodovaWE;
	
	@FindBy(xpath = "//div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input")  
	 private WebElement jedinicnaCijenaWE;
	
	@FindBy(xpath = "/html/body/div/div[2]/main/div/div/div/div[2]/form/div/div[1]/div[3]/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement kategorijaPotrosnjeIGrupaKupcaWE;
	
	@FindBy(xpath = "//div[3]/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/div[1]/div/input")  
	 private WebElement odobrenaPrikljucnaSnagaKwWE;
	
	@FindBy(xpath = "//div[3]/div/div[1]/div[2]/div/div[1]/div[1]/div[3]/div/div/div[1]/div/input")  
	 private WebElement brojMjernihUredjajaWE;
	
	@FindBy(xpath = "//div[5]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement kategorijaPotrosnjeiGrupaKupacaWE;
	
	@FindBy(xpath = "//div[5]/div/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement prikljucnaSnagaKwWE;
	
	@FindBy(xpath = "//tr[2]/td[4]")
	private WebElement nazivTabelaWE;
	
	@FindBy(xpath = "//td[4]/div/div/div/div[1]/input")  
	 private WebElement filterBrojProtokolaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uspješno završeno.')]")
	private WebElement porukaWE;
	
	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement vrstaPodrucjaWE;
	
	@FindBy(xpath = "//tr[2]/td[4]")  
	 private WebElement brojProtokolaWE;
	
	public void verifikujUgovorOPrikljucenju() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Ugovor o priključenju')]")));
		verifyCommonElements("MJERNA MJESTA", "UGOVOR O PRIKLJUČENJU", "UGOVOR O PRIKLJUČENJU", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaElektroenergetskaSaglasnostWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaPodrucjaWE));
	}

	public String dodajUgovorOPrikljucenju(String nazivEES)throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ElektroenergetskaSaglasnostWE));
		ElektroenergetskaSaglasnostWE.click();
		ElektroenergetskaSaglasnostWE.sendKeys(nazivEES);
		Thread.sleep(1000);
		ElektroenergetskaSaglasnostWE.sendKeys(Keys.ARROW_DOWN);
		ElektroenergetskaSaglasnostWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtnWE));
		datumBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumWE));
		datumWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipStandardnogPrikljuckaWE));
		tipStandardnogPrikljuckaWE.click();
		tipStandardnogPrikljuckaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		tipStandardnogPrikljuckaWE.sendKeys(Keys.ARROW_DOWN);
		tipStandardnogPrikljuckaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojPrikljucnihVodovaWE));
		brojPrikljucnihVodovaWE.click();
		brojPrikljucnihVodovaWE.sendKeys(Helper.getRandomNumber(1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",odobrenaPrikljucnaSnagaKwWE);
		wait.until(ExpectedConditions.elementToBeClickable(kategorijaPotrosnjeIGrupaKupcaWE));
		kategorijaPotrosnjeIGrupaKupcaWE.sendKeys("1");
		Thread.sleep(1000);
		kategorijaPotrosnjeIGrupaKupcaWE.sendKeys(Keys.ARROW_DOWN);
		kategorijaPotrosnjeIGrupaKupcaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(odobrenaPrikljucnaSnagaKwWE));
		odobrenaPrikljucnaSnagaKwWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(brojMjernihUredjajaWE));
		brojMjernihUredjajaWE.sendKeys(Helper.getRandomNumber(1));
		js.executeScript("arguments[0].scrollIntoView(true);",kategorijaPotrosnjeiGrupaKupacaWE);
		kategorijaPotrosnjeiGrupaKupacaWE.sendKeys("1");
		Thread.sleep(1000);
		kategorijaPotrosnjeiGrupaKupacaWE.sendKeys(Keys.ARROW_DOWN);
		kategorijaPotrosnjeiGrupaKupacaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(prikljucnaSnagaKwWE));
		prikljucnaSnagaKwWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		prikljucnaSnagaKwWE.sendKeys(Keys.ARROW_DOWN);
		prikljucnaSnagaKwWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		verifikujPoruku("Uspješno završeno.");
		String brProtokola = brojProtokolaWE.getText();
		return brProtokola;
	}
	
	public void verifikujUgovorOPrikljucenju(String brProtokola) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterBrojProtokolaWE));
		filterBrojProtokolaWE.click();
		filterBrojProtokolaWE.clear();
		filterBrojProtokolaWE.sendKeys(brProtokola);
		filterBrojProtokolaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(brojProtokolaWE));
		assertTrue(brojProtokolaWE.getText().equals(brProtokola), "UgovorOPrikljucenju: Broj protokola nije pronadjen!");
	}
	
	public void urediUgovorOPrikljucenju() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrstaPodrucjaWE));
		vrstaPodrucjaWE.click();
		vrstaPodrucjaWE.sendKeys("2");
		vrstaPodrucjaWE.sendKeys(Keys.ARROW_DOWN);
		vrstaPodrucjaWE.sendKeys(Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",submitBtnWE);
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		assertTrue(porukaWE.getText().equals("Uspješno završeno."), "ElektroenergetskaSaglasnost: Uređivanje nije uspešno!");
	}

}