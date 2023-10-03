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
	
	@FindBy(xpath = "/html/body/div/div[15]/main/div/div/div/div[2]/form/div/div/div[8]/div/div/div[1]/div/div/div[2]/a")
	private WebElement neocitaniVodomjerWE;
	
	@FindBy(xpath = "/html/body/div/div[15]/main/div/div/div/div[2]/form/div/div/div[8]/div/div/div[1]/div/div/div[3]/a")
	private WebElement duplaRedovnaWE;
	
	@FindBy(xpath = "/html/body/div/div[15]/main/div/div/div/div[2]/form/div/div/div[8]/div/div/div[1]/div/div/div[4]/a")
	private WebElement analizaPotrosnjeWE;
	
	@FindBy(xpath = "/html/body/div/div[15]/main/div/div/div/div[2]/form/div/div/div[8]/div/div/div[1]/div/div/div[5]/a")
	private WebElement odstupanjaPotrosnjaWE;
	
	public void verifikujMonitoringOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Monitoring očitanja')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "MONITORING OČITANJA", "Monitoring očitanja", 6, false, false, false, false, false, false, false);
		wait.until(ExpectedConditions.elementToBeClickable(pokreniMonitoringWE));
		wait.until(ExpectedConditions.elementToBeClickable(neocitaniVodomjerWE));
		wait.until(ExpectedConditions.elementToBeClickable(duplaRedovnaWE));
		wait.until(ExpectedConditions.elementToBeClickable(analizaPotrosnjeWE));
		wait.until(ExpectedConditions.elementToBeClickable(odstupanjaPotrosnjaWE));
	}
}
