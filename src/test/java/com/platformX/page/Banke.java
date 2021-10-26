package com.platformX.page;

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

public class Banke extends PocetnaStranica {

	public Banke(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//td[6]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Briši')]")
	private WebElement obrisiWE;
	
	@FindBy(xpath = "//a/span/i") 
	private WebElement dodajBankuBtnWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div/input") 
	private WebElement pretraziBankeWE;
	
	@FindBy(xpath = "//tr[2]/td[2]") 
	private WebElement imeBankeTableWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;
	
	@FindBy(xpath = "//tr[2]/td")
	private WebElement praznaTabelaWE;
	
	// Kreiraj banku elementi
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input") 
	private WebElement nazivBankeWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input") 
	private WebElement cifreZiroRacunaWE;
	
	@FindBy(xpath = "//div[2]/button[1]") 
	private WebElement dodajBtnWE;
	
	public void verifikujBanke() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Banke')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPocetneCifreZiroRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailZaTrajniNalogWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "Banke: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("BANKE"), "Banke: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("BANKE"), "Banke: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "Banke: Broj kolona nije dobar! ");
	}
	
	public String dodajBanku() throws InterruptedException {
		String banka = "Banka " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBankuBtnWE));
		Thread.sleep(1000);
		dodajBankuBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivBankeWE));
		nazivBankeWE.sendKeys(banka);
		wait.until(ExpectedConditions.elementToBeClickable(cifreZiroRacunaWE));
		cifreZiroRacunaWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		return banka;
	}
	
	public String dodajBankuSaImenom(String ime) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBankuBtnWE));
		Thread.sleep(1000);
		dodajBankuBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivBankeWE));
		nazivBankeWE.sendKeys(ime);
		wait.until(ExpectedConditions.elementToBeClickable(cifreZiroRacunaWE));
		cifreZiroRacunaWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		return ime;
	}
	
	public void verifikujBanku(String banka) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziBankeWE));
		Thread.sleep(1000);
		pretraziBankeWE.click();
		pretraziBankeWE.clear();
		pretraziBankeWE.sendKeys(banka);
		pretraziBankeWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(imeBankeTableWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(imeBankeTableWE.getText().equals(banka), "Banke: Ime banke nije dobro!");
	}
	
	public String izmjeniBanku() throws InterruptedException {
		String banka = "Banka " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivBankeWE));
		nazivBankeWE.click();
		nazivBankeWE.clear();
		nazivBankeWE.sendKeys(banka);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		return banka;
	}
	
	public void obrisiBanku() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeBanke(String banka) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(pretraziBankeWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(pretraziBankeWE));
		pretraziBankeWE.click();
		pretraziBankeWE.clear();
		pretraziBankeWE.sendKeys(banka);
		pretraziBankeWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Banke: Poruka prazne tabele nije dobra!");
	}

}