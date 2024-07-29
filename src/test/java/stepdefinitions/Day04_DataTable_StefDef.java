package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Day01_Background_Pages;
import pages.Day04_DataTable_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Day04_DataTable_StefDef {

    Day04_DataTable_Page page4=new Day04_DataTable_Page();

    @Given("{string} sitesine gidilir")
    public void sitesineGidilir(String arg0) {

        switch (arg0){
            case "herokuapp":
                Driver.getDriver().get(ConfigReader.getProperty("herokuapp"));
                break;
            case "getir":
                Driver.getDriver().get(ConfigReader.getProperty("getir"));
                break;
            case "cicek sepeti":
                Driver.getDriver().get(ConfigReader.getProperty("cicekSepeti"));
                break;
            case "pazarama":
                Driver.getDriver().get(ConfigReader.getProperty("pazarama"));
                break;
            case "trendyol":
                Driver.getDriver().get(ConfigReader.getProperty("trendyol"));
                break;
            case "mynet":
                Driver.getDriver().get(ConfigReader.getProperty("mynet"));
                break;

        }
    }

    @When("hediye linki tiklanir")
    public void hediyeLinkiTiklanir() {

        page4.hediye.click();

        ReusableMethods.bekle(5);



    }

    @And("dogum gunu linki tiklanir")
    public void dogumGunuLinkiTiklanir() {

        page4.reklam.click();

        ReusableMethods.bekle(5);

       page4.dogumGunu.click();


    }

    @Then("dogum gunu sayfasinda oldugu dogrulanir")
    public void dogumGunuSayfasindaOlduguDogrulanir() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dogum-gunu-hediyeleri"));

    }

    @When("renk drop down tiklanir")
    public void renkDropDownTiklanir() {

        page4.renk.click();



    }

    @Then("sirasiyla renkler secilir")
    public void sirasiylaRenklerSecilir(DataTable dataTable) {

        List<String> list = dataTable.asList();

        for (int i = 1; i < list.size(); i++) {

            switch (list.get(i)) {

                case "Bej":
                    page4.bej.click();
                    ReusableMethods.bekle(2);
                    break;
                case "Beyaz":
                   page4.beyaz.click();
                    ReusableMethods.bekle(2);
                    break;
                case "Çok Renkli ":
                    page4.cokRenkli.click();
                    ReusableMethods.bekle(3);
                    break;
                case "Gri":
                    page4.gri.click();
                    ReusableMethods.bekle(3);
                    break;
                case "Kahverengi ":
                    page4.kahverengi.click();
                    ReusableMethods.bekle(3);
                    break;
                default:
                    break;

            }

            Driver.getDriver().get("https://www.ciceksepeti.com/dogum-gunu-hediyeleri");
            ReusableMethods.bekle(5);
            page4.renk.click();

            
        }

    }
}
