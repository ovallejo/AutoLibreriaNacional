package com.sqasa.reto.libreria.nacional.taks;

import com.sqasa.reto.libreria.nacional.utils.BuscarElemento;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.sqasa.reto.libreria.nacional.userinterface.MiCuentaUserInterface.BUSCADOR;

public class Buscar implements Task {
    private String tema;

    public Buscar(String tema) {
        this.tema = tema;
    }

    public static Performable libros(String tema) {
        return Tasks.instrumented(Buscar.class, tema);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade buscador = BuscarElemento.clickable(BUSCADOR, actor);

        actor.attemptsTo(Click.on(buscador));
        actor.attemptsTo(Enter.theValue(tema).into(buscador));
        buscador.sendKeys(Keys.ENTER);
    }
}
