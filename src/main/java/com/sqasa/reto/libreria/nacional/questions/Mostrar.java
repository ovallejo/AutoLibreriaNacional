package com.sqasa.reto.libreria.nacional.questions;

import com.sqasa.reto.libreria.nacional.userinterface.ResultadoBusquedaUserInterface;
import com.sqasa.reto.libreria.nacional.utils.TextoElemento;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class Mostrar {
    public static Question<List<String>> libros() {
        return actor -> TextoElemento.mostrar(ResultadoBusquedaUserInterface.RESULTADO_BUSQUEDA, actor);
    }
}
