package scp.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
	
	// Elemnti forme za dodavanje fizckog lica
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Prezime (ime oca) ime']")
	public WebElement imePrezimeWE;
	
	// TODO Custom dodaj dugme xpath

	public void verifikujFizickaLica() throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[@id='v-fx-0']")));
		wait.until(ExpectedConditions.visibilityOf(kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolonaEmailWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "FizickaLica: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("FIZIČKA LICA"), "FizickaLica: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("Fizička Lica"), "FizickaLica: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "FizickaLica: Broj kolona nije dobar! ");
	}
	
	public void dodajFizickoLice() {
		String ime = Helper.getRandomString(5) + " (" + Helper.getRandomString(5) + ") " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(imePrezimeWE));
		imePrezimeWE.click();
		imePrezimeWE.sendKeys(ime);
		// TODO Napraviti kolekciju enuma za imena
	}

}