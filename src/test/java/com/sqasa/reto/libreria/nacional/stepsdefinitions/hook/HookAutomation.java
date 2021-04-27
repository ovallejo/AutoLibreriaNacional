package com.sqasa.reto.libreria.nacional.stepsdefinitions.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HookAutomation {
    @Managed
    WebDriver elNavegador;

    @Before
    public void preConfiguraciones(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Cliente");
        theActorInTheSpotlight().can(BrowseTheWeb.with(elNavegador));
    }
}
