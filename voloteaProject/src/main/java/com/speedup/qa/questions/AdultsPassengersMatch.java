package com.speedup.qa.questions;

import com.speedup.qa.tasks.AdultPassengersSelector;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userinterfaces.PassengersInterface.ADULT_PASSENGERS_COUNTER;


public class AdultsPassengersMatch implements Question<Integer> {


    @Override
    public Integer answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((ADULT_PASSENGERS_COUNTER), WebElementStateMatchers.isVisible()));
        return Text.of(ADULT_PASSENGERS_COUNTER).viewedBy(actor).asInteger();
    }
    public static AdultsPassengersMatch matchResponse () {
        return new AdultsPassengersMatch();
    }
}
