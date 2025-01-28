package questao2;

public class CamaroteInferior extends Vip {
	private String localizacao;

	public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
		super(valor, valorAdicional);
		this.setLocalizacao(localizacao);
	}
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	@Override
	public void imprimeValor() {
		System.out.println("Valor: " + super.getValor() + this.getValorAdicional() + "Localização: " +this.localizacao);
	}
}
