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

public class NaseljenaMjesta extends PocetnaStranica{

	public NaseljenaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//form/div/div[1]/div/div[1]/div/div/div[1]/div/input") 
	private WebElement idWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[2]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[1]/div/div[3]/div/div/div[1]/div[1]/input") 
	private WebElement drzavaWE;
	
	@FindBy(xpath = "//div[1]/div/div[4]/div/div/div[1]/div[1]/input") 
	private WebElement entitetWE;
	
	public void verifikujNaseljenaMjesta()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Naseljena mjesta')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Naseljena Mjesta", "Naseljena mjesta", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDrzava1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEntitet1WE));
	}
	public void verifikujNaseljenaMjestaGas()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Naseljena mjesta')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Naseljena Mjesta", "Naseljena mjesta", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDrzava1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEntitet1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAtmosferskiPritisakWE));
		// Kolona atmosferski pritisak se pojavljuje samo na organizaciji Gas.	
	}
	
	public String dodajNaseljenaMjesta() throws InterruptedException{
		String naseljenoMjesto = "Naseljeno mjesto" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(Helper.getRandomNumber(4));
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naseljenoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(drzavaWE));
		drzavaWE.sendKeys("BIH");
		Thread.sleep(500);
		drzavaWE.sendKeys(Keys.ARROW_DOWN);
		drzavaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(entitetWE));
		entitetWE.sendKeys(Helper.getRandomNubmer1to4(1));
		Thread.sleep(500);
		entitetWE.sendKeys(Keys.ARROW_DOWN);
		entitetWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return naseljenoMjesto;
	}
}
