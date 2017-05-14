package model;

public class Modalidade {
	private String nome;
	
	public Modalidade(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome +" ";
	}
}
