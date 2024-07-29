package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Day06_Excell_Page;
import utilities.Driver;
import utilities.ExcelUtils;

public class Day06_Excell_StepDef {

    Day06_Excell_Page page6=new Day06_Excell_Page();

    String firstUrl;

    String secondUrl;


    @And("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void kullaniciExceldekiSayfasindakiKullaniciBilgileriIleLoginOlur(String arg0) {

       firstUrl = Driver.getDriver().getCurrentUrl();

        ExcelUtils excelUtils=new ExcelUtils("src/userData.xlsx","pozitive");

        for (int i = 1; i <=excelUtils.rowCount() ; i++) {

            String email=excelUtils.getCellData(i,0);
            String password=excelUtils.getCellData(i,1);

            page6.email.sendKeys(email);

            page6.password.sendKeys(password);

            page6.submit.click();

            page6.logout.click();


        }

        

    }

    @Then("kullanici login oldugunu dogrular")
    public void kullaniciLoginOldugunuDogrular() {

       secondUrl = Driver.getDriver().getCurrentUrl();

       Assert.assertNotEquals(firstUrl,secondUrl);



    }


    @Then("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login olamadigini dogrular")
    public void kullaniciExceldekiSayfasindakiKullaniciBilgileriIleLoginOlamadiginiDogrular(String arg0) {

        ExcelUtils excelUtils=new ExcelUtils("src/userData.xlsx","negative");

        String email1 = excelUtils.getCellData(1, 0);

        String pass1 = excelUtils.getCellData(1, 1);

        page6.email.sendKeys(email1);

        page6.password.sendKeys(pass1);

        page6.submit.click();

        Assert.assertTrue(page6.error.getText().contains("Incorrect"));


    }

}
