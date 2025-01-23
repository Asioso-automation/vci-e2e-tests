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

public class VrsteZahtjeva extends PocetnaStranica {
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement tipVrsteReklamacijeWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement kodWE;
	
	@FindBy(xpath = "//textarea")
	private WebElement opisWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement opisTabelaWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement opisFilterWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediBtnWE;

	public VrsteZahtjeva(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujVrsteZahtjeva() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Vrste zahtjeva')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Vrste Zahtjeva", "Vrste zahtjeva", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipVrsteReklamacijeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpisWE));
	}
	
	public String dodajVrstuZahtjeva(String kod) {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipVrsteReklamacijeWE));
		tipVrsteReklamacijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		aktivniLookupWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kodWE));
		kodWE.sendKeys(kod);
		wait.until(ExpectedConditions.elementToBeClickable(opisWE));
		opisWE.sendKeys("Opis " + Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return kod;
	}
	
	public String urediVrstuZahtjeva(String kod) {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBtnWE));
		urediBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kodWE));
		kodWE.click();
		kodWE.clear();
		kodWE.sendKeys(kod);
		submitBtnWE.click();
		return kod;
	}

}