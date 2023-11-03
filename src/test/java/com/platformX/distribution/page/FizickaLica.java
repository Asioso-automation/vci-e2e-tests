package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class FizickaLica extends PocetnaStranicaPXD {
	
	public FizickaLica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	 @FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")  
	 private WebElement poljeImeIPrezimeWE;
	 
	 @FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input") 
	 private WebElement poljeStampaniNazivNaDokumentimaWE;
	 
	 @FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeMjestoWE;
	 
	 @FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '6 - Banja Luka')]")
	 private WebElement odaberiMjestoWE;
	 
	 @FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeUlicaWE;
	 
	 @FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '10950 - Svetog Save')]")
	 private WebElement odaberiUlicuWE;
	 
	 @FindBy(xpath = "//div[3]/div[4]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljePostaWE;
	 
	 @FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '78000 - Banja Luka')]")
	 private WebElement odaberiPostuWE;

	public void verifikujFizickaLica() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Fizička lica')]")));
		verifikacijaZajednickihElemenata("Kupci", "Fizička Lica", "Fizička lica", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeIprezimeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojLicneKarteWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}
	
	public String dodajFizickoLice(String naziv) throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeImeIPrezimeWE));
		poljeImeIPrezimeWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(poljeStampaniNazivNaDokumentimaWE));
		poljeStampaniNazivNaDokumentimaWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(poljeMjestoWE));
		poljeMjestoWE.sendKeys("6 - Banja Luka");
		wait.until(ExpectedConditions.elementToBeClickable(odaberiMjestoWE));
		odaberiMjestoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeUlicaWE));
		poljeUlicaWE.sendKeys("10950 - Svetog Save");
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljePostaWE));
		poljePostaWE.sendKeys("78000 - Banja Luka");
		wait.until(ExpectedConditions.elementToBeClickable(odaberiPostuWE));
		odaberiPostuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}
	
	 public String kreirajFizickoLice() {
		String kupac = podatak2Tabela1WE.getText() + " - " + podatak2Tabela2WE.getText();
		return kupac;
	 }  
	 
	 public String urediFizickoLice(String naziv) throws InterruptedException {
		 wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		 Thread.sleep(800);																// trenutno ne radi burgerBarWE.click() bez Thread.sleep - ne radi ni sa try/catch
		 burgerBarWE.click();
		 wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		 urediWE.click();
		 wait.until(ExpectedConditions.elementToBeClickable(poljeImeIPrezimeWE));
		 poljeImeIPrezimeWE.click();
		 poljeImeIPrezimeWE.clear();
		 poljeImeIPrezimeWE.sendKeys(naziv);
		 wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		 submitBtnWE.click();
		 wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		 return naziv; 
	 }
	 
}