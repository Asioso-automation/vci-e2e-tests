package scp.page;

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

public class FizickaLica extends PocetnaStranica {

	public FizickaLica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable v-table theme--light')]//*[text() = 'ID']")
	public WebElement kolonaIdWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-datatable v-table theme--light')]//*[text() = 'Email']")
	public WebElement kolonaEmailWE;
	
	@FindBy(xpath = "//*[contains(@href,'/kupci/fizicka-lica/dodaj')]")
	public WebElement dodajBtnWE;
	
	@FindBy(xpath = "//*[@id='v-fx-1']/div/div/div/div[1]/input")
	public WebElement pretraziFizickaLicaWE;
	
	// Elemnti forme za dodavanje fizickog lica
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Prezime (ime oca) ime']")
	public WebElement imePrezimeWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	public WebElement dodajUgovorWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr/td[2]")
	public WebElement imePrezimeTabelaWE;
	
	// TODO Custom dodaj dugme xpath
	
	public void verifikujFizickaLica()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Fizička Lica')]")));
	    verifikacijaZajednickihElemenata("KUPCI", "FIZIČKA LICA", "Fizička Lica", 13, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrezimeImeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJmbgWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikIzmijenioWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzmjeneWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikPortalaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOslobodjenPdvaWE));
	}
	

//	public void verifikujFizickaLica() throws InterruptedException, FileNotFoundException, IOException {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//*[@id='v-fx-0']")));
//		wait.until(ExpectedConditions.visibilityOf(kolonaIdWE));
//		wait.until(ExpectedConditions.visibilityOf(kolonaEmailWE));
//		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
//		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "FizickaLica: Naziv sekcije nije dobar!");
//		assertTrue(stranicaBtnWE.getText().trim().equals("FIZIČKA LICA"), "FizickaLica: Naziv stranice nije dobar!");
//		assertTrue(naslovStraniceWE.getText().trim().equals("Fizička Lica"), "FizickaLica: Naziv stranice nije dobar!");
//		assertTrue(brojKolona().size() == 13, "FizickaLica: Broj kolona nije dobar! ");
//	}
	
	public String dodajFizickoLice() {
		String ime = Helper.getRandomString(5) + " (" + Helper.getRandomString(5) + ") " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(imePrezimeWE));
		imePrezimeWE.click();
		imePrezimeWE.sendKeys(ime);
		// TODO Napraviti kolekciju enuma za imena
		wait.until(ExpectedConditions.elementToBeClickable(dodajUgovorWE));
		dodajUgovorWE.click();
		return ime;
	}
	
	public void verifikujFizickoLice(String ime) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziFizickaLicaWE));
		pretraziFizickaLicaWE.click();
		pretraziFizickaLicaWE.clear();
		pretraziFizickaLicaWE.sendKeys(ime);
		pretraziFizickaLicaWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(imePrezimeTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(imePrezimeTabelaWE.getText().equals(ime), "FizickaLica: Ime i prezime fizickog lica nije dobro!");
	}

}