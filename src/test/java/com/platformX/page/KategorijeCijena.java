package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KategorijeCijena extends PocetnaStranica {
	
	@FindBy(xpath = "//div[1]/div/div/div/div[1]/div/input")
	private WebElement nazivKategorijeWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input")
	private WebElement stampaniNazivKategorijeWE;

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
	
	public String dodajKategoriju(String kategorija) {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivKategorijeWE));
		nazivKategorijeWE.sendKeys(kategorija);
		wait.until(ExpectedConditions.elementToBeClickable(stampaniNazivKategorijeWE));
		stampaniNazivKategorijeWE.sendKeys(kategorija);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return kategorija;
	}
	
	public String urediKategorijuCijena(String novaKategorija) {
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

}