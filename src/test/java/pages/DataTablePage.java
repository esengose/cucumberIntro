package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablePage {


        public DataTablePage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "(//button[@type='button'])[1]")
        public WebElement newBtn;

        @FindBy(id="DTE_Field_first_name")
        public WebElement firstname;

        @FindBy(id="DTE_Field_last_name")
        public WebElement lastname;

        @FindBy(id="DTE_Field_position")
        public WebElement position;

        @FindBy(id="DTE_Field_office")
        public WebElement office;

        @FindBy(id="DTE_Field_extn")
        public WebElement extension;

        @FindBy(id="DTE_Field_start_date")
        public WebElement startDate;

        @FindBy(id="DTE_Field_salary")
        public WebElement salary;

        @FindBy(xpath = "//button[.='Create']")
        public WebElement createBtn;

        @FindBy(xpath = "//input[@type='search']")
        public WebElement search;

        @FindBy(xpath = "(//table[@id='example']//td[@class='sorting_1'])[1]")
        public WebElement name;








}
