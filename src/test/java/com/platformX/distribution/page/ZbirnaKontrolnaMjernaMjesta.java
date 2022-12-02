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

public class ZbirnaKontrolnaMjernaMjesta extends PocetnaStranica {

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
	
	@FindBy(xpath = "//div[8]/div[1]/div/div[1]/div[1]/div/button")
	 private WebElement datumIkonicaWE;
	
	@FindBy(xpath = "//tr[2]/td[4]/button/div")
	 private WebElement izaberiDatumWE;
	
	@FindBy(xpath = "//div[2]/button[1]/span")
	 private WebElement dodajZbirnoMjestoBtnWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	 private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	 private WebElement nazivTabelaWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]/span")
	 private WebElement potvrdiBrisanjeBtnWE;
	
	@FindBy(xpath = "/html/body/div/div[3]/div/div")
	 private WebElement obradaUTokuBtnWE;

	public void verifikujZbirnaKontrolnaMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zbirna/kontrolna mjerna mjesta')]")));
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
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("MJERNA MJESTA"), "ZbirnaKontrolnaMjernaMjesta: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ZBIRNA/KONTROLNA MJERNA MJESTA"), "ZbirnaKontrolnaMjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ZBIRNA/KONTROLNA MJERNA MJESTA"), "ZbirnaKontrolnaMjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "ZbirnaKontrolnaMjernaMjesta: Broj kolona nije dobar! ");
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
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTrafoStanicuWE));
		odaberiTrafoStanicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeCitackiHodWE));
		poljeCitackiHodWE.click();
		poljeCitackiHodWE.sendKeys("01 01 00 011120");
		Thread.sleep(1000);
		poljeCitackiHodWE.sendKeys(Keys.ARROW_DOWN);
		poljeCitackiHodWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(poljeBrojCitackogHodaWE));   
		poljeBrojCitackogHodaWE.sendKeys(Helper.getRandomNumber(4));
		wait.until(ExpectedConditions.elementToBeClickable(datumIkonicaWE));
		datumIkonicaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izaberiDatumWE));
		izaberiDatumWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dodajZbirnoMjestoBtnWE));
		dodajZbirnoMjestoBtnWE.click();
		return nazivZbirnogKontrolnogMjesta;
	}
	
	public void verifikujZbirnoKontrolnoMjernoMjesto(String nazivZbirnogMjesta) throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(nazivZbirnogMjesta);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(nazivTabelaWE));
		assertTrue(nazivTabelaWE.getText().contains(nazivZbirnogMjesta),"Mjerna Mjesta: Zbirno/Kontrolno mjerno mjesto nije dobro!");
	}
	
	public String urediZbirnoKontrolnoMjernoMjesto() throws InterruptedException, FileNotFoundException, IOException {
		String nazivZbirnogKontrolnogMjesta = "Zbirno mjm " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBar1stWE));
		burgerBar1stWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBurgerBarWE));
		urediBurgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivWE));
		poljeNazivWE.click();
		poljeNazivWE.clear();
		poljeNazivWE.sendKeys(nazivZbirnogKontrolnogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(dodajZbirnoMjestoBtnWE));
		dodajZbirnoMjestoBtnWE.click();
		return nazivZbirnogKontrolnogMjesta;
	}
	
	public void obrisiZbirnoKontrolnoMjernoMjesto() throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBar1stWE));
		burgerBar1stWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brisiBurgerBarWE));
		brisiBurgerBarWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		potvrdiBrisanjeBtnWE.click();
	}
	
	public void verifikujBrisanjeZbirnogKontrolnogMjernogMjesta(String zbirnaKontrolnaMjernaMjesta) throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.invisibilityOf(obradaUTokuBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(zbirnaKontrolnaMjernaMjesta);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Zbirna kontrolna mjerna mjesta: Poruka prazne tabele nije dobra!");
	}

}