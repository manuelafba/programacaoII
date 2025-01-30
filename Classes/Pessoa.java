package revisaoClasses;

public class Pessoa {
	private String nome;
	private String email;
	private int telefone;
	
	public Pessoa(String nome, String email, int telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void exibirPessoa() {
		System.out.println("Nome: " +nome);
		System.out.println("Email: " +email);
		System.out.println("Telefone " +telefone);
		System.out.println();
	}	
}
