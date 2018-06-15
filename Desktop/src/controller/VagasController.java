package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;

public class VagasController {

	public static final String tituloTelaVagas = "Vagas";
    
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

