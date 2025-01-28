package questao2;

public class Ingresso {
	private double valor = 10;
	
	public Ingresso(double valor) {
		this.setValor(valor);
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void imprimeValor() {
		System.out.println("Valor: " +this.valor);
	}
}
