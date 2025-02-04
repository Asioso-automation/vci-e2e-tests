package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class ObracunskiUgovori extends PocetnaStranicaPXD {
	
	public ObracunskiUgovori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeKupacWE;
	
	@FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeMjernoMjestoWE;
	
	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div/input")
	private WebElement poljeNazivMjernogMjestaWE;
	
	@FindBy(xpath = "//div[4]/div[2]/div/div/div[1]/div/input")
	private WebElement poljeNazivMjMjestaNaStampanimDokumentimaWE;
	
	@FindBy(xpath = "//div[5]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeTarifnaGrupaWE;
	
	@FindBy(xpath = "//div[5]/div[2]/div/div/div[1]/div/input")
	private WebElement poljeOdobrenaPrikljucnaSnagaWE;
	
	@FindBy(xpath = "//div[7]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeAktivnoBrojiloWE;
	
	@FindBy(xpath = "//div[7]/div[1]/div/div/div[1]/div/input")
	private WebElement poljeAktivnaKonstantaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '4 - TG')]")
	private WebElement odaberiTarifnuGrupuWE;
	
	@FindBy(xpath = "//textarea")
	private WebElement napomenaWE;
	
	@FindBy(xpath = "//div[@class='v-tab v-tab--active']")
	private WebElement aktivniTabWE;
	
	@FindBy(xpath = "//div[5]/div[1]/div/div/div[1]/div/input")
	private WebElement poljeAktivnaKonstanta1WE;
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaKupacWE, kolone.kolonaMjMjestoWE, kolone.kolonaNazivMjMjestaWE, kolone.kolonaAdresaMjMjestaWE, 
			kolone.kolonaTrenutniSnabdWE, kolone.kolonaTrenutniTipUgovoraWE, kolone.kolonaTrenutnaTGWE, kolone.kolonaTrenutnoBrojiloWE, kolone.kolonaTrenutnaKonstWE, 
			kolone.kolonaUPripremiWE, kolone.kolonaAktivanWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE, infoBtnWE};

	public void navigirajVerifikujObracunskiUgovori() throws Exception {
		navigateOnPage(ObracunskiUgovori.class, "Obračunski ugovori", "Obračunski ugovori");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Obračunski ugovori')]")));
		verifikacijaStranice("Ugovori", "Obračunski Ugovori", "Obračunski ugovori", 2, columns, buttons);
	}
	
	public void dodajObracunskiUgovor(String kupac, String mjernoMjesto, String brBrojila) throws InterruptedException, FileNotFoundException, IOException {
		try {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
			dodajBtnWE.click();
		}
		catch (Exception e) {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
			dodajBtnWE.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(poljeKupacWE));
		poljeKupacWE.click();
		poljeKupacWE.sendKeys(kupac);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeTarifnaGrupaWE));
		poljeTarifnaGrupaWE.sendKeys("4 - TG-1 (Domaćinstva 0,4 kV JT), JT");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTarifnuGrupuWE));
		odaberiTarifnuGrupuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeMjernoMjestoWE));
		poljeMjernoMjestoWE.sendKeys(mjernoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeOdobrenaPrikljucnaSnagaWE));
		poljeOdobrenaPrikljucnaSnagaWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(poljeAktivnoBrojiloWE));
		poljeAktivnoBrojiloWE.sendKeys(brBrojila);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + brBrojila + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + brBrojila + "')]")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(poljeAktivnaKonstantaWE));
//		poljeAktivnaKonstantaWE.sendKeys(Helper.getRandomNumber(1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public String urediObracunskiUgovor(String konstanta) throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(pogledajWE));
		pogledajWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", aktivniTabWE);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeAktivnaKonstanta1WE));
		changeInput(poljeAktivnaKonstanta1WE, konstanta);
//		poljeAktivnaKonstanta1WE.sendKeys(konstanta);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return konstanta;
	}
	
}