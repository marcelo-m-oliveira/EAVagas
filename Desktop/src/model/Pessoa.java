package model;
import model.Veiculo;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String confirmaSenha;
	private String cpf;
	private String telefone;
	private Veiculo[] veiculo = new Veiculo [3]; 
	private CartaoCredito[] cartao = new CartaoCredito[2]; 
	
	public Pessoa (String nome, String sobrenome, String email, String senha, String confirmaSenha, String cpf, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
		this.confirmaSenha = confirmaSenha;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getEmail() {
		return email;
	}
	
	public void setSenha() {	
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
	
	public void setTelefone() {   
	 } 
	 
	 public Veiculo[] getAutomovel() { 
	    return veiculo; 
	 } 
	 
	 public CartaoCredito[] getCartao() { 
	    return cartao; 
	 }
	 
	 public void reservarVaga() {
		 
	 }
}
