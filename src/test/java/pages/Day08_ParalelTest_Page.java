package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Day08_ParalelTest_Page {

    public Day08_ParalelTest_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Marka, ürün veya hizmet ara...']")
    public WebElement searchbox;


    @FindBy(xpath = "//h1[normalize-space()='jenga']")
    public WebElement urunlist;









}
