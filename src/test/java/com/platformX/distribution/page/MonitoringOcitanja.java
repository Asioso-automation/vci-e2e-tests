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

	public void verifikujMonitoringOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Monitoring očitanja')]")));
		verifikacijaZajednickihElemenata("Očitanja", "Monitoring Očitanja", "Monitoring očitanja", 132, false, false, false, false, false, false, false);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", neocitanaBrojilaBtnWE);
		wait.until(ExpectedConditions.visibilityOf(neocitanaBrojilaBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(djelimicnoOcitanaBrojilaBtnWE));
		djelimicnoOcitanaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAvtNeocitanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAmtNeocitanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonRvtNeocitanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonRmtNeocitanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonSnagaNeocitanaWE));
		wait.until(ExpectedConditions.visibilityOf(podcitanaBrojilaBtnWE));
		podcitanaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonStaraVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNovaVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonStaraMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNovaMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonReaktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(precitanaBrojilaBtnWE));
		precitanaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonReaktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonVtResetovanaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMtResetovanaWE));
		wait.until(ExpectedConditions.visibilityOf(natprosjecnaOcitanjaBtnWE));
		natprosjecnaOcitanjaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNovaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonProsjecnaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonProcenatOdstupanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAmtWE));
//		slideRightBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(duplaOcitanjaBrojilaBtnWE));
		duplaOcitanjaBrojilaBtnWE.click();
		duplaOcitanjaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonSnaga1WE));
		slideRightBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(duplaNevalidnaOcitanjaBrojilaBtnWE));
		duplaNevalidnaOcitanjaBrojilaBtnWE.click();
		duplaNevalidnaOcitanjaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonPorukaCitacaWE));
		wait.until(ExpectedConditions.visibilityOf(nemaPotrosnjeBtnWE));
		nemaPotrosnjeBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonRmtWE));
//		slideRightBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(iskljucenaBrojilaSaPotrosnjomBtnWE));
		iskljucenaBrojilaSaPotrosnjomBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonStaraVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNovaVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonStaraMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonNovaMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonAktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonReaktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(neocitanaZbirnaKontrolnaMjernaMjestaBtnWE));
		neocitanaZbirnaKontrolnaMjernaMjestaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonZbirnoMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonCitacWE));
	}
	
}