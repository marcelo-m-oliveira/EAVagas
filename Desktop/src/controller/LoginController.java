package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	public static final String tituloTelaInicial = "EAVagas"; // t�tulo exibido na barra superior da tela
	@FXML
	private TextField TextFieldEmail;
	@FXML
	private PasswordField PasswordFieldSenha;

	// Carrega a tela de cadastro de usu�rio. Chamado pelo bot�o 'Cadastre-se'
	public void FazerCadastro(ActionEvent event) {
		TelaController.carregarTela(event, "/application/Cadastro.fxml", CadastroDadosPessoaisController.tituloTelaCadastroUsuario);
	}

	// Autentica usu�rio, e em caso de sucesso, carrega a tela de compra de produto.
	// Chamado pelo bot�o 'Entrar'
	public void FazerLogin(ActionEvent event) {
		if (UsuarioController.autenticarUsuario(TextFieldEmail.getText(), PasswordFieldSenha.getText())) {
			TelaController.exibirJanela(AlertType.INFORMATION, LoginController.tituloTelaInicial, "Opera��o realizada!",
					"Login realizado com sucesso! Nome: " + TextFieldEmail.getText());
		} else {
			TelaController.exibirJanela(AlertType.ERROR, LoginController.tituloTelaInicial, "Erro!",
					"N�o foi poss�vel realizar login!");
		}
	}

}
