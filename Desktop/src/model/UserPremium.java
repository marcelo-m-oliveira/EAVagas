package model;

import java.util.Scanner;

public class UserPremium extends Pessoa {

	private String numCard;
	private Pagamento Pa1;
	
	public UserPremium (String nome, String email, String senha, String cpf, String telefone, String numCard ) {
		super(nome, email, senha, cpf, telefone);
		this.numCard = numCard;
	}
	
	public String getNumCard() {
		return numCard;
	}
}
	/*public static void reatVaga() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Selecione o tempo adicional para a vaga: "
				+ "\n1 - 30 min"
				+ "\n2 - 1 hora"
				+ "\n3 - 1 hora e 30 min"
				+ "\n4 - 2 horas");
		leitor.nextInt(); leitor.nextLine();
		if (leitor = 1) {
			
		}
	}
	
	public static void fazPagamento() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Selecione o metodo de pagamento: "
				+ "\n1 - MasterCard"
				+ "\n2 - Visa"
				+ "\n3 - Hipercard");
		leitor.nextInt(); leitor.nextLine();
	}
}*/
