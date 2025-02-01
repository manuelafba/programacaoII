package pokemon;

public class Ataque {
    private String nome;
    private TipoPokemon tipo;
    private int efeitoDefesa; 
    private int dano;
    private StatusPokemon efeitoStatus; 

    public Ataque(String nome, TipoPokemon tipo, int efeitoDefesa, int dano) {
        this(nome, tipo, efeitoDefesa, dano, null);
    }

    public Ataque(String nome, TipoPokemon tipo, int efeitoDefesa, int dano, StatusPokemon efeitoStatus) {
        this.nome = nome;
        this.tipo = tipo;
        this.efeitoDefesa = efeitoDefesa;
        this.dano = dano;
        this.efeitoStatus = efeitoStatus;
    }

    public String getNome() {
        return nome;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public int getEfeitoDefesa() {
        return efeitoDefesa;
    }

    public int getDano() {
        return dano;
    }

    public StatusPokemon getEfeitoStatus() {
        return efeitoStatus;
    }
}
