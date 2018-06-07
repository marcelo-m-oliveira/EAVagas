package controller;

import java.util.HashSet;
import java.util.Set;

import model.Pessoa;

public class UsuarioController {
    private static Set<Pessoa> conjuntoUsuarios = new HashSet<Pessoa>(); // conjunto de usuários cadastrados no sistema
	
    // Retorna verdadeiro se o usuário foi cadastrado com sucesso
	public static boolean cadastrarUsuario(String nome,String sobrenome, String cpf, String telefone, String senha, String confirmaSenha, String email) {
		if (camposPreenchidos(nome, sobrenome, cpf, telefone, senha, email, confirmaSenha)) {
			return conjuntoUsuarios.add(new Pessoa(nome, cpf, telefone, senha, email));
		} else {
			return false;
		}
	}
	
	// Retorna verdadeiro se todos os campos de cadastro estiverem preenchidos
	private static boolean camposPreenchidos(String nome, String sobrenome, String email, String senha, String confirmarSenha, String cpf, String telefone) {
		return (!nome.trim().isEmpty() && !sobrenome.trim().isEmpty() && !email.trim().isEmpty() && !senha.trim().isEmpty() && !confirmarSenha.trim().isEmpty() && !cpf.trim().isEmpty());
	}
	
	// Retorna verdadeiro se a autenticação do usuário foi realizada com sucesso
	public static boolean autenticarUsuario(String senha,  String email) {
		for (Pessoa u : conjuntoUsuarios) { // percorre a lista de usuários para encontrar o nome equivalente ao do parâmetro
			if (u.getNome().equals(email)) { // se o usuário for encontrado
				if (u.getSenha().equals(senha)) { // verifica se a senha é compatível com a passada como parâmetro
					return true;
				}
			}
		}
		return false;
	}
}
