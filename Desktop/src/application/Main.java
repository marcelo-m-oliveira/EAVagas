package application;

import controller.TelaController;
import javafx.application.Application;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage cenario) {
		try {
			// carrega a tela do nome passado como par�metro, ou seja, a tela inicial do
			// sistema
			TelaController.carregarTela(null, "/application/Login.fxml", "EAVagas");
		} catch (Exception e) {
			TelaController.exibirJanela(AlertType.ERROR, "P�gina inicial", "Erro!",
					"N�o foi poss�vel carregar a p�gina inicial do sistema");
		}
	}

	public static void main(String[] args) {
		launch(args); // m�todo �nico padr�o de execu��o de uma Aplica��o FX
	}
}
