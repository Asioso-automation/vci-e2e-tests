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

public class Banke extends PocetnaStranica {

	public Banke(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	// Kreiraj banku elementi
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input") 
	private WebElement nazivBankeWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input") 
	private WebElement stampaniNazivBankeWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div/input") 
	private WebElement cifreZiroRacunaWE;
	
	public void verifikujBanke() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Banke')]")));
		verifikacijaZajednickihElemenata2("Finansije", "Banke", "Banke", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPocetneCifreZiroRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaWE));
	}
	
	public String dodajBanku() throws InterruptedException {
		String banka = "Banka " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivBankeWE));
		nazivBankeWE.sendKeys(banka);
		wait.until(ExpectedConditions.elementToBeClickable(stampaniNazivBankeWE));
		stampaniNazivBankeWE.sendKeys(banka);
		wait.until(ExpectedConditions.elementToBeClickable(cifreZiroRacunaWE));
		cifreZiroRacunaWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return banka;
	}
	
	public String dodajBankuSaImenom(String ime) throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivBankeWE));
		nazivBankeWE.sendKeys(ime);
		wait.until(ExpectedConditions.elementToBeClickable(stampaniNazivBankeWE));
		stampaniNazivBankeWE.sendKeys(ime);
		wait.until(ExpectedConditions.elementToBeClickable(cifreZiroRacunaWE));
		cifreZiroRacunaWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return ime;
	}
	
	public String verifikujBanku(String banka) throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(banka);
		filterKolona2WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela2WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		try {
			assertTrue(podatak2Tabela2WE.getText().equals(banka), "Banke: Ime banke nije dobro!");
		} catch (Exception e) {
			Thread.sleep(2000);
			assertTrue(podatak2Tabela2WE.getText().contains(banka), "Banke: Ime banke nije dobro!");
		}
		String bankaTabela = podatak2Tabela1WE.getText() + " - " + banka;
		return bankaTabela;
	}
	
	public String urediBanku() throws InterruptedException {
		String banka = "Banka " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(nazivBankeWE));
		nazivBankeWE.click();
		nazivBankeWE.clear();
		nazivBankeWE.sendKeys(banka);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return banka;
	}
	
	public void verifikujBrisanjeBanke(String banka) throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(filterKolona2WE));
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(banka);
		filterKolona2WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(podatak2TabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatak2TabelaWE.getText().equals("Nema podataka"), "Banke: Poruka prazne tabele nije dobra!");
	}

}