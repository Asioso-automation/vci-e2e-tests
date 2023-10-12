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

public class Reoni extends PocetnaStranica{

	public Reoni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//form/div/div[1]/div/div[1]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[2]/div/div/div[1]/div/input") 
	private WebElement sifraWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[3]/div/div/div[1]/div/input") 
	private WebElement mjestoWE;
	
	public void verifikujReone()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Reoni')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "REONI", "Reoni", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifra1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesto1WE));
	}

	public String dodajReone()throws InterruptedException{
		String reoni = "Reon" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(reoni);
		wait.until(ExpectedConditions.elementToBeClickable(sifraWE));
		sifraWE.sendKeys(Helper.getRandomNumber(5));
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.sendKeys("a");
		Thread.sleep(1000);
		mjestoWE.sendKeys(Keys.ARROW_DOWN);
		mjestoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return reoni;
	}
	
}
