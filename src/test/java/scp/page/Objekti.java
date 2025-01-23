package scp.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.xerces.impl.xs.XSElementDeclHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Objekti extends PocetnaStranica {

	public Objekti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//*[contains(@href,'/kupci/objekti/dodaj')]")
	public WebElement dodajBtnWE;
	
	@FindBy(xpath = "//*[@id='v-fx-1']/div/div/div/div[1]/input")
	public WebElement pretraziObjekatWE;
	
	// Elemnti forme za dodavanje fizickog lica
	
	@FindBy(xpath = "//div/div[1]/div[1]/div[1]/div/div/div[1]/div/input")
	public WebElement nazivWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div[1]/input")
	public WebElement uliceWE;
	
	@FindBy(xpath = "//div[4]/div/div/div/a/div/div")
	public WebElement odaberiUlicuWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input")
	public WebElement brojWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr/td[2]")
	public WebElement adresaTabelaWE;
	
	@FindBy(xpath = "//div/div[1]/div[5]/div/div/div/div[1]/div/textarea")
	public WebElement napomenaWE;
	
	// TODO Custom dodaj dugme xpath
	
	public void verifikujObjekte()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Objekti')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Objekti", "Objekti", 15, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorija1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMZNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReonWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstoriWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKuceWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanoviWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoslovniProstoriWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGarazeWE));
	}

//	public void verifikujObjekti() throws InterruptedException, FileNotFoundException, IOException {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//*[@id='v-fx-0']")));
//		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
//		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "Objekti: Naziv sekcije nije dobar!");
//		assertTrue(stranicaBtnWE.getText().trim().equals("OBJEKTI"), "Objekti: Naziv stranice nije dobar!");
//		assertTrue(naslovStraniceWE.getText().trim().equals("Objekti"), "Objekti: Naziv stranice nije dobar!");
//		assertTrue(brojKolona().size() == 11, "Objekti: Broj kolona nije dobar! ");
//	}
	
	public String dodajObjekat() throws InterruptedException {
		String naziv = "Naziv" + Helper.getRandomNubmer1to8(3);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(uliceWE));
		uliceWE.click();
		uliceWE.sendKeys(Helper.getRandomNumber(2));
		Thread.sleep(700);
		uliceWE.sendKeys(Keys.ARROW_DOWN);
		uliceWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojWE));
		brojWE.sendKeys(Helper.getRandomNubmer1to8(2));
		wait.until(ExpectedConditions.elementToBeClickable(napomenaWE));
		napomenaWE.sendKeys("#test");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return naziv;
	}
	
	public void verifikujObjekat(String broj) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziObjekatWE));
		pretraziObjekatWE.click();
		pretraziObjekatWE.clear();
		pretraziObjekatWE.sendKeys("Jevrejska " + broj);
		pretraziObjekatWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(adresaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(adresaTabelaWE.getText().equals("Jevrejska " + broj), "Objekti: Adresa objekta nije dobra!");
	}

}