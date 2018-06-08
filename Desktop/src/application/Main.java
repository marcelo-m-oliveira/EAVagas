package application;

import controller.TelaController;
import javafx.application.Application;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage cenario) {
		try {
			// carrega a tela do nome passado como parâmetro, ou seja, a tela inicial do
			// sistema
			TelaController.carregarTela(null, "/application/Login.fxml", "EAVagas");
		} catch (Exception e) {
			TelaController.exibirJanela(AlertType.ERROR, "Página inicial", "Erro!",
					"Não foi possível carregar a página inicial do sistema");
		}
	}

	public static void main(String[] args) {
		launch(args); // método único padrão de execução de uma Aplicação FX
	}
}
