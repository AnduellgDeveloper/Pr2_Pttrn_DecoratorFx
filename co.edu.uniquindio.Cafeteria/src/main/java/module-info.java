module co.edu.uniquindio.parcial2.cafeteriaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial2.cafeteriaapp to javafx.fxml;
    exports co.edu.uniquindio.parcial2.cafeteriaapp;
}