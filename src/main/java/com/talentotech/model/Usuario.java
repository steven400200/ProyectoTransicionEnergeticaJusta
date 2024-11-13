package com.talentotech.model;

public class Usuario {

    private static int contadorId;
    private final int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String tipoUsuario;


    public Usuario(String nombre,
                   String apellido,
                   int edad,
                   String cedula,
                   String tipoUsuario) {
        this.id = ++Usuario.contadorId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() { return id; }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public int getEdad() { return edad; }

    public String getCedula() { return cedula; }

    public String getTipoUsuario() { return tipoUsuario; }

    public void setNombre(String nombre) {
        if(!nombre.isBlank()) this.nombre = nombre;
        else System.out.println("ERROR, usted a ingresado un nombre invalido.");
    }

    public void setApellido(String apellido) {
        if(!apellido.isBlank()) this.apellido = apellido;
        else System.out.println("ERROR, usted a ingresado un apellido invalido.");
    }

    public void setEdad(int edad) {
        if (edad > 10 && edad < 110)this.edad = edad;
        else System.out.println("ERROR, usted a ingresado una edad invalida.");
    }

    public void setCedula(String cedula) {
        if(!cedula.isBlank()) this.cedula = cedula;
        else System.out.println("ERROR, usted a ingresado una cedula invalida.");
    }

    public void setTipoUsuario(String tipoUsuario) {
        if(!tipoUsuario.isBlank()) this.tipoUsuario = tipoUsuario;
        else System.out.println("ERROR, usted a ingresado un tipoUsuario invalido.");
    }

    @Override
    public String toString() {
        return  "id: " + id +
                "\nnombre: '" + nombre +
                "\napellido: " + apellido +
                "\nedad: " + edad +
                "\ncedula: " + cedula +
                "\ntipoUsuario: " + tipoUsuario ;
    }
}
