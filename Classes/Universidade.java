package revisaoClasses;
import java.util.ArrayList;
import java.util.List;

public class Universidade {
	private String nome;
	private List<Departamento> departamentos;
	
	public Universidade(String nome) {
		this.nome = nome;
		this.departamentos = new ArrayList<>();
	}
	
	public void adicionarDepartamento(Departamento departamento) {
		if (departamentos.size() < 10) {
			this.departamentos.add(departamento);
		} else {
			System.out.println("Não é possível ter mais de 10 departamentos");
		}
	}
	
	public void exibirUniversidade() {
	    System.out.println("===========================");
	    System.out.println("Universidade: " + nome);
	    System.out.println("===========================");
	    for (Departamento departamento : departamentos) {
	    	departamento.exibirDepartamento();
	    }
	}
	
	public String getNome() {
		return nome;
	}
	
}
