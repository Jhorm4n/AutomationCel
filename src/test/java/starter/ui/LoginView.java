package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {
    public static Target username = Target.the("username")
            .located(AppiumBy.accessibilityId("username"));

}
