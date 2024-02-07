package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class MonitoringOcitanja extends PocetnaStranica{

	public MonitoringOcitanja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(text(), 'Pokreni monitoring')]")
	private WebElement pokreniMonitoringWE;
	
	public void verifikujMonitoringOcitanjaVodovod()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Monitoring očitanja')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "MONITORING OČITANJA", "Monitoring očitanja", 6, false, false, false, false, false, false, false);
		wait.until(ExpectedConditions.elementToBeClickable(pokreniMonitoringWE));
	}
	
	public void verifikujMonitoringOcitanjaGas()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Monitoring očitanja')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "MONITORING OČITANJA", "Monitoring očitanja", 5, false, false, false, false, false, false, false);
		wait.until(ExpectedConditions.elementToBeClickable(pokreniMonitoringWE));
	}
	
	public void verifikujMonitoringOcitanjaToplama()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Monitoring očitanja')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "MONITORING OČITANJA", "Monitoring očitanja", 5, false, false, false, false, false, false, false);
		wait.until(ExpectedConditions.elementToBeClickable(pokreniMonitoringWE));
	}
	
}
