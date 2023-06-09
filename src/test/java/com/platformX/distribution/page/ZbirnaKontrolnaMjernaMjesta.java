package com.platformX.distribution.page;

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

public class ZbirnaKontrolnaMjernaMjesta extends PocetnaStranicaPXD {

	public ZbirnaKontrolnaMjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	 private WebElement poljeNazivWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeBrojiloWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div/input")
	 private WebElement poljeKonstantaWE;
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeTrafoStanicaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '11120 - 120-Didas')]")
	 private WebElement odaberiTrafoStanicuWE;
	
	@FindBy(xpath = "//div[6]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeCitackiHodWE;
	
	@FindBy(xpath = "//div[7]/div/div/div[1]/div/input")
	 private WebElement poljeBrojCitackogHodaWE;

	public void verifikujZbirnaKontrolnaMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zbirna/kontrolna mjerna mjesta')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Zbirna/kontrolna Mjerna Mjesta", "Zbirna/kontrolna mjerna mjesta", 12, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRedniBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrenosniOdnosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKontrolnoMjernoMjestoWE));
	}
	
	public String dodajZbirnoKontrolnoMjernoMjesto(String brBrojila) throws InterruptedException, FileNotFoundException, IOException {
		String nazivZbirnogKontrolnogMjesta = "Zbirno mjm " + Helper.getRandomString(5);
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
		poljeTrafoStanicaWE.sendKeys("11120 - 120-Didas");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTrafoStanicuWE));
		odaberiTrafoStanicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeCitackiHodWE));
		poljeCitackiHodWE.click();
		poljeCitackiHodWE.sendKeys("01 01 00 011120");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		poljeCitackiHodWE.sendKeys(Keys.ARROW_DOWN);
		poljeCitackiHodWE.sendKeys(Keys.ENTER);
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
	
	public String urediZbirnoKontrolnoMjernoMjesto() throws InterruptedException, FileNotFoundException, IOException {
		String nazivZbirnogKontrolnogMjesta = "Zbirno mjm " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivWE));
		poljeNazivWE.click();
		poljeNazivWE.clear();
		poljeNazivWE.sendKeys(nazivZbirnogKontrolnogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return nazivZbirnogKontrolnogMjesta;
	}

}