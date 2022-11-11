package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MonitoringOcitanja extends PocetnaStranica {
	
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
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[7]")
    protected WebElement duplaOcitanjaBrojilaBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[8]")
    protected WebElement nemaPotrosnjeBtnWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/div/div[9]")
    protected WebElement iskljucenaBrojilaSaPotrosnjomBtnWE;
	
	@FindBy(xpath = "//div[2]/div[3]/div[1]/div/div[1]/div[3]")
    protected WebElement slideBtnWE;
	
	// Kolone
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Mjerno mjesto (EIC)']")
	protected WebElement kolonaMjernoMjestoEicWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'AVT']")
	protected WebElement kolonaAvtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'AMT']")
	protected WebElement kolonaAmtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'RVT']")
	protected WebElement kolonaRvtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'RMT']")
	protected WebElement kolonaRmtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga']")
	protected WebElement kolonaSnaga1WE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Trafostanica']")
	protected WebElement kolonaTrafoStanicaWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Naziv mjernog mjesta']")
	protected WebElement kolonaNazivMjernogMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Obračunski ugovor']")
	protected WebElement kolonaObracunskiUgovorWE;
	
	@FindBy(xpath =  "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Broj brojila']")
	protected WebElement kolonaBrojBrojilaWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Čitač']")
	protected WebElement kolonaCitacWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Adresa mjernog mjesta']")
	protected WebElement kolonaAdresaMjernogMjestaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AVT neočitano']")
	protected WebElement kolonaAvtNeocitanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'AMT neočitano']")
	protected WebElement kolonaAmtNeocitanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'RVT neočitano']")
	protected WebElement kolonaRvtNeocitanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'RMT neočitano']")
	protected WebElement kolonaRmtNeocitanoWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Snaga neočitana']")
	protected WebElement kolonaSnagaNeocitanaWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stara VT']")
	protected WebElement kolonaStaraVtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nova VT']")
	protected WebElement kolonaNovaVtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Stara MT']")
	protected WebElement kolonaStaraMtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nova MT']")
	protected WebElement kolonaNovaMtWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Aktivno brojilo']")
	protected WebElement kolonaAktivnoBrojiloWE;
	
	@FindBy(xpath = "//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-data-table-header')]//*[text() = 'Reaktivno brojilo']")
	protected WebElement kolonaReaktivnoBrojiloWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'VT']")
	protected WebElement kolonaVtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'MT']")
	protected WebElement kolonaMtWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'VT resetovana']")
	protected WebElement kolonaVtResetovanaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'MT resetovana']")
	protected WebElement kolonaMtResetovanaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Nova potrošnja']")
	protected WebElement kolonaNovaPotrosnjaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-data-table-header')]//*[text() = 'Prosječna potrošnja']")
	protected WebElement kolonaProsjecnaPotrosnjaWE;

	public void verifikujMonitoringOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Monitoring očitanja')]")));
		wait.until(ExpectedConditions.visibilityOf(neocitanaBrojilaBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaCitacWE));
		assertTrue(brojKolona().size() == 108, "MonitoringOcitanja: Broj kolona nije dobar! ");
		wait.until(ExpectedConditions.visibilityOf(djelimicnoOcitanaBrojilaBtnWE));
		djelimicnoOcitanaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAvtNeocitanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAmtNeocitanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaRvtNeocitanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaRmtNeocitanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaSnagaNeocitanaWE));
		assertTrue(brojKolona().size() == 108, "MonitoringOcitanja: Broj kolona nije dobar! ");
		wait.until(ExpectedConditions.visibilityOf(podcitanaBrojilaBtnWE));
		podcitanaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaStaraVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNovaVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaStaraMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNovaMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaReaktivnoBrojiloWE));
		assertTrue(brojKolona().size() == 108, "MonitoringOcitanja: Broj kolona nije dobar! ");
		wait.until(ExpectedConditions.visibilityOf(precitanaBrojilaBtnWE));
		precitanaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaReaktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaVtResetovanaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMtResetovanaWE));
		assertTrue(brojKolona().size() == 108, "MonitoringOcitanja: Broj kolona nije dobar! ");
		wait.until(ExpectedConditions.visibilityOf(natprosjecnaOcitanjaBtnWE));
		natprosjecnaOcitanjaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNovaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaProsjecnaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAmtWE));
		assertTrue(brojKolona().size() == 108, "MonitoringOcitanja: Broj kolona nije dobar! ");
		wait.until(ExpectedConditions.visibilityOf(duplaOcitanjaBrojilaBtnWE));
		duplaOcitanjaBrojilaBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaSnaga1WE));
		assertTrue(brojKolona().size() == 108, "MonitoringOcitanja: Broj kolona nije dobar! ");
		wait.until(ExpectedConditions.visibilityOf(nemaPotrosnjeBtnWE));
		nemaPotrosnjeBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaRmtWE));
		assertTrue(brojKolona().size() == 108, "MonitoringOcitanja: Broj kolona nije dobar! ");
		wait.until(ExpectedConditions.visibilityOf(slideBtnWE));
		slideBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(iskljucenaBrojilaSaPotrosnjomBtnWE));
		iskljucenaBrojilaSaPotrosnjomBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaStaraVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNovaVtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaStaraMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaNovaMtWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaAktivnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaReaktivnoBrojiloWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "MonitoringOcitanja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("MONITORING OČITANJA"), "MonitoringOcitanja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MONITORING OČITANJA"), "MonitoringOcitanja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 108, "MonitoringOcitanja: Broj kolona nije dobar! ");
	}
	
}