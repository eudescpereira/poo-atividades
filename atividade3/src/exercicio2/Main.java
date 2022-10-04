package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		InfoClientePF icpf = new InfoClientePF("111.222.333-44");
		InfoClientePJ icpj = new InfoClientePJ("999.888.777-66");
		
		ClienteFidelizacao cf = new ClienteFidelizacao("Alice", "Rua da paz", icpf);
		ClienteFidelizacaoEspecial cfe = new ClienteFidelizacaoEspecial("Wallmart", "Rua do mar", icpj);
		
		cf.setCompra(300);
		cfe.setCompra(300);
		
		System.out.println("Cliente Fidelizacao");
		System.out.println("Nome: " + cf.getNome());
		System.out.println("Endereco: " + cf.getEndereco());
		System.out.println("Cpf: " + icpf.getCpf());
		System.out.println("Valor do bonus: ");
		System.out.println(cf.adicionaBonus(cf.getCompra()));
		
		System.out.println("\nCliente Fidelizacao Especial");
		System.out.println("Nome: " + cfe.getNome());
		System.out.println("Endereco: " + cfe.getEndereco());
		System.out.println("Cnpj: " + icpj.getCnpj());
		System.out.println("Valor do bonus: ");
		System.out.println(cfe.adicionaBonus(cfe.getCompra()));
		

	}

}
