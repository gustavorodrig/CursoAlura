
public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(double valor) {
		super("Valor n�o pode ser negativo: " + valor);
	}

}
