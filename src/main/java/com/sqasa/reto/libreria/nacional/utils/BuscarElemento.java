package com.sqasa.reto.libreria.nacional.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.stream.Collectors;

public class BuscarElemento {

    public static WebElementFacade clickable(Target target, Actor actor) {
        WebElementFacade webElementFacade = null;
        List<WebElementFacade> webElementFacadesList = target.resolveAllFor(actor).stream().filter(WebElementState::isClickable).collect(Collectors.toList());
        if (!webElementFacadesList.isEmpty()) {
            webElementFacade = webElementFacadesList.get(0);
        }
        return webElementFacade;
    }
}
