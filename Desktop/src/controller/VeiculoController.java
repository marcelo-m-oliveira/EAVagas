package controller;

import java.util.HashSet;
import java.util.Set;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import model.Veiculo;

public class VeiculoController {
	
	 	private Label LabelDadosVeiculo;
	    private TextField TextFieldPlaca;
	    private MenuButton MenuButtonTipoVeiculo;
	    private MenuItem MenuItemCarro;
	    private MenuItem MenuItemMoto;

	    @FXML
	    private MenuItem VeicCarro;

	    @FXML
	    private MenuItem VeicMoto;

	    @FXML
	    private Button ButtonProximo;

	    @FXML
	    private CheckBox CheckBoxTermos;

	    @FXML
	    private Button ButtonVoltar;
	private static Set<Veiculo> dadosVeiculo = new HashSet<Veiculo>(); // conjunto de usuários cadastrados no sistema

	// Retorna verdadeiro se o usuário foi cadastrado com sucesso
	public static boolean CadastroVeiculo(String placaVeic, String tipoVeic) {
		if (camposPreenchidos(placaVeic, tipoVeic)) {
			return dadosVeiculo.add(new Veiculo(placaVeic, tipoVeic));
		} else {
			return false;
		}
	}

	// Retorna verdadeiro se todos os campos de cadastro estiverem preenchidos
	private static boolean camposPreenchidos(String placaVeic, String tipoVeic) {
		return (!placaVeic.trim().isEmpty() && !tipoVeic.trim().isEmpty());
	}

}
