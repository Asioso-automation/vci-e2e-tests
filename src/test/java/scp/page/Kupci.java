package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Kupci extends PocetnaStranica{

	public Kupci(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//i[contains(@class, 'fa-filter')]")
	protected WebElement filterBtnWE;
	
	public void verifikujKupce()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Kupci')]")));
	    verifikacijaZajednickihElemenata("KUPCI", "KUPCI", "Kupci", 12, false, false, true, true, true, true, false);
	    wait.until(ExpectedConditions.elementToBeClickable(filterBtnWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJibJmbgWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifra1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipKupcaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTestniObracunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvObveznik1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikPortalaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOslobodjenPdvaWE));
	}
}
