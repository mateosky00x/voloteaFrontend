package com.speedup.qa.tasks;

import com.speedup.qa.models.FlightData;
import com.speedup.qa.models.FlightDataDestination;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterfaces.PassengersInterface.*;

public class FlightCityDestination implements Task {

    private FlightDataDestination flightDataDestination;

    public FlightCityDestination(FlightDataDestination flightDataDestination) {
        this.flightDataDestination = flightDataDestination;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(flightDataDestination.getIataCodeDestination()).into(CITY_DESTINATION));
        actor.attemptsTo(Click.on(CLICK_ON_CITY_DESTINATION));
    }

    public static FlightCityDestination withData(FlightDataDestination flightDataDestination) {
        return new FlightCityDestination(flightDataDestination);
    }
}
