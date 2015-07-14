class Funcionario {

	private String nome;
	protected double salario;

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return this.salario * 0.2;
	}

	public String getNome() {
		return nome;
	}

}