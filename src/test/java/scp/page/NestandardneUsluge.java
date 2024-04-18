package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class NestandardneUsluge extends PocetnaStranica{

	public NestandardneUsluge(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[2]/div/div/div[1]/div/input") 
	private WebElement jedinicaMjereWE;
	
	@FindBy(xpath = "//div/div[1]/div[2]/div[3]/div/div/div[1]/div/input") 
	private WebElement predlozenaCijenaWE;
	
	@FindBy(xpath = "//div/div[1]/div[2]/div[4]/div/div/div[1]/div/input") 
	private WebElement pdvStopaWE;
	
	@FindBy(xpath = "//div/div[1]/div[2]/div[5]/div/div/div[1]/div[1]/input") 
	private WebElement vrstaStavkeWE;
	
	public void verifikujNestandardneUsluge()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Nestandardne usluge')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Nestandardne Usluge", "Nestandardne usluge", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaStavkeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJedinicaMjereWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPredlozenaCijenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvStopa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlaziUKifWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlaziUOpomeneWE));
	}
	
	public String dodajNestandardneUsluge()throws InterruptedException{
		String nestandardna = "NestandardnaUsluga" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(nestandardna);
		wait.until(ExpectedConditions.elementToBeClickable(jedinicaMjereWE));
		jedinicaMjereWE.sendKeys(Helper.getRandomString(3));
		wait.until(ExpectedConditions.elementToBeClickable(predlozenaCijenaWE));
		predlozenaCijenaWE.sendKeys(Helper.getRandomNubmer1to8(1));
		wait.until(ExpectedConditions.elementToBeClickable(pdvStopaWE));
		pdvStopaWE.sendKeys("0,17");
		wait.until(ExpectedConditions.elementToBeClickable(vrstaStavkeWE));
		vrstaStavkeWE.sendKeys(Keys.ARROW_DOWN);
		vrstaStavkeWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return nestandardna;
	}
	
	
}
