package exercicio3;

public class ContaBase implements Conta {

		public int numConta;
		private int limite;
		private String dono;
		private double saldo;
		private double salario;
		private boolean status;
		
		public ContaBase (String dono) {
			this.numConta = ((int)(Math.random()*300));
			this.dono = dono;
			this.salario = 2500;
			this.limite = 300;
			this.saldo = salario;
			this.status = false;
		}
		
		public int getNumConta() {
			return numConta;
		}
	
		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}
	
		public double getLimite() {
			return limite;
		}
	
		public void setLimite(int limite) {
			this.limite = limite;
		}
	
		public String getDono() {
			return dono;
		}
	
		public void setDono(String dono) {
			this.dono = dono;
		}
	
		public double getSaldo() {
			return saldo;
		}
	
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	
		public double getSalario() {
			return salario;
		}
	
		public void setSalario(double salario) {
			this.salario = salario;
		}
	
		public boolean isStatus() {
			return status;
		}
	
		public void setStatus(boolean status) {
			this.status = status;
		}
	
		@Override
		public boolean abrirConta() {
			return this.status = true;
		}
	
		@Override
		public boolean fecharConta() {
			return this.status = false;
		}
	
		@Override
		public void depositar(double deposito) {
			this.saldo = this.saldo + deposito;
		}
	
		@Override
		public void sacar(double saque) {
			if(getLimite() > getSalario()) {
				System.out.println("O saque nao pode ser efetuado. Valor superior ao limite!");
			} else {
				this.saldo -= saque; 
			}
		}
}