package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class RegistarBrojila extends PocetnaStranicaPXD {

	public RegistarBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div[2]/div[1]/div/div/div[1]/div/input")
	 private WebElement poljeBrojWE;
	
	@FindBy(xpath = "//div[3]/div[3]/div/div/div[1]/div/input")
	 private WebElement poljeSerijskiBrojWE;
	
	@FindBy(xpath = "//div[3]/div[4]/div/div/div[1]/div/input")
	private WebElement poljeRedniBrojURegistruWE;
	
	@FindBy(xpath = "//div[4]/div/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeTipBrojilaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '11 - DB2M')]")			// 59712 - E5BD (A-D) > 11 - DB2M
	 private WebElement odaberiTipBrojilaWE;
	
	@FindBy(xpath = "//td[2]/div/div[1]/div/div/div/div[1]/input")
	 public WebElement filterBrojBrojilaWE;
	
	@FindBy(xpath = "//div[1]/div/div[2]/div/div/input")
	 private WebElement napredniFilterJednakoWE;
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaRedniBrojWE, kolone.kolonaBrojBrojilaWE, kolone.kolonaSerijskiBrojWE, kolone.kolonaBrojDrzavnePlombeWE, kolone.kolonaTipBrojilaWE, 
			kolone.kolonaGodinaIstekaZigaWE, kolone.kolonaGodinaProizvodnjeWE, kolone.kolonaPodrzavaAmmIntegracijuWE, kolone.kolonaDlmsIntegrisanoWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujRegistarBrojila()throws Exception {
		navigateOnPage(RegistarBrojila.class, "Brojila", "Registar brojila");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Registar brojila')]")));
		verifikacijaStranice("Brojila", "Registar Brojila", "Registar brojila", 1, columns, buttons);
	}
	
	public String dodajBrojilo() throws InterruptedException, FileNotFoundException, IOException {
		String brojBrojila = Helper.getRandomNumber(6);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeBrojWE));
		poljeBrojWE.sendKeys(brojBrojila);
		wait.until(ExpectedConditions.elementToBeClickable(poljeSerijskiBrojWE));
		poljeSerijskiBrojWE.sendKeys("SN" + brojBrojila);
		wait.until(ExpectedConditions.elementToBeClickable(poljeRedniBrojURegistruWE));
		poljeRedniBrojURegistruWE.sendKeys(Helper.getRandomNumber(3) + brojBrojila);
		wait.until(ExpectedConditions.elementToBeClickable(poljeTipBrojilaWE));
		poljeTipBrojilaWE.sendKeys("11 - DB2M");									// 59712 - E5BD (A-D) > 11 - DB2M
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTipBrojilaWE));
		odaberiTipBrojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return brojBrojila;
	}
	
	public String kreirajBrojilo() {
		String brBrojila = podatak2Tabela2WE.getText();
		return brBrojila;
	}

}