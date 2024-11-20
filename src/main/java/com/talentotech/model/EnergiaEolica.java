package com.talentotech.model;

public class EnergiaEolica extends EnergiaRenovable {
    private static final double EFICIENCIA = 0.4; // Porcentaje de eficiencia de los aerogeneradores (normalmente entre 0.3 y 0.4).
    private static final double DENSIDAD_AIRE = 1.225; // Densidad del aire en kg/m³ al nivel del mar.
    private double velocidadViento; // en m/s
    private double areaBarrido; // en m² area barrida por las aspas del aerogenerador
    private int numeroTurbinas;
//esto es un comentario
//Hola
    public EnergiaEolica(String tipo,
                         String pais,
                         int anio,
                         double produccion,
                         double consumo,
                         double velocidadViento,
                         double areaBarrido,
                         int numeroTurbinas) {
        super(tipo, pais, anio, produccion, consumo);
        this.velocidadViento = velocidadViento;
        this.areaBarrido = areaBarrido;
        this.numeroTurbinas = numeroTurbinas;
    }

    public int getNumeroTurbinas() {return numeroTurbinas; }

    public double getVelocidadViento() { return velocidadViento; }

    public double getAreaBarrido() { return areaBarrido; }

    public void setNumeroTurbinas(int numeroTurbinas) {
        if (numeroTurbinas >= 0) this.numeroTurbinas = numeroTurbinas;
        else System.out.println("ERROR, usted a ingresado un numero de turbinas invalido.");
    }

    public void setVelocidadViento(double velocidadViento) {
        if (velocidadViento >= 0) this.velocidadViento = velocidadViento;
        else System.out.println("ERROR, usted a ingresado una velocidad del viento invalida.");
    }

    public void setAreaBarrido(double areaBarrido) {
        if (areaBarrido >= 0) this.areaBarrido = areaBarrido;
        else System.out.println("ERROR, usted a ingresado una area de barrido invalida.");
    }

    @Override
    public double calcularProduccion() {
        return 0.5 * EFICIENCIA * DENSIDAD_AIRE * Math.pow(velocidadViento, 3) * areaBarrido;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nvelocidadViento: " + velocidadViento +
                "\nareaBarrido: " + areaBarrido +
                "\numeroTurbinas: " + numeroTurbinas ;
    }
}
