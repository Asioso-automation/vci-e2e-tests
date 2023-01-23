package com.platformX.distribution.page;

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

public class TarifneNadgrupe extends PocetnaStranica {

	public TarifneNadgrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//input") 
	private WebElement nazivTarifneNadrupeWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivTarifneNadgrupeTabelaWE;

	public void verifikujTarifneNadgrupe() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Tarifne nadgrupe')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TARIFNE NADGRUPE", "TARIFNE NADGRUPE", 3, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	}

	public String dodajTarifnuNadrgupu() throws InterruptedException{
		String naziv = "Tarifna nadgrupa" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneNadrupeWE));
		nazivTarifneNadrupeWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return naziv;
	}
	
	public void verifikujTarifnuNadgrupu(String naziv) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneNadgrupeTabelaWE));
		assertTrue(nazivTarifneNadgrupeTabelaWE.getText().equals(naziv), "TarfinaNadgrupa: Tarifna nadgrupa nije pronadjena!");
	}
	
	public String urediTarifnuNadgrupu()throws InterruptedException {
		String tarifnaNadrgupa = "Tarifna nadrgupa" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneNadrupeWE));
		nazivTarifneNadrupeWE.click();
		nazivTarifneNadrupeWE.clear();
		nazivTarifneNadrupeWE.sendKeys(tarifnaNadrgupa);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return tarifnaNadrgupa;
	}

}