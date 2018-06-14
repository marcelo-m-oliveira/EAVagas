package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CadastraCartaoController {
	
	public static final String tituloCadastroCartao = "Cadastro de Cartão de Crédito";
	@FXML private TextField TextFieldNumCartao;
	@FXML private TextField TextFieldDataCartao;
	@FXML private TextField TextFieldCodigoCartao;
    
    public void cadastrarCartao(ActionEvent event) {
    	if(CartaoController.cadastraCartao(TextFieldNumCartao.getText(), TextFieldCodigoCartao.getText(), 
    			TextFieldDataCartao.getText())) {
    		TelaController.exibirJanela(AlertType.INFORMATION, CadastraCartaoController.tituloCadastroCartao, 
    				"Cadastro bem-sucedido", "Cadastro de Cartão de Crédito efetuado com sucesso!");
    		limpaCampos();
    		TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
    	}else {
    		TelaController.exibirJanela(AlertType.ERROR, CadastraCartaoController.tituloCadastroCartao, 
    				"Falha no cadastro", "Falha ao cadastrar cartão de crédito. Verifique os dados preenchidos e tente novamente.");
    	}
    }

    
    private void limpaCampos() {
    	TextFieldNumCartao.clear();
    	TextFieldDataCartao.clear();
    	TextFieldCodigoCartao.clear();
    }

}
