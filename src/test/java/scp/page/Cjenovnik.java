package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Cjenovnik extends PocetnaStranica{

	public Cjenovnik(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/input") 
	private WebElement tarifnaGrupaWE;
	
	@FindBy(xpath = "//div/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/input") 
	private WebElement uslugaWE;
	
	@FindBy(xpath = "//div/div[2]/form/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input") 
	private WebElement kolicinaWE;
	
	@FindBy(xpath = "//div/div[2]/form/div/div[1]/div[2]/div[2]/div/div/div[1]/div/input") 
	private WebElement cijenaWE;
	
	@FindBy(xpath = "//div/div[1]/div[3]/div[1]/div/div/div[1]/div[1]/input") 
	private WebElement periodOdWE;
	
	public void verifikujCjenovnik()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Cjenovnik')]")));
		verifikacijaZajednickihElemenata2("Tarifni Sistem", "Cjenovnik", "Cjenovnik - Tarifne grupe", 4, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
	}

	public void verifikujCjenovnikSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Cjenovnik')]")));
		verifikacijaZajednickihElemenata2("Tarifni Sistem", "Cjenovnik", "Cjenovnik - Tarifne grupe", 4, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
	}	
}
