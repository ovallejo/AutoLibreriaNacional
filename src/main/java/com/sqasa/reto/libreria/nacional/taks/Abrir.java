package com.sqasa.reto.libreria.nacional.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static com.sqasa.reto.libreria.nacional.utils.Constantes.URL;

public class Abrir implements Task {
    public static Abrir laPagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    @Step("{0} Abre la Pagina Web de la Librería Nacional")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL));
    }
}
