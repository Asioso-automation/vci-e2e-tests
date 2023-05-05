package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PozadinskiProcesi extends PocetnaStranicaPXD {

	public PozadinskiProcesi(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujPozadinskiProcesi() throws InterruptedException, FileNotFoundException, IOException {
//		wait.until(ExpectedConditions.visibilityOf(overviewWE));
//		wait.until(ExpectedConditions.visibilityOf(logOutBtnWE));
	}

}
