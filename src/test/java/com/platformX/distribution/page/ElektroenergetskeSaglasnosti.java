package com.platformX.distribution.page;

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

public class ElektroenergetskeSaglasnosti extends PocetnaStranicaPXD {
	
	public ElektroenergetskeSaglasnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//form/div/div/div/div/div[1]/div[1]/input[1]")
	private WebElement tipEESWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-stepper__step--active')]")
	private WebElement odaberiTipEESWE;
	
	@FindBy(xpath = "//div[contains(text(), '1 - Domaćinstva') and @class='v-list-item__title']")
	private WebElement tipEESDomacinstvaWE;
	
	@FindBy(xpath = "//span[contains(text(), 'Dalje') and @class='v-btn__content']")
	private WebElement daljeBtnWE;
	
	@FindBy(xpath = "//div[@class='v-card__title subtitle-2 title-border text-uppercase mb-5']")  
	private WebElement naslovWE;
	
//	DOMACINSTVA
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	private WebElement kupacWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement fizickaLokacijaWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement kategorijaPrikljuckaWE;
	
	@FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement tipPrikljuckaWE;
	
	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div/input")  
	private WebElement brojProtokolaWE;
	
	@FindBy(xpath = "//div[4]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement razlogEESWE;
	
	@FindBy(xpath = "//div[6]/div[1]/div/div/div[1]/div[1]/input[1]")  
	private WebElement mjestoWE;
	
	@FindBy(xpath = "//div[6]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement postaWE;
	
	@FindBy(xpath = "//div[7]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement vrstaObjektaWE;
	
	@FindBy(xpath = "//div[9]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement kategorijaPotrosnjeWE;
	
	@FindBy(xpath = "//div[13]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement mjestoPrikljucenjaWE;
	
	@FindBy(xpath = "//div[13]/div[3]/div/div/div[1]/div[1]/input[1]")  
	private WebElement vrstaPrikljuckaWE;
	
	@FindBy(xpath = "//div[14]/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojPrikljucnihVodovaWE;
	
	@FindBy(xpath = "//div[14]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipPrikljucnogVodaWE;
	
	@FindBy(xpath = "//div[14]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement presjekMm2WE;
	
	@FindBy(xpath = "//div[15]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement napojnaTransformatorskaStanicaWE;
	
	@FindBy(xpath = "//div[15]/div[5]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUgradjenihBrojilaWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaWE;
	
//	@FindBy(xpath = "//div[2]/div[1]/div/div[1]/div[2]/input")
//	private WebElement datumZahtjevaInputWE;
	
	
//	@FindBy(xpath = "//div[4]/div[3]/div/div/div[1]/div[1]/input[1]")  
//	 private WebElement ulicaWE;
//
//	@FindBy(xpath = "//div[5]/div[1]/div/div/div[1]/div[1]/input[1]")  
//	 private WebElement brojUuliciWE;
	

//	@FindBy(xpath = "//div[5]/div[2]/div/div/div[1]/div[1]/input[1]")
//	 private WebElement vrstaObjektaInputWE;
//	
//	@FindBy(xpath = "//div[7]/div[2]/div/div/div[1]/div[1]/input[1]")  
//	 private WebElement odobrenaPrikljucnaSnagaWE;
//	
//	@FindBy(xpath = "//div[7]/div[2]/div/div/div[1]/div[1]/input[1]")  
//	 private WebElement tarifnaGrupaWE;
//	
//	@FindBy(xpath = "//div[10]/div[1]/div/div/div[1]/div[1]/input[1]")
//	 private WebElement naponskiNivoWE;
	
//	@FindBy(xpath = "//div[21]/div[2]/div/div/div[1]/div[1]/input[1]")
//	 private WebElement rokVazenjaWE;
	
//	@FindBy(xpath = "//div[contains(text(), 'Uspješno završeno.')]")
//	private WebElement porukaWE;
//	
//	@FindBy(xpath = "//tr[2]/td[2]")
//	private WebElement brojProtokolaTabelaWE;
//	

//	

//	

		
//	NISKI NAPON
	
	@FindBy(xpath = "//div[9]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement odobrenaSnagaStambeniDioWE;
	
	@FindBy(xpath = "//div[9]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement odobrenaSnagaPoslovniDioWE;
	
	@FindBy(xpath = "//div[12]/div[1]/div/div/div[1]/div[1]/input[1]")
	 private WebElement naponskiNivoNWE;
	
	@FindBy(xpath = "//div[12]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement mjestoPrikljucenjaNWE;
	
	@FindBy(xpath = "//div[12]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement vrstaPrikljuckaNWE;
	
	@FindBy(xpath = "//div[13]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipPrikljucnogVodaNWE;
	
	@FindBy(xpath = "//div[13]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement presjekMm2NWE;
	
	@FindBy(xpath = "//div[14]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement napojnaTransformatorskaStanicaNWE;
	
	@FindBy(xpath = "//div[18]/div[2]/div/div/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUgradjenihBrojilaNSWE;
	
	@FindBy(xpath = "//div[18]/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaNSWE;
	
	@FindBy(xpath = "//div[19]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaNSWE;
	
	@FindBy(xpath = "//div[22]/div[2]/div/div/div/div[1]/div/div/div[1]/div/input")
	 private WebElement brojUgradjenihBrojilaNPWE;
		
	@FindBy(xpath = "//div[22]/div[2]/div/div/div/div[2]/div/div/div[1]/div/input")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaNPWE;
	
	@FindBy(xpath = "//div[23]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaNPWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Stambeni dio')]")
	private WebElement stambenioDioWE;
	
	@FindBy(xpath = "//div[26]/div/div/div[1]/div[1]/input[1]")  
	private WebElement rokVazenjaNWE;
	

	
	@FindBy(xpath = "//div[2]/div[2]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumZahtjevaInputNNWE;
	
	public void verifikujElektroenergetskeSaglasnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Elektroenergetske saglasnosti')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 12, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaObjektaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipEesWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogEesWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaPrikljuckaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktiviranaWE));
	}
	
//	TODO razdvojiti metodu za dodavanje EES na tri metode, za svaki tip EES
	public void dodajElektronergetskuSaglasnostD(String brojProtokola) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTipEESWE));
		wait.until(ExpectedConditions.elementToBeClickable(tipEESWE));
		tipEESWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(tipEESDomacinstvaWE));
		tipEESDomacinstvaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(daljeBtnWE));
		daljeBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTipEESWE));
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.click();
		kupacWE.sendKeys(Helper.getRandomNumber(3));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(fizickaLokacijaWE));
		fizickaLokacijaWE.click();
		fizickaLokacijaWE.sendKeys("4101 - 01 - BIJELJINA");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		fizickaLokacijaWE.sendKeys(Keys.ARROW_DOWN);
		fizickaLokacijaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(kategorijaPrikljuckaWE));
		kategorijaPrikljuckaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		kategorijaPrikljuckaWE.sendKeys(Keys.ARROW_DOWN);
		kategorijaPrikljuckaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(tipPrikljuckaWE));
		tipPrikljuckaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		tipPrikljuckaWE.sendKeys(Keys.ARROW_DOWN);
		tipPrikljuckaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojProtokolaWE));
		brojProtokolaWE.click();
		brojProtokolaWE.sendKeys(brojProtokola);
		wait.until(ExpectedConditions.elementToBeClickable(razlogEESWE));
		razlogEESWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		razlogEESWE.sendKeys(Keys.ARROW_DOWN);
		razlogEESWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.visibilityOf(naslovWE));
		naslovWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn2WE));
		datumBtn2WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum2WE));
		trenutniDatum2WE.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", datumBtn2WE);
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.click();
		mjestoWE.sendKeys("25 - Bijeljina");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		mjestoWE.sendKeys(Keys.ARROW_DOWN);
		mjestoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.click();
		postaWE.sendKeys("76300 - Bijeljina");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		postaWE.sendKeys(Keys.ARROW_DOWN);
		postaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(vrstaObjektaWE));
		vrstaObjektaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		vrstaObjektaWE.sendKeys(Keys.ARROW_DOWN);
		vrstaObjektaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(kategorijaPotrosnjeWE));
		kategorijaPotrosnjeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		kategorijaPotrosnjeWE.sendKeys(Keys.ARROW_DOWN);
		kategorijaPotrosnjeWE.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].scrollIntoView(true);", kategorijaPotrosnjeWE);
		wait.until(ExpectedConditions.elementToBeClickable(mjestoPrikljucenjaWE));
		mjestoPrikljucenjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		mjestoPrikljucenjaWE.sendKeys(Keys.ARROW_DOWN);
		mjestoPrikljucenjaWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(vrstaPrikljuckaWE));
		vrstaPrikljuckaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		vrstaPrikljuckaWE.sendKeys(Keys.ARROW_DOWN);
		vrstaPrikljuckaWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(brojPrikljucnihVodovaWE));
		brojPrikljucnihVodovaWE.click();
		brojPrikljucnihVodovaWE.sendKeys(Helper.getRandomNumber(2));		
		wait.until(ExpectedConditions.elementToBeClickable(tipPrikljucnogVodaWE));
		tipPrikljucnogVodaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		tipPrikljucnogVodaWE.sendKeys(Keys.ARROW_DOWN);
		tipPrikljucnogVodaWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(presjekMm2WE));
		presjekMm2WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		presjekMm2WE.sendKeys(Keys.ARROW_DOWN);
		presjekMm2WE.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].scrollIntoView(true);", presjekMm2WE);
		wait.until(ExpectedConditions.elementToBeClickable(napojnaTransformatorskaStanicaWE));
		napojnaTransformatorskaStanicaWE.click();
		napojnaTransformatorskaStanicaWE.sendKeys("410123 - MIRKA FILIPOVIĆA");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		napojnaTransformatorskaStanicaWE.sendKeys(Keys.ARROW_DOWN);
		napojnaTransformatorskaStanicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(lokacijaMjernogMjestaWE));
		lokacijaMjernogMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		lokacijaMjernogMjestaWE.sendKeys(Keys.ARROW_DOWN);
		lokacijaMjernogMjestaWE.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].scrollIntoView(true);", lokacijaMjernogMjestaWE);
		wait.until(ExpectedConditions.elementToBeClickable(brojUgradjenihBrojilaWE));
		brojUgradjenihBrojilaWE.click();
		brojUgradjenihBrojilaWE.sendKeys(Helper.getRandomNumberInRange(1, 4));		
		wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaGlavnogOsiguracaWE));
		nazivnaStrujaGlavnogOsiguracaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		nazivnaStrujaGlavnogOsiguracaWE.sendKeys(Keys.ARROW_DOWN);
		nazivnaStrujaGlavnogOsiguracaWE.sendKeys(Keys.ENTER);		
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
	}
	
//	public void urediElektroenergetskuSaglasnost() throws InterruptedException {
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
//		burgerBarWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
//		urediWE.click();
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		wait.until(ExpectedConditions.visibilityOf(stranicaBtnWE));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", vrstaObjektaWE);
//		wait.until(ExpectedConditions.elementToBeClickable(odobrenaPrikljucnaSnagaWE));
//		odobrenaPrikljucnaSnagaWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
//		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ARROW_DOWN);
//		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ENTER);
//		submitBtnWE.click();
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//	}
	
}