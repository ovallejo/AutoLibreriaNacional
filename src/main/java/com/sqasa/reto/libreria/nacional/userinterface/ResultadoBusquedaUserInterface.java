package com.sqasa.reto.libreria.nacional.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadoBusquedaUserInterface {
    private ResultadoBusquedaUserInterface() {
    }

    public static final Target RESULTADO_BUSQUEDA = Target.the("Resultado de la Busqueda").located(By.xpath("//a[@class='d-flex text--blue text--sm text--bold text--lh-1 book-title']"));
}
