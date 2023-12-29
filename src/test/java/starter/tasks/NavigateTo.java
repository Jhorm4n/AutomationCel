package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.HomeView;

import static starter.ui.HomeView.sesionLink;

public class NavigateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(sesionLink);
    }
    public static NavigateTo iniciarSesion(){
        return new NavigateTo();
    }

}
