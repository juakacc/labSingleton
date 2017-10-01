
public class TrianguloIsosceles extends Triangulo {
	
	public static void registrarSub() {
		System.out.println("Aquiii");
		new TrianguloIsosceles();
	}
	
	private TrianguloIsosceles() {
		System.out.println("Entrou aqui");
		registrar("Isosceles", this);
	}
	
	@Override
	public String toString() {
		return "Triangulo Isosceles";
	}

//	public static TrianguloIsosceles getInstance() {
//		if (instancia == null)
//			instancia = new TrianguloIsosceles();
//		return instancia;
//	}
	
	
}
