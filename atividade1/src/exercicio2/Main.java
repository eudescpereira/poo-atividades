package exercicio2;

public class Main {
	
	public static void main(String[] args) {
		
		Gato gatinho1 = new Gato("Romeu", "Gato Siames");
		System.out.println("Nome do gatinho: " + gatinho1.getNome());
		System.out.println("Raca do gatinho: " + gatinho1.getRaca());
		System.out.println(gatinho1.caminha());
		System.out.println(gatinho1.mia());
		
		Cachorro doguinho1 = new Cachorro("Marley", "Cachorro Labrador");
		
		System.out.println("\nNome do doguinho: " + doguinho1.getNome());
		System.out.println("Raca do doguinho: " + doguinho1.getRaca());
		System.out.println(doguinho1.caminha());
		System.out.println(doguinho1.late());
	}

}
