package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, operacao;
		
		System.out.println("Bem vindo(a)! Para comecar, digite dois numeros reais.");
		System.out.println("Primeiro Numero: " );
		a = input.nextInt();
		System.out.println("Otimo! Agora digite o segundo numero: ");
		b = input.nextInt();
		System.out.println("Perfeito! Agora informe a operacao matematica voce deseja realizar.");
		System.out.println("1- Soma");
		System.out.println("2- Subtracao");
		System.out.println("3- Multplicacao");
		System.out.println("2- Divisao");
		operacao = input.nextInt();
		
		if (operacao == 1) {
			Soma soma = new Soma(a, b);
			System.out.println("O resultado da soma e: " + soma.Calcula(a, b));
		} else if (operacao == 2){
			Subtracao sub = new Subtracao(a, b);
			System.out.println("O resultado da subtracao e: " + sub.Calcula(a, b));
		} else if (operacao ==  3){
			Multiplicacao mult = new Multiplicacao(a, b);
			System.out.println("O resultado da multplicacao e: " + mult.Calcula(a, b));
		} else if (operacao == 4){
			Divisao div = new Divisao(a, b);
			System.out.println("O resultado da divisao e: " + div.Calcula(a, b));
		}
		
	}

}
