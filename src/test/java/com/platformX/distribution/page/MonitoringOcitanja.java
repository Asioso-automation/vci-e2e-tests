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

public class MonitoringOcitanja extends PocetnaStranicaPXD {
	
	public MonitoringOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[2]")
    protected WebElement neocitanaBrojilaBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[3]")
    protected WebElement djelimicnoOcitanaBrojilaBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[4]")
    protected WebElement podcitanaBrojilaBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[5]")
    protected WebElement precitanaBrojilaBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[6]")
    protected WebElement natprosjecnaOcitanjaBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[7]")		//div[@class='v-tab' and text()=' Dupla očitanja brojila ')]
    protected WebElement duplaOcitanjaBrojilaBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[8]")
    protected WebElement duplaNevalidnaOcitanjaBrojilaBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[9]")
    protected WebElement nemaPotrosnjeBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[10]")
    protected WebElement iskljucenaBrojilaSaPotrosnjomBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[11]")
    protected WebElement neocitanaZbirnaKontrolnaMjernaMjestaBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'mdi mdi-chevron-right theme--light')]")
    protected WebElement slideRightBtnWE;
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] buttons = {};
	
//	ukupan broj kolona 134, broj dodatnih kolona po tabu: 134 minus broj elemenata iz liste kolona
	
	public WebElement[] columns1 = {kolone.kolonaMonObracunskiUgovorWE, kolone.kolonaMonMjernoMjestoEicWE, kolone.kolonaMonNazivMjernogMjestaWE, 
			kolone.kolonaMonAdresaMjernogMjestaWE, kolone.kolonaMonBrojBrojilaWE, kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE}; //7
	
	public WebElement[] columns2 = {kolone.kolonaMonObracunskiUgovorWE, kolone.kolonaMonMjernoMjestoEicWE, kolone.kolonaMonNazivMjernogMjestaWE, 
			kolone.kolonaMonAdresaMjernogMjestaWE, kolone.kolonaMonBrojBrojilaWE, kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE, 
			kolone.kolonaMonAvtNeocitanoWE, kolone.kolonaMonAmtNeocitanoWE, kolone.kolonaMonRvtNeocitanoWE, kolone.kolonaMonRmtNeocitanoWE, 
			kolone.kolonaMonSnagaNeocitanaWE}; //12
	
	public WebElement[] columns3 = {kolone.kolonaMonObracunskiUgovorWE, kolone.kolonaMonMjernoMjestoEicWE, kolone.kolonaMonNazivMjernogMjestaWE, 
			kolone.kolonaMonAdresaMjernogMjestaWE, kolone.kolonaMonBrojBrojilaWE, kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE, 
			kolone.kolonaMonStaraVtWE, kolone.kolonaMonNovaVtWE, kolone.kolonaMonStaraMtWE, kolone.kolonaMonNovaMtWE, kolone.kolonaMonAktivnoBrojiloWE, 
			kolone.kolonaMonReaktivnoBrojiloWE}; //13

	public WebElement[] columns4 = {kolone.kolonaMonObracunskiUgovorWE, kolone.kolonaMonMjernoMjestoEicWE, kolone.kolonaMonNazivMjernogMjestaWE, 
			kolone.kolonaMonAdresaMjernogMjestaWE, kolone.kolonaMonBrojBrojilaWE, kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE, 
			kolone.kolonaMonVtWE, kolone.kolonaMonMtWE, kolone.kolonaMonSnaga1WE, kolone.kolonaMonAktivnoBrojiloWE, kolone.kolonaMonReaktivnoBrojiloWE, 
			kolone.kolonaMonVtResetovanaWE, kolone.kolonaMonMtResetovanaWE}; //14
	
	public WebElement[] columns5 = {kolone.kolonaMonObracunskiUgovorWE, kolone.kolonaMonMjernoMjestoEicWE, kolone.kolonaMonNazivMjernogMjestaWE, 
			kolone.kolonaMonAdresaMjernogMjestaWE, kolone.kolonaMonBrojBrojilaWE, kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE, 
			kolone.kolonaMonNovaPotrosnjaWE, kolone.kolonaMonProsjecnaPotrosnjaWE, kolone.kolonaMonProcenatOdstupanjaWE, kolone.kolonaMonAvtWE, 
			kolone.kolonaMonAmtWE}; //12
	
	public WebElement[] columns6 = {kolone.kolonaMonObracunskiUgovorWE, kolone.kolonaMonMjernoMjestoEicWE, kolone.kolonaMonNazivMjernogMjestaWE, 
			kolone.kolonaMonAdresaMjernogMjestaWE, kolone.kolonaMonBrojBrojilaWE, kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE, 
			kolone.kolonaMonAvtWE, kolone.kolonaMonAmtWE, kolone.kolonaMonRvtWE, kolone.kolonaMonRmtWE, kolone.kolonaMonSnaga1WE}; //12

	public WebElement[] columns7 = {kolone.kolonaMonBrojiloWE, kolone.kolonaMonNazivMjernogMjestaWE, kolone.kolonaMonMjernoMjestoEicWE, 
			kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE, kolone.kolonaMonAvtWE, kolone.kolonaMonAmtWE, kolone.kolonaMonRvtWE, 
			kolone.kolonaMonRmtWE, kolone.kolonaMonSnaga1WE, kolone.kolonaMonPorukaCitacaWE}; //11

	public WebElement[] columns8 = {kolone.kolonaMonObracunskiUgovorWE, kolone.kolonaMonMjernoMjestoEicWE, kolone.kolonaMonNazivMjernogMjestaWE, 
			kolone.kolonaMonAdresaMjernogMjestaWE, kolone.kolonaMonBrojBrojilaWE, kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE, 
			kolone.kolonaMonAvtWE, kolone.kolonaMonAmtWE, kolone.kolonaMonRvtWE, kolone.kolonaMonRmtWE}; //11

	public WebElement[] columns9 = {kolone.kolonaMonObracunskiUgovorWE, kolone.kolonaMonMjernoMjestoEicWE, kolone.kolonaMonNazivMjernogMjestaWE, 
			kolone.kolonaMonAdresaMjernogMjestaWE, kolone.kolonaMonBrojBrojilaWE, kolone.kolonaMonTrafostanicaWE, kolone.kolonaMonCitacWE, 
			kolone.kolonaMonStaraVtWE, kolone.kolonaMonNovaVtWE, kolone.kolonaMonStaraMtWE, kolone.kolonaMonNovaMtWE, kolone.kolonaMonAktivnoBrojiloWE, 
			kolone.kolonaMonReaktivnoBrojiloWE}; //13

	public WebElement[] columns10 = {kolone.kolonaMonZbirnoMjernoMjestoEicWE, kolone.kolonaMonBrojiloWE, kolone.kolonaMonTrafostanicaWE, 
			kolone.kolonaMonTerenskaJedinicaWE, kolone.kolonaMonFizickaLokacijaWE, kolone.kolonaMonCitacWE}; //6
	
	public void verifikujMonitoringOcitanja()throws Exception {
		navigateOnPage(MonitoringOcitanja.class, "Očitanja", "Monitoring očitanja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Monitoring očitanja')]")));
