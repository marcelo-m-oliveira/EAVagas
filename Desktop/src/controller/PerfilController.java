package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class PerfilController {
	
	public static final String telaPerfil = "Perfil";

    @FXML
    private Label LabelPerfil;

    @FXML
    private ImageView ImageViewFoto;

    @FXML
    private Label LabelMembro;

    @FXML
    private Label LabelNome;

    @FXML
    private Label LabelVeiculo;

    @FXML
    private Label LabelEstacionamento;

    @FXML
    private Button ButtonSair;

    @FXML
    private Button ButtonVoltar;
    
    public void voltarHome(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
    }

}

