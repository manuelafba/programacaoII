package prog2;

import java.util.ArrayList;
public class Agenda {
	 private ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public Agenda(Contato contatos) {
		this.contatos.add(contatos);
	}
	
	public void adicionaContato(Contato contato) {
		this.contatos.add(contato);
	}
	
	public Contato buscaContato(String nome) {
		for (int i = 0; i <= contatos.size(); i++) {
			if (this.contatos.get(i).getNome() == nome) {
				return contatos.get(i);
			}
		}
		return null;
	}
	
	public void excluiContato(String nome) {
		for (int i = 0; i <= contatos.size(); i++) {
			if (this.contatos.get(i).getNome() == nome) {
				this.contatos.remove(i);
				System.out.println("Contato" +nome+ "deletado");
			} else {
				System.out.println("Contato não encontrado");
			}
		}
	}
	
	public void exibeAgenda() {
		for (int i = 0; i <= this.contatos.size(); i++) {
			System.out.println("Nome: " +this.contatos.get(i).getNome());
			System.out.println("Email: " +this.contatos.get(i).getEmail());
		}
	}
}
