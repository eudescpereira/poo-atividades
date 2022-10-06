package exercicio3;

import java.util.Scanner;

public class Main {
	
		public static void menu(){
			
	        System.out.println("\n1. Criar uma Conta Normal");
	        System.out.println("2. Criar uma Conta Especial");
	        System.out.println("3. Verificar Status da minha conta");
	        System.out.println("4. Realizar um deposito");
	        System.out.println("5. Realizar um saque");
	        System.out.println("6. Fechar Conta");
	        System.out.println("7. Fechar Menu.");
	    }
		
		public static void menu2() {
			
	        System.out.println("\n1. Verificar Status da minha conta");
		System.out.println("2. Realizar um deposito");
	        System.out.println("3. Realizar um saque");
	        System.out.println("4. Fechar Conta");
	        System.out.println("5. Fechar Menu.");
	    }
		
		public static void main(String[] args) {
			
			 Scanner input = new Scanner(System.in);
		
			 String dono = null;
			 double saque = 0.0;
			 double deposito = 0.0;
			 int opcaoMenu1 = 0;
			 int opcaoMenu2 = 0;
			 
			 System.out.println("Sistema de Contas Bancarias");
			 
			 ContaBase cb = new ContaBase(dono);
			 
			 do {
				 menu();
				 opcaoMenu1 = input.nextInt();
				 
				 if (opcaoMenu1 == 1){
					System.out.print("Seu nome: ");
					dono = input.next();
					cb.setDono(dono);
					cb.abrirConta();
					System.out.println("\nConta Aberta com sucesso!");
					 
				 } else if(opcaoMenu1 == 2) {
					System.out.print("Seu nome: ");
					dono = input.next();
						 
					ContaEspecial ce = new ContaEspecial (dono);
					ce.abrirConta();
					System.out.println("\nConta Aberta com sucesso!");
						 
					System.out.println("\nSistema de Contas Bancarias Especial");
						 
						 do {

							 menu2();
							 opcaoMenu2 = input.nextInt();

							 if(opcaoMenu2 == 1) {
								System.out.println("\nInformacoes sobre a Conta Especial: ");
								System.out.println("Dono da Conta: " + ce.getDono());
								System.out.println("Numero da Conta: " + ce.getNumConta());
								System.out.println("Saldo: " + ce.getSaldo());

							 } else if(opcaoMenu2 == 2) {

								 if(ce.isStatus()) {
									System.out.print("\nInforme o Valor do Deposito: ");
									deposito = input.nextDouble();
									ce.depositar(deposito);
									System.out.println("\nDeposito Realizado com sucesso!");
								 } else {
									System.out.println("\nAcao nao concluida.\nRazao: Voce precisa ter uma conta aberta.");
								 }

							 } else if(opcaoMenu2 == 3) {

								 if (ce.isStatus() == true && saque < ce.getSaldo()) {
								 	System.out.print("\nValor do Saque: ");
									saque = input.nextDouble();
									ce.sacar(saque);
									System.out.println("\nSaque Realizado com sucesso!");

								 } else if (ce.getSaldo() == 0){
									System.out.println("\nAcao nao concluida.\nRazao: Nao ha nada para sacar!");

								 } else if (saque > ce.getSaldo()){
									System.out.println("\nAcao nao concluida. \nRazao: O saque nao pode ser maior que o seu saldo!");

								 } else if (ce.isStatus() == false) {
									System.out.println("\nAcao nao concluida.\nRazao: Voce precisa de uma conta aberta.");
								}

							} else if(opcaoMenu2 == 4) {
								ce.fecharConta();
								System.out.println("\nConta Especial fechada com sucesso!");
								 
							}  else {
								System.out.println("\nMenu fechado.");
							}
						 
						 } while(opcaoMenu2 < 5);
						 
				} else if(opcaoMenu1 == 3) {
					System.out.println("\nInformacoes sobre a Conta: ");
					System.out.println("Dono da Conta: " + cb.getDono());
					System.out.println("Numero da Conta: " + cb.getNumConta());
					System.out.println("Saldo: " + cb.getSaldo());
	
			        } else if(opcaoMenu1 == 4) {
			        	
			        	if(cb.isStatus()) {
						System.out.print("\nInforme o Valor do Deposito: ");
						deposito = input.nextDouble();
						cb.depositar(deposito);
						System.out.println("\nDeposito Realizado com sucesso!");
						
					} else {
						System.out.println("\nAcao nao concluida.\nRazao: Voce precisa ter uma conta aberta.");
						
					}
			        	
			        } else if(opcaoMenu1 == 5) {
			        	
			        	 if (cb.isStatus() == true && saque < cb.getSaldo()) {
						System.out.print("\nValor do Saque: ");
						saque = input.nextDouble();
						cb.sacar(saque);
						System.out.println("\nSaque Realizado com sucesso!");
							 
					 } else if (cb.getSaldo() == 0){
						System.out.println("\nAcao nao concluida.\nRazao: Nao ha nada para sacar!");

					 } else if (saque > cb.getSaldo()){
						System.out.println("\nAcao nao concluida. \nRazao: O saque nao pode ser maior que o seu saldo!");

					 } else if (cb.isStatus() == false) {
						System.out.println("\nAcao nao concluida.\nRazao: Voce precisa de uma conta aberta.");
					}
			        	 
			        } else if(opcaoMenu1 == 6) {
			        	cb.fecharConta();
					System.out.println("\nConta fechada com sucesso!");
			        	
			        } else {
					System.out.println("\nMenu fechado.");
			          
			        }
				 
			} while(opcaoMenu1 < 7 && opcaoMenu2 < 5);
		}
	
}
