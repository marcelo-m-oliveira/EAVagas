package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastraCartaoController {
	
	public static final String tituloCadastroCartao = "Cadastro de Cartão de Crédito";

    private Label LabelInsiraNumero;
    private TextField TextFieldNumero;
    private TextField TextFieldData;
    private TextField TextFieldCodigo;
    private Button ButtonConfirmar;
    private CheckBox CheckBoxTermos;
    
    public void cadastrar(ActionEvent event) {
    	if(CartaoController.cadastrarCartao(TextFieldNumero.getText(), TextFieldCodigo.getText(), 
    			TextFieldData.getText())) {
    		TelaController.exibirJanela(AlertType.CONFIRMATION, CadastraCartaoController.tituloCadastroCartao, 
    				"Cadastro bem-sucedido", "Cadastro de Cartão de Crédito efetuado com sucesso!");
    		TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
    	}else {
    		TelaController.exibirJanela(AlertType.ERROR, CadastraCartaoController.tituloCadastroCartao, 
    				"Falha no cadastro", "Falha ao cadastrar cartão de crédito. Verifique os dados preenchidos e tente novamente.");
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
