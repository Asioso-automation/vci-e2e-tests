package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Tuzbe extends PocetnaStranica{

	public Tuzbe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "(//i[@class='v-icon fas fa-layer-group theme--light'])[2]")
	protected WebElement generateBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-print')]")
	protected WebElement printBtnWE;

	public void verifikujTuzbe()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tužbe')]")));
		verifikacijaZajednickihElemenata2("Pravni Odnosi", "Tužbe", "Tužbe", 15, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(printBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(generateBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTuzbeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipTuzbeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpomenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnik1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUtuzeniIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPreostaliIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupniTroskoviTuzbeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaplaceniTroskoviTuzbeWE));
	}
}
 