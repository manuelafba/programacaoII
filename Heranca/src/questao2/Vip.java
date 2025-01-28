package questao2;

public class Vip extends Ingresso {
	private double valorAdicional = 10;
	
	public Vip(double valor, double valorAdicional) {
		super(valor);
		this.setValorAdicional(valorAdicional); 
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public void imprimeValor() {
		System.out.println("Valor: " + super.getValor() + this.valorAdicional);
	}
}
