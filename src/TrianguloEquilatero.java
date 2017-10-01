
public class TrianguloEquilatero extends Triangulo {
	
	public static void registrarSub() {
		new TrianguloEquilatero();
	}
	
	private TrianguloEquilatero() {
		registrar("equilatero",this);
	}
	
	@Override
	public String toString() {
		return "Triangulo Equilatero";
	}
}