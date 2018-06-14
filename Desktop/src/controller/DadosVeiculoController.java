package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuItem;

public class DadosVeiculoController {

	public static final String tituloDadosVeiculo = "Dados do Veculo";
    @FXML private TextField TextFieldPlaca;
    @FXML private MenuButton MenuButtonTipoVeiculo;
    @FXML private MenuItem VeicCarro;
    @FXML private MenuItem VeicMoto;
    
	public void CadastrarVeiculo(ActionEvent event) {
		if (VeiculoController.CadastroVeiculo(TextFieldPlaca.getText(),
				MenuButtonTipoVeiculo.getText())) {
			TelaController.exibirJanela(AlertType.INFORMATION, DadosVeiculoController.tituloDadosVeiculo, "Operação realizada",
					"Veículo cadastrado com sucesso!");
			TelaController.carregarTela(event, "/application/FacaCartao.fxml", FacaCartaoController.tituloFacaCartao);
			limparCamposCadastro();
		} else {
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"Não foi possível cadastrar Veículo, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
		
	}
	
    public void BotaoVoltar(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Cadastro.fxml", CadastroDadosPessoaisController.tituloTelaCadastroUsuario);
    }

	private void limparCamposCadastro() {
		TextFieldPlaca.clear();
	}
}
