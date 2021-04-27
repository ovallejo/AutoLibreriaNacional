package com.sqasa.reto.libreria.nacional.stepsdefinitions;

import com.sqasa.reto.libreria.nacional.questions.ElementoPagina;
import com.sqasa.reto.libreria.nacional.taks.Abrir;
import com.sqasa.reto.libreria.nacional.taks.Llenar;
import com.sqasa.reto.libreria.nacional.taks.Menu;
import com.sqasa.reto.libreria.nacional.utils.Constantes;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class RegistrarseLibreriaNacionalStepDefinition {

    @Dado("Entro a la pagina web de la Libreria Nacional para registrarme")
    public void entroALaPaginaWebDeLaLibreriaNacionalParaRegistrarme() {
        theActorInTheSpotlight().wasAbleTo(Abrir.laPagina());
        theActorInTheSpotlight().attemptsTo(Menu.registro());
    }

    @Cuando("Ingreso mis datos personales")
    public void ingresoMisDatosPersonales() {
        theActorInTheSpotlight().attemptsTo(Llenar.formularioRegistro());
    }

    @Entonces("me he registrado exitosamente en la pagina web")
    public void meHeRegistradoExitosamenteEnLaPaginaWeb() {
        theActorInTheSpotlight().should(seeThat(ElementoPagina.cuenta(), equalTo(Constantes.TU_CUENTA)));
    }
}
