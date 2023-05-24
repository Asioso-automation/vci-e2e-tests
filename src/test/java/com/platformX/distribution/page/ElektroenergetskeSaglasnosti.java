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

public class ElektroenergetskeSaglasnosti extends PocetnaStranicaPXD {
	
	public ElektroenergetskeSaglasnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement razlogEESWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement kupacWE;
	
	@FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement fizickaLokacijaWE;
	
	@FindBy(xpath = "//div[5]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement mjestoWE;
	
	@FindBy(xpath = "//div[5]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement postaWE;
	
	@FindBy(xpath = "//div[5]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement ulicaWE;

	@FindBy(xpath = "//div[6]/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUuliciWE;
	
	@FindBy(xpath = "//div[6]/div[2]/div/div/div[1]/div[1]/div/div/i")
	 private WebElement vrstaObjektaWE;
	
	@FindBy(xpath = "//div[6]/div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement vrstaObjektaInputWE;
	
	@FindBy(xpath = "//div[8]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement odobrenaPrikljucnaSnagaWE;
	
	@FindBy(xpath = "//div[8]/div[2]/div/div/div[1]/div[1]/div/div/i")
	private WebElement odobrenaPrikljucnaSnaga1WE;
	
	@FindBy(xpath = "//div[11]/div[1]/div/div/div[1]/div[1]/input[1]")
	 private WebElement naponskiNivoWE;
	
	@FindBy(xpath = "//div[11]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement mjestoPrikljucenjaWE;
	
	@FindBy(xpath = "//div[11]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement vrstaPrikljuckaWE;
	
	@FindBy(xpath = "//div[12]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipPrikljucnogVodaWE;
	
	@FindBy(xpath = "//div[12]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement presjekMm2WE;
	
	@FindBy(xpath = "//div[13]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement napojnaTransformatorskaStanicaWE;
	
	@FindBy(xpath = "//div[13]/div[4]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaWE;
	
	@FindBy(xpath = "//div[15]/div[2]/div/div/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUgradjenihBrojilaWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaWE;
	
	@FindBy(xpath = "//div[19]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement rokVazenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'UspjeÅ¡no zavrÅ¡eno.')]")
	private WebElement porukaWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement brojProtokolaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-stepper__step--active')]")
	private WebElement odaberiTipEESWE;
	
	@FindBy(xpath = "//input[1]")
	private WebElement tipEESWE;
	
	@FindBy(xpath = "//button[@type='button' and contains(@class, 'primary')]")
	private WebElement daljeBtnWE;
		
//	NISKI NAPON
	
	@FindBy(xpath = "//div[11]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement odobrenaSnagaStambeniDioWE;
	
	@FindBy(xpath = "//div[11]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement odobrenaSnagaPoslovniDioWE;
	
	@FindBy(xpath = "//div[14]/div[1]/div/div/div[1]/div[1]/input[1]")
	 private WebElement naponskiNivoNWE;
	
	@FindBy(xpath = "//div[14]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement mjestoPrikljucenjaNWE;
	
	@FindBy(xpath = "//div[14]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement vrstaPrikljuckaNWE;
	
	@FindBy(xpath = "//div[15]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipPrikljucnogVodaNWE;
	
	@FindBy(xpath = "//div[15]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement presjekMm2NWE;
	
	@FindBy(xpath = "//div[16]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement napojnaTransformatorskaStanicaNWE;
	
	@FindBy(xpath = "//div[20]/div[2]/div/div/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUgradjenihBrojilaNSWE;
	
	@FindBy(xpath = "//div[20]/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaNSWE;
	
	@FindBy(xpath = "//div[21]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaNSWE;
	
	@FindBy(xpath = "//div[24]/div[2]/div/div/div/div[1]/div/div/div[1]/div/input")
	 private WebElement brojUgradjenihBrojilaNPWE;
		
	@FindBy(xpath = "//div[24]/div[2]/div/div/div/div[2]/div/div/div[1]/div/input")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaNPWE;
	
	@FindBy(xpath = "//div[25]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaNPWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Stambeni dio')]")
	private WebElement stambenioDioWE;
	
	@FindBy(xpath = "//div[28]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement rokVazenjaNWE;
	
	@FindBy(xpath = "//div[@class='v-card__title subtitle-2 title-border text-uppercase mb-5']")  
	private WebElement naslovWE;
	
	public void verifikujElektroenergetskeSaglasnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Elektroenergetske saglasnosti')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Elektroenergetske Saglasnosti", "ELEKTROENERGETSKE SAGLASNOSTI", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaObjektaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipEesWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogEesWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
	}
	
	public String dodajElektronergetskuSaglasnost(String tipEES) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTipEESWE));
		wait.until(ExpectedConditions.elementToBeClickable(tipEESWE));
		tipEESWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + tipEES + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + tipEES + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(daljeBtnWE));
		daljeBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='v-icon notranslate mdi mdi-pencil theme--light']")));
		wait.until(ExpectedConditions.visibilityOf(naslovWE));
		naslovWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumKalendar1WE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(razlogEESWE));
		razlogEESWE.click();
		razlogEESWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		razlogEESWE.sendKeys(Keys.ARROW_DOWN);
		razlogEESWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.click();
		kupacWE.sendKeys(Helper.getRandomNumber(3));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(fizickaLokacijaWE));
		fizickaLokacijaWE.click();
		fizickaLokacijaWE.sendKeys("308 - 01 - Pale");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		fizickaLokacijaWE.sendKeys(Keys.ARROW_DOWN);
		fizickaLokacijaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.click();
		mjestoWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		mjestoWE.sendKeys(Keys.ARROW_DOWN);
		mjestoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.click();
		postaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		postaWE.sendKeys(Keys.ARROW_DOWN);
		postaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.click();
		ulicaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		ulicaWE.sendKeys(Keys.ARROW_DOWN);
		ulicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojUuliciWE));
		brojUuliciWE.click();
		brojUuliciWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(vrstaObjektaWE));
		vrstaObjektaWE.click();
		vrstaObjektaInputWE.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		vrstaObjektaInputWE.sendKeys(Keys.ARROW_DOWN);
		vrstaObjektaInputWE.sendKeys(Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//	tip EES 1 - Domacinstva
		if (tipEES=="DomaÄ‡instva") {
		js.executeScript("arguments[0].scrollIntoView(true);", odobrenaPrikljucnaSnagaWE);
		wait.until(ExpectedConditions.elementToBeClickable(odobrenaPrikljucnaSnagaWE));
		odobrenaPrikljucnaSnagaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ARROW_DOWN);
		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(naponskiNivoWE));
		naponskiNivoWE.click();
		naponskiNivoWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		naponskiNivoWE.sendKeys(Keys.ARROW_DOWN);
		naponskiNivoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(mjestoPrikljucenjaWE));
		mjestoPrikljucenjaWE.click();
		mjestoPrikljucenjaWE.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		mjestoPrikljucenjaWE.sendKeys(Keys.ARROW_DOWN);
		mjestoPrikljucenjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(vrstaPrikljuckaWE));
		vrstaPrikljuckaWE.click();
		vrstaPrikljuckaWE.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		vrstaPrikljuckaWE.sendKeys(Keys.ARROW_DOWN);
		vrstaPrikljuckaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(tipPrikljucnogVodaWE));
		tipPrikljucnogVodaWE.click();
		tipPrikljucnogVodaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		tipPrikljucnogVodaWE.sendKeys(Keys.ARROW_DOWN);
		tipPrikljucnogVodaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(presjekMm2WE));
		presjekMm2WE.click();
		presjekMm2WE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		presjekMm2WE.sendKeys(Keys.ARROW_DOWN);
		presjekMm2WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(napojnaTransformatorskaStanicaWE));
		napojnaTransformatorskaStanicaWE.click();
		napojnaTransformatorskaStanicaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		napojnaTransformatorskaStanicaWE.sendKeys(Keys.ARROW_DOWN);
		napojnaTransformatorskaStanicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(lokacijaMjernogMjestaWE));
		lokacijaMjernogMjestaWE.click();
		lokacijaMjernogMjestaWE.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		lokacijaMjernogMjestaWE.sendKeys(Keys.ARROW_DOWN);
		lokacijaMjernogMjestaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojUgradjenihBrojilaWE));
		brojUgradjenihBrojilaWE.click();
		brojUgradjenihBrojilaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaGlavnogOsiguracaWE));
		nazivnaStrujaGlavnogOsiguracaWE.click();
		nazivnaStrujaGlavnogOsiguracaWE.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		nazivnaStrujaGlavnogOsiguracaWE.sendKeys(Keys.ARROW_DOWN);
		nazivnaStrujaGlavnogOsiguracaWE.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].scrollIntoView(true);", rokVazenjaWE);
		wait.until(ExpectedConditions.elementToBeClickable(rokVazenjaWE));
		rokVazenjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		rokVazenjaWE.sendKeys(Keys.ARROW_DOWN);
		rokVazenjaWE.sendKeys(Keys.ENTER);
		}
//	tip EES 2 - Niski napon
		else if (tipEES=="Niski napon") {
			js.executeScript("arguments[0].scrollIntoView(true);", odobrenaSnagaStambeniDioWE);
			wait.until(ExpectedConditions.elementToBeClickable(odobrenaSnagaStambeniDioWE));
			odobrenaSnagaStambeniDioWE.sendKeys(Helper.getRandomNumber(1));
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			odobrenaSnagaStambeniDioWE.sendKeys(Keys.ARROW_DOWN);
			odobrenaSnagaStambeniDioWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(odobrenaSnagaPoslovniDioWE));
			odobrenaSnagaPoslovniDioWE.sendKeys(Helper.getRandomNumber(1));
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			odobrenaSnagaPoslovniDioWE.sendKeys(Keys.ARROW_DOWN);
			odobrenaSnagaPoslovniDioWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(naponskiNivoNWE));
			naponskiNivoNWE.click();
			naponskiNivoNWE.sendKeys(Helper.getRandomNumber(1));
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			naponskiNivoNWE.sendKeys(Keys.ARROW_DOWN);
			naponskiNivoNWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(mjestoPrikljucenjaNWE));
			mjestoPrikljucenjaNWE.click();
			mjestoPrikljucenjaNWE.sendKeys("1");
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			mjestoPrikljucenjaNWE.sendKeys(Keys.ARROW_DOWN);
			mjestoPrikljucenjaNWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(vrstaPrikljuckaNWE));
			vrstaPrikljuckaNWE.click();
			vrstaPrikljuckaNWE.sendKeys("1");
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			vrstaPrikljuckaNWE.sendKeys(Keys.ARROW_DOWN);
			vrstaPrikljuckaNWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(tipPrikljucnogVodaNWE));
			tipPrikljucnogVodaNWE.click();
			tipPrikljucnogVodaNWE.sendKeys(Helper.getRandomNumber(1));
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			tipPrikljucnogVodaNWE.sendKeys(Keys.ARROW_DOWN);
			tipPrikljucnogVodaNWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(presjekMm2NWE));
			presjekMm2NWE.click();
			presjekMm2NWE.sendKeys(Helper.getRandomNumber(1));
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			presjekMm2NWE.sendKeys(Keys.ARROW_DOWN);
			presjekMm2NWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(napojnaTransformatorskaStanicaNWE));
			napojnaTransformatorskaStanicaNWE.click();
			napojnaTransformatorskaStanicaNWE.sendKeys(Helper.getRandomNumber(1));
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			napojnaTransformatorskaStanicaNWE.sendKeys(Keys.ARROW_DOWN);
			napojnaTransformatorskaStanicaNWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(brojUgradjenihBrojilaNSWE));
			brojUgradjenihBrojilaNSWE.click();
			brojUgradjenihBrojilaNSWE.sendKeys(Helper.getRandomNumber(1));
			js.executeScript("arguments[0].scrollIntoView(true);", stambenioDioWE);
			wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaGlavnogOsiguracaNSWE));
			nazivnaStrujaGlavnogOsiguracaNSWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			nazivnaStrujaGlavnogOsiguracaNSWE.sendKeys(Keys.ARROW_DOWN);
			nazivnaStrujaGlavnogOsiguracaNSWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(lokacijaMjernogMjestaNSWE));
			lokacijaMjernogMjestaNSWE.click();
			lokacijaMjernogMjestaNSWE.sendKeys("1");
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			lokacijaMjernogMjestaNSWE.sendKeys(Keys.ARROW_DOWN);
			lokacijaMjernogMjestaNSWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(brojUgradjenihBrojilaNPWE));
			brojUgradjenihBrojilaNPWE.click();
			brojUgradjenihBrojilaNPWE.sendKeys(Helper.getRandomNumber(1));
			wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaGlavnogOsiguracaNPWE));
			nazivnaStrujaGlavnogOsiguracaNPWE.click();
			nazivnaStrujaGlavnogOsiguracaNPWE.sendKeys("1");
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			nazivnaStrujaGlavnogOsiguracaNPWE.sendKeys(Keys.ARROW_DOWN);
			nazivnaStrujaGlavnogOsiguracaNPWE.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(lokacijaMjernogMjestaNPWE));
			lokacijaMjernogMjestaNPWE.click();
			lokacijaMjernogMjestaNPWE.sendKeys("1");
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			lokacijaMjernogMjestaNPWE.sendKeys(Keys.ARROW_DOWN);
			lokacijaMjernogMjestaNPWE.sendKeys(Keys.ENTER);
			js.executeScript("arguments[0].scrollIntoView(true);", rokVazenjaNWE);
			wait.until(ExpectedConditions.elementToBeClickable(rokVazenjaNWE));
			rokVazenjaNWE.click();
			wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
			rokVazenjaNWE.sendKeys(Keys.ARROW_DOWN);
			rokVazenjaNWE.sendKeys(Keys.ENTER);
		}
		js.executeScript("arguments[0].scrollIntoView(true);", datumBtn3WE);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn3WE));
		datumBtn3WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumKalendar2WE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum2WE));
		trenutniDatum2WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		String brProtokola = brojProtokolaWE.getText();
		return brProtokola;
	}
	
	public void verifikujElektroenergetskuSaglasnost(String brProtokola)throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(brProtokola);
		filterKolona2WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(brojProtokolaWE));
		assertTrue(brojProtokolaWE.getText().equals(brProtokola), "ElektroenergetskaSaglasnost: Broj protokola nije pronadjen!");
	}
	
	public void urediElektroenergetskuSaglasnost() throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(odobrenaPrikljucnaSnaga1WE));
		odobrenaPrikljucnaSnaga1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ARROW_DOWN);
		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ENTER);
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	
}