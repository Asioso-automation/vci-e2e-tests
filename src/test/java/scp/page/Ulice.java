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

public class Ulice extends PocetnaStranica{

	public Ulice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div/div[2]/form/div/div[1]/div[1]/div[1]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div/div[2]/form/div/div[1]/div[2]/div[1]/div/div/div[1]/div[1]/input") 
	private WebElement mjestoWE;
	
	@FindBy(xpath = "//div[2]/form/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/input") 
	private WebElement postaWE;
	
	public void verifikujUlice()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Ulice')]")));
		verifikacijaZajednickihElemenata2("Šifarnici", "Ulice", "Ulice", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesto1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPosta1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReonWE));
	}

	public String dodajUlice() throws InterruptedException{
		String ulica = "Ulica" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(ulica);
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.sendKeys(Helper.getRandomNubmer1to8(1));
		Thread.sleep(1000);
		mjestoWE.sendKeys(Keys.ARROW_DOWN);
		mjestoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.sendKeys(Helper.getRandomNumber(2));
		Thread.sleep(1000);
		postaWE.sendKeys(Keys.ARROW_DOWN);
		postaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return ulica;
	}
}
