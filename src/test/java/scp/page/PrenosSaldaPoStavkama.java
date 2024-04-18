package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PrenosSaldaPoStavkama extends PocetnaStranica{

	public PrenosSaldaPoStavkama(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}


	public void verifikujPrenosSaldaPoStavkama()throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Prenos salda po stavkama')]")));
		verifikacijaZajednickihElemenata("Finansije", "Prenos Salda Po Stavkama", "Prenos salda po stavkama", 0, false, false, false, false, false, false, false);
	}
}
