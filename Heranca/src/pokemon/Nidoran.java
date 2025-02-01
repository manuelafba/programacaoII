package pokemon;

public class Nidoran extends Pokemon {
    public Nidoran() {
        super("Nidoran", 46, 57, 40, 50, 40, StatusPokemon.OK, TipoPokemon.VENENO);

        adicionarAtaque(new Ataque("Poison Sting", TipoPokemon.VENENO, 0, 15, null));
        adicionarAtaque(new Ataque("Double Kick", TipoPokemon.LUTADOR, 0, 30, null));
        adicionarAtaque(new Ataque("Leer", TipoPokemon.NORMAL, -1, 0, null));  
        adicionarAtaque(new Ataque("Toxic", TipoPokemon.VENENO, 0, 0, StatusPokemon.ENVENENADO));  
    }
}
