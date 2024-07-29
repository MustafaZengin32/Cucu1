package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day01_Background_Pages {

    public Day01_Background_Pages() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[contains(text(),'Giriş Yap')]")
    public WebElement giris;

    @FindBy(xpath = "//input[@id=':rg:']")
    public WebElement email;

    @FindBy(xpath = "//input[@id=':rh:']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisyap;

    @FindBy(xpath = "//p[@class='MuiFormHelperText-root Mui-error css-10jkrjo']")
    public WebElement mesaj;

    //

    @FindBy(xpath = "//button[normalize-space()='Üye Ol']")
    public WebElement uyeol;

    @FindBy(id = ":r0:")
    public WebElement isim;

    @FindBy(id = ":r1:")
    public WebElement soyisim;

    @FindBy(id = ":r2:")
    public WebElement email1;

    @FindBy(id = ":r2:")
    public WebElement telefon;

    @FindBy(id = ":r3:")
    public WebElement sifre;

    @FindBy(id = ":r4:")
    public WebElement sifretekrar;

    @FindBy(xpath = "//input[@name='acceptKvk']")
    public WebElement kullanim;

    @FindBy(xpath = "//input[@name='allowMarketing']")
    public WebElement kampanya;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement uyeol1;



    @FindBy(xpath = "//button[contains(text(),'Doğrula')]")
    public WebElement dogrula;






































}
