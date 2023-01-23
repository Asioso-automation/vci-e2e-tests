package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class Sap extends PocetnaStranica {

	public Sap(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujSap() throws InterruptedException {
		verifyCommonElements("FINANSIJE", "SAP", "SAP", 0, false, false, false, false, false, false, false);
	}

}