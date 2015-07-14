public class Circulo implements AreaCalculavel {

	double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}

}
