package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablePage dataTablePage = new DataTablePage();
    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
    dataTablePage.newBtn.click();
    }
    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
    dataTablePage.firstname.sendKeys(string);
    }
    @When("kulanici lastname {string} girer")
    public void kulanici_lastname_girer(String string) {
    dataTablePage.lastname.sendKeys(string);
    }
    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
    dataTablePage.position.sendKeys(string);
    }
    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
    dataTablePage.office.sendKeys(string);
    }
    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
    dataTablePage.extension.sendKeys(string);
    }
    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
    dataTablePage.startDate.sendKeys(string);
    }
    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
    dataTablePage.salary.sendKeys(string);
    }
    @When("kullanici create buttonuna basar")
    public void kullanici_create_buttonuna_basar() {
    dataTablePage.createBtn.click();
    }
    @When("kullanici firstname ile {string} arar")
    public void kullanici_firstname_ile_arar(String string) {
       dataTablePage.search.sendKeys(string);
    }
    @Then("firstname {string} in olustugunu test et")
    public void firstname_in_olustugunu_test_et(String string) {
        Driver.wait(1);
        Assert.assertTrue(Driver.waitAndGetText(dataTablePage.name,5).contains(string));
//        Assert.assertTrue(dataTablesPage.name.getText().contains(string));
    }



}
