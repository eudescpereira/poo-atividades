package exercicio1;

public class Main {

	public static void main(String[] args) {
				
				Soma s = new Soma();
				s.setValor1(10);
				s.setValor2(5);
				s.Calcula();
				
				Subtracao sub = new Subtracao();
				sub.setValor1(10);
				sub.setValor2(5);
				sub.Calcula();
				
				Multiplicacao mult = new Multiplicacao();
				mult.setValor1(10);
				mult.setValor2(5);
				mult.Calcula();
				
				Divisao div = new Divisao();
				div.setValor1(10);
				div.setValor2(5);
				div.Calcula();
	}

}
