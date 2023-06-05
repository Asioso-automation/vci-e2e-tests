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
import com.platformX.util.Helper;

public class ZiroRacuni extends PocetnaStranica {

	public ZiroRacuni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement odaberiBankuWE;

	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement ziroRacunWE;

	public void verifikujZiroRacuni() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Žiro računi')]")));
		verifikacijaZajednickihElemenata("Finansije", "Žiro Računi", "Žiro računi", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivBankeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojZiroRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}

	public String dodajZiroRacun(String banka) throws InterruptedException {
		String ziroRacun = "111-" + Helper.getRandomNumber(3) + "-" + Helper.getRandomNumber(8) + "-" + Helper.getRandomNumber(2);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBankuWE));
		odaberiBankuWE.click();
		odaberiBankuWE.sendKeys(banka);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacunWE));
		ziroRacunWE.sendKeys(ziroRacun);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return ziroRacun;
	}
	
	public String dodajZiroRacunSaBrojem(String banka, String ziroRacun) throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBankuWE));
		odaberiBankuWE.click();
		odaberiBankuWE.sendKeys(banka);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacunWE));
		ziroRacunWE.sendKeys(ziroRacun);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return ziroRacun;
	}

	public String verifikujZiroRacun(String ziroRacun) throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(filterKolona3WE));
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona3WE));
		filterKolona3WE.click();
		filterKolona3WE.clear();
		filterKolona3WE.sendKeys(ziroRacun);
		filterKolona3WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela3WE));
		try {
			assertTrue(podatak2Tabela3WE.getText().equals(ziroRacun), "ZiroRacuniPage: Ime ziro racuna nije dobro!");
		} catch (Exception e) {
			Thread.sleep(2000);
			assertTrue(podatak2Tabela3WE.getText().contains(ziroRacun), "ZiroRacuniPage: Ime ziro racuna nije dobro!");
		}
		String ziroRacunTabela = podatak2Tabela1WE.getText() + " - " + ziroRacun;
		return ziroRacunTabela;
	}
	
	public String urediZiroRacun() throws InterruptedException {
		String noviZiroRacun = "111-" + Helper.getRandomNumber(3) + "-" + Helper.getRandomNumber(8) + "-" + Helper.getRandomNumber(2);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacunWE));
		ziroRacunWE.click();
		ziroRacunWE.clear();
		ziroRacunWE.sendKeys(noviZiroRacun);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return noviZiroRacun;
	}
	
	public void verifikujBrisanjeZiroRacuna(String ziroRacun) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(filterKolona3WE));
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona3WE));
		filterKolona3WE.click();
		filterKolona3WE.clear();
		filterKolona3WE.sendKeys(ziroRacun);
		filterKolona3WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "ZiroRacuni: Poruka prazne tabele nije dobra!");
	}

}