package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OperatoriSistemaPage extends HomePage {

	public OperatoriSistemaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOperatoreSistemaStranicu() {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(stranicaBtnWE.getText().trim().equals("OPERATORI DISTRIBUTIVNIH SISTEMA"), "OperatoriSistema: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OPERATORI DISTRIBUTIVNIH SISTEMA"), "OperatoriSistema: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "OperatoriSistema: Broj kolona nije dobar! ");
	}

}