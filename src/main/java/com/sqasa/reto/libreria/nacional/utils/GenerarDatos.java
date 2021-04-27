package com.sqasa.reto.libreria.nacional.utils;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class GenerarDatos {
    private static final FakeValuesService fakeValuesService = new FakeValuesService(new Locale("es-CO"), new RandomService());
    private static Faker faker = new Faker(new Locale("es-ES"));


    public static String email() {
        return fakeValuesService.bothify("????####@????####.???.??");
    }

    public static String nombre() {
        return faker.name().firstName();
    }

    public static String apellido() {
        return faker.name().lastName();
    }

    public static String clave(int longitud) {
        return RandomStringUtils.randomAlphabetic(longitud);
    }

    public static String cedula(int longitud) {
        return RandomStringUtils.randomNumeric(longitud);
    }

    public static String celular(int longitud) {
        return cedula(longitud);
    }

    public static String fijo(int longitud) {
        return cedula(longitud);
    }
}


