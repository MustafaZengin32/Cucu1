package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day03_ScenarioOutline_Page {

    public Day03_ScenarioOutline_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='sc-fqkvVR byzlMQ icon-account']")
    public WebElement login;

    //a[normalize-space()='Üye Ol']
    @FindBy(xpath = " //a[normalize-space()='Üye Ol']")
    public WebElement uyeol;


    @FindBy(xpath = "//div[@class='login-desktop_leftHeaderRegisterTitle__ABHjJ']")
    public WebElement uyelikSayfasiKontrol;

    @FindBy(xpath = " //input[@placeholder='Ad Soyad']")
    public WebElement adSoyad;


    @FindBy(xpath = "//input[@placeholder='E-posta']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Şifre']")
    public WebElement sifre;

    //input[@id='phone']
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;


    @FindBy(xpath = "(//div[@class='checkbox_box__1NS2V'])[1]")
    public WebElement uyelik;

    @FindBy(xpath = "(//div[@class='checkbox_box__1NS2V'])[2]")
    public WebElement riza;

    @FindBy(xpath = "//button[@class='login-button_box__dnyuU register-form_registerSubmitButton__Aztsg']")
    public WebElement uyeol1;























}
