package revisaoClasses;

public class Elevador {
	private int totalAndares;
	private int capacidade;
	private int andarAtual;
	private int qtdPessoas;
	
	public Elevador(int totalAndares, int capacidade) {
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}
	
	public void Entra() {
		if (this.qtdPessoas < this.capacidade) {
			this.qtdPessoas++;
			System.out.println("Uma pessoa entrou no elevador");
		} else {
			System.out.println("Elevador cheio!");
		}
	}
	
	public void Sai() {
		if (this.qtdPessoas > 0) {
			this.qtdPessoas--;
			System.out.println("Uma pessoa saiu do elevador");
		} else {
			System.out.println("Elevador vazio!");
		}
	}
	
	public void Sobe() {
		if (this.andarAtual < this.totalAndares) {
			this.andarAtual++;
			System.out.println("Elevador subindo");
		} else {
			System.out.println("Elevador no último andar!");
		}
	}
	
	public void Desce() {
		if (this.andarAtual > 0) {
			this.andarAtual--;
			System.out.println("Elevador descendo");
		} else {
			System.out.println("Elevador no térreo!");
		}
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
}
