package com.sqasa.reto.libreria.nacional.interactions;

import com.sqasa.reto.libreria.nacional.utils.BuscarElemento;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static com.sqasa.reto.libreria.nacional.userinterface.MiCuentaUserInterface.MI_CUENTA;
import static com.sqasa.reto.libreria.nacional.userinterface.MiCuentaUserInterface.REGISTRARME;

public class MenuRegistro implements Interaction {
    public static Performable ingresar() {
        return new MenuRegistro();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade miCuenta = BuscarElemento.clickable(MI_CUENTA, actor);
        actor.attemptsTo(Click.on(miCuenta));

        WebElementFacade registro = BuscarElemento.clickable(REGISTRARME, actor);
        actor.attemptsTo(Click.on(registro));
    }
}
