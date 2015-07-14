
public class Teste {

	public static void main(String[] args) {
		
		AreaCalculavel q = new Quadrado(10);
		
		System.out.println(q.calculaArea());
		
		AreaCalculavel circulo = new Circulo(10);
		
		System.out.println(circulo.calculaArea());
	}
}
