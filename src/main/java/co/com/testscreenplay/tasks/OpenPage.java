package co.com.testscreenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {

    WebDriver driver = new ChromeDriver();


    String url;
    public OpenPage(String url){
        this.url = url;
    }

    public static OpenPage openPage(String url){
        return instrumented(OpenPage.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.can(BrowseTheWeb.with(driver));
    }

}
