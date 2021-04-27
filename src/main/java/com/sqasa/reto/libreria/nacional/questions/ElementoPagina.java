package com.sqasa.reto.libreria.nacional.questions;

import net.serenitybdd.screenplay.Question;

import static com.sqasa.reto.libreria.nacional.userinterface.MiCuentaUserInterface.TU_CUENTA;

public class ElementoPagina {

    private ElementoPagina() {
    }

    public static Question<String> cuenta() {
        return actor -> TU_CUENTA.resolveFor(actor).getText();
    }
}
