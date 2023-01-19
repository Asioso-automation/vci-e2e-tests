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

public class RegistarBrojila extends PocetnaStranica {

	public RegistarBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div[2]/div[1]/div/div/div[1]/div/input")
	 private WebElement poljeBrojWE;
	
	@FindBy(xpath = "//div[4]/div/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeTipBrojilaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '59712 - E5BD (A-D)')]")
	 private WebElement odaberiTipBrojilaWE;
	
	@FindBy(xpath = "//div[3]/div[4]/div/div/div[1]/div/input")
	 private WebElement poljeRedniBrojURegistruWE;
	
	@FindBy(xpath = "//div[2]/button[1]/span")
	 private WebElement dodajBrojiloBtnWE;
	
	@FindBy(xpath = "//td[2]/div/div[1]/div/div/div/div[1]/input")
	 private WebElement filterBrojBrojilaWE;
	
	@FindBy(xpath = "//div[1]/div/div[2]/div/div/input")
	 private WebElement napredniFilterJednakoWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	 private WebElement brojBrojilaTabelaWE;

	public void verifikujRegistarBrojila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Registar brojila')]")));
		verifyCommonElements("BROJILA", "REGISTAR BROJILA", "REGISTAR BROJILA", 9, true, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRedniBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDrzavnePlombeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaIstekaZigaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaProizvodnjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAmmIntegrisanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDlmsIntegrisanoWE));
	}
	
	public String dodajBrojilo() throws InterruptedException, FileNotFoundException, IOException {
		String brojBrojila = Helper.getRandomNumber(6);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeBrojWE));
		poljeBrojWE.sendKeys(brojBrojila);
		wait.until(ExpectedConditions.elementToBeClickable(poljeTipBrojilaWE));
		poljeTipBrojilaWE.sendKeys("59712 - E5BD (A-D)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTipBrojilaWE));
		odaberiTipBrojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeRedniBrojURegistruWE));
		poljeRedniBrojURegistruWE.sendKeys(Helper.getRandomNumber(7));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return brojBrojila;
	}
	
	public void verifikujBrojilo(String brojBrojila) throws InterruptedException, FileNotFoundException, IOException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterBrojBrojilaWE));
		filterBrojBrojilaWE.click();
		Thread.sleep(1000);
		napredniFilterJednakoWE.sendKeys(brojBrojila);
		napredniFilterJednakoWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(brojBrojilaTabelaWE));
		assertTrue(brojBrojilaTabelaWE.getText().contains(brojBrojila),"Registar brojila: Broj brojila nije dobar!");
	}
	
	public String kreirajBrojilo() {
		String brBrojila = brojBrojilaTabelaWE.getText();
		return brBrojila;
	}

}