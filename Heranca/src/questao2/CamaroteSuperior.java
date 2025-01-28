package questao2;

public class CamaroteSuperior extends Vip {
	private double adicionalCamarote = 5;

	public CamaroteSuperior(double valor, double valorAdicional) {
		super(valor, valorAdicional);
		this.setAdicionalCamarote(adicionalCamarote);
	}
	
	public double getAdicionalCamarote() {
		return adicionalCamarote;
	}

	public void setAdicionalCamarote(double adicionalCamarote) {
		this.adicionalCamarote = adicionalCamarote;
	}

	@Override
	public void imprimeValor() {
		System.out.println("Valor: " + super.getValor() +this.adicionalCamarote);
	}
}
