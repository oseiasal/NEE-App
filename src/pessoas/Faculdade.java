package pessoas;

public class Faculdade {
	private String nome;
	private int notaDoMec;

	public Faculdade(String nome, int nota) {
		this.nome = nome;
		this.notaDoMec = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNotaDoMec() {
		return notaDoMec;
	}

	public void setNotaDoMec(int notaDoMec) {
		this.notaDoMec = notaDoMec;
	}

}
