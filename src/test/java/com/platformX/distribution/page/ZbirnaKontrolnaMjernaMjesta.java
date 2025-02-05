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

public class ZbirnaKontrolnaMjernaMjesta extends PocetnaStranicaPXD {

	public ZbirnaKontrolnaMjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	 private WebElement poljeNazivWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeBrojiloWE;
	
	@FindBy(xpath = "//div[2]/div[3]/div/div/div[1]/div/input")
	 private WebElement poljeKonstantaWE;
	
	@FindBy(xpath = "//div[2]/div[4]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeTrafoStanicaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '410112 - NOVA BANKA')]")			// 11120 - 120-Didas > 410112 - NOVA BANKA
	 private WebElement odaberiTrafoStanicuWE;
	
	@FindBy(xpath = "//div[6]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeCitackiHodWE;
	
	@FindBy(xpath = "//div[7]/div/div/div[1]/div/input")
	 private WebElement poljeBrojCitackogHodaWE;
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE, kolone.kolonaCitackiHodWE, kolone.kolonaRedniBrojWE, kolone.kolonaTrafostanicaWE, 
			kolone.kolonaFizickaLokacijaWE, kolone.kolonaKonstantaWE, kolone.kolonaBrojiloWE, kolone.kolonaDatumOdWE, kolone.kolonaDatumDoWE, 
			kolone.kolonaKontrolnoMjernoMjestoWE, kolone.kolonaAmmIntegrisano};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujZbirnaKontrolnaMjernaMjesta() throws Exception {
		navigateOnPage(ZbirnaKontrolnaMjernaMjesta.class, "Mjerna mjesta", "Zbirna/kontrolna mjerna mjesta");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zbirna/kontrolna mjerna mjesta')]")));
		verifikacijaStranice("Mjerna mjesta", "Zbirna/kontrolna Mjerna Mjesta", "Zbirna/kontrolna mjerna mjesta", 1, columns, buttons);
	}
	
	public String dodajZbirnoKontrolnoMjernoMjesto(String brBrojila, String nazivZbirnogKontrolnogMjesta) throws InterruptedException, FileNotFoundException, IOException {
	    wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
	    dodajBtnWE.click();
	    wait.until(ExpectedConditions.elementToBeClickable(poljeNazivWE));
	    poljeNazivWE.sendKeys(nazivZbirnogKontrolnogMjesta);
	    wait.until(ExpectedConditions.elementToBeClickable(poljeBrojiloWE));
	    poljeBrojiloWE.click();
	    poljeBrojiloWE.sendKeys(brBrojila);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + brBrojila + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + brBrojila + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeKonstantaWE));
		poljeKonstantaWE.click();
		poljeKonstantaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(poljeTrafoStanicaWE));
		poljeTrafoStanicaWE.sendKeys("410112 - NOVA BANKA");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTrafoStanicuWE));
		odaberiTrafoStanicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeBrojCitackogHodaWE));   
		poljeBrojCitackogHodaWE.sendKeys(Helper.getRandomNumber(4));
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return nazivZbirnogKontrolnogMjesta;
	}
	
	public String urediZbirnoKontrolnoMjernoMjesto(String nazivZbirnogKontrolnogMjesta) throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivWE));
		changeInput(poljeNazivWE, nazivZbirnogKontrolnogMjesta);
//		poljeNazivWE.sendKeys(nazivZbirnogKontrolnogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return nazivZbirnogKontrolnogMjesta;
	}

}