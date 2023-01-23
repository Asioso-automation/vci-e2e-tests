package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class Uino extends PocetnaStranica {

	public Uino(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujUino() {
		verifyCommonElements("FINANSIJE", "UINO", "UINO", 0, false, false, false, false, false, false, false);
	}

}