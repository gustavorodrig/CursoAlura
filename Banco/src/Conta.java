
public abstract class Conta {

	protected double saldo;
	private double saldopoupanca;
	
	public abstract void atualiza(double taxa);
	

	//public abstract void deposita(double valor);
	public void deposita(double valor) throws ValorInvalidoException{
		if (valor > 0) {
			this.saldo += valor;
		} else {
			throw new ValorInvalidoException(valor);
		}
	}

	
	
	public double getSaldo() {
		return this.saldo;
	}	

	public void saca(double valor) {
		this.saldo -= valor;
	}	

	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		this.saldopoupanca = saldopoupanca;
	}

}
