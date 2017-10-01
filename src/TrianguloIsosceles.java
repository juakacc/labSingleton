
public class TrianguloIsosceles extends Triangulo {
	
	public static void registrarSub() {
		new TrianguloIsosceles();
	}
	
	private TrianguloIsosceles() {
		registrar("Isosceles", this);
	}
	
	@Override
	public String toString() {
		return "Triangulo Isosceles";
	}
	
	private int i;
	
	public void setValor(int value) {
		this.i = value;
	}

	public int getValor() {
		return i;
	}
}
