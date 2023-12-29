package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import starter.tasks.NavigateTo;
import starter.tasks.Login;

import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.tasks.Login.credenciales;
import static starter.tasks.NavigateTo.iniciarSesion;

public class SessionStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Jhorman").can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("John Wick wants to create a new post")
    public void John_Wick_wants_to_create_a_new_post() {
        try {
                theActorInTheSpotlight().attemptsTo(
                        iniciarSesion(),
                        credenciales()
                );
            Thread.sleep(5000);
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Error navigating to login", e);
            Assertions.fail();
        }
    }

    @Then("he sends his credencials")
    public void he_sends_his_credencials() {


    }
}
