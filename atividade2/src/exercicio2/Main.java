package exercicio2;

public class Main {
	
	public static void main(String[] args) {
		
		Circulo c = new Circulo();
		
		c.setRaio(10);
		
		System.out.println("A area do circulo e: " + c.area());
		System.out.println("O comprimento do circulo e: " + c.comprimento());
		
		Quadrado q = new Quadrado();
		
		q.setLado(10);
		
		System.out.println("\nA area do quadrado e: " + q.area());
		System.out.println("O comprimento do quadrado e: " + q.comprimento());
		
		Retangulo r = new Retangulo();
		
		r.setLargura(10);
		r.setAltura(2);
		
		System.out.println("\nA area do retangulo e: " + r.area());
		System.out.println("O comprimento do retangulo e: " + r.comprimento());
		
	}

}