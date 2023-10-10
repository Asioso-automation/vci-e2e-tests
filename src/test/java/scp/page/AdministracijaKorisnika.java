package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class AdministracijaKorisnika extends PocetnaStranica{

	public AdministracijaKorisnika(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujAdministracijuKorisnika()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Administracija korisnika')]")));
		verifikacijaZajednickihElemenata("ADMINISTRACIJA", "ADMINISTRACIJA KORISNIKA", "Administracija korisnika", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIme1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrezime1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnickoIme1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOrganizacija1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdminWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
	}
}
