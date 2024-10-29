package co.edu.uniquindio.parcial2.cafeteriaapp.model.builder;

import co.edu.uniquindio.parcial2.cafeteriaapp.model.CafeSimple;

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
    public CafeSimple build(){
        return new CafeSimple(
                ingredientes,
                costo
        );
    }
}
