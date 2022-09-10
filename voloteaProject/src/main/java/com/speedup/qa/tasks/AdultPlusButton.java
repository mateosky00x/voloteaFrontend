package com.speedup.qa.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.speedup.qa.userinterfaces.PassengersInterface.CLICK_ON_ADULT_PASSENGERS_PLUS_BUTTON;

public class AdultPlusButton implements Task {
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLICK_ON_ADULT_PASSENGERS_PLUS_BUTTON));
    }

    public static AdultPlusButton adultPlusButton(){
        return Tasks.instrumented(AdultPlusButton.class);
    }
}
