package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class NotificacoesController {
	
	public static final String telaNotificacoes = "Notificações";
	
	public void voltarPref(ActionEvent event) {
		TelaController.carregarTela(event, "/application/Preferencias.fxml", PreferenciasController.telaPreferencias);
	}

}
