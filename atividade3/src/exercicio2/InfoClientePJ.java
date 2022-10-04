package exercicio2;

public class InfoClientePJ extends InfoCliente {
	
	private String cnpj;
	
	public InfoClientePJ(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
