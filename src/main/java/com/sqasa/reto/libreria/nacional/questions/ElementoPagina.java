package com.sqasa.reto.libreria.nacional.questions;

import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static com.sqasa.reto.libreria.nacional.userinterface.MiCuentaUserInterface.TU_CUENTA;

public class ElementoPagina {

    private ElementoPagina() {
    }
    @Step("{0} Busca el titulo tu Cuenta en la página web de la Librería Nacional")
    public static Question<String> cuenta() {
        return actor -> TU_CUENTA.resolveFor(actor).getText();
    }
}
