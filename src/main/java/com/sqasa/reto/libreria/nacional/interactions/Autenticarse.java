package com.sqasa.reto.libreria.nacional.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.sqasa.reto.libreria.nacional.userinterface.FormularioInicioSesionUserInterface.*;

public class Autenticarse implements Interaction {
    private Map<String, String> usuarioCliente;

    public Autenticarse(Map<String, String> usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public static Performable enLaLibreriaNacional(Map<String, String> usuarioClienteList) {
        return Tasks.instrumented(Autenticarse.class, usuarioClienteList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(USUARIO));
        actor.attemptsTo(Enter.theValue(usuarioCliente.get("usuario")).into(USUARIO));

        actor.attemptsTo(Click.on(CLAVE));
        actor.attemptsTo(Enter.theValue(usuarioCliente.get("clave")).into(CLAVE));

        actor.attemptsTo(Click.on(BOTON_INICIAR_SESION));
    }
}
