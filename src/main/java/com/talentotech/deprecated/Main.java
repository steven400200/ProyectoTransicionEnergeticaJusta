package com.talentotech.deprecated;

import com.talentotech.deprecated.logica.GestionDatos;
import com.talentotech.entity.EnergiaEolica;
import com.talentotech.entity.EnergiaHidraulica;
import com.talentotech.entity.EnergiaRenovable;
import com.talentotech.entity.EnergiaSolar;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GestionDatos gestion = new GestionDatos();
        String pais = JOptionPane.showInputDialog("ingrese el pais");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año"));
        String tipo = JOptionPane.showInputDialog("ingrese el tipo de energia");
        gestion.setListEnergiasRenovables(crearMockEnergias());

        verDatos(gestion, pais, anio, tipo);
    }

    /**
     * Método que muestra los datos de producción y consumo de energía.
     *
     * @param gestion Objeto de la clase GestionDatos.
     * @param pais    País del que se desea ver la producción.
     * @param anio    Año del que se desea ver la producción.
     */
    private static void verDatos(GestionDatos gestion, String pais, int anio, String tipo) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("La produccion total mundial es de : " + " " + gestion.calcularProduccionTotal() + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("El consumo total mundial es de :" + " " + gestion.calcularConsumoTotal() + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("La produccion total de " + " " + pais + " " + "es : " + gestion.calcularProduccionTotalPais(pais) + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("el consumo total de " + pais + "es : " + gestion.calcularConsumoTotalPais(pais) + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("la producion de energia de tipo " + tipo + " del pais " + " " + pais + " en el anio " + " " + anio + " es: " + " " + gestion.calcularProduccionPaisTipo(pais, tipo) + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("la producion de energia de " + pais + " " + "en el año" + " " + anio + " " + "es : " + gestion.calcularProduccionPaisAnio(pais, anio) + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    /**
     * Método que crea una lista de energías renovables de prueba.
     *
     * @return Lista de energías renovables.
     */
    public static List<EnergiaRenovable> crearMockEnergias() {
        ArrayList<EnergiaRenovable> energias = new ArrayList<>();
        energias.add(new EnergiaSolar( "solar","Colombia", 2020, 365000, 2007, 1000,200,7));
        energias.add(new EnergiaEolica( "Eolica","Colombia", 2020, 365000, 518400, 1000,203,8));
        energias.add(new EnergiaHidraulica( "hidraulica","Colombia", 2020, 1000, 1000, 1000,100));

        energias.add(new EnergiaSolar("solar","Brasil", 2020, 365000, 2007, 1000,200,7));
        energias.add(new EnergiaEolica( "Eolica","Brasil", 2020, 1000, 1000, 1000,400,6));
        energias.add(new EnergiaHidraulica( "hidraulica","Brasil", 2020, 1000, 1000, 1000,100));

        return energias;
    }
}
