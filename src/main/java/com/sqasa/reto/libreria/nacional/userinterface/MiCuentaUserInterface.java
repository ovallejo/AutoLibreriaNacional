package com.sqasa.reto.libreria.nacional.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MiCuentaUserInterface {
    private MiCuentaUserInterface() {
    }

    public static final Target MI_CUENTA = Target.the("Botón Mi Cuenta").located(By.id("dropdownMenuLogin"));
    public static final Target INICIAR_SESION = Target.the("Botón Iniciar Sesión").located(By.xpath("//a[@href='/usuario/ingresar']"));
    public static final Target REGISTRARME = Target.the("Botón Iniciar Sesión").located(By.xpath("//a[@href='/usuario/registrarme']"));
    public static final Target TU_CUENTA = Target.the("Título de la Cuenta").located(By.xpath("//div[text()='Tu cuenta']"));
    public static final Target BUSCADOR = Target.the("Título de la Cuenta").located(By.xpath("//input[@placeholder='Buscar…']"));


}
