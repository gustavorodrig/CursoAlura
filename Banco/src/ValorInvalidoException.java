
public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(double valor) {
		super("Valor não pode ser negativo: " + valor);
	}

}
