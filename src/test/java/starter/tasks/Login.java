package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.LoginView;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static starter.ui.LoginView.username;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Jhorman").into(username)
        );
    }

    public static Login credenciales(){
        return new Login();
    }


}
