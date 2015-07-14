public class ContaCorrente extends Conta implements Tributavel {

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	//@Override
	//public void deposita(double valor) {
	//		this.saldo += valor;
	//}

	@Override
	public double calculaTributos() {
		return this.saldo * 0.01;
	}
}
