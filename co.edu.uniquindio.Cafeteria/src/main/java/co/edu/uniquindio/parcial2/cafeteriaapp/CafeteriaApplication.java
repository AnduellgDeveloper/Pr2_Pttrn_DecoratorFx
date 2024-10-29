package co.edu.uniquindio.parcial2.cafeteriaapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CafeteriaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CafeteriaApplication.class.getResource("Cafe.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cafeteria lechita");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main() {
        launch();
    }
}