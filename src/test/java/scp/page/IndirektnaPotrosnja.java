package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class IndirektnaPotrosnja extends PocetnaStranica{

	public IndirektnaPotrosnja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div/div/div[1]/div[2]/div/div/div/div[1]/input")
	public WebElement indirektnoMjeriloWE;
	
	public void verifikujIndirektnuPotrosnju()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Indirektna potrošnja')]")));
		verifikacijaZajednickihElemenata2("Očitanja", "Indirektna Potrošnja", "Indirektna potrošnja", 10, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIndirektnaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaIndirektnaMjerilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
	}

}
