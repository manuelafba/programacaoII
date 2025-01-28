package questao1;

public class Main {
	public static void main(String args[]) {
		Mamifero camelo = new Mamifero("Camelo", 150.0, 4, "Amarelo", "Terra", 2.0, "Comida");
		Peixe tubarao = new Peixe("Tubarão", 300.0, 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
		Mamifero ursoCanada = new Mamifero("Urso-do-Canadá", 180.0, 4, "Vermelho", "Terra", 0.5, "Mel");
		
		System.out.println(ursoCanada);
		System.out.println(tubarao);
		System.out.println(camelo);
	}
	
}
