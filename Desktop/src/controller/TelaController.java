package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class TelaController {

	// Abre uma nova tela com o nome passado como parâmetro
	public static void carregarTela(ActionEvent evento, String nomeTela, String titulo) {
		if (evento != null) { // tem alguma tela para fechar antes
			Node telaAtual = (Node) evento.getSource();
			telaAtual.getScene().getWindow().hide(); // fecha a tela atual antes de abrir a próxima
		}
		try {
			FXMLLoader carregadorTela = new FXMLLoader(TelaController.class.getResource(nomeTela));
			Parent base = (Parent) carregadorTela.load();
			Scene cena = new Scene(base);
			Stage cenario = new Stage();
			cenario.setScene(cena);
			cenario.setTitle(titulo);
			cenario.show();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			exibirJanela(AlertType.ERROR, "Alerta de Erro", "Erro!", "Não foi possível carregar a página solicitada!");
		}
	}

	// Exibe um alerta padrão de confirmação/erro na tela atual
	public static void exibirJanela(AlertType tipoAlerta, String titulo, String cabecalho, String conteudo) {
		Alert alerta = new Alert(tipoAlerta);
		alerta.setTitle(titulo);
		alerta.setHeaderText(cabecalho);
		alerta.setContentText(conteudo);
		alerta.showAndWait();
	}

}
