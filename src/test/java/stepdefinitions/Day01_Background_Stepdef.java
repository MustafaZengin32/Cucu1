package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Day01_Background_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class Day01_Background_Stepdef {

    Day01_Background_Pages page;

    @Given("ets tur sitesine gidilir")
    public void etsTurSitesineGidilir() {

        Driver.getDriver().get(ConfigReader.getProperty("etsUrl"));

        ReusableMethods.bekle(5);


    }

    @And("login butonu ustune gidilir")
    public void loginButonuUstuneGidilir() {

        ReusableMethods.moveToElementWithAction(page.giris);


    }

    @When("giris butonuna basilir")
    public void girisButonunaBasilir() {

        ReusableMethods.click(page.giris);


    }

    @And("eposta girilir")
    public void epostaGirilir() {

        page.email.sendKeys("hakkan@gmail.com");


    }

    @And("password girilir")
    public void passwordGirilir() {

        page.password.sendKeys("53342364");
    }

    @When("giris yap butonuna basilir")
    public void girisYapButonunaBasilir() {

        page.girisyap.click();


    }

    @Then("sayfaya gidilemedigi dogrulanir")
    public void sayfayaGidilemedigiDogrulanir() {

        String expectedMesaj="E-posta adresiniz sistemimizde kayıtlı değildir. Lütfen üyelik oluşturunuz.";

        Assert.assertTrue(expectedMesaj==page.mesaj.getText());


    }

    @And("uye ol butonuna basilir")
    public void uyeOlButonunaBasilir() {

        page.uyeol.click();
    }

    @And("ad girilir")
    public void adGirilir() {

        page.isim.sendKeys("Alime");




    }

    @And("soyad girilir")
    public void soyadGirilir() {

        page.soyisim.sendKeys("Kallame");
    }

    @And("uyelik icin eposta girilir")
    public void uyelikIcinEpostaGirilir() {

        page.email1.sendKeys("alimem987789@gmail.com");
    }

    @And("ceptelefonu girilir")
    public void ceptelefonuGirilir() {
        page.telefon.sendKeys("5304556778");
    }

    @And("uyelik icin password girilir")
    public void uyelikIcinPasswordGirilir() {

        page.sifre.sendKeys("123456abc");
    }

    @And("password yeniden girilir")
    public void passwordYenidenGirilir() {
        page.sifretekrar.sendKeys("123456abc");
    }

    @And("kullanim sartlari checkbox secilir")
    public void kullanimSartlariCheckboxSecilir() {

        page.kullanim.click();



    }

    @And("firsat ve kampanyalar checkbox secilir")
    public void firsatVeKampanyalarCheckboxSecilir() {

        page.kampanya.click();
    }

    @When("uyelik bolumunde uye ol butonuna basilir")
    public void uyelikBolumundeUyeOlButonunaBasilir() {

        page.uyeol1.click();
    }

    @Then("sayfaya gidilemedigi dogrulanir{int}")
    public void sayfayaGidilemedigiDogrulanir(int arg0) {
        Assert.assertTrue(page.dogrula.isEnabled());
    }
}
