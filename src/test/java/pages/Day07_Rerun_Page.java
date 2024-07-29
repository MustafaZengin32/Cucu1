package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day07_Rerun_Page {

    public Day07_Rerun_Page() {

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(id ="myGlobalSearchBtn")
    public WebElement searchIsaret;

    @FindBy(id ="myGlobalSearchInput")
    public WebElement searchglobal;

    @FindBy(id ="myGlobalSearchBtn")
    public WebElement searchglobalclick;

    @FindBy(tagName ="h1")
    public WebElement aramasonuc;















}
