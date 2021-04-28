package com.sqasa.reto.libreria.nacional.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioRegistroUserInterface {
    private FormularioRegistroUserInterface() {
    }

    public static final Target EMAIL = Target.the("Correo Electrónico del Cliente").located(By.id("email"));
    public static final Target NOMBRES = Target.the("Nombre del Cliente").located(By.id("nombres"));
    public static final Target APELLIDOS = Target.the("Apellidos del Cliente").located(By.id("apellidos"));
    public static final Target IDENTIFICACION = Target.the("Número de Documento del Cliente").located(By.id("identificacion"));
    public static final Target TELEFONO_MOVIL = Target.the("Número del Teléfono Móvil del Cliente").located(By.id("telefono_movil"));
    public static final Target TELEFONO = Target.the("Número del Teléfono Fijo del Cliente").located(By.id("telefono"));
    public static final Target CLAVE = Target.the("Clave de Acceso del Cliente").located(By.id("contrasena"));
    public static final Target REPETIR_CLAVE = Target.the("Clave de Acceso del Cliente").located(By.id("repeatContrasena"));
    public static final Target TIPO_DOCUMENTO = Target.the("Clave de Acceso del Cliente").located(By.name("tipo_identificacion"));
    public static final Target TERMINOS_CONDICIONES = Target.the("Clave de Acceso del Cliente").located(By.id("terminosCondiciones"));
    public static final Target ENVIAR_FORMULARIO = Target.the("Clave de Acceso del Cliente").located(By.xpath("//button[text()='Registrarme']"));
}
