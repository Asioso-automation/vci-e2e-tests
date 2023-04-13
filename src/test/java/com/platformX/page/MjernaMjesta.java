package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class MjernaMjesta extends PocetnaStranica {
	
	@FindBy(xpath = "//header/div/button[3]")
	protected WebElement osvjeziDetaljeBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-paper-plane')]")
	protected WebElement posaljiZahtjevZaDostavuPodatakaBtnWE;

	public MjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Mjerna mjesta')]")));
		verifikacijaZajednickihElemenata("Očitanja", "Mjerna Mjesta", "Mjerna mjesta", 6, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(posaljiZahtjevZaDostavuPodatakaBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}
	
	public void verifikujDetaljeMjernogMjesta() {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Mjerno mjesto')]")));
	wait.until(ExpectedConditions.elementToBeClickable(osvjeziDetaljeBtnWE));
	}
	
}