package co.com.testscreenplay.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.NoStageException;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static co.com.testscreenplay.tasks.LoginTask.withCredentials;
import static co.com.testscreenplay.tasks.OpenPage.openPage;
import static co.com.testscreenplay.stepdefinitions.SetupConfiguration.*;
import static co.com.testscreenplay.util.Data.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

public class LoginStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    @Steps
    Actor sergio;


    @Given("ingreso al ambiente")
    public void ingresoAlAmbiente() {
        givenThat(sergio).can(BrowseTheWeb.with(driver));
        when(sergio).attemptsTo(Open.url("https://www.saucedemo.com/v1/index.html"));
    }

    @When("ingreso usuario {string} y contraseña {string} correcto")
    public void ingresoUsuarioYContraseñaCorrecto(String user, String password) {
        sergio.attemptsTo(withCredentials(user, password));
    }
    @Then("permite ingresar")
    public void permiteIngresar() {

    }




}
