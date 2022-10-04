package exercicio2;

public class InfoClientePF extends InfoCliente {
	
	private String cpf;
	
	public InfoClientePF(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
