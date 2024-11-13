package com.talentotech.model;

public class EnergiaGeotermica extends EnergiaRenovable {

    private double temperatura;
    private double profundidad;

    public EnergiaGeotermica(String tipo,
                             String pais,
                             int anio,
                             double produccion,
                             double consumo,
                             double temperatura,
                             double profundidad) {
        super(tipo, pais, anio, produccion, consumo);
        this.temperatura = temperatura;
        this.profundidad = profundidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setTemperatura(double temperatura) {
        if (temperatura >= 0) this.temperatura = temperatura;
        else System.out.println("ERROR, usted a ingresado un valor de temperatura invalido.");
    }

    public void setProfundidad(double profundidad) {
        if (profundidad > 0) this.profundidad = profundidad;
        else System.out.println("ERROR, usted a ingresado un valor de profundidad es invalido.");
    }

    @Override
    public double calcularProduccion() {
        return 0;
    }

    @Override
    public String toString() {
        return "EnergiaGeotermica:\n" +
                super.toString() +
                "\ntemperatura: " + temperatura +
                "\nprofundidad: " + profundidad ;
    }
}
