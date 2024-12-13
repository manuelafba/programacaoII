package revisaoClasses;

public class Main {
	public static void main(String[]args) {
		// Questão 1
		Pessoa Manuela = new Pessoa("Manuela", "manuela@gmail.com", 123456789);
		Pessoa Mariana = new Pessoa("Mariana", "mariana@gmail.com", 987654321);
		Pessoa Tiago = new Pessoa("Tiago", "tiago@gmail.com", 248562849);
		Pessoa Bella = new Pessoa("Bella", "bella@gmail.com", 112233445);
		Pessoa Maria = new Pessoa("Maria", "maria@gmail.com", 985748345);
		Pessoa Luiza = new Pessoa("Luiza", "luiza@gmail.com", 846238593);
		
		Departamento computacao = new Departamento("Departamento de Computação");
		Departamento artes = new Departamento("Departamento de Artes");
		Departamento medicina = new Departamento("Departamento de Medicina");
		
		Universidade ufpa = new Universidade("Universidade Federal do Pará");
		
		computacao.adicionarPessoa(Manuela);
		computacao.adicionarPessoa(Tiago);
		
		artes.adicionarPessoa(Mariana);
		artes.adicionarPessoa(Bella);
		
		medicina.adicionarPessoa(Maria);
		medicina.adicionarPessoa(Luiza);
		
		ufpa.adicionarDepartamento(computacao);
		ufpa.adicionarDepartamento(artes);
		ufpa.adicionarDepartamento(medicina);
		
		ufpa.exibirUniversidade();
		
		// Questão 2
		Elevador elevador = new Elevador(5, 8);
		
		for (int i = 0; i < elevador.getCapacidade(); i++) {
			elevador.Entra();
		}
		
		for (int i = elevador.getQtdPessoas(); i > 0; i--) {
			elevador.Sai();
		}
		
		for (int i = 0; i < elevador.getTotalAndares(); i++) {
			elevador.Sobe();
		}
		
		for (int i = elevador.getAndarAtual(); i > 0; i--) {
			elevador.Desce();
		}
	}

}
