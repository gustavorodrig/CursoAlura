
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario joao = new Funcionario();
		joao.setSalario(1000.0);
		
		System.out.println(joao.getBonus());
		
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		joaquim.cobraEntrega();
		
		
		System.out.println(joaquim.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(joaquim);
		
		System.out.println(totalizador.getTotal());
		
	}
	
}
