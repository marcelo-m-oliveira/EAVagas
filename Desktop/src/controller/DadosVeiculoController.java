package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class DadosVeiculoController {

	public static final String tituloDadosVeiculo = "Dados do Veculo";
    @FXML private TextField TextFieldPlaca;
    @FXML private MenuButton MenuButtonTipoVeiculo;
    
	public void cadastrarUsuario(ActionEvent event) {
		if (VeiculoController.CadastroVeiculo(TextFieldPlaca.getText(), MenuButtonTipoVeiculo.getText())) {
			TelaController.exibirJanela(AlertType.INFORMATION, DadosVeiculoController.tituloDadosVeiculo, "Opera��o realizada",
					"Ve�culo cadastrado com sucesso!");
			limparCamposCadastro();
		} else {
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"N�o foi poss�vel cadastrar Ve�culo, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
		
	}

	private void limparCamposCadastro() {
		TextFieldPlaca.clear();
	}
}
