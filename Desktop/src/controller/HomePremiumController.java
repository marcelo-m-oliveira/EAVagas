package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

public class HomePremiumController {
	
	public static final String telaHomePremium = "Home";
	
	public void telaPreferencias(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Preferencias.fxml", PreferenciasController.telaPreferencias);
    }
    
    public void perfil(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Perfil.fxml", PerfilController.telaPerfil);
    }
    
    public void TelaVagas(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Vagas.fxml", VagasController.tituloTelaVagas);
    }

}
