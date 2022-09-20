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
	
	@FindBy(xpath = "//div[1]/div[1]/div/div/div[1]/div[1]/input")
	public WebElement uliceWE;
	
	@FindBy(xpath = "//div[5]/div/div/div/a/div/div")
	public WebElement odaberiUlicuWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input")
	public WebElement brojWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	public WebElement dodajObjekatWE;
	
	@FindBy(xpath = "//div[1]/table/tbody/tr/td[2]")
	public WebElement adresaTabelaWE;
	
	// TODO Custom dodaj dugme xpath

	public void verifikujObjekti() throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[@id='v-fx-0']")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "Objekti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OBJEKTI"), "Objekti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("Objekti"), "Objekti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 11, "Objekti: Broj kolona nije dobar! ");
	}
	
	public String dodajObjekat() {
		String broj = Helper.getRandomNumber(2);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uliceWE));
		uliceWE.click();
		uliceWE.sendKeys("7 - (78000 BANJA LUKA) - Aleja Svetog Save");
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojWE));
		brojWE.sendKeys(broj);
		dodajObjekatWE.click();
		return broj;
	}
	
	public void verifikujObjekat(String broj) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziObjekatWE));
		pretraziObjekatWE.click();
		pretraziObjekatWE.clear();
		pretraziObjekatWE.sendKeys("Aleja Svetog Save " + broj);
		pretraziObjekatWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(adresaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(adresaTabelaWE.getText().equals("Aleja Svetog Save " + broj), "Objekti: Adresa objekta nije dobra!");
	}

}