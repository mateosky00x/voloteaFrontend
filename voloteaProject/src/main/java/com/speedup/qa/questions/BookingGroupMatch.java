package com.speedup.qa.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.speedup.qa.userinterfaces.PassengersInterface.BOOKING_GROUP_SELECTOR;

public class BookingGroupMatch implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((BOOKING_GROUP_SELECTOR), WebElementStateMatchers.isVisible()));
        return Text.of(BOOKING_GROUP_SELECTOR).viewedBy(actor).asString();
    }

    public static BookingGroupMatch matchResponse() {return new BookingGroupMatch();}
}
