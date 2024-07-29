package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


import java.util.ArrayList;
import java.util.List;

import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.getApkTags;

public class Hooks {
    /*
    Hooks : Her bir Scenario ya da Scenario Outline dan once ya da sonra calismasini istedigimiz metotlar konur
    @Before ve @After metotlarini icerir
     */

    /*Before After Methodlarin icine seneryolardaki @ leri yazarsak sadece o seneryo icin kosturulur

     */

    @Before
    public void setUpScenarios(){
        System.out.println("Bu metoto @user tagi için çalıştı. Before Metotu çalıştı.");
    }

    @After
    public void tearDownScenarios(Scenario scenario) {

        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle

        final byte[] failedScreenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
        if (scenario.isFailed()) {
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());
            Driver.closeDriver();
        }


    }
}