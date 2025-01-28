package questao2;

public class Normal extends Ingresso {
	
	public Normal(double valor) {
		super(valor);
	}

	public void imprimeTipo() {
		System.out.println("Ingresso normal");
	}
	
	@Override
	public void imprimeValor() {
		System.out.println("Valor: " +this.getValor());
	}
}
