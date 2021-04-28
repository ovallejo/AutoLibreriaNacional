package com.sqasa.reto.libreria.nacional.stepsdefinitions;

import com.sqasa.reto.libreria.nacional.questions.Mostrar;
import com.sqasa.reto.libreria.nacional.taks.Buscar;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsNull.notNullValue;

public class BuscarLibroStepDefinition {

    @Entonces("Busco Libros sobre el tema {string}")
    public void buscoLibrosSobreElTemaTerror(String tema) {
        theActorInTheSpotlight().attemptsTo(Buscar.libros(tema));
    }

    @Y("muestro los libros")
    public void muestroLosLibros() {
        theActorInTheSpotlight().should(seeThat(Mostrar.libros(), notNullValue()));
    }
}
