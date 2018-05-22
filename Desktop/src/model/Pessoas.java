package model;
import model.Veiculos;

public class Pessoas {
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String telefone;
	private Veiculos Car;
	
	public Pessoas (String nome, String email, String senha, String cpf, String telefone) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
}
