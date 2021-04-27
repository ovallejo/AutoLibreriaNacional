package com.sqasa.reto.libreria.nacional.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioInicioSesionUserInterface {

    public static final Target USUARIO = Target.the("Usuario del Cliente").located(By.name("usuario"));

    public static final Target CLAVE = Target.the("Clave del Cliente").located(By.name("contrasena"));

    public static final Target LINK_INICIO_SESION = Target.the("Bóton Inicio de Sesión").located(By.xpath("//a[@href='/usuario/iniciar-sesion']"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Clave de Acceso del Cliente").located(By.xpath("//button[text()='Iniciar sesión']"));
}
