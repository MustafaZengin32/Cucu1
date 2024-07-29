package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day04_DataTable_Page {

    public Day04_DataTable_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='home-page-switch__button'])[2]")
    public WebElement hediye;
    @FindBy(xpath = "//span[contains(text(),'Doğum Günü')]")
    public WebElement dogumGunu;

    @FindBy(xpath = "//a[normalize-space()='Tüm Ürünleri Gör']")
    public WebElement dogumGunuTumHediyeleriGor;

    @FindBy(xpath = "//a[normalize-space()='Renk']")
    public WebElement renk;

    @FindBy(xpath = "//label[normalize-space()='Bej']")
    public WebElement bej;

    @FindBy(xpath = "//label[normalize-space()='Beyaz']")
    public WebElement beyaz;

    @FindBy(xpath = "//label[normalize-space()='Çok Renkli']")
    public WebElement cokRenkli;

    @FindBy(xpath = "//label[normalize-space()='Gri']")
    public WebElement gri;

    @FindBy(xpath = "//label[normalize-space()='Kahverengi']")
    public WebElement kahverengi;


    @FindBy(xpath = " //button[@aria-label='Close Message']")
    public WebElement reklam;















}
