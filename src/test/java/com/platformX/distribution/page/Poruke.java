package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Poruke extends PocetnaStranicaPXD {

	public Poruke(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//tr[2]/td[1]")
	private WebElement idWE;

	public void verifikujPoruke()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Poruke')]")));
		verifikacijaZajednickihElemenata("Administracija", "Poruke", "PORUKE", 8, false, false, true, false, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaslovWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrioritetWE));
	}
	
	public int pokupiIdPoruke() {
	wait.until(ExpectedConditions.visibilityOf(idWE));
	int id = Integer.parseInt(idWE.getText());
	return id;
	}

}