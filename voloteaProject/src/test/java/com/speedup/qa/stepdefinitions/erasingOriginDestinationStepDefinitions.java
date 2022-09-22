package com.speedup.qa.stepdefinitions;
import com.speedup.qa.models.EraseOriginData;
import com.speedup.qa.models.FlightData;
import com.speedup.qa.questions.CityDestinationDisabledMatch;
import com.speedup.qa.questions.OutboundDateMatch;
import com.speedup.qa.tasks.ErasingOriginDestination;
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

public class erasingOriginDestinationStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }

    @When("^User goes back to erase the city origin$")
    public void userGoesBackToEraseTheCityOrigin(List<EraseOriginData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(ErasingOriginDestination.withData(data.get(0)));

    }
    @Then("^The city destination will be erased automatically as well(.*)$")
    public void theCityDestinationWillBeErasedAutomaticallyAsWell(String cityDestinationDisabledMatch) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CityDestinationDisabledMatch.matchResponse(),org.hamcrest.Matchers.is(cityDestinationDisabledMatch)));

    }
}
