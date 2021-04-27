package com.sqasa.reto.libreria.nacional.interactions;

import com.sqasa.reto.libreria.nacional.models.DatosCliente;
import com.sqasa.reto.libreria.nacional.utils.BuscarElemento;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.pages.components.Dropdown;

import static com.sqasa.reto.libreria.nacional.userinterface.FormularioRegistroUserInterface.*;


public class Registrarse implements Interaction {
    public static Performable enLaLibreriaNacional() {
        return new Registrarse();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        WebElementFacade email = BuscarElemento.clickable(EMAIL, actor);
        actor.attemptsTo(Click.on(email));
        actor.attemptsTo(Enter.theValue(DatosCliente.getDatosCliente().getCorreo()).into(email));

        WebElementFacade nombres = BuscarElemento.clickable(NOMBRES, actor);
        actor.attemptsTo(Click.on(nombres));
        actor.attemptsTo(Enter.theValue(DatosCliente.getDatosCliente().getNombre()).into(nombres));

        WebElementFacade apellidos = BuscarElemento.clickable(APELLIDOS, actor);
        actor.attemptsTo(Click.on(apellidos));
        actor.attemptsTo(Enter.theValue(DatosCliente.getDatosCliente().getApellido()).into(apellidos));

        Dropdown.forWebElement(TIPO_DOCUMENTO.resolveFor(actor)).selectByValue(DatosCliente.getDatosCliente().getTipoDocumento());

        WebElementFacade identificacion = BuscarElemento.clickable(IDENTIFICACION, actor);
        actor.attemptsTo(Click.on(identificacion));
        actor.attemptsTo(Enter.theValue(DatosCliente.getDatosCliente().getNumeroDocumento()).into(identificacion));

        WebElementFacade telefonoMovil = BuscarElemento.clickable(TELEFONO_MOVIL, actor);
        actor.attemptsTo(Click.on(telefonoMovil));
        actor.attemptsTo(Enter.theValue(DatosCliente.getDatosCliente().getCelular()).into(telefonoMovil));

        WebElementFacade telefonoFijo = BuscarElemento.clickable(TELEFONO, actor);
        actor.attemptsTo(Click.on(telefonoFijo));
        actor.attemptsTo(Enter.theValue(DatosCliente.getDatosCliente().getFijo()).into(telefonoFijo));

        WebElementFacade clave = BuscarElemento.clickable(CLAVE, actor);
        actor.attemptsTo(Click.on(clave));
        actor.attemptsTo(Enter.theValue(DatosCliente.getDatosCliente().getClave()).into(clave));

        WebElementFacade repetirClave = BuscarElemento.clickable(REPETIR_CLAVE, actor);
        actor.attemptsTo(Click.on(repetirClave));
        actor.attemptsTo(Enter.theValue(DatosCliente.getDatosCliente().getClave()).into(repetirClave));

        actor.attemptsTo(Click.on(TERMINOS_CONDICIONES));

        actor.attemptsTo(Click.on(ENVIAR_FORMULARIO));



    }
}
