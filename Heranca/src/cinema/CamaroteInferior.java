package cinema;

public class CamaroteInferior extends Vip {
	private char filera;
	private int poltrona;
	
	public CamaroteInferior(char fileira, int poltrona) {
		super();
		this.filera = fileira;
		this.poltrona = poltrona;
	}

	public char getFilera() {
		return filera;
	}

	public void setFilera(char filera) {
		this.filera = filera;
	}

	public int getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}
	
	public void imprimirLocalização() {
		System.out.println("Localização: " +this.filera+ "-" +this.poltrona);
	}
	
	@Override
	public double imprimeValor() {
		return (this.valor + this.adicional);
	}
}
