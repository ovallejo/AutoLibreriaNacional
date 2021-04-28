package com.sqasa.reto.libreria.nacional.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class BuscarElemento {
    /**
     * Busca los elementos que son clickeables de una lista de WebElementsFacada
     *
     * @param target Elemento de la página web
     * @param actor  para poder buscar los elementos clicables
     * @return WebElementFacada al cuál se le puede hacer click
     */
    public static WebElementFacade clickable(Target target, Actor actor) {
        target.waitingForNoMoreThan(Duration.ofSeconds(10));
        WebElementFacade webElementFacade = null;
        List<WebElementFacade> webElementFacadesList = target.resolveAllFor(actor).stream().filter(WebElementState::isClickable).collect(Collectors.toList());
        if (!webElementFacadesList.isEmpty()) {
            webElementFacade = webElementFacadesList.get(0);
        }
        return webElementFacade;
    }
}
