package co.com.testscreenplay.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validate implements Question<String>{

    Target validateProduct;

    public Validate(Target validateProduct){
        this.validateProduct = validateProduct;
    }

    public static Validate product(Target validateProduct){
        return Instrumented.instanceOf(Validate.class).withProperties(validateProduct);
    }

    @Override
    public String answeredBy(Actor actor){
        return validateProduct.resolveFor(actor).getText();
    }
}
