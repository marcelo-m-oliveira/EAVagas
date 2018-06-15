package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuButton;
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
	@FXML private TextField TextFieldPlaca;
    @FXML private MenuButton MenuButtonTipoVeiculo;
    @FXML private TextField TextFieldNumCartao;
	@FXML private TextField TextFieldDataCartao;
	@FXML private TextField TextFieldCodigoCartao;

	// Cadastra um novo usuário no sistema. Chamado pelo botão 'Ok'
	public void CadastrarDadosPessoais(ActionEvent event) {
    	if (UsuarioController.cadastrarUsuario(TextFieldNome.getText(),TextFielSobrenome.getText(),
    			TextFieldCPF.getText(), TextFieldTelefone.getText(),
    			PasswordFieldSenha.getText(), PasswordFieldConfirmeSenha.getText(),
    			TextFieldEmail.getText()) && VeiculoController.CadastroVeiculo(TextFieldPlaca.getText(), MenuButtonTipoVeiculo.getText()))
    		if(CartaoController.cadastraCartao(TextFieldNumCartao.getText(), TextFieldCodigoCartao.getText(), 
    				TextFieldDataCartao.getText())) {
    			TelaController.exibirJanela(AlertType.INFORMATION, CadastraCartaoController.tituloCadastroCartao, 
    					"Cadastro bem-sucedido", "Cadastro de Cartão de Crédito efetuado com sucesso!");
    			limparCamposCadastro();
    			TelaController.carregarTela(event, "/application/HomePremium.fxml", HomePremiumController.telaHomePremium);
    		}else {
		TelaController.exibirJanela(AlertType.INFORMATION, CadastroDadosPessoaisController.tituloTelaCadastroUsuario,
				"Operação realizada", "Novo usuário cadastrado com sucesso! Usuário: " + TextFieldEmail.getText());
		limparCamposCadastro();
		TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
		//TelaController.carregarTela(event, "/application/DadosVeiculo.fxml", DadosVeiculoController.tituloDadosVeiculo);
		
	}  
	else {
			
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"Não foi possível cadastrar novo usuário, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
	}
	
	public void CadastrarVeiculo(ActionEvent event) {
		if (VeiculoController.CadastroVeiculo(TextFieldPlaca.getText(),
				MenuButtonTipoVeiculo.getText())) {
			TelaController.exibirJanela(AlertType.INFORMATION, DadosVeiculoController.tituloDadosVeiculo, "Operação realizada",
					"Veículo cadastrado com sucesso!");
			//TelaController.carregarTela(event, "/application/FacaCartao.fxml", FacaCartaoController.tituloFacaCartao);
			TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
			limparCamposCadastro();
		} else {
			TelaController.exibirJanela(AlertType.ERROR, CadastroDadosPessoaisController.tituloTelaCadastroUsuario, "Erro!",
					"Não foi possível cadastrar Veículo, verifique os dados informados e tente novamente.");
			limparCamposCadastro();
		}
		
	}
	
	public void cadastrarCartao(ActionEvent event) {
    	if(CartaoController.cadastraCartao(TextFieldNumCartao.getText(), TextFieldCodigoCartao.getText(), 
    			TextFieldDataCartao.getText())) {
    		TelaController.exibirJanela(AlertType.INFORMATION, CadastraCartaoController.tituloCadastroCartao, 
    				"Cadastro bem-sucedido", "Cadastro de Cartão de Crédito efetuado com sucesso!");
    		limparCamposCadastro();
    		TelaController.carregarTela(event, "/application/HomePremium.fxml", HomePremiumController.telaHomePremium);
    	}else {
    		TelaController.exibirJanela(AlertType.ERROR, CadastraCartaoController.tituloCadastroCartao, 
    				"Falha no cadastro", "Falha ao cadastrar cartão de crédito. Verifique os dados preenchidos e tente novamente.");
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
		TextFieldNumCartao.clear();
    	TextFieldDataCartao.clear();
    	TextFieldCodigoCartao.clear();
	}

}
