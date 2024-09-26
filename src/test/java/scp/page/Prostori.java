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

public class Prostori extends PocetnaStranica{

	public Prostori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	
	@FindBy(xpath = "//div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/input")
	private WebElement vrstaProstoraWE;
	
	@FindBy(xpath = "//div/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/input")
	private WebElement objekatWE;
	
	@FindBy(xpath = "//div[2]/form/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input")
	private WebElement ulazWE;
	
	@FindBy(xpath = "//div[1]/div[6]/div/div[1]/div/div/div[1]/div[1]/input")
	private WebElement zonaOcitanjaWE;
	
	@FindBy(xpath = "//div[2]/form/div/div[1]/div[2]/div[2]/div/div/div[1]/div/input")
	private WebElement spratBrojWE;
	
	@FindBy(xpath = "//div/div[1]/div[3]/div/div/div/div[1]/div[1]/input")
	private WebElement zonaDmaWE;
	
	@FindBy(xpath = "//td[9]/button/div")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//table/tbody/tr/td[7]/button/div/i")
	private WebElement burgerBar1WE;
	
	@FindBy(xpath = "//div/div[1]/table/tbody/tr[1]/td[13]/button/div/i")
	private WebElement dropDownWE;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/a/div[2]/div")
	private WebElement kreirajUgovorWE;
	
	@FindBy(xpath = "//table/tbody/tr[2]/td/div/div/div[1]/nav/div/button[1]/div/i")
	private WebElement dodajProstorWE;
	
	

	public void verifikujProstore()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Prostori')]")));
		verifikacijaZajednickihElemenata("Kupci", "Prostori", "Prostori", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRBZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSpratWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanWE));
	}
	
	public void verifikujProstoreOpstinaCistoca()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Prostori')]")));
		verifikacijaZajednickihElemenata("Kupci", "Prostori", "Prostori", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSpratWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanWE));
	}
	
	public void verifikujProstoreSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Prostori')]")));
		verifikacijaZajednickihElemenata("Kupci", "Prostori", "Prostori", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSpratWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanWE));
	}
	
	public String dodajProstori() throws InterruptedException{
		String sprat = Helper.getRandomNubmer1to8(1);
		wait.until(ExpectedConditions.elementToBeClickable(dropDownWE));
		dropDownWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dodajProstorWE));
		dodajProstorWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrstaProstoraWE));
		vrstaProstoraWE.sendKeys("Kuća");
		Thread.sleep(1000);
		vrstaProstoraWE.sendKeys(Keys.ARROW_DOWN);
		vrstaProstoraWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(ulazWE));
		ulazWE.sendKeys(Helper.getRandomNubmer1to8(1));
		wait.until(ExpectedConditions.elementToBeClickable(spratBrojWE));
		spratBrojWE.sendKeys(sprat);
		wait.until(ExpectedConditions.elementToBeClickable(zonaDmaWE));
		zonaDmaWE.sendKeys(Helper.getRandomNubmer1to8(1));
		zonaDmaWE.sendKeys(Keys.ARROW_DOWN);
		zonaDmaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(zonaOcitanjaWE));
		zonaOcitanjaWE.sendKeys(Helper.getRandomNubmer1to8(1));
		Thread.sleep(1000);
		zonaOcitanjaWE.sendKeys(Keys.ARROW_DOWN);
		zonaOcitanjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return sprat;
	}
	
	public String dodajProstoriGas() throws InterruptedException{
		String sprat = Helper.getRandomNubmer1to8(1);
		wait.until(ExpectedConditions.elementToBeClickable(dropDownWE));
		dropDownWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dodajProstorWE));
		dodajProstorWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrstaProstoraWE));
		vrstaProstoraWE.sendKeys("Kuća");
		Thread.sleep(1000);
		vrstaProstoraWE.sendKeys(Keys.ARROW_DOWN);
		vrstaProstoraWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(ulazWE));
		ulazWE.sendKeys(Helper.getRandomNubmer1to8(1));
		wait.until(ExpectedConditions.elementToBeClickable(spratBrojWE));
		spratBrojWE.sendKeys(sprat);
		wait.until(ExpectedConditions.elementToBeClickable(zonaOcitanjaWE));
		zonaOcitanjaWE.sendKeys("Test");
		Thread.sleep(1000);
		zonaOcitanjaWE.sendKeys(Keys.ARROW_DOWN);
		zonaOcitanjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return sprat;
	}
	
	public String dodajProstoriOpstinaCistoca() throws InterruptedException{
		String sprat = Helper.getRandomNubmer1to8(1);
		wait.until(ExpectedConditions.elementToBeClickable(dropDownWE));
		dropDownWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dodajProstorWE));
		dodajProstorWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrstaProstoraWE));
		vrstaProstoraWE.sendKeys("Kuća");
		Thread.sleep(1000);
		vrstaProstoraWE.sendKeys(Keys.ARROW_DOWN);
		vrstaProstoraWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(ulazWE));
		ulazWE.sendKeys(Helper.getRandomNubmer1to8(1));
		wait.until(ExpectedConditions.elementToBeClickable(spratBrojWE));
		spratBrojWE.sendKeys(sprat);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return sprat;
	}
	
	public void dodajUgovorProstori()throws InterruptedException{
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kreirajUgovorWE));
		kreirajUgovorWE.click();
	}
	
	public void dodajUgovorProstoriOpstinaCistoca()throws InterruptedException{
		wait.until(ExpectedConditions.elementToBeClickable(burgerBar1WE));
		burgerBar1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kreirajUgovorWE));
		kreirajUgovorWE.click();
	}
	
	
}
