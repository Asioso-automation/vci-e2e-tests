package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class ObracunskiUgovori extends PocetnaStranica {
	
	public ObracunskiUgovori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeKupacWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeTipUgovoraWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '3 - Domaćinstva')]")
	 private WebElement odaberiTipUgovoraWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeTarifnaGrupaWE;
	
	@FindBy(xpath = "//div[5]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeMjernoMjestoWE;
	
	@FindBy(xpath = "//div[6]/div/div/div[1]/div/input")
	 private WebElement poljeNazivMjernogMjestaWE;
	
	@FindBy(xpath = "//div[7]/div/div/div[1]/div/input")
	 private WebElement poljeNazivMjMjestaNaStampanimDokumentimaWE;
	
	@FindBy(xpath = "//div[8]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeAktivnoBrojiloWE;
	
	@FindBy(xpath = "//div[11]/div/div/div[1]/div/input")
	 private WebElement poljeAktivnaKonstantaWE;
	
	@FindBy(xpath = "//div[2]/button[1]/span")
	 private WebElement dodajObracunskiUgovorBtnWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '4 - TG-1 (Domaćinstva 0,4 kV JT), JT')]")
	 private WebElement odaberiTarifnuGrupuWE;
	
	@FindBy(xpath = "//div[1]/div[1]/div/button")
	 private WebElement datumPocetkaWE;
	
	@FindBy(xpath = "//tr[3]/td[4]/button/div")
	 private WebElement odaberiDatumWE;
	
	@FindBy(xpath = "//td[3]/div/div/div/div[1]/input")
	 private WebElement filterPoMjernomMjestuWE;
	
	@FindBy(xpath = "//tr[2]/td[3]")
	 private WebElement mjernoMjestoTabelaWE;

	public void verifikujObracunskiUgovori() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Obračunski ugovori')]")));
		verifyCommonElements("UGOVORI", "OBRAČUNSKI UGOVORI", "OBRAČUNSKI UGOVORI", 13, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaMjMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutniSnabdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnaTGWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnaKonstWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImaNapomenuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}
	
	public void dodajObracunskiUgovor(String kupac, String mjernoMjesto, String brBrojila) throws InterruptedException, FileNotFoundException, IOException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeKupacWE));
		poljeKupacWE.sendKeys(kupac);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(poljeTipUgovoraWE));
		poljeTipUgovoraWE.sendKeys("3 - Domaćinstva");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTipUgovoraWE));
		odaberiTipUgovoraWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeTarifnaGrupaWE));
		poljeTarifnaGrupaWE.sendKeys("4 - TG-1 (Domaćinstva 0,4 kV JT), JT");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTarifnuGrupuWE));
		odaberiTarifnuGrupuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumPocetkaWE));
		datumPocetkaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiDatumWE));
		odaberiDatumWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeMjernoMjestoWE));
		poljeMjernoMjestoWE.sendKeys(mjernoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivMjernogMjestaWE));
		poljeNazivMjernogMjestaWE.sendKeys(Helper.getRandomString(7));
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivMjMjestaNaStampanimDokumentimaWE));
		poljeNazivMjMjestaNaStampanimDokumentimaWE.sendKeys(Helper.getRandomString(7));
		wait.until(ExpectedConditions.elementToBeClickable(poljeAktivnoBrojiloWE));
		poljeAktivnoBrojiloWE.sendKeys(brBrojila);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + brBrojila + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + brBrojila + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeAktivnaKonstantaWE));
		poljeAktivnaKonstantaWE.sendKeys(Helper.getRandomNumber(1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dodajObracunskiUgovorBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(dodajObracunskiUgovorBtnWE));
		dodajObracunskiUgovorBtnWE.click();
		Thread.sleep(1000);
	}
	
	public void verifikujObracunskiUgovor(String mjernoMjesto) throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoMjernomMjestuWE));
		Thread.sleep(1000);
		filterPoMjernomMjestuWE.click();
		filterPoMjernomMjestuWE.clear();
		filterPoMjernomMjestuWE.sendKeys(mjernoMjesto);
		filterPoMjernomMjestuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(mjernoMjestoTabelaWE));
		assertTrue(mjernoMjestoTabelaWE.getText().contains(mjernoMjesto),"Obracunski ugovori: EIC ugovora nije dobar!");
	}
	
	public String urediObracunskiUgovor() throws InterruptedException {
		String nazivMjernogMjesta = "Naziv mjm " + Helper.getRandomString(7);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		Thread.sleep(1000);
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivMjernogMjestaWE));
		poljeNazivMjernogMjestaWE.click();
		poljeNazivMjernogMjestaWE.clear();
		poljeNazivMjernogMjestaWE.sendKeys(nazivMjernogMjesta);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dodajObracunskiUgovorBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(dodajObracunskiUgovorBtnWE));
		dodajObracunskiUgovorBtnWE.click();
		return nazivMjernogMjesta;
	}
	

}