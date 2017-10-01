
public class Main {

	public static void main(String[] args) {
		registrar();
		
		Triangulo t = Triangulo.getInstance("isosceles");
		System.out.println(t);
		
		t = Triangulo.getInstance("equilatero");
		System.out.println(t);
		
		t = Triangulo.getInstance("retangulo");
		System.out.println(t);
		
		Circulo c = Circulo.getInstancia();
		System.out.println(c);
		
		Quadrado q = new Quadrado();
		System.out.println(q);
	}
	
	/**
	 * Método para registrar os tipos de intancias possíveis,
	 * antes de serem utilizadas.
	 * Em java não encontramos uma forma de fazer isto automaticamente
	 * ao iniciar o programa. 
	 */
	private static void registrar() {
		TrianguloIsosceles.registrarSub();
		TrianguloEquilatero.registrarSub();
		TrianguloRetangulo.registrarSub();
	}
}