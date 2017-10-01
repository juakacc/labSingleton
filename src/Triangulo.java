import java.util.ArrayList;
import java.util.List;

public class Triangulo {
	
	private static Triangulo instancia;
	private static List<SingletonComNome> registradas = new ArrayList<>();
	
	/**
	 * Registra um tipo de instancia
	 * @param nome
	 * @param instancia
	 */
	public static void registrar(String nome, Triangulo instancia) {
		registradas.add(new SingletonComNome(nome, instancia));
	}
	
	public static Triangulo getInstance(String tipo) {
		instancia = encontrar(tipo);
		return instancia;
	}
	
	protected static Triangulo encontrar(String nome) {
		for (SingletonComNome singletonPar : registradas) {
			if (singletonPar.getNome().equalsIgnoreCase(nome)) {
				return singletonPar.getTriangulo();
			}
		}
		return null;
	}
}