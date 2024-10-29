package co.edu.uniquindio.parcial2.cafeteriaapp.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CafeViewController {
    @FXML
    private Button btnCalcular;

    @FXML
    private Label txtCafe;
    @FXML
    private CheckBox chBLeche;

    @FXML
    private Label txtCosto;

    @FXML
    void onCalcular(ActionEvent event) {
        calcularCosto();

    }
    public void calcularCosto () {
        if (btnCalcular.isFocused()) {
            txtCafe.setText("Café Simple");
            txtCosto.setText("$2");
            if (btnCalcular.isFocused() && chBLeche.isSelected()) {
                txtCafe.setText("Café Simple + Leche");
                txtCosto.setText("$2.5");
            }
        }

    }
}
