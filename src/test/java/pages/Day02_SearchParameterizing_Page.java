package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day02_SearchParameterizing_Page {

    public Day02_SearchParameterizing_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//button[@class='cc-nb-okagree']")
    public WebElement accept;

    @FindBy(xpath ="//input[@id='pz-form-input-AutocompleteInput']")
    public WebElement searchBox;


    @FindBy(xpath ="//div[@class='searched-text']")
    public WebElement aramakontrol;



    @FindBy(xpath ="//div[@class='band-menu']//button[@type='submit'][normalize-space()='EN']")
    public WebElement eng;






}
