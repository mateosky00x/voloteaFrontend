package com.speedup.qa.stepdefinitions;

import com.speedup.qa.questions.CityIATAMatch;
import com.speedup.qa.questions.OutboundDateMatch;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Date;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class outboundDateSelectorStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }

    @Then("^user should see the date for today(.*)$")
    public void userShouldSeeTheDateForToday(String Data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OutboundDateMatch.matchResponse(),org.hamcrest.Matchers.is(Data)));
    }

}
