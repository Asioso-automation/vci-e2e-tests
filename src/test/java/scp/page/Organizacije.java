package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Organizacije extends PocetnaStranica{

	public Organizacije(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath =  "//nav/div/button[1]/div")
	public WebElement SpremnaZaObracunBtnWE;
	
		
	public void verifikujOrganizacije() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and starts-with(., ' Organizacije')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "ORGANZACIJE", "Organizacije", 11, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(SpremnaZaObracunBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFaxWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlaziUObracunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSpremnaZaObracunWE));
	}
		
	

}
