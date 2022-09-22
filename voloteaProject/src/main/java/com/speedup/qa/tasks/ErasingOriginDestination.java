package com.speedup.qa.tasks;
import com.speedup.qa.interactions.WaitInteraction;
import com.speedup.qa.models.EraseOriginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterfaces.PassengersInterface.*;


public class ErasingOriginDestination implements Task {

    private EraseOriginData eraseOriginData;

    public ErasingOriginDestination (EraseOriginData eraseOriginData) {this.eraseOriginData = eraseOriginData;}
    @Override
    public <T extends Actor> void performAs(T actor){
        WaitInteraction.waitFor(8);
        actor.attemptsTo(Click.on(CLICK_GO_BACK_TO_CITY_ORIGIN));
        actor.attemptsTo(Enter.theValue(eraseOriginData.getEraseIATACodeOrigin()).into(FLIGHT_ORIGIN_SELECTOR_INPUT));
    }

    public static ErasingOriginDestination withData(EraseOriginData eraseOriginData) {
        return new ErasingOriginDestination(eraseOriginData);
    }
}
