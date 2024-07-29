package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.Day08_ParalelTest_Page;

import java.util.List;

public class Day08_ParalelTest_StepDef {

    Day08_ParalelTest_Page page8=new Day08_ParalelTest_Page();

    String a="oyun";

    @When("search box ina {string} yazılır")
    public void searchBoxInaYazılır(String arg0) {

        page8.searchbox.sendKeys(arg0+Keys.ENTER);

    }

    @Then("goruntulenen sonuclarda {string} yazdigi dogrulanir")
    public void goruntulenenSonuclardaYazdigiDogrulanir(String arg0) {

        Assert.assertTrue( page8.urunlist.getText().contains(arg0));




    }




}
