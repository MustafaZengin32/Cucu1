package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Day03_ScenarioOutline_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Day03_ScenarioOutline_StepDef {

    Day03_ScenarioOutline_Page page3=new Day03_ScenarioOutline_Page();


    @Given("boyner sitesine gidilir")
    public void boynerSitesineGidilir() {

        Driver.getDriver().get(ConfigReader.getProperty("boynerUrl"));
    }

    @When("login ikonu ustune gidilir")
    public void loginIkonuUstuneGidilir() {

        ReusableMethods.moveToElementWithAction(page3.login);
    }

    @And("uye ol linki tiklanir")
    public void uyeOlLinkiTiklanir() {

        page3.uyeol.click();

        ReusableMethods.bekle(3);

    }

    @Then("uyelik sayfasinda oldugu dogrulanir")
    public void uyelikSayfasindaOlduguDogrulanir() {

        Assert.assertTrue(page3.uyelikSayfasiKontrol.getText().contains("hoş geldin"));

        ReusableMethods.bekle(3);


    }

    @And("uyelik sayfasinda ad bolumune {string} girilir")
    public void uyelikSayfasindaAdBolumuneGirilir(String arg1) {

        page3.adSoyad.sendKeys(arg1);


    }

    @And("uyelik sayfasinda email bolumune{string} girilir")
    public void uyelikSayfasindaEmailBolumuneGirilir(String arg1) {

        page3.email.sendKeys(arg1);


    }

    @And("uyelik sayfasinda password bolumune{string} girilir")
    public void uyelikSayfasindaPasswordBolumuneGirilir(String arg1) {

        page3.sifre.sendKeys(arg1);
    }

    @And("uyelik sayfasinda cep telefonu bolumune{string} girilir")
    public void uyelikSayfasindaCepTelefonuBolumuneGirilir(String arg0) {

        page3.phone.sendKeys(arg0);

    }

    @And("uyelik metni icin {string} checkbox secilir")
    public void uyelikMetniIcinCheckboxSecilir(String arg0) {

        page3.uyelik.click();

    }

    @And("riza metni icin {string} checkbox secilir")
    public void rizaMetniIcinCheckboxSecilir(String arg0) {

        page3.riza.click();

        ReusableMethods.scroll(page3.uyeol1);
    }

    @And("uye ol butonu tiklanir")
    public void uyeOlButonuTiklanir() {

       ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"button[type='button']\")");
    }

    @Then("uye olunamadigi dogrulanir")
    public void uyeOlunamadigiDogrulanir() {

        String expectedUrl="https://www.boyner.com.tr/uyelik?type=uye-ol";

        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertNotEquals(expectedUrl, actualUrl);



    }



}
