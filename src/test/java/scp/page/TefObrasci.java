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

public class TefObrasci extends PocetnaStranica{

	public TefObrasci(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/input")
	private WebElement ugovorWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[2]/div/div/div[1]/div[1]/input")
	private WebElement brojWE;
	
	public void verifikujTefObrasce()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'TEF obrasci')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "TEF OBRASCI", "TEF obrasci", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovor1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
	}
	
	public String dodajTefObrazac()throws InterruptedException{
		String broj = Helper.getRandomNumber(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ugovorWE));
		ugovorWE.sendKeys(Helper.getRandomNumber(3));
		Thread.sleep(1300);
		ugovorWE.sendKeys(Keys.ARROW_DOWN);
		ugovorWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojWE));
		brojWE.sendKeys(broj);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return broj;
	}
	
}
