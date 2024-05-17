package co.com.testscreenplay.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;


//Clase para configurar el escenario de pruebas y para
//cerrar el navegador y limpiar memoria despues de cerrar cada prueba

public class SetupConfiguration {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Test
    public void Actor() {
        Actor sergio = Actor.named("Sergio");
        OnStage.theActorCalled(String.valueOf(sergio));
    }

    @After
    public void close () {
          getDriver().close();
    }

}
