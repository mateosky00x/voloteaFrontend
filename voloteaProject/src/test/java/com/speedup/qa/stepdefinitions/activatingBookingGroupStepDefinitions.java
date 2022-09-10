package com.speedup.qa.stepdefinitions;
import com.speedup.qa.questions.AdultsPassengersMatch;
import com.speedup.qa.questions.BookingGroupMatch;
import com.speedup.qa.tasks.AdultPassengersSelector;
import com.speedup.qa.tasks.AdultPlusButton;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class activatingBookingGroupStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }
    @Then("^the user will see the number of adult passengers selected '(\\d+)' and the booking group enabled '\"([^\"]*)\"'$")
    public void theUserWillSeeTheNumberOfAdultPassengersSelectedAndTheBookingGroupEnabled(int adultPassengersMatch, String bookingGroup) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AdultsPassengersMatch.matchResponse(),org.hamcrest.Matchers.is(adultPassengersMatch)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(BookingGroupMatch.matchResponse(),org.hamcrest.Matchers.is(bookingGroup)));

    }

    }

