package cinema;

public class Normal extends Ingresso {

    public Normal() {
        super(); 
    }

    public void imprimeTipo() {
        System.out.println("Ingresso Normal");
    }

    @Override
    public double imprimeValor() {
		return this.valor;
	}
}
