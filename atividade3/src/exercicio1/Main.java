package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Gerente g = new Gerente("Roberto", 5000);
		Programador p = new Programador("Laura", 4000);
		AnalistaDeSistemas ads = new AnalistaDeSistemas("Pedro", 3000);
		
		int opcaoDados, opcaoSalario;
		
		System.out.println("Bem vindo(a)! Quais dados voce deseja vizualizar?");
		System.out.println("1- Dados do Gerente");
		System.out.println("2- Dados do Programador");
		System.out.println("3- Dados do Analista de Sistemas");
		opcaoDados = input.nextInt();
		
		if (opcaoDados == 1) {
			System.out.println("Voce escolheu: Dados do Gerente.");
			System.out.println("Nome: " + g.getNome());
			System.out.println("Salário: " + g.getSalario());
		} else if (opcaoDados == 2) {
			System.out.println("Voce escolheu: Dados do Programador");
			System.out.println("Nome: " + p.getNome());
			System.out.println("Salário: " + p.getSalario());
		} else if (opcaoDados == 3) {
			System.out.println("Voce escolheu: Dados do Analista de Sistemas");
			System.out.println("Nome: " + ads.getNome());
			System.out.println("Salário: " + ads.getSalario());
		}
		
		System.out.println("\nDe quem voce deseja aumentar o salario?");
		System.out.println("1- Gerente");
		System.out.println("2- Programador");
		System.out.println("3- Analista de Sistemas");
		opcaoSalario = input.nextInt();
		
		if (opcaoSalario == 1) {
			System.out.println("Voce escolheu: Gerente.");
			g.aumentaSalario();
		} else if (opcaoDados == 2) {
			System.out.println("Voce escolheu: Programador");
			p.aumentaSalario();
		} else if (opcaoDados == 3) {
			System.out.println("Voce escolheu: Analista de Sistemas");
			ads.aumentaSalario();
		}
		
	}

}
