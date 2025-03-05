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
	
//	ZAJEDNICKI ELEMENTI
	
	@FindBy(xpath = "//form/div/div/div/div/div[1]/div[1]/input[1]")
	private WebElement tipEESWE;
	
	@FindBy(xpath = "//form/div/div[2]/div/div/div[1]/div[1]/div[1]/input")
	private WebElement kategorijaPotrosnjeWE;
	
	@FindBy(xpath = "//span[contains(text(), 'Dalje') and @class='v-btn__content']")
	private WebElement daljeBtnWE;
	
	@FindBy(xpath = "//div[@class='v-card__title subtitle-2 title-border text-uppercase mb-5']")  
	private WebElement naslovWE;
	
	@FindBy(xpath = "//form/div/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	private WebElement kupacWE;

	@FindBy(xpath = "//form/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement fizickaLokacijaWE;
	
	@FindBy(xpath = "//form/div/div[2]/div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement kategorijaPrikljuckaWE;

	@FindBy(xpath = "//form/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement tipPrikljuckaWE;

	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div/input")  
	private WebElement brojProtokolaWE;

	@FindBy(xpath = "//div[4]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement razlogEESWE;

	@FindBy(xpath = "//div[6]/div[1]/div/div/div[1]/div[1]/input[1]")  
	private WebElement mjestoWE;

	@FindBy(xpath = "//div[6]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement postaWE;

	@FindBy(xpath = "//div[8]/div/div/div/div[1]/div[1]/input[1]")
	private WebElement vrstaObjektaWE;

//	DOMACINSTVA
	
	@FindBy(xpath = "//div[15]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement mjestoPrikljucenjaWE;
	
	@FindBy(xpath = "//div[15]/div[3]/div/div/div[1]/div[1]/input[1]")  
	private WebElement vrstaPrikljuckaWE;
	
	@FindBy(xpath = "//div[16]/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojPrikljucnihVodovaWE;
	
	@FindBy(xpath = "//div[16]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipPrikljucnogVodaWE;
	
	@FindBy(xpath = "//div[16]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement presjekMm2WE;
	
	@FindBy(xpath = "//div[17]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement napojnaTransformatorskaStanicaWE;
	
	@FindBy(xpath = "//div[20]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUgradjenihBrojilaWE;
	
	@FindBy(xpath = "//div[20]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaWE;
	
	@FindBy(xpath = "//div[17]/div[4]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaWE;
	
	@FindBy(xpath = "//div[20]/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaBrojilaAktivneEnergijeWE;

	@FindBy(xpath = "//div[20]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement klasaTacnostiBrojilaAktivneEnergijeWE;

//	NISKI NAPON

	@FindBy(xpath = "//div[18]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement mjestoPrikljucenjaNNWE;
	
	@FindBy(xpath = "//div[18]/div[3]/div/div/div[1]/div[1]/input[1]")  
	private WebElement vrstaPrikljuckaNNWE;

	@FindBy(xpath = "//div[19]/div[1]/div/div[1]/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojPrikljucnihVodovaNNWE;
	
	@FindBy(xpath = "//div[19]/div[1]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipPrikljucnogVodaNNWE;

	@FindBy(xpath = "//div[19]/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement presjekMm2NNWE;
	
	@FindBy(xpath = "//div[20]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement napojnaTransformatorskaStanicaNNWE;
	
	@FindBy(xpath = "//div[24]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUgradjenihBrojilaNNWE;
	
	@FindBy(xpath = "//div[24]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaNNWE;

	@FindBy(xpath = "//div[24]/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaNNWE;
	
	@FindBy(xpath = "//div[24]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaBrojilaAktivneEnergijeNNWE;

	@FindBy(xpath = "//div[24]/div[2]/div[2]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement klasaTacnostiBrojilaAktivneEnergijeNNWE;

	@FindBy(xpath = "//div[16]/div[2]/div/div/div[1]/div/input")  
	 private WebElement poljeZaScrollWE;
	
//	10 - Javna rasvjeta
	
	@FindBy(xpath = "//div[24]/div[2]/div[3]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaBrojilaReaktivneEnergijeNNWE;

	@FindBy(xpath = "//div[24]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement klasaTacnostiBrojilaReaktivneEnergijeNNWE;
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojProtokolaWE, kolone.kolonaKupacWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaAdresaWE, kolone.kolonaVrstaObjektaWE, 
			kolone.kolonaTipEesWE, kolone.kolonaRazlogEesWE, kolone.kolonaKategorijaPrikljuckaWE, kolone.kolonaDatumWE, kolone.kolonaAktiviranaWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujElektroenergetskeSaglasnosti() throws Exception {
		navigateOnPage(ElektroenergetskeSaglasnosti.class, "Mjerna mjesta", "Elektroenergetske saglasnosti");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Elektroenergetske saglasnosti')]")));
		verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, columns, buttons);
	}
	
	public void dodajOdaberiTipEES(String tipEES, String kategorijaPotrosnje) {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipEESWE));
		tipEESWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + tipEES + "')]"))).click();
		try {
		wait.until(ExpectedConditions.elementToBeClickable(daljeBtnWE));
		daljeBtnWE.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(kategorijaPotrosnjeWE));
			kategorijaPotrosnjeWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kategorijaPotrosnje + "')]"))).click();
			tipEESWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(daljeBtnWE));
			daljeBtnWE.click();
		}
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public void popuniZajednickaPoljaEES(String brojProtokola) {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
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
	}

	public void dodajElektronergetskuSaglasnostD() throws Exception {
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
		js.executeScript("arguments[0].scrollIntoView(true);", datumBtn3WE);
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
		wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaBrojilaAktivneEnergijeWE));
		nazivnaStrujaBrojilaAktivneEnergijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		nazivnaStrujaBrojilaAktivneEnergijeWE.sendKeys(Keys.ARROW_DOWN);
		nazivnaStrujaBrojilaAktivneEnergijeWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(klasaTacnostiBrojilaAktivneEnergijeWE));
		klasaTacnostiBrojilaAktivneEnergijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		klasaTacnostiBrojilaAktivneEnergijeWE.sendKeys(Keys.ARROW_DOWN);
		klasaTacnostiBrojilaAktivneEnergijeWE.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
	}
	
	public void dodajElektronergetskuSaglasnostNN(int kategorijaPotrosnje) throws Exception {
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
		js.executeScript("arguments[0].scrollIntoView(true);", poljeZaScrollWE);		
		wait.until(ExpectedConditions.elementToBeClickable(mjestoPrikljucenjaNNWE));
		mjestoPrikljucenjaNNWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		mjestoPrikljucenjaNNWE.sendKeys(Keys.ARROW_DOWN);
		mjestoPrikljucenjaNNWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(vrstaPrikljuckaNNWE));
		vrstaPrikljuckaNNWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		vrstaPrikljuckaNNWE.sendKeys(Keys.ARROW_DOWN);
		vrstaPrikljuckaNNWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(brojPrikljucnihVodovaNNWE));
		brojPrikljucnihVodovaNNWE.click();
		brojPrikljucnihVodovaNNWE.sendKeys(Helper.getRandomNumber(2));		
		wait.until(ExpectedConditions.elementToBeClickable(tipPrikljucnogVodaNNWE));
		tipPrikljucnogVodaNNWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		tipPrikljucnogVodaNNWE.sendKeys(Keys.ARROW_DOWN);
		tipPrikljucnogVodaNNWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(presjekMm2NNWE));
		presjekMm2NNWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		presjekMm2NNWE.sendKeys(Keys.ARROW_DOWN);
		presjekMm2NNWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(napojnaTransformatorskaStanicaNNWE));
		napojnaTransformatorskaStanicaNNWE.click();
		napojnaTransformatorskaStanicaNNWE.sendKeys("410123 - MIRKA FILIPOVIĆA");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		napojnaTransformatorskaStanicaNNWE.sendKeys(Keys.ARROW_DOWN);
		napojnaTransformatorskaStanicaNNWE.sendKeys(Keys.ENTER);		
		js.executeScript("arguments[0].scrollIntoView(true);", napojnaTransformatorskaStanicaNNWE);
		wait.until(ExpectedConditions.elementToBeClickable(brojUgradjenihBrojilaNNWE));
		brojUgradjenihBrojilaNNWE.click();
		brojUgradjenihBrojilaNNWE.sendKeys(Helper.getRandomNumberInRange(1, 4));		
		wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaGlavnogOsiguracaNNWE));
		nazivnaStrujaGlavnogOsiguracaNNWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		nazivnaStrujaGlavnogOsiguracaNNWE.sendKeys(Keys.ARROW_DOWN);
		nazivnaStrujaGlavnogOsiguracaNNWE.sendKeys(Keys.ENTER);		
		js.executeScript("arguments[0].scrollIntoView(true);", nazivnaStrujaGlavnogOsiguracaNNWE);		
		wait.until(ExpectedConditions.elementToBeClickable(lokacijaMjernogMjestaNNWE));
		lokacijaMjernogMjestaNNWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		lokacijaMjernogMjestaNNWE.sendKeys(Keys.ARROW_DOWN);
		lokacijaMjernogMjestaNNWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaBrojilaAktivneEnergijeNNWE));
		nazivnaStrujaBrojilaAktivneEnergijeNNWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		nazivnaStrujaBrojilaAktivneEnergijeNNWE.sendKeys(Keys.ARROW_DOWN);
		nazivnaStrujaBrojilaAktivneEnergijeNNWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(klasaTacnostiBrojilaAktivneEnergijeNNWE));
		klasaTacnostiBrojilaAktivneEnergijeNNWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		klasaTacnostiBrojilaAktivneEnergijeNNWE.sendKeys(Keys.ARROW_DOWN);
		klasaTacnostiBrojilaAktivneEnergijeNNWE.sendKeys(Keys.ENTER);
		if (kategorijaPotrosnje==10) {
			wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaBrojilaReaktivneEnergijeNNWE));
			nazivnaStrujaBrojilaReaktivneEnergijeNNWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			nazivnaStrujaBrojilaReaktivneEnergijeNNWE.sendKeys(Keys.ARROW_DOWN);
			nazivnaStrujaBrojilaReaktivneEnergijeNNWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(klasaTacnostiBrojilaReaktivneEnergijeNNWE));
			klasaTacnostiBrojilaReaktivneEnergijeNNWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			klasaTacnostiBrojilaReaktivneEnergijeNNWE.sendKeys(Keys.ARROW_DOWN);
			klasaTacnostiBrojilaReaktivneEnergijeNNWE.sendKeys(Keys.ENTER);
		}
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
	}

	
}