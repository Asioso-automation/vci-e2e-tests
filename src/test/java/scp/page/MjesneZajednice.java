package scp.page;

import static org.testng.Assert.expectThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class MjesneZajednice extends PocetnaStranica{

	public MjesneZajednice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//form/div/div[1]/div/div[1]/div/div/div[1]/div/input") 
	private WebElement nazivWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[3]/div/div/div[1]/div/input") 
	private WebElement kontaktWE;
	
	public void verifikujMjesneZajednice()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Mjesne zajednice')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "MJESNE ZAJEDNICE", "Mjesne zajednice", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifra1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKontaktWE));
	}

	public String dodajMjesneZajednice()throws InterruptedException{
		String mjesnaZajednica = "MjesnaZajednica" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(mjesnaZajednica);
		wait.until(ExpectedConditions.elementToBeClickable(kontaktWE));
		kontaktWE.sendKeys(Helper.getRandomNumber(6));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return mjesnaZajednica;
	}
	
}
