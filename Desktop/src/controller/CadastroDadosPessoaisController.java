package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroDadosPessoaisController {

	public static final String tituloTelaCadastroUsuario = "Cadastro de Usu�rio"; // t�tulo exibido na barra superior da tela
	@FXML private TextField TextFieldNome;
	@FXML private TextField TextFielSobrenome;
	@FXML private TextField TextFieldCPF;
	@FXML private TextField TextFieldTelefone;
	@FXML private PasswordField PasswordFieldSenha;
	@FXML private PasswordField PasswordFieldConfirmeSenha;
	@FXML private TextField TextFieldEmail;

	// Cadastra um novo usu�rio no sistema. Chamado pelo bot�o 'Ok'
	public void CadastrarDadosPessoais(ActionEvent event) {
    	if (UsuarioController.cadastrarUsuario(TextFieldNome.getText(),TextFielSobrenome.getText(),
    			TextFieldCPF.getText(), TextFieldTelefone.getText(),
    			PasswordFieldSenha.getText(), PasswordFieldConfirmeSenha.getText(),
    			TextFieldEmail.getText())) {
		TelaController.exibirJanela(AlertType.INFORMATION, CadastroDadosPessoaisController.tituloTelaCadastroUsuario,
				"Opera��o realizada", "Novo usu�rio cadastrado com sucesso! Usu�rio: " + TextFieldEmail.getText());
		limparCamposCadastro();
		TelaController.carregarTela(event, "/application/DadosVeiculo.fxml", DadosVeiculoController.tituloDadosVeiculo);
	}  else {
			
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
		TextFieldNome.clear();
		TextFielSobrenome.clear();
		TextFieldCPF.clear();
		TextFieldTelefone.clear();
		TextFieldEmail.clear();
		PasswordFieldSenha.clear();
		PasswordFieldConfirmeSenha.clear();
	}

}
