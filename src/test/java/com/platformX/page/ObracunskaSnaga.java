package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ObracunskaSnaga extends PocetnaStranica {

	public ObracunskaSnaga(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//header/div/button[1]")
	protected WebElement ukloniFiltereBtnWE;
	
	@FindBy(xpath = "//header/div/button[2]")
	protected WebElement osvjeziBtnWE;
	
	@FindBy(xpath = "//header/div/a")
	protected WebElement dodajBtnWE;

	public void verifikujObracunskaSnaga() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Obračunska snaga')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Obračunska Snaga", "Obračunska snaga", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonakWWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjerenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaValidnaWE));
	}

}