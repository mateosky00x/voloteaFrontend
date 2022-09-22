package com.speedup.qa.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.joda.time.DateTime;

import static com.speedup.qa.userinterfaces.PassengersInterface.CLICK_ON_OUTBOUND_DATE;
public class OutboundDateMatch implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CLICK_ON_OUTBOUND_DATE), WebElementStateMatchers.isVisible()));
        return Text.of(CLICK_ON_OUTBOUND_DATE).viewedBy(actor).asString();
    }
    public static OutboundDateMatch matchResponse () {
        return new OutboundDateMatch();
    }
}

