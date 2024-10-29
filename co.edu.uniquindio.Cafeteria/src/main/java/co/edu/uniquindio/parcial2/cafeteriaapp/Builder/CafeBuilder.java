package co.edu.uniquindio.parcial2.cafeteriaapp.Builder;

import co.edu.uniquindio.parcial2.cafeteriaapp.Model.Cafe;

public class CafeBuilder {
    private String ingredientes;
    private double costo;

    public CafeBuilder ingredientes(String ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }
    public CafeBuilder costo(double costo) {
        this.costo = costo;
        return this;
    }
    public Cafe build(){
        return new Cafe(
                ingredientes,
                costo
        );
    }
}
