package com.sqasa.reto.libreria.nacional.stepsdefinitions;

import com.sqasa.reto.libreria.nacional.questions.ElementoPagina;
import com.sqasa.reto.libreria.nacional.taks.Abrir;
import com.sqasa.reto.libreria.nacional.taks.Buscar;
import com.sqasa.reto.libreria.nacional.taks.Llenar;
import com.sqasa.reto.libreria.nacional.taks.Menu;
import com.sqasa.reto.libreria.nacional.utils.Constantes;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class AutenticarmeLibreriaNacionalStepDefinition {
    @Dado("que quiero hacer una compra a la Libreria Nacional")
    public void queQuieroHacerUnaCompraALaLibreriaNacional() {
        theActorInTheSpotlight().wasAbleTo(Abrir.laPagina());
        theActorInTheSpotlight().attemptsTo(Menu.iniciarSesion());

    }

    @Cuando("ingreso mi usuario y clave")
    public void ingresoMiUsuarioYClave(List<Map<String, String>> usuarioClienteList) {
        theActorInTheSpotlight().attemptsTo(Llenar.formularioInicioSesion(usuarioClienteList.get(0)));
    }

}
