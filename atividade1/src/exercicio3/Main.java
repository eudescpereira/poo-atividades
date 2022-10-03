package exercicio3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Ingresso i = new Ingresso(65);
		Vip v = new Vip(65, 15);
		CamaroteSuperior cs = new CamaroteSuperior(65,20);
		CamaroteInferior ci = new CamaroteInferior(65,10);
		
		int tipoIngresso, tipoCamarote;
		
		System.out.println("Bem vindo(a)! Qual tipo de ingresso voce deseja comprar?");
		System.out.println("1- Ingresso Normal");
		System.out.println("2- Ingresso Vip");
		tipoIngresso = input.nextInt();
		
		if (tipoIngresso == 1) {
			System.out.println("Voce escolheu: Ingresso Normal!");
			i.imprimeValor();
		} else {
			System.out.println("Voce escolheu: Ingresso Vip!");
			System.out.println("Qual tipo de ingresso VIP voce deseja comprar?");
			System.out.println("1- Camarote Superior");
			System.out.println("2- Camarote Inferior");
			tipoCamarote = input.nextInt();
			
			if (tipoCamarote == 1 ) {
				System.out.println("Voce escolheu: Camarote Superior!");
				cs.imprimeValor();
			} else {
				System.out.println("Voce escolheu: Camarote Inferior!");
				ci.imprimeValor();
			}
		} 
	
	}

}
