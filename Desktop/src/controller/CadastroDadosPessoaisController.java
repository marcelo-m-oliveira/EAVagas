package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuButton;
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
	@FXML private TextField TextFieldPlaca;
    @FXML private MenuButton MenuButtonTipoVeiculo;
    @FXML private TextField TextFieldNumCartao;
	@FXML private TextField TextFieldDataCartao;
	@FXML private TextField TextFieldCodigoCartao;

	// Cadastra um novo usu�rio no sistema. Chamado pelo bot�o 'Ok'
	public void CadastrarDadosPessoais(ActionEvent event) {
    	if (UsuarioController.cadastrarUsuario(TextFieldNome.getText(),TextFielSobrenome.getText(),
    			TextFieldCPF.getText(), TextFieldTelefone.getText(),
    			PasswordFieldSenha.getText(), PasswordFieldConfirmeSenha.getText(),
    			TextFieldEmail.getText()) && VeiculoController.CadastroVeiculo(TextFieldPlaca.getText(), MenuButtonTipoVeiculo.getText()))
    		if(CartaoController.cadastraCartao(TextFieldNumCartao.getText(), TextFieldCodigoCartao.getText(), 
    				TextFieldDataCartao.getText())) {
    			TelaController.exibirJanela(AlertType.INFORMATION, CadastraCartaoController.tituloCadastroCartao, 
    					"Cadastro bem-sucedido", "Cadastro de Cart�o de Cr�dito efetuado com sucesso!");
    			limparCamposCadastro();
    			TelaController.carregarTela(event, "/application/HomePremium.fxml", HomePremiumController.telaHomePremium);
    		}else {
		TelaController.exibirJanela(AlertType.INFORMATION, CadastroDadosPessoaisController.tituloTelaCadastroUsuario,
				"Opera��o realizada", "Novo usu�rio cadastrado com sucesso! Usu�rio: " + TextFieldEmail.getText());
		limparCamposCadastro();
		TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
		//TelaController.carregarTela(event, "/application/DadosVeiculo.fxml", DadosVeiculoController.tituloDadosVeiculo);
		
	}  
	else {
			
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"N�o foi poss�vel cadastrar novo usu�rio, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
	}
	
	public void CadastrarVeiculo(ActionEvent event) {
		if (VeiculoController.CadastroVeiculo(TextFieldPlaca.getText(),
				MenuButtonTipoVeiculo.getText())) {
			TelaController.exibirJanela(AlertType.INFORMATION, DadosVeiculoController.tituloDadosVeiculo, "Opera��o realizada",
					"Ve�culo cadastrado com sucesso!");
			//TelaController.carregarTela(event, "/application/FacaCartao.fxml", FacaCartaoController.tituloFacaCartao);
			TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
			limparCamposCadastro();
		} else {
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"N�o foi poss�vel cadastrar Ve�culo, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
		
	}
	
	public void cadastrarCartao(ActionEvent event) {
    	if(CartaoController.cadastraCartao(TextFieldNumCartao.getText(), TextFieldCodigoCartao.getText(), 
    			TextFieldDataCartao.getText())) {
    		TelaController.exibirJanela(AlertType.INFORMATION, CadastraCartaoController.tituloCadastroCartao, 
    				"Cadastro bem-sucedido", "Cadastro de Cart�o de Cr�dito efetuado com sucesso!");
    		limparCamposCadastro();
    		TelaController.carregarTela(event, "/application/HomePremium.fxml", HomePremiumController.telaHomePremium);
    	}else {
    		TelaController.exibirJanela(AlertType.ERROR, CadastraCartaoController.tituloCadastroCartao, 
    				"Falha no cadastro", "Falha ao cadastrar cart�o de cr�dito. Verifique os dados preenchidos e tente novamente.");
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
		TextFieldNumCartao.clear();
    	TextFieldDataCartao.clear();
    	TextFieldCodigoCartao.clear();
	}

}
