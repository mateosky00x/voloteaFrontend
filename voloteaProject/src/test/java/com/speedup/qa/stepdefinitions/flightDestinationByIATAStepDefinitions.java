package com.speedup.qa.stepdefinitions;

import com.speedup.qa.models.FlightData;
import com.speedup.qa.models.FlightDataDestination;
import com.speedup.qa.questions.CityIATAMatch;
import com.speedup.qa.questions.OutboundDateMatch;
import com.speedup.qa.tasks.FlightCityDestination;
import com.speedup.qa.tasks.FlightCityOrigin;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class flightDestinationByIATAStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }
    @When("^The system opens flight destination selector, enters the IATA code and clicks on the city$")
    public void theSystemOpensFlightDestinationSelectorEntersTheIATACodeAndClicksOnTheCity(List<FlightDataDestination> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FlightCityDestination.withData(data.get(0)));

    }

    @Then("^The user should go to the outbound selector(.*)$")
    public void theUserShouldGoToTheOutboundSelector(String outboundDateMatch) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OutboundDateMatch.matchResponse(),org.hamcrest.Matchers.is(outboundDateMatch)));
    }
    }

