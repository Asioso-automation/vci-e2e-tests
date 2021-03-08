package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DnevniciUplataPage extends PocetnaStranica {

	public DnevniciUplataPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//a/span/i")
	private WebElement dodajDnevnikBtnWE;

	@FindBy(xpath = "//tr[2]/td[12]/button/span/i")
	private WebElement barWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., 'Uplate')]")
	private WebElement uplateWE;
	
	@FindBy(xpath = "//header/div/a")
	private WebElement dodajUplatuBtnWE;

	// Dodaj dnevnik uplata form

	@FindBy(xpath = "//form/div/div[1]/div[1]/div[1]/div/div/div[1]")
	private WebElement bankaWE;

	@FindBy(xpath = "//div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/input")
	private WebElement unesiBankuWE;

	@FindBy(xpath = "//div[7]/div/div[1]/div/div")
	private WebElement odaberiBankuWE;

	@FindBy(xpath = "//*[contains(text(),bankName)]")
	private WebElement kreiranaBankaWE;

	@FindBy(xpath = "//div/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/div[1]")
	private WebElement ziroRacunWE;
	
	@FindBy(xpath = "//body/div/div[3]/div/div/div")
	private WebElement odaberiZiroRacunWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div/input")
	private WebElement brojIzvodaWE;
	
	@FindBy(xpath = "//div[2]/div[3]/div/div/div[1]/div/input")
	private WebElement brojUplataNaIzvoduWE;
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div/input")
	private WebElement iznosUplataNaIzvoduWE;
	
	@FindBy(xpath = "//div[1]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumKnjizenjaWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumIzvodaWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement submitDnevnikBtnWE;

	public void verifikujDnevniciUplataPage() {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "DnevniciUplata: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("DNEVNICI UPLATA"), "DnevniciUplata: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("DNEVNICI UPLATA"), "DnevniciUplata: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "DnevniciUplata: Broj kolona nije dobar! ");
	}

	public void dodajDnevnikUplata(String banka, String ziroRacun) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajDnevnikBtnWE));
		Thread.sleep(1000);
		dodajDnevnikBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(bankaWE));
		Thread.sleep(1000);
		bankaWE.click();
		Thread.sleep(2000);
		List<WebElement> list;
		int lastElement;
		//ako je manja od 20, nemoj ici na skrol
		//ako je veca od 20 idi u jedan skrol
		//poslije prvog skrola opet gledamo size
		//ako je manja od 40 nemoj ici u sledeci skrol
		//a ako je veca od 40 idemo u sledeci skrol
		for (int i = 1; i < 3; i++) {
			list = driver.findElements(By.xpath("//div[@role='listbox']/div"));
			lastElement = list.size();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					list.get(lastElement - 1));
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//div[contains(text(),'" + banka + "')]")).click();
		Thread.sleep(1000);
		ziroRacunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + ziroRacun + "')]")));
		driver.findElement(By.xpath("//div[contains(text(),'" + ziroRacun + "')]")).click();
		Thread.sleep(1000);
		brojIzvodaWE.sendKeys("34325");
		brojUplataNaIzvoduWE.sendKeys("1");
		iznosUplataNaIzvoduWE.sendKeys("100");
		datumKnjizenjaWE.click();
		datumKnjizenjaWE.clear();
		datumKnjizenjaWE.sendKeys("04.07.2020.");
		datumIzvodaWE.click();
		datumIzvodaWE.clear();
		datumIzvodaWE.sendKeys("04.06.2020.");
		submitDnevnikBtnWE.click();
		Thread.sleep(1000);
	}
	
	public void verifyDnevnikUplata(String banka, String ziroRacun){
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + banka + "')]")));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + ziroRacun + "')]")));
		// TODO ova dva polja vise nisu vidljiva u DOMu, dodati nove verifikacije
	}

	public void navigateToUplateSaStranice() {
		wait.until(ExpectedConditions.elementToBeClickable(barWE));
		barWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uplateWE));
		uplateWE.click();
	}
	
	public void navigateToUplateSaSDetalja() {
		wait.until(ExpectedConditions.elementToBeClickable(dodajUplatuBtnWE));
		dodajUplatuBtnWE.click();
	}

}