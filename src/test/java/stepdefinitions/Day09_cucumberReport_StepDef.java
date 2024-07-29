package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Day09_cucumberReport_Page;
import utilities.Driver;

public class Day09_cucumberReport_StepDef {

    Day09_cucumberReport_Page page9=new Day09_cucumberReport_Page();



    @When("cerezleri kapatir")
    public void cerezleriKapatir() {

        try{
            page9.accept.click();
        }

        catch (Exception e){
            System.out.println("Cookies Cikmadi Test de sorun yok devam et");
        }

    }


    @Then("sayfada oldugunu dogrular")
    public void sayfadaOldugunuDogrular() {

        String expectedTitle="Getir - At Your Door in Minutes";

        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());


    }
}
