package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroController {

	public static final String tituloTelaCadastroUsuario = "Cadastro de Usuário"; // título exibido na barra superior da
																					// tela
	@FXML
	private TextField textFieldNome;
	@FXML
	private TextField textFielSobrenome;
	@FXML
	private TextField textFieldCPF;
	@FXML
	private TextField textFieldTelefone;
	@FXML
	private PasswordField passwordFieldCadastroSenha;
	@FXML
	private PasswordField passwordFieldConfirmeSenha;
	@FXML
	private TextField textFieldCadastroEmail;

	// Cadastra um novo usuário no sistema. Chamado pelo botão 'Ok'
	public void cadastrarUsuario(ActionEvent event) {
		if (UsuarioController.cadastrarUsuario(textFieldNome.getText(), textFielSobrenome.getText(),
				textFieldCPF.getText(), textFieldTelefone.getText(), passwordFieldCadastroSenha.getText(),
				passwordFieldConfirmeSenha.getText(), textFieldCadastroEmail.getText())) {
			TelaController.exibirJanela(AlertType.INFORMATION, CadastroController.tituloTelaCadastroUsuario, "Operação realizada",
					"Novo usuário cadastrado com sucesso! Nome: " + textFieldNome.getText());
			limparCamposCadastro();
		} else {
			TelaController.exibirJanela(AlertType.ERROR, CadastroController.tituloTelaCadastroUsuario, "Erro!",
					"Não foi possível cadastrar novo usuário!");
			limparCamposCadastro();
		}
	}

	// Volta para a tela de login. Chamado pelo botão 'Voltar'
	public void carregarTelaInicial(ActionEvent event) {
		TelaController.carregarTela(event, "/application/TelaInicial.fxml", LoginController.tituloTelaInicial);
	}

	// Limpa todos os campos de cadastro. Chamado internamente por outros métodos
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
