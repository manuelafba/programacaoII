package pokemon;

public class Main {
	public static void main(String[]args) {
		Pikachu pikachu = new Pikachu();
		Nidoran nidoran = new Nidoran();
		pikachu.imprimirDescricao();
		nidoran.imprimirDescricao();
		
		pikachu.usarAtaque("Thundershock", nidoran);
		nidoran.usarAtaque("Toxic", pikachu);
		pikachu.usarAtaque("Tail Whip", nidoran);
	}
}
