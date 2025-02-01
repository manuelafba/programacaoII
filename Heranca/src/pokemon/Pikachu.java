package pokemon;

public class Pikachu extends Pokemon {
	
    public Pikachu() {
        super("Pikachu", 35, 55, 40, 90, 50,StatusPokemon.OK, TipoPokemon.ELETRICO);
        
        adicionarAtaque(new Ataque("Thundershock", TipoPokemon.ELETRICO, 0, 40, null));
        adicionarAtaque(new Ataque("Quick Attack", TipoPokemon.NORMAL, 0, 40, null));
        adicionarAtaque(new Ataque("Tail Whip", TipoPokemon.NORMAL, -1, 0, null)); 
        adicionarAtaque(new Ataque("Thunder Wave", TipoPokemon.ELETRICO, 0, 0, StatusPokemon.PARALISADO)); 
    }
}
