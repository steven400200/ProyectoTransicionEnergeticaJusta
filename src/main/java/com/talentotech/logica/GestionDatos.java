package com.talentotech.logica;

import com.talentotech.model.*;
import com.talentotech.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionDatos {

    private List<EnergiaRenovable> listEnergiasRenovables;

    public GestionDatos() {
        this.listEnergiasRenovables = new ArrayList<>();
    }

    public List<EnergiaRenovable> getListEnergiasRenovables() {
        return listEnergiasRenovables;
    }

    public void setListEnergiasRenovables(List<EnergiaRenovable> listEnergiasRenovables) {
        if (!listEnergiasRenovables.isEmpty())this.listEnergiasRenovables = listEnergiasRenovables;
        else System.out.println("ERROR, usted a ingresado una lista vacia.");
    }

    public void agregarEnergia(EnergiaRenovable energia) {
        listEnergiasRenovables.add(energia);
    }

    public double calcularProduccionTotal() {
        double energiaTotal = 0.0;
        for (EnergiaRenovable energia : listEnergiasRenovables) {
            energiaTotal += energia.getProduccion();
        }
        return energiaTotal;
    }

    public double calcularConsumoTotal() {
        double consumoTotal = 0.0;
        for (EnergiaRenovable energia : listEnergiasRenovables) {
            consumoTotal += energia.getConsumo();
        }
        return consumoTotal;

    }

    public double calcularProduccionTotalPais(String pais) {
        double energiaTotal = 0.0;
        for (EnergiaRenovable energia : listEnergiasRenovables) {
            if (energia.getPais().equalsIgnoreCase(pais)) {
                energiaTotal += energia.getProduccion();
            }
        }
        return energiaTotal;
    }

    public double calcularConsumoTotalPais(String pais) {
        double consumoTotal = 0.0;
        for (EnergiaRenovable energia : listEnergiasRenovables) {
            if (energia.getPais().equalsIgnoreCase(pais)) {
                consumoTotal += energia.getConsumo();
            }
        }
        return consumoTotal;
    }

    public double calcularProduccionPaisTipo(String pais, String tipo) {
        double energiaTotal = 0.0;
        for (EnergiaRenovable energia : listEnergiasRenovables) {
            if (energia.getPais().equalsIgnoreCase(pais) && energia.getTipo().equalsIgnoreCase(tipo)) {
                energiaTotal += energia.getProduccion();
            }
        }
        return energiaTotal;
    }

    public double calcularConsumoPaisTipo(String pais, String tipo) {
        double consumoTotal = 0.0;
        for (EnergiaRenovable energia : listEnergiasRenovables) {
            if (energia.getPais().equalsIgnoreCase(pais) && energia.getTipo().equalsIgnoreCase(tipo)) {
                consumoTotal += energia.getConsumo();
            }
        }
        return consumoTotal;
    }
    public double calcularProduccionPaisAnio(String pais, int anio) {
        double energiaTotal = 0.0;
        for (EnergiaRenovable energia : listEnergiasRenovables) {
            if (energia.getPais().equalsIgnoreCase(pais) && energia.getAnio()== anio) {
                energiaTotal += energia.calcularProduccion();
            }
        }
        return energiaTotal;
    }

}
