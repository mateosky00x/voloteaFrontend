package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PassengersInterface {

    public static final Target CLICK_ON_PASSENGERS_SELECTOR = Target
            .the("The user clicks on passengers")
            .located(By.id("input-text_sf-passenger"));
    public static final Target CLICK_ON_ADULT_PASSENGERS_PLUS_BUTTON = Target
            .the("The user clicks on adult passenger plus button")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[1]"));
    public static final Target ADULT_PASSENGERS_COUNTER = Target
            .the("Validate adult passengers counter")
            .located(By.xpath("//span[@class='v7-passenger__number ng-star-inserted']"));
    public static final Target BOOKING_GROUP_SELECTOR = Target
            .the("Validate booking group selector")
            .located(By.xpath("//span[@class='v7-rounded__text v7-rounded__text--xs']"));
    public static final Target CLICK_ON_FLIGHT_ORIGIN_SELECTOR = Target
            .the("Validate flight origin selector")
            .located(By.id("input-text_sf-origin"));
    public static final Target FLIGHT_ORIGIN_SELECTOR_INPUT = Target
            .the("Validate flight origin input")
            .located(By.xpath("//input[@class='v7-sf__input v7-is-focused']"));
    public static final Target CITY_SELECTION = Target
            .the("Validate the search of a city")
            .located(By.xpath("//h3[@class='v7-card__title || v7-sub-title v7-sub-title--md || v7-u-bold']"));
}
