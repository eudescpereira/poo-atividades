package exercicio4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Imovel in = new Novo("Rua Guimaraes", 1700, 300);
		Imovel iv = new Velho("Rua Almir", 1500, 200);
		
		int tipoImovel;
		
		System.out.println("Bem vindo(a)! Qual tipo de Imovel voce deseja comprar?");
		System.out.println("1- Imovel Novo");
		System.out.println("2- Imovel Velho");
		tipoImovel = input.nextInt();
		
		if (tipoImovel == 1) {
			System.out.println("Voce escolheu: Imovel Novo!");
			in.valorFinal();
		} else {
			System.out.println("Voce escolheu: Imovel Velho!");
			iv.valorFinal();
		}
		
	}

}
