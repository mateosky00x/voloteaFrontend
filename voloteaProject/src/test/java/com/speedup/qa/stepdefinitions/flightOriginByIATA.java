package com.speedup.qa.stepdefinitions;

import com.speedup.qa.models.FlightData;
import com.speedup.qa.questions.AdultsPassengersMatch;
import com.speedup.qa.questions.CityIATAMatch;
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

public class flightOriginByIATA {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }

    @When("^user clicks flight origin selector and enters the IATA code$")
    public void userClicksFlightOriginSelectorAndEntersTheIATACode(List<FlightData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FlightCityOrigin.withData(data.get(0)));
    }

    @Then("^The user should see the flight city origin (.*)$")
    public void theUserShouldSeeTheFlightCityOrigin(String cityIATAMatch) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CityIATAMatch.matchResponse(),org.hamcrest.Matchers.is(cityIATAMatch)));

    }
}