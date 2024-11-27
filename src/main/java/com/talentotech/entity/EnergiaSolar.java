package com.talentotech.entity;

public class EnergiaSolar extends EnergiaRenovable {
    private static final double EFICIENCIA = 0.15; // Porcentaje de eficiencia de las placas solares (normalmente entre 0.15 y 0.20).
    private double radiacion; // en W/m² radiación solar
    private double area; // en m² de las placas solares
    private int numeroPaneles;

    public EnergiaSolar(String tipo,
                        String pais,
                        int anio,
                        double produccion,
                        double consumo,
                        double radiacion,
                        double area,
                        int numeroPaneles) {
        super(tipo, pais, anio, produccion, consumo);
        this.radiacion = radiacion;
        this.area = area;
        this.numeroPaneles = numeroPaneles;
    }

    public int getNumeroPaneles() {
        return numeroPaneles;
    }

    public double getRadiacion() { return radiacion; }

    public double getArea() { return area; }

    public void setNumeroPaneles(int numeroPaneles) {
        if (numeroPaneles >= 0) this.numeroPaneles = numeroPaneles;
        else System.out.println("ERROR, usted a ingresado una cantidad de paneles invalida.");
    }

    public void setRadiacion(double radiacion) {
        if (radiacion >= 0) this.radiacion = radiacion;
        else System.out.println("ERROR, usted a ingresado una radiacion invalida.");
    }

    public void setArea(double area) {
        if (area >= 0) this.area = area;
        else System.out.println("ERROR, usted a ingresado una area invalida.");
    }

    @Override
    public double calcularProduccion() {
        return EFICIENCIA * radiacion * area;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nradiacion: " + radiacion +
                "\narea: " + area +
                "\nnumeroPaneles: " + numeroPaneles ;
    }
}
