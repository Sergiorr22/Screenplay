package co.com.testscreenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    public static final Target BTN_CAR = Target.the("getBtnCar").
            located(By.id("shopping_cart_container"));

    public static final Target BTN_CHECKOUT = Target.the("getBtnCheckout").
            located(By.xpath("//a[.='CHECKOUT']"));

    public static final Target INPUT_NAME = Target.the("getInputName").
            located(By.id("first-name"));

    public static final Target INPUT_LASTNAME = Target.the("getInputLastName").
            located(By.id("last-name"));

    public static final Target INPUT_POSTAL = Target.the("getInputPostal").
            located(By.id("postal-code"));

    public static final Target BTN_CONTINUE = Target.the("getBtnContinue").
            located(By.xpath("//input[@value='CONTINUE']"));

    public static final Target LBL_INFO_BUYS = Target.the("getLblInfoBuys").
            located(By.xpath("//div[@class='summary_info']"));
}
