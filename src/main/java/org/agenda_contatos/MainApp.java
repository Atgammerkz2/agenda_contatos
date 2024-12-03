package org.agenda_contatos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.agenda_contatos.model.entities.Contato;
import org.agenda_contatos.model.services.ContatoDAO;
import org.agenda_contatos.utils.HibernateSessionFactory;
import org.agenda_contatos.utils.PathFXML;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(new FileInputStream(PathFXML.pathBase() + "MainView.fxml"));
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Agenda de Contatos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}