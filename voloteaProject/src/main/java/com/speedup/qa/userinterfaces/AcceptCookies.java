package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcceptCookies {

    public static final Target CLICK_ON_ACCEPT_COOKIES = Target
            .the("The user clicks on accept button")
            .located(By.id("onetrust-accept-btn-handler"));
}
