package co.edu.uniquindio.parcial2.cafeteriaapp.model;

import java.util.ArrayList;
import java.util.List;

public class CafeObjeto {
    private static final List<CafeSimple> listaCafes = new ArrayList<>();

    public static List<CafeSimple> getListaCafes() {
        return listaCafes;
    }
     
}
