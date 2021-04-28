package com.sqasa.reto.libreria.nacional.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/iniciar_sesion_libro_libreria_nacional.feature",
        glue = "com.sqasa.reto.libreria.nacional.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        monochrome = true

)
public class BuscarLibroLibreriaNacionalRunner {
}
