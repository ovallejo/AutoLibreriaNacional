package com.sqasa.reto.libreria.nacional.utils;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class GenerarDatos {
    private static final FakeValuesService fakeValuesService = new FakeValuesService(new Locale("es-CO"), new RandomService());
    private static Faker faker = new Faker(new Locale("es-ES"));

    /**
     * Se genera un email aleatoriamente
     * @return un email
     */
    public static String email() {
        return fakeValuesService.bothify("????####@????####.???.??");
    }

    /**
     * Se genera un nombre aleatoreamente
     * @return un nombre
     */
    public static String nombre() {
        return faker.name().firstName();
    }

    /**
     * Se genera un apellido aleatoreamente
     * @return
     */
    public static String apellido() {
        return faker.name().lastName();
    }

    /**
     * Se genera una cadena alfanumerica aleatoreamente
     * @param longitud tamaño de la cade a generar
     * @return una cadena alfanumerica
     */
    public static String clave(int longitud) {
        return RandomStringUtils.randomAlphabetic(longitud);
    }

    /**
     *  se genera un número de identificación aleatoreamente
     * @param longitud tamaño del número de identificación
     * @return un número de identificación
     */
    public static String cedula(int longitud) {
        return RandomStringUtils.randomNumeric(longitud);
    }

    /**
     *  Se genera un número de celular aleatoreamente
     * @param longitud tamaño del número
     * @return un número de celular
     */
    public static String celular(int longitud) {
        return cedula(longitud);
    }

    /**
     * Se genera un número fijo aleatoreamente
     * @param longitud tamaño del número
     * @return un número fijo
     */
    public static String fijo(int longitud) {
        return cedula(longitud);
    }
}


