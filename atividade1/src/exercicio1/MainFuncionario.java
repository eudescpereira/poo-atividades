package exercicio1;

public class MainFuncionario {
		
		public static void main(String[] args) {
			
			Funcionario f = new Funcionario("Eudes Pereira", 3000);
			System.out.println("Dados do Funcionário\n");
			f.exibeDados();
			
			f.addAumento(1000);
			
			System.out.println("\nDados Atualizados\n");
			
			f.exibeDados();
			
			Assistente a = new Assistente("Samara", 2000, 1);
			
			System.out.println("\nDados do Assistente\n");
			a.exibeDados();
			
			a.addAumento(500);
			
			System.out.println("\nDados atualizados\n");
			
			a.exibeDados();
			
			AssistenteTecnico aT = new AssistenteTecnico("Eduarda", 2500, 2, 500);
			
			System.out.println("\nDados do Assistente Técnico\n");
			aT.exibeDados();
			
			AssistenteAdministrativo aA = new AssistenteAdministrativo("Bruna", 3000, 3, "noite");
			
			System.out.println("\nDados do Assistente Administrativo\n");
			aA.exibeDados();
		
		}
		
}
