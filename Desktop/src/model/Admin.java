package model;

public class Admin extends Pessoa {

	public Admin (String nome, String email, String senha, String cpf, String confirmaSenha, String sobreNome, String telefone) {
		super(nome, email, senha, cpf, telefone, confirmaSenha, sobreNome);
	}
	
	public static void cadEstac() {
	}
	
	public static void darpermissao() {
	}
}
