package com.sqasa.reto.libreria.nacional.interactions;

import com.sqasa.reto.libreria.nacional.utils.BuscarElemento;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.sqasa.reto.libreria.nacional.userinterface.FormularioInicioSesionUserInterface.LINK_INICIO_SESION;
import static com.sqasa.reto.libreria.nacional.userinterface.MiCuentaUserInterface.INICIAR_SESION;
import static com.sqasa.reto.libreria.nacional.userinterface.MiCuentaUserInterface.MI_CUENTA;

public class MenuAutenticacion implements Interaction {
    public static Performable ingresar() {
        return Tasks.instrumented(MenuAutenticacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade miCuenta = BuscarElemento.clickable(MI_CUENTA, actor);
        actor.attemptsTo(Click.on(miCuenta));

        WebElementFacade iniciarSesion = BuscarElemento.clickable(INICIAR_SESION, actor);
        actor.attemptsTo(Click.on(iniciarSesion));

        actor.attemptsTo(Click.on(LINK_INICIO_SESION));

    }
}
