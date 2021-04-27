package com.sqasa.reto.libreria.nacional.taks;

import com.sqasa.reto.libreria.nacional.interactions.Autenticarse;
import com.sqasa.reto.libreria.nacional.interactions.Registrarse;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

public class Llenar {

    public static Performable formularioRegistro() {
        return Task.where("{0} Llena el formulario de registro", Registrarse.enLaLibreriaNacional());
    }

    public static Performable formularioInicioSesion(Map<String, String> usuarioCliente) {
        return Task.where("{0} Llena el formulario de inicio de sesión", Autenticarse.enLaLibreriaNacional(usuarioCliente));
    }
}
