package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class DadosVeiculoController {

	public static final String tituloDadosVeiculo = "Dados do Veculo";
    @FXML private TextField TextFieldPlaca;
    @FXML private MenuButton MenuButtonTipoVeiculo;
    
	public void cadastrarUsuario(ActionEvent event) {
		if (VeiculoController.CadastroVeiculo(TextFieldPlaca.getText(), MenuButtonTipoVeiculo.getText())) {
			TelaController.exibirJanela(AlertType.INFORMATION, DadosVeiculoController.tituloDadosVeiculo, "Operação realizada",
					"Veículo cadastrado com sucesso!");
			limparCamposCadastro();
		} else {
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"Não foi possível cadastrar Veículo, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
		
	}

	private void limparCamposCadastro() {
		TextFieldPlaca.clear();
	}
}
