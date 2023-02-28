package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalPage;
import utilities.Driver;

public class BlueRentalStepDefinitions {
    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        blueRentalPage.loginLink.click();
    }

    @When("kullanıcı {string} girer")
    public void kullanıcı_girer(String string) {
        blueRentalPage.email.sendKeys(string);
    }

    @When("{string} girer")
    public void girer(String string) {
        blueRentalPage.password.sendKeys(string);
    }

    @When("login butonuna basar")
    public void login_butonuna_basar() {
        blueRentalPage.loginBtn.click();
    }

    @Then("login islemi gerçekleşir")
    public void login_islemi_gerçekleşir() {
        Assert.assertTrue(blueRentalPage.nameMenu.isDisplayed());
        Driver.closeDriver();
    }
}