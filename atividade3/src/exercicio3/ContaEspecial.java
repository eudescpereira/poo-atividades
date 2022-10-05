package exercicio3;

public class ContaEspecial extends ContaBase {
	
	public ContaEspecial(String dono) {
		super(dono);
		super.setLimite((int)(Math.random()*super.getSalario()*3));
		super.setNumConta((int)(Math.random()*300));
		super.setDono(dono);
		super.setSalario(getSalario());
		super.setSaldo(super.getSalario());
		super.setStatus(false);
	
	}

}