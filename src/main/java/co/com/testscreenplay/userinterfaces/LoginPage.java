package co.com.testscreenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target LBL_USERNAME = Target.the("getLblUsername")
            .located(By.id("user-name"));
    public static final Target LBL_PASSWORD =Target.the("getLblPassword")
            .located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("getBtnLogin")
            .located(By.id("login-button"));
    public static final Target LBL_PRODUCTS = Target.the("getLblProducts").
            located(By.xpath("//div[.='Products']"));


}
