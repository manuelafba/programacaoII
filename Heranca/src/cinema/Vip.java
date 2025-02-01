package cinema;

public class Vip extends Ingresso {
	protected final double adicional = 5;
	
	public Vip() {
		super();
	}
	
	@Override
	public double imprimeValor() {
		return (this.valor + this.adicional);
	}
}
