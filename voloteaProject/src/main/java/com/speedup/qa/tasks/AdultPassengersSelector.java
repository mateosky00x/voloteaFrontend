package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.PassengersInterface.*;


public class AdultPassengersSelector implements Task {
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLICK_ON_PASSENGERS_SELECTOR));
    }

    public static AdultPassengersSelector adultPassengersSelector() {
        return new AdultPassengersSelector();
    }
}
