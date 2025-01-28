package questao1;

public class Peixe extends Animal {
	private String caracteristica;
	
	public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String caracteristica) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.setCaracteristica(caracteristica);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override 
	public String toString() {
		return super.toString() + "\nCaracteristica: " +this.caracteristica;
	}
}
