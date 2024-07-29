package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Day07_Rerun_Page;
import utilities.ReusableMethods;

public class Day07_Rerun_StepDef {

    Day07_Rerun_Page page7=new Day07_Rerun_Page();

    @And("arama butonuna basar")
    public void aramaButonunaBasar() {

        page7.searchIsaret.click();


    }

    @And("arama kutusuna {string} yazar")
    public void aramaKutusunaYazar(String arg0) {

        page7.searchglobal.sendKeys(arg0);

        ReusableMethods.bekle(5);

        page7.searchglobalclick.click();

        ReusableMethods.bekle(5);
    }

    @Then("sonuçlarda {string} oldugunu dogrular")
    public void sonuclardaOldugunuDogrular(String arg0) {

        String text = page7.aramasonuc.getText().toLowerCase();

        Assert.assertTrue(text.contains(arg0));

    }

    //**********************************************************


}
