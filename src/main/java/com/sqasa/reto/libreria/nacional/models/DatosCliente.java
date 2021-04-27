package com.sqasa.reto.libreria.nacional.models;


import com.sqasa.reto.libreria.nacional.utils.GenerarDatos;

import static com.sqasa.reto.libreria.nacional.utils.Constantes.CEDULA_CIUDADANIA;

public class DatosCliente {
    private String correo;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private String celular;
    private String fijo;
    private String clave;
    private static DatosCliente miDatosCliente = null;

    public static DatosCliente getDatosCliente() {
        if (miDatosCliente == null) {
            miDatosCliente = new DatosCliente(
                    GenerarDatos.email(),
                    GenerarDatos.nombre(),
                    GenerarDatos.apellido(),
                    CEDULA_CIUDADANIA,
                    GenerarDatos.cedula(11),
                    GenerarDatos.celular(10),
                    GenerarDatos.fijo(7),
                    GenerarDatos.clave(12)
            );
        }
        return miDatosCliente;
    }

    public DatosCliente(String correo, String nombre, String apellido, String tipoDocumento, String numeroDocumento, String celular, String fijo, String clave) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
        this.fijo = fijo;
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getCelular() {
        return celular;
    }

    public String getFijo() {
        return fijo;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "correo='" + correo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", celular='" + celular + '\'' +
                ", fijo='" + fijo + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
