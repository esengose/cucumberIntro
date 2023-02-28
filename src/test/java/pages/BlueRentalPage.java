package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class BlueRentalPage {

    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement loginLink;

    @FindBy(id="formBasicEmail")
    public WebElement email;

    @FindBy(id="formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(id="dropdown-basic-button")
    public WebElement nameMenu;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutLnk;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement OKbtn;


}
