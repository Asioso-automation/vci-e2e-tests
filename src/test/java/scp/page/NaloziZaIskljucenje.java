package scp.page;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;
public class NaloziZaIskljucenje extends PocetnaStranica{

	public NaloziZaIskljucenje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "(//i[@class='v-icon fas fa-layer-group theme--light'])[2]")
	protected WebElement generateBtnWE;	
	
	@FindBy(xpath = "//i[contains(@class, 'fa-print')]")
	protected WebElement printBtnWE;
	
	public void verifikujNalogeZaIskljucenjaSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Nalozi za isključenje')]")));
		verifikacijaZajednickihElemenata("Isključenja", "Nalozi Za Isključenje", "Nalozi za isključenje", 15, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(generateBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojNalogaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpomenaPredIskljWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpomenutiIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNalozeniIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPreostaliIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatus1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucen1WE));
	}
	
	public void verifikujNalogeZaIskljucenjaVodovod()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Nalozi za isključenje')]")));
		verifikacijaZajednickihElemenata("Isključenja", "Nalozi Za Isključenje", "Nalozi za isključenje", 15, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(printBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojNalogaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpomenaPredIskljWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpomenutiIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNalozeniIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPreostaliIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatus1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucen1WE));
	}
}
