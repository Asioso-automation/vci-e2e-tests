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

public class Prostori extends PocetnaStranica{

	public Prostori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/input")
	public WebElement vrstaProstoraWE;
	
	@FindBy(xpath = "//div/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/input")
	public WebElement objekatWE;
	
	@FindBy(xpath = "//div/div[1]/div[3]/div/div/div/div[1]/div/textarea")
	public WebElement napomenaWE;

	@FindBy(xpath = "//div[2]/form/div/div[1]/div[2]/div[1]/div/div/div[1]/div/input")
	public WebElement ulazWE;
	
	@FindBy(xpath = "//div[2]/form/div/div[1]/div[2]/div[2]/div/div/div[1]/div/input")
	public WebElement spratBrojWE;

	public void verifikujProstore()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Prostori')]")));
		verifikacijaZajednickihElemenata("KUPCI", "PROSTORI", "Prostori", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
	}
	
	public String dodajProstori() throws InterruptedException{
		String vrsta = "Stan";
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrstaProstoraWE));
		vrstaProstoraWE.sendKeys(vrsta);
		Thread.sleep(1000);
		vrstaProstoraWE.sendKeys(Keys.ARROW_DOWN);
		vrstaProstoraWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(objekatWE));
		objekatWE.sendKeys(Helper.getRandomNubmer1to8(2));
		Thread.sleep(1000);
		objekatWE.sendKeys(Keys.ARROW_DOWN);
		objekatWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(ulazWE));
		ulazWE.sendKeys(Helper.getRandomNubmer1to8(1));
		wait.until(ExpectedConditions.elementToBeClickable(spratBrojWE));
		spratBrojWE.sendKeys(Helper.getRandomNubmer1to8(1));
		wait.until(ExpectedConditions.elementToBeClickable(napomenaWE));
		napomenaWE.sendKeys("#test");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return vrsta;
	}
	
	
}
