package data;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.platformX.base.Kolone;

public class Library extends Kolone {

	public Library(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
//	PXD kolone za svaku stranicu
	
	public WebElement[] organizacijeKolone = {kolonaIdWE, kolonaNazivWE, kolonaPostaWE, kolonaMjestoWE, kolonaAdresaWE, 
			kolonaBrojTelefonaWE, kolonaFaxWE, kolonaEmailWE, kolonaInternetAdresaWE, kolonaCallCentarWE, kolonaZiroRacunWE};

	
}