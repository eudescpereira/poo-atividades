package exercicio2pt2;

public class Main {
	
	public static void main(String[] args) {
		
		Rica r = new Rica("Clara", 22, 100000);
		System.out.println("Nome da  pessoa rica: " + r.getNome());
		System.out.println("Idade da pessoa rica: " + r.getIdade());
		System.out.println("Fortuna: " + r.getDinheiro());
		
		System.out.println(r.fazCompras());
		
		Pobre p = new Pobre("Sebastiao", 45);
		System.out.println("\nNome da  pessoa pobre: " + p.getNome());
		System.out.println("Idade da pessoa pobre: " + p.getIdade());
		
		System.out.println(p.trabalha());
		
		Miseravel m = new Miseravel("Diego", 34);
		System.out.println("\nNome do Mendigo: " + m.getNome());
		System.out.println("Idade da Mendigo: " + m.getIdade());
		
		System.out.println(m.mendiga());
	}

}
