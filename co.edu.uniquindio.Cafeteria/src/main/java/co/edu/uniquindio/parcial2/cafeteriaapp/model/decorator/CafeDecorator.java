package co.edu.uniquindio.parcial2.cafeteriaapp.model.decorator;

import co.edu.uniquindio.parcial2.cafeteriaapp.service.ICafe;

public class CafeDecorator implements ICafe {
    protected ICafe cafeDecorado;

    public CafeDecorator(ICafe cafeDecorado){
        this.cafeDecorado = cafeDecorado;
    }
    @Override
    public String getIngredientes() {
        return cafeDecorado.getIngredientes();
    }

    @Override
    public double getCosto() {
        return cafeDecorado.getCosto();
    }
}
