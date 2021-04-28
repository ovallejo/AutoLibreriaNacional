package com.sqasa.reto.libreria.nacional.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.stream.Collectors;

public class TextoElemento {

    public static List<String> mostrar(Target target, Actor actor) {
        return target.resolveAllFor(actor).stream().map(WebElementFacade::getText).collect(Collectors.toList());
    }
}
