package co.com.testscreenplay.tasks;


import co.com.testscreenplay.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {

    private final String username;
    private final String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginTask withCredentials(String username, String password){
        return instrumented(LoginTask.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.LBL_USERNAME),
                Enter.theValue(password).into(LoginPage.LBL_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
//                WaitUntil.the(LoginPage.LBL_PRODUCTS, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
