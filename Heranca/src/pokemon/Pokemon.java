package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nome;
    private int hp, ataque, defesa, velocidade, especial;
    private StatusPokemon status;
    private TipoPokemon tipo;
    private List<Ataque> ataques;

    public Pokemon(String nome, int hp, int ataque, int defesa, int velocidade, int especial,
                   StatusPokemon status, TipoPokemon tipo) {
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.especial = especial;
        this.status = status;
        this.tipo = tipo;
        this.ataques = new ArrayList<>();
    }

    public void adicionarAtaque(Ataque ataque) {
        ataques.add(ataque);
    }

    public void reduzirDefesa() {
        if (defesa > 1) {
            defesa--;
            System.out.println(nome + " teve a Defesa reduzida! Nova Defesa: " + defesa);
        } else {
            System.out.println(nome + " já está com a menor Defesa possível!");
        }
    }

    public void aplicarStatus(StatusPokemon novoStatus) {
        if (status == StatusPokemon.OK) {
            status = novoStatus;
            System.out.println(nome + " agora está " + status + "!");
        } else {
            System.out.println(nome + " já está com um status e não pode ser afetado por " + novoStatus + "!");
        }
    }

    public void usarAtaque(String ataqueNome, Pokemon alvo) {
    	for (Ataque ataque : ataques) {
    		if (ataque.getNome() == ataqueNome) {
    			System.out.println(nome + " usou " + ataque.getNome() + "!");
    			
    			if (ataque.getDano() > 0) {
    	            int dano = ataque.getDano();
    	            alvo.hp = Math.max(0, alvo.hp - dano);
    	            System.out.println("Causou " + dano + " de dano. HP de "+alvo.nome+ " agora: " + alvo.hp);
    	        } else if (ataque.getEfeitoDefesa() < 0) {
    	            alvo.reduzirDefesa();
    	        } else if (ataque.getEfeitoStatus() != null) {
    	            alvo.aplicarStatus(ataque.getEfeitoStatus());
    	        }
    			return;
    		}
    	}
    	System.out.println(nome + " não conhece o ataque " + ataqueNome + "!");
    }

    public int getDefesa() {
        return defesa;
    }
    
    
    public void imprimirDescricao() {
        System.out.println("Pokemon: " + nome +
                           "\nHP: " + hp + 
                           "\nAtaque: " + ataque + 
                           "\nDefesa: " + defesa + 
                           "\nVelocidade: " + velocidade + 
                           "\nEspecial: " + especial + 
                           "\nStatus: " + status + 
                           "\nTipo: " + tipo);

        System.out.println("Ataques:");
        for (Ataque ataque : ataques) {
            System.out.println("- " + ataque.getNome() +
                               " | Tipo: " + ataque.getTipo() +
                               " | Dano: " + ataque.getDano() +
                               (ataque.getEfeitoDefesa() < 0 ? " | Reduz defesa!" : "") +
                               (ataque.getEfeitoStatus() != null ? " | Muda o status do oponente para " + ataque.getEfeitoStatus() : ""));
        }
        System.out.println("");
    }

}
