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
	private Veiculo[] veiculo = new Veiculo[3];
	private CartaoCredito[] cartao = new CartaoCredito[2];

	public Pessoa(String nome, String sobrenome, String email, String senha, String confirmaSenha, String cpf,
			String telefone) {
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
	
	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	@Override
	// Sobrescrita do método hashCode() necessária para que o método equals()
	// funcione na comparação de usuários
	public int hashCode() {
		return 5; // valor padrão de hashCode para o Java 8, embora não seja indicado para
					// conjunto com +150000 ocorrências
	}

	@Override
		// Sobrescrita do método equals que retorna verdadeiro se dois nomes de usuário ou e-mails forem iguais
		// Necessário para evitar que dois usuários sejam cadastrados com o mesmo nome ou endereço de e-mail
		public boolean equals(Object o) {
			if (o instanceof Pessoa) {
				Pessoa usuario = (Pessoa) o;
				if (this.getNome().equals(usuario.getNome()) || (this.getEmail().equals(usuario.getEmail()) 
						|| (this.getSobrenome().equals(usuario.getSobrenome())) 
						|| (this.getTelefone().equals(usuario.getTelefone()))
						|| (this.getCpf().equals(usuario.getCpf())))) {
					return true;
				}
			}
			return false;
		}
}
