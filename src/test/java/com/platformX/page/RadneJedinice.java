package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RadneJedinice extends PocetnaStranica {

	public RadneJedinice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivRadneJediniceWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement odsWE;
	
	@FindBy(xpath = "//div[contains(text(), 'New York')]")
	private WebElement odaberiOdsWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	private WebElement jibWE;

	public void verifikujRadneJedinice() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Radne jedinice')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Radne Jedinice", "Radne jedinice", 12, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFaxWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaInternetAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCallCentarWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZiroRacunWE));
	}
	
	public void dodajRadnuJedinicu(String jedinica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivRadneJediniceWE));
		nazivRadneJediniceWE.click();
		nazivRadneJediniceWE.sendKeys(jedinica);
		wait.until(ExpectedConditions.elementToBeClickable(odsWE));
		odsWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiOdsWE));
		odaberiOdsWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(jibWE));
		jibWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		Thread.sleep(500);
	}
	
	public void verifikujRadnuJedinicu(String radnaJedinica) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(radnaJedinica);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela2WE));
		assertTrue(podatak2Tabela2WE.getText().equals(radnaJedinica), "Radne jedinice: Ime radne jedinice nije dobro!");
	}
	
	public void urediRadnuJedinicu(String radnaJedinica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivRadneJediniceWE));
		nazivRadneJediniceWE.click();
		nazivRadneJediniceWE.clear();
		nazivRadneJediniceWE.sendKeys(radnaJedinica);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
	}
	
	public void verifikujBrisanjeRadneJedinice(String jedinica) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(filterKolona2WE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(jedinica);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatak2TabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatak2TabelaWE.getText().equals("Nema podataka"), "Radne jedinice: Poruka prazne tabele nije dobra!");
	}

}