package com.speedup.qa.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userinterfaces.PassengersInterface.DESTINATION_IS_DISABLED;

public class CityDestinationDisabledMatch implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((DESTINATION_IS_DISABLED), WebElementStateMatchers.isVisible()));
        return Text.of(DESTINATION_IS_DISABLED).viewedBy(actor).asString();
    }
    public static CityDestinationDisabledMatch matchResponse () {
        return new CityDestinationDisabledMatch();
    }

}
