package com.talentotech.entity;

import jakarta.persistence.Id;

public abstract class EnergiaRenovable {

    @Id
    private int id;
    private String tipo;
    private String pais;
    private int anio;
    private double produccion;
    private double consumo;

    public EnergiaRenovable(String tipo,
                            String pais,
                            int anio,
                            double produccion,
                            double consumo) {
        this.tipo = tipo;
        this.pais = pais;
        this.anio = anio;
        this.produccion = produccion;
        this.consumo = consumo;
    }
    public void calcularBalance (){
        System.out.println("El balance es: "+ (produccion - consumo) );
    }

    public int getId() { return id; }

    public String getTipo() { return tipo; }

    public String getPais() { return pais; }

    public int getAnio() { return anio; }

    public double getProduccion() { return produccion; }

    public double getConsumo() { return consumo; }

    public void setTipo(String tipo) {
        if (!tipo.isBlank()) this.tipo = tipo;
        else System.out.println("ERROR, usted a ingresado un tipo invalido.");
    }

    public void setPais(String pais) {
        if (!pais.isBlank()) this.pais = pais;
        else System.out.println("ERROR usted a ingresado un pais invalido.");
    }

    public void setAnio(int anio) {
        if (anio > 1990 && anio < 2025) this.anio = anio;
        else System.out.println("ERROR, usted a ingresado un año invalido.");
    }

    public void setProduccion(double produccion) {
        if (produccion >= 0) this.produccion = produccion;
        else System.out.println("ERROR, usted a ingresado un valor de produccion invalido.");
    }

    public void setConsumo(double consumo) {
        if (consumo >= 0) this.consumo = consumo;
        else System.out.println("ERROR, usted a ingresado un valor de consumo invalido.");
    }

    public abstract double calcularProduccion();

    @Override
    public String toString() {
        return  "id: " + id +
                "\ntipo: '" + tipo +
                "\npais: '" + pais +
                "\naño: '" + anio +
                "\nproduccion: " + produccion +
                "\nconsumo: " + consumo ;
    }
}
