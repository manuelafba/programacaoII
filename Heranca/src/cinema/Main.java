package cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bem-vindo ao Cinema!");
        System.out.println("\n--- Compra de Ingressos ---\n");
        System.out.println("Digite o número da opção desejada: ");
        System.out.println("1 - Ingresso Normal (R$10)");
        System.out.println("2 - Ingresso VIP (R$15)");

        int opcao = s.nextInt();
        String tipoIngresso = "";
        Ingresso ingresso = null;  
        CamaroteInferior camaroteInferior = null;
        CamaroteSuperior camaroteSuperior = null;

        switch (opcao) {
            case 1:
                tipoIngresso = "Normal";
                ingresso = new Ingresso(); 
                System.out.println("Ingresso normal selecionado");
                break;

            case 2:
                ingresso = new Vip(); 
                System.out.println("Ingresso VIP selecionado");
                System.out.println("Digite o número da opção desejada: ");
                System.out.println("1 - Camarote Inferior");
                System.out.println("2 - Camarote Superior (Adicional de R$5)");
                int opcaoVip = s.nextInt();

                switch (opcaoVip) {
                    case 1:
                    	tipoIngresso = "VIP - Camarote inferior";
                        System.out.println("Camarote Inferior selecionado");
                        System.out.println("Digite a letra da fileira: ");
                        char fileiraInf = s.next().charAt(0);
                        System.out.println("Digite o número da poltrona: ");
                        int poltronaInf = s.nextInt();
                        camaroteInferior = new CamaroteInferior(fileiraInf, poltronaInf);
                        break;

                    case 2:
                    	tipoIngresso = "VIP - Camarote superior";
                        System.out.println("Camarote Superior selecionado");
                        System.out.println("Digite a letra da fileira: ");
                        char fileiraSup = s.next().charAt(0);
                        System.out.println("Digite o número da poltrona: ");
                        int poltronaSup = s.nextInt();
                        camaroteSuperior = new CamaroteSuperior(fileiraSup, poltronaSup);
                        break;

                    default:
                        System.out.println("Categoria inválida");
                        break;
                }
                break;

            default:
                System.out.println("Categoria inválida");
                break;
        }

        if (ingresso != null) {
            double valorIngresso = ingresso.imprimeValor();  

            System.out.println("\nDeseja um combo de pipoca?");
            System.out.println("1 - Pequeno");
            System.out.println("2 - Médio");
            System.out.println("3 - Grande");
            System.out.println("4 - Sem combo");

            int opcaoPipoca = s.nextInt();
            String tipoPipoca = "";
            double valorPipoca = 0.0;

            switch (opcaoPipoca) {
                case 1:
                    tipoPipoca = "Pequena";
                    valorPipoca = 5.0;
                    break;
                case 2:
                    tipoPipoca = "Média";
                    valorPipoca = 7.50;
                    break;
                case 3:
                    tipoPipoca = "Grande";
                    valorPipoca = 10.0;
                    break;
                case 4:
                    tipoPipoca = "Sem combo";
                    valorPipoca = 0.0;
                    break;
                default:
                    System.out.println("Opção de combo inválida");
                    break;
            }

            double valorFinal = valorIngresso + valorPipoca;
            System.out.println("--- Resumo da compra ---");
            System.out.println("Tipo de ingresso: " + tipoIngresso);
            System.out.println("Valor do ingresso: R$ " + valorIngresso);
            System.out.println("Tipo de pipoca: " + tipoPipoca);
            System.out.println("Valor do combo de pipoca: R$ " + valorPipoca);
            System.out.println("Valor total da compra: R$ " + valorFinal);

            if (camaroteInferior != null) {
                camaroteInferior.imprimirLocalização();
            } else if (camaroteSuperior != null) {
                camaroteSuperior.imprimirLocalização();
            }
        } else {
            System.out.println("Nenhum ingresso selecionado.");
        }

        s.close();
    }
}
