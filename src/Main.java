
public class Main {

	public static void main(String[] args) {
		
//		Circulo c = Circulo.getInstancia();
//		System.out.println(c);
//		
//		Triangulo t = Triangulo.getInstance("isosceles");
//		System.out.println(t);
//		
//		Triangulo t1 = Triangulo.getInstance("equilatero");
//		System.out.println(t1);
//		
//		Triangulo t2 = Triangulo.getInstance("retangulo");
//		System.out.println(t2);
//		
//		System.out.println(new Quadrado());
		registrar();
		
		Triangulo t = Triangulo.getInstance();
		System.out.println(t);
	}
	
	
	private static void registrar() {
		TrianguloIsosceles.registrarSub();
	}

}
