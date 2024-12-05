package prog2;

public class Main {
	public static void main(String[]args) {
		Contato Manu = new Contato("Manu", "manuela@gmail.com");
		Contato Tiago = new Contato("Tiago", "tiago@gmail.com");
		
		Agenda agenda = new Agenda(Manu);
		agenda.adicionaContato(Tiago);
		agenda.excluiContato("Manu");
		agenda.exibeAgenda();
	}
}
