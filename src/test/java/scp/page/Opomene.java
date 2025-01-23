package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Opomene extends PocetnaStranica{

	public Opomene(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "(//i[@class='v-icon fas fa-layer-group theme--light'])[2]")
	protected WebElement generateBtnWE;
	
	public void verifikujOpomene()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Opomene')]")));
		verifikacijaZajednickihElemenata2("Pravni Odnosi", "Opomene", "Opomene", 13, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.elementToBeClickable(generateBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOd1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDo1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpomenutiIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIstekaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanBrojTuzbiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStampaUzRacun1WE));
	}

}
