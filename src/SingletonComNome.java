
public class SingletonComNome {
	
	private String nome;
	private Triangulo triangulo;
	
	
	public SingletonComNome(String nome, Triangulo triangulo) {
		this.nome = nome;
		this.triangulo = triangulo;
	}
	
	public String getNome() {
		return nome;
	}

	public Triangulo getTriangulo() {
		return triangulo;
	}
}
