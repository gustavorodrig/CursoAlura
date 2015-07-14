public class TestaDeposita {
	public static void main(String[] args) throws ValorInvalidoException{

		String[] ss = new String[Integer.MAX_VALUE];
		Conta c = new ContaCorrente();
		try {
			c.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
