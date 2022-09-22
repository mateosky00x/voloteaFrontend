package com.speedup.qa.tasks;

import com.speedup.qa.models.FlightData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterfaces.PassengersInterface.*;

public class FlightCityOrigin implements Task {

    private FlightData flightData;

    public FlightCityOrigin (FlightData flightData) {this.flightData = flightData;}
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLICK_ON_FLIGHT_ORIGIN_SELECTOR));
        actor.attemptsTo(Enter.theValue(flightData.getIataCodeOrigin()).into(FLIGHT_ORIGIN_SELECTOR_INPUT));
        actor.attemptsTo(Click.on(CITY_SELECTION));
    }

    public static FlightCityOrigin withData(FlightData flightData) {
        return new FlightCityOrigin(flightData);
    }

}
