package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Ocitanja extends PocetnaStranica{

	public Ocitanja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//i[contains(@class, 'fa-angle-double-up')]")
	protected WebElement masovnaOcitanjaBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-book-reader')]")
	protected WebElement neocitaniBtnWE;
	
	public void verifikujOcitanjaVodovod()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Očitanja')]")));
		verifikacijaZajednickihElemenata("Očitanja", "Očitanja", "Očitanja mjerila", 19, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(masovnaOcitanjaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(neocitaniBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNalogZaOcitanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrethodnoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdobrenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzmijenioKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNacinUnosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaResetovanWE));
	}
	
	public void verifikujOcitanjaMjerila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Očitanja')]")));
		verifikacijaZajednickihElemenata("Očitanja", "Očitanja", "Očitanja mjerila", 20, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(masovnaOcitanjaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(neocitaniBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNalogZaOcitanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrethodnoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdobrenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPogonskiPritisakWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzmijenioKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNacinUnosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaResetovanWE));
	}
	
	public void verifikujOcitanjaToplana()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Očitanja')]")));
		verifikacijaZajednickihElemenata("Očitanja", "Očitanja", "Očitanja mjerila", 19, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(masovnaOcitanjaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(neocitaniBtnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNalogZaOcitanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrethodnoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdobrenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzmijenioKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNacinUnosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaResetovanWE));
	}
	
}
