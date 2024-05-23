package co.com.testscreenplay.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Verifie implements Question<String> {

    Target validateBuy;

    public Verifie(Target validateBuy){
        this.validateBuy = validateBuy;
    }

    public static Verifie payment(Target validateBuy){
        return Instrumented.instanceOf(Verifie.class).withProperties(validateBuy);
    }

    public String answeredBy(Actor actor){
        return validateBuy.resolveFor(actor).getText();
    }git
}
