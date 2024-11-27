package com.talentotech.entity;

public class EnergiaHidraulica extends EnergiaRenovable {
    private static double EFICIENCIA=0.7;//Porcentaje de eficiencia de la turbina (normalmente entre 0.7 y 0.9).
    private static double GRAVEDAD=9.81; //Aceleración debido a la gravedad (9.81 m/s²).
    private double flujo;
    private double altura;

    public EnergiaHidraulica(String tipo,
                             String pais,
                             int anio,
                             double produccion,
                             double consumo,
                             double flujo,
                             double altura) {
        super(tipo, pais, anio, produccion, consumo);
        this.flujo = flujo;
        this.altura = altura;
    }

    public double getFlujo() { return flujo; }

    public double getAltura() { return altura; }

    public void setFlujo(double flujo) {
        if (flujo >= 0) this.flujo = flujo;
        else System.out.println("ERROR, usted a ingresado una cantidad de flujo invalido.");
    }

    public void setAltura(double altura) {
        if (altura >=0) this.altura = altura;
        else System.out.println("ERROR, usted a ingresado una altura invalida.");
    }

    @Override
    public double calcularProduccion() {
        return EFICIENCIA * flujo * altura * GRAVEDAD;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nflujo: " + flujo +
                "\naltura: " + altura;
    }
}
