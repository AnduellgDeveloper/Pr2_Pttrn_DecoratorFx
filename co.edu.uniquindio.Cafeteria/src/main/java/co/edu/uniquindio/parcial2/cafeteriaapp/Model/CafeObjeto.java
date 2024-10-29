package co.edu.uniquindio.parcial2.cafeteriaapp.Model;

import java.util.ArrayList;
import java.util.List;

public class CafeObjeto {
    private static final List<Cafe> listaCafes = new ArrayList<>();

    public static List<Cafe> getListaCafes() {
        return listaCafes;
    }
     
}
