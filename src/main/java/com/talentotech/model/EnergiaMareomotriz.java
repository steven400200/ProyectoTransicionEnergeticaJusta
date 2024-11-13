package com.talentotech.model;

public class EnergiaMareomotriz extends EnergiaRenovable {

    private double alturaMareaPromedio;
    private double areaCubierta;

    public EnergiaMareomotriz(String tipo,
                              String pais,
                              int anio,
                              double produccion,
                              double consumo,
                              double alturaMareaPromedio,
                              double areaCubierta) {
        super(tipo, pais, anio, produccion, consumo);
        this.alturaMareaPromedio = alturaMareaPromedio;
        this.areaCubierta = areaCubierta;
    }

    public double getAlturaMareaPromedio() {
        return alturaMareaPromedio;
    }

    public double getAreaCubierta() {
        return areaCubierta;
    }

    public void setAlturaMareaPromedio(double alturaMareaPromedio) {
        if (alturaMareaPromedio >= 0) this.alturaMareaPromedio = alturaMareaPromedio;
        else System.out.println("ERROR, usted a ingresado un valor de altura promedio de la marea invalido.");
    }

    public void setAreaCubierta(double areaCubierta) {
        if (areaCubierta >= 0) this.areaCubierta = areaCubierta;
        else System.out.println("ERROR, usted a ingresado un valor de area de cubierta invalido.");
    }

    @Override
    public double calcularProduccion() {
        return 0;
    }

    @Override
    public String toString() {
        return "EnergiaMareomotriz:\n" +
                super.toString()+
                "\naltura promedio de la marea: " + alturaMareaPromedio +
                "\narea de la cubierta: " + areaCubierta ;
    }
}
