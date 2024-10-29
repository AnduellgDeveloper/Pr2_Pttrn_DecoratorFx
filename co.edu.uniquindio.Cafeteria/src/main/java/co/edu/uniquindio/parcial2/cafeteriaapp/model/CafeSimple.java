package co.edu.uniquindio.parcial2.cafeteriaapp.model;

import co.edu.uniquindio.parcial2.cafeteriaapp.service.ICafe;

public class CafeSimple implements ICafe {
    private String ingredientes;
    private double costo;

    public CafeSimple(String ingredientes, double costo) {
        this.ingredientes = ingredientes;
        this.costo = costo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
