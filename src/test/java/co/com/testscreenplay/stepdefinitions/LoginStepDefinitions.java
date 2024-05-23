package co.com.testscreenplay.stepdefinitions;


import co.com.testscreenplay.questions.ValidateText;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.testscreenplay.tasks.LoginTask.withCredentials;
import static co.com.testscreenplay.userinterfaces.LoginPage.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    Actor user = Actor.named("User");
    @Given("ingreso al ambiente {string}")
    public void ingresoAlAmbiente(String url) {
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(Open.url(url));
    }
    @When("ingreso usuario {string} y contraseña {string} correcto")
    public void ingresoUsuarioYContraseñaCorrecto(String usuario, String password) {
        user.attemptsTo(withCredentials(usuario, password));
    }
    @Then("permite ingresar")
    public void permiteIngresar() {
        user.should(seeThat(ValidateText.of(LBL_PRODUCTS), equalTo("Products")));
    }

    @Then("no permite ingresar")
    public void noPermiteIngresar() {
        user.should(seeThat(ValidateText.of(ERROR_LOGIN), equalTo("Epic sadface: Sorry, this user has been locked out.")));
    }
}