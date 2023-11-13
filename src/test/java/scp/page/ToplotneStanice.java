package scp.page;

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

public class ToplotneStanice extends PocetnaStranica{

	public ToplotneStanice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div[1]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input") 
	private WebElement instalistanaSnagaWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div/input") 
	private WebElement adresaWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/input") 
	private WebElement toplovodWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/input") 
	private WebElement toplotniIzvorWE;
	
	public void verifikujToplotneStanice()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Toplotne stanice')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "TOPLOTNE STANICE", "Toplotne stanice", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaInstalisanaSnagaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaToplotniReonWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaToplovodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaToplotniIzvorWE));
	}
	
	public String dodajToplotneStanice(String toplovod) throws InterruptedException{
		String toplotnaStanica = "Stanica" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(toplotnaStanica);
		wait.until(ExpectedConditions.elementToBeClickable(instalistanaSnagaWE));
		instalistanaSnagaWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(adresaWE));
		adresaWE.sendKeys("Adresa" + Helper.getRandomString(3));
		wait.until(ExpectedConditions.elementToBeClickable(toplovodWE));
		toplovodWE.sendKeys(toplovod);
		Thread.sleep(1000);
		toplovodWE.sendKeys(Keys.ARROW_DOWN);
		toplovodWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(toplotniIzvorWE));
		toplotniIzvorWE.sendKeys("Izvor" + Helper.getRandomString(4));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return toplotnaStanica;
		
	}

}
