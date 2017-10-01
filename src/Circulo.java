
public class Circulo {

	private static Circulo instancia;
	
	private Circulo() {
	}
	
	public static Circulo getInstancia() {
		if (instancia == null)
			instancia = new Circulo();
		return instancia;
	}
	
	@Override
	public String toString() {
		return "Circulo";
	}
}
