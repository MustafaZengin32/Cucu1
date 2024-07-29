package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.Day05_Hooks_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class Day05_Hooks_StepDef {

Day05_Hooks_Page page5=new Day05_Hooks_Page();

int x;

    @And("arama kutusuna {string} yazılır")
    public void aramaKutusunaYazılır(String arg0) {

        page5.rejectAll.click();

        ReusableMethods.bekle(3);

        Select select=new Select(page5.ulkesecselect);

        select.selectByVisibleText("Türkiye");

        ReusableMethods.bekle(3);

        page5.select.click();

        ReusableMethods.bekle(3);

        page5.searchbox.sendKeys(arg0+ Keys.ENTER);


    }

    @Then("arama sonuclarinin goruntulendigi dogrulanir")
    public void aramaSonuclarininGoruntulendigiDogrulanir() {

        Driver.getDriver().navigate().refresh();

        ReusableMethods.bekle(3);

        Assert.assertTrue(page5.aramagorunur.isDisplayed());
    }

    @Then("sonuc sayfasinda {string} oldugu dogrulanir")
    public void sonucSayfasindaOlduguDogrulanir(String arg0) {

        Assert.assertTrue(page5.aramagorunur.getText().contains(arg0));
    }

    @When("sonuc sayfasindaki arama sonuc sayisi alinir")
    public void sonucSayfasindakiAramaSonucSayisiAlinir() {

        String text=page5.aramagorunur.getText();

        String yeni=text.replaceAll("\\D","");

        x= Integer.parseInt(yeni);


    }

    @Then("{int} den fazla urunun ekranda goruntulendigi dogrulanir")
    public void denFazlaUrununEkrandaGoruntulendigiDogrulanir(int arg0) {

        Assert.assertTrue(x>arg0);
    }

    @Then("sonuc sayisindaki kadar urunun ekranda goruntulendigi dogrulanir")
    public void sonucSayisindakiKadarUrununEkrandaGoruntulendigiDogrulanir() {

    }
}
