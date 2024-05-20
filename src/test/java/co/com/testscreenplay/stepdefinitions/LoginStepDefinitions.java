package co.com.testscreenplay.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static co.com.testscreenplay.tasks.LoginTask.withCredentials;


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

    }




}
