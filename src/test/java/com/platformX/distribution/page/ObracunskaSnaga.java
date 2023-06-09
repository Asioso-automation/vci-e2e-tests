package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class ObracunskaSnaga extends PocetnaStranicaPXD {

	public ObracunskaSnaga(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//form/div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/div[1]") 
	private WebElement grupaWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input") 
	private WebElement kwWE;
	
	@FindBy(xpath = "//*[contains(@class, 'menuable__content__active')]//*[text() = '2209 - septembar 2022.']") 
	private WebElement septWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[1]/div[1]/input[1]") 
	private WebElement periodOdWE;
	
	@FindBy(xpath = "//div[2]/button[1]") 
	private WebElement dodajBtn1WE;
	
	public void verifikujObracunskaSnaga() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Obračunska snaga')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Obračunska Snaga", "Obračunska snaga", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonakWWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaValidnaWE));
	}
	
	public void dodajObracunskuSnagu(String tarifnaGrupa) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(grupaWE));
		grupaWE.click();
		WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + tarifnaGrupa + "')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
		wait.until(ExpectedConditions.elementToBeClickable(kwWE));
		kwWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(periodOdWE));
		periodOdWE.sendKeys("2209 - septembar 2022.");
		wait.until(ExpectedConditions.elementToBeClickable(septWE));
		septWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
	}

}