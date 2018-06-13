package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroDadosPessoaisController {

	public static final String tituloTelaCadastroUsuario = "Cadastro de Usuário"; // título exibido na barra superior da tela
	@FXML private TextField TextFieldNome;
	@FXML private TextField TextFielSobrenome;
	@FXML private TextField TextFieldCPF;
	@FXML private TextField TextFieldTelefone;
	@FXML private PasswordField PasswordFieldSenha;
	@FXML private PasswordField PasswordFieldConfirmeSenha;
	@FXML private TextField TextFieldEmail;

	// Cadastra um novo usuário no sistema. Chamado pelo botão 'Ok'
	public void CadastrarDadosPessoais(ActionEvent event) {
    	if (UsuarioController.cadastrarUsuario(TextFieldNome.getText(),TextFielSobrenome.getText(),
    			TextFieldCPF.getText(), TextFieldTelefone.getText(),
    			PasswordFieldSenha.getText(), PasswordFieldConfirmeSenha.getText(),
    			TextFieldEmail.getText())) {
		TelaController.exibirJanela(AlertType.INFORMATION, CadastroDadosPessoaisController.tituloTelaCadastroUsuario,
				"Operação realizada", "Novo usuário cadastrado com sucesso! Usuário: " + TextFieldEmail.getText());
		limparCamposCadastro();
		TelaController.carregarTela(event, "/application/DadosVeiculo.fxml", DadosVeiculoController.tituloDadosVeiculo);
	}  else {
			
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"Não foi possível cadastrar novo usuário, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
	}
	
	// Volta para a tela de login. Chamado pelo botão 'Voltar'
	public void TelaInicial(ActionEvent event) {
		TelaController.carregarTela(event, "/application/Login.fxml", LoginController.tituloTelaInicial);
	}

	// Limpa todos os campos de cadastro. Chamado internamente por outros métodos
	private void limparCamposCadastro() {
		TextFieldNome.clear();
		TextFielSobrenome.clear();
		TextFieldCPF.clear();
		TextFieldTelefone.clear();
		TextFieldEmail.clear();
		PasswordFieldSenha.clear();
		PasswordFieldConfirmeSenha.clear();
	}

}
