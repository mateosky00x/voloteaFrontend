package com.speedup.qa.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.speedup.qa.userinterfaces.PassengersInterface.CITY_SELECTION;

public class CityIATAMatch implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CITY_SELECTION), WebElementStateMatchers.isVisible()));
        return Text.of(CITY_SELECTION).viewedBy(actor).asString();
    }
    public static CityIATAMatch matchResponse() {return new CityIATAMatch();}
}
