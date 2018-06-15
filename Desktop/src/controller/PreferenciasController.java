package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

public class PreferenciasController {
	
	public static final String telaPreferencias = "Preferências";
    @FXML
    private Label LabelPreferencias;
    @FXML
    private Hyperlink HyperlinkConta;
    @FXML
    private Hyperlink HyperlinkNotificacoes;
    @FXML
    private Hyperlink HyperlinkAjuda;
    @FXML
    private Button ButtonVoltar;
    
    public void voltar(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
    }
    
    public void notificacoes(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Notificacoes.fxml", NotificacoesController.telaNotificacoes);
    }
    
    public void ajuda(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Ajuda.fxml", AjudaController.telaAjuda);
    }
    
    public void SairdoPrograma(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Login.fxml", LoginController.tituloTelaInicial);
    }

}
