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

public class Bonifikacije extends PocetnaStranica{

	public Bonifikacije(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[2]/form/div/div[1]/div[2]/div[1]/div/div/div[1]/div[1]/input") 
	private WebElement kupacWE;
	
	@FindBy(xpath = "//div[2]/form/div/div[1]/div[3]/div[2]/div/div/div[1]/div/input") 
	private WebElement iznosWE;
	
	@FindBy(xpath = "//div[2]/form/div/div[1]/div[3]/div[3]/div/div/div[1]/div[1]/input") 
	private WebElement periodOdWE;
	
	@FindBy(xpath = "//div[2]/form/div/div[1]/div[3]/div[4]/div/div/div[1]/div[1]/input") 
	private WebElement periodDoWE;
	
	@FindBy(xpath = "//textarea") 
	private WebElement napomenaWE;

	public void verifikujBonifikacije()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Bonifikacije')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Bonifikacije", "Bonifikacije", 12, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObjekatWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProcenat1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznos1WE));
	}
	
	public String dodajBonifikacije()throws InterruptedException{
		String napomena = "#Test" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(Helper.getRandomNubmer1to8(3));
		Thread.sleep(1000);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(iznosWE));
		iznosWE.sendKeys(Helper.getRandomNubmer1to8(2));
		wait.until(ExpectedConditions.elementToBeClickable(periodOdWE));
		periodOdWE.sendKeys("2025");
		Thread.sleep(1000);
		periodOdWE.sendKeys(Keys.ARROW_DOWN);
		periodOdWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(periodDoWE));
		periodDoWE.sendKeys("februar");
		Thread.sleep(1000);
		periodDoWE.sendKeys(Keys.ARROW_DOWN);
		periodDoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(napomenaWE));
		napomenaWE.sendKeys(napomena);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return napomena;
	}
}
