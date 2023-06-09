package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
	@FindBy(xpath = "//div[contains(@class, 'v-picker v-card v-picker--date')]")
	private WebElement datepickerWE;
	
	@FindBy(xpath = "(//div[@class='message-title'])[2]")
	private WebElement porukaNaslov2WE;
	
	@FindBy(xpath = "(//div[@class='message-title'])[3]")
	private WebElement porukaNaslov3WE;
	
	@FindBy(xpath = "(//div[@class='pl-8'])[2]")
	private WebElement porukaSadrzaj2WE;
	
	@FindBy(xpath = "(//div[@class='pl-8'])[3]")
	private WebElement porukaSadrzaj3WE;

	public void verifikujPoruke()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Poruke')]")));
		verifikacijaZajednickihElemenata("Administracija", "Poruke", "Poruke", 8, false, false, true, false, true, true, false);
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
		wait.until(ExpectedConditions.visibilityOf(datepickerWE));
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		try {
			trenutniDatum1WE.click();
		} catch (Exception e) {
			Thread.sleep(800);
			trenutniDatum1WE.click();
		}
		sacuvajWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return podaci;
	}
	
	public void verifikujPorukuLista(String naslov) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela3WE));
		assertTrue(podatak2Tabela3WE.getText().trim().contains(naslov), "Poruke: Poruka nije pronađena!");
	}
	
	public void verifikujPorukuPocetna(String naslov, String sadrzaj) throws Exception {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='message-title' and contains(., '" + naslov + "')]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pl-8' and contains(., '" + sadrzaj + "')]")));
	}

}