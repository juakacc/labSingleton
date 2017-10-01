
public class TrianguloRetangulo extends Triangulo {

	private static TrianguloRetangulo instancia;
	
	private TrianguloRetangulo() {
		
	}
	
	@Override
	public String toString() {
		return "Triangulo Retangulo";
	}

	public static TrianguloRetangulo getInstance() {
		if (instancia == null)
			instancia = new TrianguloRetangulo();
		return instancia;
	}
}
