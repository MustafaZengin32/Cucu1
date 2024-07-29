package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day05_Hooks_Page {

    public Day05_Hooks_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='onetrust-reject-all-handler']")
    public WebElement rejectAll;


    @FindBy(xpath = "//select[@data-testid='country-select']")
    public WebElement ulkesecselect;

    @FindBy(xpath = "//button[@data-testid='country-select-btn']")
    public WebElement select;

    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement searchbox;

    @FindBy(tagName = "h1")
    public WebElement aramagorunur;



}
