package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

public class HomeController {
	
	public static final String telaHome = "EA Vagas";

    @FXML
    private Hyperlink HyperlinkDadosUsuario;

    @FXML
    private Hyperlink HyperlinkDadosCarro;

    @FXML
    private Button ButtonPremium;

    @FXML
    private Hyperlink HyperlinkPreferencia;
    
    public void telaPreferencias(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Preferencias.fxml", PreferenciasController.telaPreferencias);
    }
    
    public void perfil(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Perfil.fxml", PerfilController.telaPerfil);
    }
    
    public void sejaPremium(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/FacaCartao.fxml", FacaCartaoController.tituloFacaCartao);
    }

}
