package co.com.testscreenplay.questions;

import com.beust.ah.A;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateText implements Question<String> {

    Target txtValidation;

    public ValidateText(Target txtValidation){
        this.txtValidation = txtValidation;
    }
    public static ValidateText of(Target txtValidation){
        return Instrumented.instanceOf(ValidateText.class).withProperties(txtValidation);
    }
    @Override
    public String answeredBy(Actor actor){
        return txtValidation.resolveFor(actor).getText();
    }
}
