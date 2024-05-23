package co.com.testscreenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target LBL_USERNAME = Target.the("getLblUsername")
            .located(By.id("user-name"));
    public static final Target LBL_PASSWORD =Target.the("getLblPassword")
            .located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("getBtnLogin")
            .located(By.id("login-button"));
    public static final Target LBL_PRODUCTS = Target.the("getLblProducts").
            located(By.xpath("//div[.='Products']"));
    public static final Target ERROR_LOGIN = Target.the("getErrorLogin").
            located(By.xpath("//div[@id='login_button_container']//form/h3"));


}
