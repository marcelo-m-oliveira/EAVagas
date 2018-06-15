package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AjudaController {
	
	public static final String telaAjuda = "Ajuda";
	
	public void voltar(ActionEvent event) {
		TelaController.carregarTela(event, "/application/Preferencias.fxml", PreferenciasController.telaPreferencias);
	}

}
