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

public class ElektroenergetskeSaglasnosti extends PocetnaStranicaPXD {
	
	public ElektroenergetskeSaglasnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
//	ZAJEDNICKI ELEMENTI
	
	@FindBy(xpath = "//form/div/div/div/div/div[1]/div[1]/input[1]")
	private WebElement tipEESWE;
	
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

	@FindBy(xpath = "//form/div/div[2]/div/div/div[1]/div[1]/div[1]/input")
	private WebElement kategorijaPotrosnjeNNWE;

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
	
//	20 - Domaćinstva i 30 - Ostala potrošnja na niskom naponu
	
	@FindBy(xpath = "//div[26]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUgradjenihBrojilaNN1WE;
	
	@FindBy(xpath = "//div[26]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaNN1WE;

	@FindBy(xpath = "//div[26]/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaNN1WE;
	
	@FindBy(xpath = "//div[26]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaBrojilaAktivneEnergijeNN1WE;

	@FindBy(xpath = "//div[26]/div[2]/div[2]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement klasaTacnostiBrojilaAktivneEnergijeNN1WE;
	
	@FindBy(xpath = "//div[26]/div[2]/div[3]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaBrojilaReaktivneEnergijeNN1WE;

	@FindBy(xpath = "//div[26]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement klasaTacnostiBrojilaReaktivneEnergijeNN1WE;

//	SREDNJI NAPON
	
	@FindBy(xpath = "//form/div/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement kategorijaPotrosnjeWE;
	
	@FindBy(xpath = "//div[7]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement vrstaObjektaSNWE;
	
	@FindBy(xpath = "//div[16]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement naponskiNivoSNWE;
	
	@FindBy(xpath = "//div[16]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement nazivniNaponMjerenjaSNWE;

	@FindBy(xpath = "//div[16]/div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement mjestoPrikljucenjaSNWE;
	
	@FindBy(xpath = "//div[14]/div[2]/div/div/div[1]/div/input")
	private WebElement ukupnaPrikljucnaSnagaWE;
	
	@FindBy(xpath = "//div[17]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement brojPrikljucnihVodovaSNWE;
	
	@FindBy(xpath = "//div[17]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipPrikljucnogVodaSNWE;
	
	@FindBy(xpath = "//div[17]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement presjekMm2SNWE;
	
	@FindBy(xpath = "//div[19]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement napojnaTransformatorskaStanicaSNWE;
	
	@FindBy(xpath = "//div[23]/div[2]/div[1]/div[3]/div/div/div[1]/div/input")  
	 private WebElement prikljucnaSnagaSNWE;
	
	@FindBy(xpath = "//div[23]/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaSNWE;
	
	@FindBy(xpath = "//div[23]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaBrojilaAktivneEnergijeSNWE;

	@FindBy(xpath = "//div[23]/div[2]/div[2]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement klasaTacnostiBrojilaAktivneEnergijeSNWE;
	
	@FindBy(xpath = "//div[23]/div[2]/div[3]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaBrojilaReaktivneEnergijeSNWE;

	@FindBy(xpath = "//div[23]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement klasaTacnostiBrojilaReaktivneEnergijeSNWE;

	@FindBy(xpath = "//div[23]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement prenosniOdnosSmtSNWE;

//	PRIVREMENI OBJEKTI
	
	@FindBy(xpath = "//form/div/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	private WebElement brojProtokolaPOWE;
	
	@FindBy(xpath = "//form/div/div[2]/div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement kupacPOWE;
	
	@FindBy(xpath = "//form/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement fizickaLokacijaPOWE;

	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div/input")  
	private WebElement kategorijaPrikljuckaPOWE;

	@FindBy(xpath = "//div[4]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement tipPrikljuckaPOWE;

	@FindBy(xpath = "//div[7]/div[1]/div/div/div[1]/div[1]/input[1]")  
	private WebElement mjestoPOWE;

	@FindBy(xpath = "//div[7]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement postaPOWE;

	@FindBy(xpath = "//div[8]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement vrstaObjektaPOWE;

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
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
	
	public void dodajOdaberiTipEES(String tipEES, String kategorijaPotrosnje1, String kategorijaPotrosnje2) {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipEESWE));
		tipEESWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + tipEES + "')]"))).click();
		if (tipEES == "Niski napon" && kategorijaPotrosnje2 == null) {
			wait.until(ExpectedConditions.elementToBeClickable(kategorijaPotrosnjeNNWE));
			kategorijaPotrosnjeNNWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kategorijaPotrosnje1 + "')]"))).click();
			tipEESWE.click();
		}
		if (tipEES == "Niski napon" && kategorijaPotrosnje2 != null && kategorijaPotrosnje1 != kategorijaPotrosnje2) {
			wait.until(ExpectedConditions.elementToBeClickable(kategorijaPotrosnjeNNWE));
			kategorijaPotrosnjeNNWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kategorijaPotrosnje1 + "')]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kategorijaPotrosnje2 + "')]"))).click();
			tipEESWE.click();
		}
		if (tipEES == "Srednji napon" || tipEES == "Privremeni objekti") {
			wait.until(ExpectedConditions.elementToBeClickable(kategorijaPotrosnjeWE));
			kategorijaPotrosnjeWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kategorijaPotrosnje1 + "')]"))).click();
			tipEESWE.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(daljeBtnWE));
		daljeBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public void popuniZajednickaPoljaEES(String brojProtokola) {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		lookupInputValue(kupacWE, Helper.getRandomNumber(3));
		lookupInputValue(fizickaLokacijaWE, "4101 - 01 - BIJELJINA");
		if (brojProtokola.contains("NestandardniPrikljucak")) {
		}
		else {
			lookupInput(kategorijaPrikljuckaWE);
		}
		lookupInput(tipPrikljuckaWE);
		fieldInputValue(brojProtokolaWE, brojProtokola);		
		lookupInput(razlogEESWE);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.visibilityOf(naslovWE));
		naslovWE.click();
		js.executeScript("arguments[0].scrollIntoView(true);", datumBtn2WE);
		lookupInputValue(mjestoWE, "25 - Bijeljina");
		lookupInputValue(postaWE, "76300 - Bijeljina");
	}

	public void dodajElektronergetskuSaglasnostD() throws Exception {
		lookupInput(vrstaObjektaWE);
		js.executeScript("arguments[0].scrollIntoView(true);", datumBtn3WE);
		lookupInput(mjestoPrikljucenjaWE);
		lookupInput(vrstaPrikljuckaWE);
		wait.until(ExpectedConditions.elementToBeClickable(brojPrikljucnihVodovaWE));
		brojPrikljucnihVodovaWE.click();
		brojPrikljucnihVodovaWE.sendKeys(Helper.getRandomNumber(2));
		lookupInput(tipPrikljucnogVodaWE);
		lookupInput(presjekMm2WE);
		js.executeScript("arguments[0].scrollIntoView(true);", presjekMm2WE);
		lookupInputValue(napojnaTransformatorskaStanicaWE, "410123 - MIRKA FILIPOVIĆA");
		lookupInput(lokacijaMjernogMjestaWE);
		js.executeScript("arguments[0].scrollIntoView(true);", lokacijaMjernogMjestaWE);
		wait.until(ExpectedConditions.elementToBeClickable(brojUgradjenihBrojilaWE));
		brojUgradjenihBrojilaWE.click();
		brojUgradjenihBrojilaWE.sendKeys(Helper.getRandomNumberInRange(1, 4));
		lookupInput(nazivnaStrujaGlavnogOsiguracaWE);
		lookupInput(nazivnaStrujaBrojilaAktivneEnergijeWE);
		lookupInput(klasaTacnostiBrojilaAktivneEnergijeWE);
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
	}
	
	public void dodajElektronergetskuSaglasnostNN(int kategorijaPotrosnje) throws Exception {
		lookupInput(vrstaObjektaWE);
		js.executeScript("arguments[0].scrollIntoView(true);", poljeZaScrollWE);
		lookupInput(mjestoPrikljucenjaNNWE);
		lookupInput(vrstaPrikljuckaNNWE);
		fieldInputValue(brojPrikljucnihVodovaNNWE, Helper.getRandomNumber(2));
		lookupInput(tipPrikljucnogVodaNNWE);
		lookupInput(presjekMm2NNWE);
		lookupInputValue(napojnaTransformatorskaStanicaNNWE, "410123 - MIRKA FILIPOVIĆA");
		js.executeScript("arguments[0].scrollIntoView(true);", napojnaTransformatorskaStanicaNNWE);
		fieldInputValue(brojUgradjenihBrojilaNNWE, Helper.getRandomNumberInRange(1, 4));
		lookupInput(nazivnaStrujaGlavnogOsiguracaNNWE);
		js.executeScript("arguments[0].scrollIntoView(true);", nazivnaStrujaGlavnogOsiguracaNNWE);
		lookupInput(lokacijaMjernogMjestaNNWE);
		lookupInput(nazivnaStrujaBrojilaAktivneEnergijeNNWE);		
		lookupInput(klasaTacnostiBrojilaAktivneEnergijeNNWE);		
		if (kategorijaPotrosnje==10 || kategorijaPotrosnje==30) {
			lookupInput(nazivnaStrujaBrojilaReaktivneEnergijeNNWE);
			lookupInput(klasaTacnostiBrojilaReaktivneEnergijeNNWE);
		}
		if (kategorijaPotrosnje==2030) {
			js.executeScript("arguments[0].scrollIntoView(true);", nazivnaStrujaGlavnogOsiguracaNNWE);
			fieldInputValue(brojUgradjenihBrojilaNN1WE, Helper.getRandomNumberInRange(1, 4));			
			lookupInput(nazivnaStrujaGlavnogOsiguracaNN1WE);
			lookupInput(lokacijaMjernogMjestaNN1WE);
			lookupInput(nazivnaStrujaBrojilaAktivneEnergijeNN1WE);
			lookupInput(klasaTacnostiBrojilaAktivneEnergijeNN1WE);
			lookupInput(nazivnaStrujaBrojilaReaktivneEnergijeNN1WE);
			lookupInput(klasaTacnostiBrojilaReaktivneEnergijeNN1WE);
		}
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
	}
	
	public void dodajElektronergetskuSaglasnostSN(int kategorijaPotrosnje) throws Exception {
		lookupInput(vrstaObjektaSNWE);
		js.executeScript("arguments[0].scrollIntoView(true);", ukupnaPrikljucnaSnagaWE);
		lookupInput(naponskiNivoSNWE);
		lookupInput(nazivniNaponMjerenjaSNWE);
		lookupInput(mjestoPrikljucenjaSNWE);
		fieldInputValue(brojPrikljucnihVodovaSNWE, Helper.getRandomNumber(2));
		lookupInput(tipPrikljucnogVodaSNWE);
		lookupInput(presjekMm2SNWE);
		lookupInputValue(napojnaTransformatorskaStanicaSNWE, "410123 - MIRKA FILIPOVIĆA");
		js.executeScript("arguments[0].scrollIntoView(true);", napojnaTransformatorskaStanicaSNWE);
		fieldInputValue(prikljucnaSnagaSNWE, Helper.getRandomNumber(2));
		lookupInput(lokacijaMjernogMjestaSNWE);		
		js.executeScript("arguments[0].scrollIntoView(true);", prikljucnaSnagaSNWE);
		lookupInput(nazivnaStrujaBrojilaAktivneEnergijeSNWE);
		lookupInput(klasaTacnostiBrojilaAktivneEnergijeSNWE);
		lookupInput(nazivnaStrujaBrojilaReaktivneEnergijeSNWE);
		lookupInput(klasaTacnostiBrojilaReaktivneEnergijeSNWE);		
		lookupInput(prenosniOdnosSmtSNWE);
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
	}
	
	public void dodajElektronergetskuSaglasnostPO(String brojProtokola) throws Exception {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(brojProtokolaPOWE));
		brojProtokolaWE.click();
		brojProtokolaWE.sendKeys(brojProtokola);
		lookupInputValue(kupacPOWE, Helper.getRandomNumber(3));
		lookupInputValue(fizickaLokacijaPOWE, "4101 - 01 - BIJELJINA");
		lookupInput(kategorijaPrikljuckaPOWE);
		lookupInput(tipPrikljuckaPOWE);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.visibilityOf(naslovWE));
		naslovWE.click();
		js.executeScript("arguments[0].scrollIntoView(true);", datumBtn2WE);
		lookupInputValue(mjestoPOWE, "25 - Bijeljina");
		lookupInputValue(postaPOWE, "76300 - Bijeljina");
		lookupInput(vrstaObjektaWE);
		js.executeScript("arguments[0].scrollIntoView(true);", datumBtn3WE);
	}


}