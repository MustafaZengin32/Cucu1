package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {
                "pretty", //console renkli yazdirmak icin
                "html:TestOutput/htmlReport/cucumberHooks1.html", //html report için
                "json:target/json-reports/cucumber1.json",  //cucumber report için
                "junit:test-output/htmlReport/cucumber1.xml", //xml report için
                "rerun:TestOutput/failed_scenario.txt",//bu satirdaki kod, hata veren testleri kaydedip yeniden otomatik kosmak icin
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},//spark report icin
        //  monochrome = true, //console okunakli hale getirir, renksiz yapar
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        tags = "@getir",
        dryRun = false,
        monochrome = false //console okunakli hale getirir,false scenario adimlarini renkli gosterir,  true renksiz yapar
)

public class Runner1 {
}
