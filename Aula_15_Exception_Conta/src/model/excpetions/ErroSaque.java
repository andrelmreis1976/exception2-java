package model.excpetions;

public class ErroSaque extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ErroSaque(String msg) {
		super(msg);
	}
}