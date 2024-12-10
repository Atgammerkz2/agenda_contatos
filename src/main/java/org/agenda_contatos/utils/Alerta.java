package org.agenda_contatos.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Alerta {

    public static void exibirAlerta(String title, String header, String content, Alert.AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }

    public static boolean solicitarConfirmacao(String titulo, String mensagem){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "", ButtonType.YES, ButtonType.NO);
        alert.setTitle(titulo);
        alert.setHeaderText(mensagem);
        alert.showAndWait();

        return alert.getResult() == ButtonType.YES;
    }
}
