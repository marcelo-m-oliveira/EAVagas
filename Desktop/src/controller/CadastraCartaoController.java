package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CadastraCartaoController {
	
	public static final String tituloCadastroCartao = "Cadastro de Cart�o de Cr�dito";

    private TextField TextFieldNumero;
    private TextField TextFieldData;
    private TextField TextFieldCodigo;
    public void cadastrarCartao(ActionEvent event) {
    	if(CartaoController.cadastraCartao(TextFieldNumero.getText(), TextFieldCodigo.getText(), 
    			TextFieldData.getText())) {
    		TelaController.exibirJanela(AlertType.INFORMATION, CadastraCartaoController.tituloCadastroCartao, 
    				"Cadastro bem-sucedido", "Cadastro de Cart�o de Cr�dito efetuado com sucesso!");
    		limpaCampos();
    		TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
    	}else {
    		TelaController.exibirJanela(AlertType.ERROR, CadastraCartaoController.tituloCadastroCartao, 
    				"Falha no cadastro", "Falha ao cadastrar cart�o de cr�dito. Verifique os dados preenchidos e tente novamente.");
    	}
    }
    
    
    public void telaAnterior(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/FacaCartao.fxml", FacaCartaoController.tituloFacaCartao);
    }
    
    private void limpaCampos() {
    	TextFieldNumero.clear();
    	TextFieldData.clear();
    	TextFieldCodigo.clear();
    }

}
