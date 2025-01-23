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

public class TipoviMjerila extends PocetnaStranica{

	public TipoviMjerila(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//form/div/div[1]/div/div[1]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[2]/div/div/div[1]/div/input") 
	private WebElement sifraWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[3]/div/div/div[1]/div/input") 
	private WebElement brojCifaraWE;

	public void verifikujTipoviMjerila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tipovi mjerila')]")));
		verifikacijaZajednickihElemenata2("Mjerila", "Tipovi Mjerila", "Tipovi mjerila", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifra1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojCifara1WE));
	}
	
	public String dodajTipoviMjerila()throws InterruptedException{
		String tipMjerila = "TipMjerila" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(tipMjerila);
		wait.until(ExpectedConditions.elementToBeClickable(sifraWE));
		sifraWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(brojCifaraWE));
		brojCifaraWE.sendKeys(Helper.getRandomNubmer1to8(1));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return tipMjerila;
	}
	
}
