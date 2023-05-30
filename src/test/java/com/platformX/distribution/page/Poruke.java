package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Poruke extends PocetnaStranicaPXD {

	public Poruke(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//tr[2]/td[1]")
	private WebElement idWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[1]/div/div/div[1]/div/input")
	private WebElement naslovPorukeWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[2]/div/div[2]/div[1]")
	private WebElement sadrzajPorukeWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumOdWE;
	
	@FindBy(xpath = "//span[@class='v-btn__content' and text()='Sačuvaj']")
	private WebElement sacuvajWE;
	
	@FindBy(xpath = "(//div[@class='message-title'])[2]")
	private WebElement naslovPoruke2WE;
	
	@FindBy(xpath = "(//div[@class='message-title'])[3]")
	private WebElement naslovPoruke3WE;
	
	@FindBy(xpath = "(//div[@class='pl-8'])[2]")
	private WebElement sadrzajPoruke2WE;
	
	@FindBy(xpath = "(//div[@class='pl-8'])[3]")
	private WebElement sadrzajPoruke3WE;

	public void verifikujPoruke()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Poruke')]")));
		verifikacijaZajednickihElemenata("Administracija", "Poruke", "PORUKE", 8, false, false, true, false, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaslovWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrioritetWE));
	}
	
	public int pokupiIdPoruke() {
		wait.until(ExpectedConditions.visibilityOf(idWE));
		int id = Integer.parseInt(idWE.getText());
		return id;
	}
	
	public String[] dodajPoruku() throws InterruptedException {
		String[] podaci = new String[2];
		podaci[0] = "Naslov Testne Poruke " + Helper.getRandomString(5);
		podaci[1] = "Sadrzaj testne poruke " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(naslovPorukeWE));
		naslovPorukeWE.click();
		naslovPorukeWE.sendKeys(podaci[0]);
		wait.until(ExpectedConditions.elementToBeClickable(sadrzajPorukeWE));
		sadrzajPorukeWE.click();
		sadrzajPorukeWE.sendKeys(podaci[1]);
		wait.until(ExpectedConditions.elementToBeClickable(datumOdWE));
		datumOdWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		trenutniDatum1WE.click();
		sacuvajWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return podaci;
	}
	
	public void verifikujPorukuLista(String naslov) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela3WE));
		assertTrue(podatak2Tabela3WE.getText().trim().equals(naslov), "Poruke: Poruka nije pronađena!");
	}
	
	public void verifikujPorukuPocetna(String naslov, String sadrzaj) throws Exception {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(naslovPoruke2WE));
		assertTrue(naslovPoruke2WE.getText().trim().contains(naslov), "Poruke: Naslov poruke nije dobar!");
		wait.until(ExpectedConditions.visibilityOf(sadrzajPoruke2WE));
		assertTrue(sadrzajPoruke2WE.getText().trim().contains(sadrzaj), "Poruke: Sadržaj poruke nije dobar!");
//		TODO ubaciti try/catch - verifikacija elemenata naslovPoruke3WE, sadrzajPoruke3WE
	}

}