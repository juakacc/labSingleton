
public class TrianguloRetangulo extends Triangulo {

	public static void registrarSub() {
		new TrianguloRetangulo();
	}
	
	private TrianguloRetangulo() {
		registrar("retangulo", this);
	}
	
	@Override
	public String toString() {
		return "Triangulo Retangulo";
	}
}
