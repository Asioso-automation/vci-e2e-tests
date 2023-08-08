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
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Organizacije')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "ORGANIZACIJE", "Organizacije", 11, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(SpremnaZaObracunBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesto1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefon1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFax1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmail1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlaziUObracunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSpremnaZaObracunWE));
	}
		
	

}
