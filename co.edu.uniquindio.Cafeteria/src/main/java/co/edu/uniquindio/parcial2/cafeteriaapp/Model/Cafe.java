package co.edu.uniquindio.parcial2.cafeteriaapp.Model;

public class Cafe {
    private String ingredientes;
    private double costo;

    public Cafe(String ingredientes, double costo) {
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
