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

public class KategorijeCijena extends PocetnaStranica {
	
	@FindBy(xpath = "//div[1]/div/div/div/div[1]/div/input")
	private WebElement nazivKategorijeWE;

	public KategorijeCijena(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKategorijeCijena() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Kategorije cijena')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Kategorije Cijena", "Kategorije cijena", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaMrezarineWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTenderskaCijenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVremenskiOgranicenaWE));
	}
	
	public String dodajKategoriju() {
		String kategorija = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivKategorijeWE));
		nazivKategorijeWE.sendKeys(kategorija);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return kategorija;
	}
	
	public void verifikujKategoriju(String kategorija) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(kategorija);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(jedinstvenElementWE));
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela2WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatak2Tabela2WE.getText().equals(kategorija), "KtegorijeCijena: Ime kategorije nije dobro!");
	}
	
	public String urediKategorijuCijena() {
		String novaKategorija = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivKategorijeWE));
		nazivKategorijeWE.click();
		nazivKategorijeWE.clear();
		nazivKategorijeWE.sendKeys(novaKategorija);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return novaKategorija;
	}
	
	public void verifikujBrisanjeKategorije(String kategorija) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(kategorija);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatak2TabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatak2TabelaWE.getText().equals("Nema podataka"), "TarifneGrupe: Poruka prazne tabele nije dobra!");
	}

}