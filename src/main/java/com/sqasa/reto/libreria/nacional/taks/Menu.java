package com.sqasa.reto.libreria.nacional.taks;

import com.sqasa.reto.libreria.nacional.interactions.MenuAutenticacion;
import com.sqasa.reto.libreria.nacional.interactions.MenuRegistro;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Menu {
    public static Performable registro() {
        return Task.where("{0} Se registra en la Página Web de la Librería Nacional", MenuRegistro.ingresar());
    }

    public static Performable iniciarSesion() {
        return Task.where("{0} se autentica en la Página Web de la Librería Nacional", MenuAutenticacion.ingresar());
    }
}
