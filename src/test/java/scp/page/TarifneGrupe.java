package scp.page;

import static org.testng.Assert.expectThrows;

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

public class TarifneGrupe extends PocetnaStranica{

	public TarifneGrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//form/div/div[1]/div[1]/div[1]/div/div/div[1]/div/input") 
	private WebElement idWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[1]/div[2]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[1]/div/div/div[1]/div[1]/div[1]") 
	private WebElement tarifnaNadgrupaWE;
	
	@FindBy(xpath = "/html/body/div/div[3]/div/div/div[1]/a/div/div") 
	private WebElement nadgrupaListWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]") 
	private WebElement tarifnaPodgrupaWE;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/a/div/div") 
	private WebElement podgrupaListWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/div[1]") 
	private WebElement tarifniModelWE;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[4]/a/div/div") 
	private WebElement modelListWE;
	
	public void verifikujTarifneGrupe()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tarifne grupe')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TARIFNE GRUPE", "Tarifne grupe", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNadgrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPodgrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOsnovZaPlacanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPravnoFizickoWE));
	}
	
	public void verifikujTarifneGrupeSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tarifne grupe')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TARIFNE GRUPE", "Tarifne grupe", 8, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNadgrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPodgrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOsnovZaPlacanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOrganizacija1WE));
	}
	
	public String dodajTarifneGrupe()throws InterruptedException{
		String grupa = "TarifnaGrupa" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(Helper.getRandomString(3));
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(grupa);
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaNadgrupaWE));
		tarifnaNadgrupaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nadgrupaListWE));
		nadgrupaListWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaPodgrupaWE));
		tarifnaPodgrupaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(podgrupaListWE));
		podgrupaListWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifniModelWE));
		tarifniModelWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(modelListWE));
		modelListWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return grupa;
	}
	
}
