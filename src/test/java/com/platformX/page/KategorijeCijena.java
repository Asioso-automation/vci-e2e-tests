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
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajKategorijuWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterNazivWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivTabelaWE;
	
	@FindBy(xpath = "//td[6]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;

	public KategorijeCijena(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKategorijeCijena() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Kategorije cijena')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaMrezarineWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTenderskaCijenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVremenskiOgranicenaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("TARIFNI SISTEM"), "KategorijeCijena: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("KATEGORIJE CIJENA"), "KategorijeCijena: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("KATEGORIJE CIJENA"), "KategorijeCijena: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "KategorijeCijena: Broj kolona nije dobar! ");
	}
	
	public String dodajKategoriju() {
		String kategorija = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivKategorijeWE));
		nazivKategorijeWE.sendKeys(kategorija);
		wait.until(ExpectedConditions.elementToBeClickable(dodajKategorijuWE));
		dodajKategorijuWE.click();
		return kategorija;
	}
	
	public void verifikujKategoriju(String kategorija) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterNazivWE));
		filterNazivWE.click();
		filterNazivWE.clear();
		filterNazivWE.sendKeys(kategorija);
		filterNazivWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(jedinstvenElementWE));
		wait.until(ExpectedConditions.visibilityOf(nazivTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(nazivTabelaWE.getText().equals(kategorija), "KtegorijeCijena: Ime kategorije nije dobro!");
	}
	
	public String izmjeniKategorijuCijene() {
		String novaKategorija = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivKategorijeWE));
		nazivKategorijeWE.sendKeys(novaKategorija);
		wait.until(ExpectedConditions.elementToBeClickable(dodajKategorijuWE));
		dodajKategorijuWE.click();
		return novaKategorija;
	}
	
	public void obrisiKategorijuCijene() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
		Thread.sleep(1000);
	}
	
	public void verifikujBrisanjeKategorije(String kategorija) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterNazivWE));
		filterNazivWE.click();
		filterNazivWE.clear();
		filterNazivWE.sendKeys(kategorija);
		filterNazivWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "TarifneGrupe: Poruka prazne tabele nije dobra!");
	}

}