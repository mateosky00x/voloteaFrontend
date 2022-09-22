package com.speedup.qa.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.speedup.qa.userinterfaces.PassengersInterface.CHECK_CITY_DESTINATION_EMPTY;

public class CityIATAMatch implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CHECK_CITY_DESTINATION_EMPTY), WebElementStateMatchers.isVisible()));
        return Text.of(CHECK_CITY_DESTINATION_EMPTY).viewedBy(actor).asString();
    }
    public static CityIATAMatch matchResponse() {return new CityIATAMatch();}
}
