package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroDadosPessoaisController {

	public static final String tituloTelaCadastroUsuario = "Cadastro de Usu�rio"; // t�tulo exibido na barra superior da tela
	@FXML private TextField textFieldNome;
	@FXML private TextField textFielSobrenome;
	@FXML private TextField textFieldCPF;
	@FXML private TextField textFieldTelefone;
	@FXML private PasswordField passwordFieldCadastroSenha;
	@FXML private PasswordField passwordFieldConfirmeSenha;
	@FXML private TextField textFieldCadastroEmail;

	// Cadastra um novo usu�rio no sistema. Chamado pelo bot�o 'Ok'
	public void cadastrarUsuario(ActionEvent event) {
		if (UsuarioController.cadastrarUsuario(textFieldNome.getText(), textFielSobrenome.getText(),
				textFieldCPF.getText(), textFieldTelefone.getText(), passwordFieldCadastroSenha.getText(),
				passwordFieldConfirmeSenha.getText(), textFieldCadastroEmail.getText())) {
			TelaController.exibirJanela(AlertType.INFORMATION, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Opera��o realizada",
					"Novo usu�rio cadastrado com sucesso! Nome: " + textFieldCadastroEmail.getText());
			TelaController.carregarTela(event, "/application/DadosVeiculo.fxml", DadosVeiculoController.tituloDadosVeiculo);
			limparCamposCadastro();
		} else {
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"N�o foi poss�vel cadastrar novo usu�rio, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
	}
	
	// Volta para a tela de login. Chamado pelo bot�o 'Voltar'
	public void TelaInicial(ActionEvent event) {
		TelaController.carregarTela(event, "/application/Login.fxml", LoginController.tituloTelaInicial);
	}

	// Limpa todos os campos de cadastro. Chamado internamente por outros m�todos
	private void limparCamposCadastro() {
		textFieldNome.clear();
		textFielSobrenome.clear();
		textFieldCPF.clear();
		textFieldTelefone.clear();
		textFieldCadastroEmail.clear();
		passwordFieldCadastroSenha.clear();
		passwordFieldConfirmeSenha.clear();
	}

}
