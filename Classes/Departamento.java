package revisaoClasses;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	private List<Pessoa> pessoas;
	
	public Departamento(String nome) {
		this.nome = nome;
		this.pessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	public void exibirDepartamento() {
		System.out.println("\n-------------------------");
        System.out.println("Departamento: " + nome);
        System.out.println("-------------------------");
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirPessoa();
        }
        System.out.println("-------------------------\n");
	}
	
	public String getNome() {
		return nome;
	}
	
}
