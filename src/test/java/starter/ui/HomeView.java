package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class HomeView {
    public static Target sesionLink = Target.the("Login screen")
            .located(xpath("//android.view.ViewGroup[@content-desc='Login Screen']"));
}
