import java.util.ArrayList;
import java.util.List;

public class Triangulo {
//
//	private static TrianguloIsosceles instanciaIso;
//	private static TrianguloEquilatero instanciaEqui;
//	private static TrianguloRetangulo instanciaRet;
	
	private static Triangulo instancia;
	private static List<SingletonComNome> registradas = new ArrayList<>();
	
	public static void registrar(String nome, Triangulo instancia) {
		registradas.add(new SingletonComNome(nome, instancia));
		System.out.println(registradas);
	}
	
	public static Triangulo getInstance() {
//		if ("isosceles".equals(tipo) ) {
//			instancia = TrianguloIsosceles.getInstance();
//		} else if ("equilatero".equals(tipo)) {
//			instancia = TrianguloEquilatero.getInstance();
//		} else {
//			instancia = TrianguloRetangulo.getInstance();
//		}
//		return instancia;
		
		String nome = "Isosceles";
		instancia = encontrar(nome);
		return instancia;
	}
	
	protected static Triangulo encontrar(String nome) {
		for (SingletonComNome singletonPar : registradas) {
			if (singletonPar.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Encontrou");
				return singletonPar.getTriangulo();
			}
		}
		return null;
	}
	
//	public static TrianguloIsosceles getIsosceles() {
//		if (instanciaIso == null)
//			instanciaIso = TrianguloIsosceles.getInstancia();
//		return instanciaIso;
//	}
//	
//	public static TrianguloEquilatero getEquilatero() {
//		if (instanciaEqui == null)
//			instanciaEqui = TrianguloEquilatero.getInstancia();
//		return instanciaEqui;
//	}
//	
//	public static TrianguloRetangulo getRetangulo() {
//		if (instanciaRet == null)
//			instanciaRet = TrianguloRetangulo.getInstancia();
//		return instanciaRet;
//	}
//	
}