//		verifikacijaZajednickihElemenata2("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 134, false, false, false, false, false, false, false);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", neocitanaBrojilaBtnWE);
		wait.until(ExpectedConditions.visibilityOf(neocitanaBrojilaBtnWE));
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 127, columns1, buttons);	// 134-7=127
		wait.until(ExpectedConditions.visibilityOf(djelimicnoOcitanaBrojilaBtnWE));
		djelimicnoOcitanaBrojilaBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 122, columns2, buttons);
		wait.until(ExpectedConditions.visibilityOf(podcitanaBrojilaBtnWE));
		podcitanaBrojilaBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 121, columns3, buttons);
		wait.until(ExpectedConditions.visibilityOf(precitanaBrojilaBtnWE));
		precitanaBrojilaBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 120, columns4, buttons);
		wait.until(ExpectedConditions.visibilityOf(natprosjecnaOcitanjaBtnWE));
		natprosjecnaOcitanjaBtnWE.click();
//		slideRightBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 122, columns5, buttons);
		wait.until(ExpectedConditions.visibilityOf(duplaOcitanjaBrojilaBtnWE));
		duplaOcitanjaBrojilaBtnWE.click();
		duplaOcitanjaBrojilaBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 122, columns6, buttons);
		try {
			slideRightBtnWE.click();
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(duplaNevalidnaOcitanjaBrojilaBtnWE));
		duplaNevalidnaOcitanjaBrojilaBtnWE.click();
		duplaNevalidnaOcitanjaBrojilaBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 123, columns7, buttons);
		wait.until(ExpectedConditions.visibilityOf(nemaPotrosnjeBtnWE));
		nemaPotrosnjeBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 123, columns8, buttons);		
//		slideRightBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(iskljucenaBrojilaSaPotrosnjomBtnWE));
		iskljucenaBrojilaSaPotrosnjomBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 121, columns9, buttons);
		wait.until(ExpectedConditions.visibilityOf(neocitanaZbirnaKontrolnaMjernaMjestaBtnWE));
		neocitanaZbirnaKontrolnaMjernaMjestaBtnWE.click();
		verifikacijaStranice("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 128, columns10, buttons);
	}
	
}