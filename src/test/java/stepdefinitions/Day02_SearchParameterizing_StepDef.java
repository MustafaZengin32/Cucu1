package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Day02_SearchParameterizing_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class Day02_SearchParameterizing_StepDef {

    Day02_SearchParameterizing_Page page2;

    Faker faker=new Faker();

    @Given("madame coco sitesine gidilir")
    public void madameCocoSitesineGidilir() {

        Driver.getDriver().get(ConfigReader.getProperty("cocoUrl"));

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page2.accept));

        try{

            page2.accept.click();

        }
        catch (Exception e){
            System.out.println("Accept Cikmadi Devam Sorun Yok");
        }


    }

    @And("arama kutusuna vazo yazilir")
    public void aramaKutusunaVazoYazilir() {

        page2.searchBox.sendKeys("vazo"+ Keys.ENTER);


    }

    @Then("sonuclarda vazo oldugu dogrulanir")
    public void sonuclardaVazoOlduguDogrulanir() {

        Assert.assertTrue(page2.aramakontrol.getText().contains("vazo"));
    }


    @And("ingilizce menu secilir")
    public void ingilizceMenuSecilir() {

        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#ccp---nb > div.cc-nb-main-container > div.cc-nb-buttons-container > button.cc-nb-reject\")");

        ReusableMethods.bekle(5);

        page2.eng.click();

    }

    @And("arama kutusuna {string} yazilir")
    public void aramaKutusunaYazilir(String urun) {

        String product=faker.commerce().productName();

        if (urun.contains("<urun>")){
            page2.searchBox.sendKeys(product);
        }

    }

    @Then("sonuclarda {string} oldugu dogrulanir")
    public void sonuclardaOlduguDogrulanir(String arg0) {


    }
}
