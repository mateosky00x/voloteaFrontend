package com.speedup.qa.stepdefinitions;

import com.speedup.qa.questions.AdultsPassengersMatch;
import com.speedup.qa.tasks.AcceptCookies;
import com.speedup.qa.tasks.AdultPassengersSelector;
import com.speedup.qa.tasks.AdultPlusButton;
import com.speedup.qa.tasks.OpenBrowser;
import com.speedup.qa.userinterfaces.PassengersInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
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

public class adultPassengersSelectorStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }

    @Given("^user opens page and accept cookies$")
    public void userOpensPageAndAcceptCookies() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
        OnStage.theActorInTheSpotlight().wasAbleTo(AcceptCookies.acceptCookies());
    }

    @When("^user clicks on passengers and add '(\\d+)'$")
    public void userClicksOn(int numberAdultPassengers) {
        OnStage.theActorInTheSpotlight().wasAbleTo(AdultPassengersSelector.adultPassengersSelector());
        for (int i = 1; i < numberAdultPassengers ; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(AdultPlusButton.adultPlusButton());
        }
    }

    @Then("^the user will see the number of adult passengers selected '(\\d+)'$")
    public void theUserWillSeeTheNumberOfAdultPassengersSelected(int adultPassengersMatch) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AdultsPassengersMatch.matchResponse(),org.hamcrest.Matchers.is(adultPassengersMatch)));
    }

}
