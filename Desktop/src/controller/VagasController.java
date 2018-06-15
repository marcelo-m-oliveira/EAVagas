package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class VagasController {

	public static final String tituloTelaVagas = "Vagas";
	
    private Button ButtonVoltar;
    private Label LabelPerdigao;
    private Label LabelEscolha;
    private Button ButtonA;
    private Button ButtonC;
    private Button ButtonE;
    private Button ButtonG;
    private Button ButtonB;
    private Button ButtonD;
    private Button ButtonF;
    private Button ButtonH;
    private Circle CircleVerde;
    private Circle CircleAmarelo;
    private Circle CircleVermelho;
    private Label LabelDisponivel;
    private Label LabelReservado;
    private Label LabelOcupado;
    private Button ButtonCancelar;
    
    public void voltarHome(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Home.fxml", VagasController.tituloTelaVagas);
    }
    
    public void vagaA(ActionEvent event) {
    	TelaController.exibirJanela(AlertType.INFORMATION, VagasController.tituloTelaVagas, 
    			"Vaga Reservada", "Vaga reservada com sucesso!");
    	TelaController.carregarTela(event, "/application/Home.fxml", VagasController.tituloTelaVagas);
    }
    
    public void vagaB(ActionEvent event) {
    	TelaController.exibirJanela(AlertType.INFORMATION, VagasController.tituloTelaVagas, 
    			"Vaga Reservada", "Vaga reservada com sucesso!");
    	TelaController.carregarTela(event, "/application/Home.fxml", VagasController.tituloTelaVagas);
    }
    
    public void vagaC(ActionEvent event) {
    	TelaController.exibirJanela(AlertType.INFORMATION, VagasController.tituloTelaVagas, 
    			"Vaga Reservada Por Outro Usuário", "Essa vaga foi reservada por outra pessoa. Tente outra vaga!");
    
    }
    
    public void vagaD(ActionEvent event) {
    	TelaController.exibirJanela(AlertType.INFORMATION, VagasController.tituloTelaVagas, 
    			"Vaga Ocupada", "Vaga já ocupada. Tente outra vaga!");
    }
    
    public void vagaE(ActionEvent event) {
    	TelaController.exibirJanela(AlertType.INFORMATION, VagasController.tituloTelaVagas, 
    			"Vaga Ocupada", "Vaga já ocupada. Tente outra vaga!");
    }
    
    public void vagaF(ActionEvent event) {
    	TelaController.exibirJanela(AlertType.INFORMATION, VagasController.tituloTelaVagas, 
    			"Vaga Reservada", "Vaga reservada com sucesso!");
    	TelaController.carregarTela(event, "/application/Home.fxml", VagasController.tituloTelaVagas);
    }
    
    public void vagaG(ActionEvent event) {
    	TelaController.exibirJanela(AlertType.INFORMATION, VagasController.tituloTelaVagas, 
    			"Vaga Reservada", "Vaga reservada com sucesso!");
    	TelaController.carregarTela(event, "/application/Home.fxml", VagasController.tituloTelaVagas);
    }
    
    public void vagaH(ActionEvent event) {
    	TelaController.exibirJanela(AlertType.INFORMATION, VagasController.tituloTelaVagas, 
    			"Vaga Reservada Por Outro Usuário", "Essa vaga foi reservada por outra pessoa. Tente outra vaga!");
    }

}

