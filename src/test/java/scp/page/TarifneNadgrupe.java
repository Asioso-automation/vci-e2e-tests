package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class TarifneNadgrupe extends PocetnaStranica{

	public TarifneNadgrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div/div[2]/form/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input") 
	private WebElement idWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[2]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	

	public void verifikujTarifneNadgrupe()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tarifne nadgrupe')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TARIFNE NADGRUPE", "Tarifne nadgrupe", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivno1WE));
	}
	
	public void verifikujTarifneNadgrupeSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tarifne nadgrupe')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TARIFNE NADGRUPE", "Tarifne nadgrupe", 4, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivno1WE));
	}
	
	public String dodajTarifneNadgrupe()throws InterruptedException{
		String nadgrupa = "TarifnaNadgrupa" + Helper.getRandomString(3);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(Helper.getRandomString(2));
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(nadgrupa);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return nadgrupa;
	}
	
}
