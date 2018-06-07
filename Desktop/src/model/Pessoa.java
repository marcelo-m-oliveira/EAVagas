package model;
import model.Veiculo;

public class Pessoa {
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String telefone;
	private Veiculo[] veiculo = new Veiculo [3]; 
	private CartaoCredito[] cartao = new CartaoCredito[2]; 
	
	public Pessoa (String nome, String email, String senha, String cpf, String telefone) {
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
