package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day06_Excell_Page {

    public Day06_Excell_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(id = "logout")
    public WebElement logout;

    @FindBy(id = "error")
    public WebElement error;



}
