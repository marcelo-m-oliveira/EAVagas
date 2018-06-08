package controller;

import java.util.HashSet;
import java.util.Set;
import model.Veiculo;

public class VeiculoController {
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
