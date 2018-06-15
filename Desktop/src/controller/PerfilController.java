package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class PerfilController {
	
	public static final String telaPerfil = "Perfil";

    
    private Label LabelPerfil;
    private ImageView ImageViewFoto;
    private Label LabelMembro;
    private Label LabelNome;
    private Label LabelVeiculo;
    private Label LabelEstacionamento;
    private Button ButtonSair;
    private Button ButtonVoltar;
    
    public void voltarHome(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
    }

}

