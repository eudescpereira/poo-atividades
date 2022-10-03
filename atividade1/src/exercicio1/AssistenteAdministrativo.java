package exercicio1;

public class AssistenteAdministrativo extends Assistente{
	
	private String turno;
	
	public AssistenteAdministrativo(String nome, double salario, int matricula, String turno) {
		super(nome, salario, matricula);
		this.turno = turno;
	}
	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double adicional() {
		if(this.turno.equalsIgnoreCase("noite")) {
			return getSalario() + 1000;
		} else {
			return getSalario();
		}
	}

	@Override
	public double GanhoAnual() {
		
		if(this.turno.equalsIgnoreCase("noite")) {
			return (super.GanhoAnual() + 1000)*13;
		} else {
			return getSalario()*13;
		}

	}
	
	@Override
	void exibeDados() {
		System.out.println("Nome do Assistente Administrativo: " + super.getNome());
		System.out.println("Número de matrícula do Assistente Administrativo: " + super.getMatricula());
		System.out.println("Salário do Assistente Administrativo: " + super.getSalario());
		System.out.println("Turno: " + turno);
		System.out.println("Salário com adicional noturno: " + adicional());
		System.out.println("Ganho anual do Assistente Administrativo: " + super.GanhoAnual());
	}
	
}
