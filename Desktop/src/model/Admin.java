package model;
import java.util.Scanner;

public class Admin extends Pessoa {
	
	//
	//

	public Admin (String nome, String email, String senha, String cpf, String telefone) {
		super(nome, email, senha, cpf, telefone);
	}
	
	/*public static void cadEstac() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o nome do estacionamento: ");
		leitor.nextLine();
		System.out.println("Informe a quantidade de vagas do estacionamento: ");
		leitor.nextInt(); leitor.nextLine();
	}
	
	public static void permissao() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o id do usuario para permiss�o: ");
		leitor.nextInt(); leitor.nextLine();
		System.out.println("Deseja dar permiss�o para o usu�rio? Digite S para SIM ou digite N para N�O.");
		leitor.nextLine();
	}*/
}
