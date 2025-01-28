package questao2;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite 1 para normal ou 2 para VIP");
		int opcao = s.nextInt();
		
		if (opcao == 1) {
			Normal ingressoNormal = new Normal(0);
			System.out.println(ingressoNormal);
		} if (opcao == 2) {
			System.out.println("Digite 1 para camarote superior ou 2 para camarote inferior");
			int opcaoCamarote = s.nextInt();
			if (opcaoCamarote == 1) {
				CamaroteSuperior superior = new CamaroteSuperior(0,0); 
				System.out.println(superior);
			}
		}
		
	}
}
