 import java.util.Scanner;

public class Algoritmo_494 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int i, c, t, t1;
        String[] nome = new String[3];
        String[] profissao = new String[3];
        String[] endereco = new String[3];

        for(i=0; i<3; i++){
        System.out.println("Digite nome: ");
        nome[i] = input.nextLine();
        System.out.println("\nDigite endereço: ");
        endereco[i] = input.nextLine(); 
        System.out.println("\nDigite profissao: ");
        profissao[i] = input.nextLine();
        }

        for(i=0; i<2; i++){
            for(c=(i+1); c<3; c++ ){
                if (nome[i].compareTo(nome[c]) > 0) {
                    troca(nome[i], nome[c]);
                        troca(endereco[i], endereco[c]);
                        troca(profissao[i], profissao[c]);
                }
            }
        }

        for(i=0; i<3; i++){
            System.out.println("\n" + nome[i] + "\t" + endereco[i] + "\t" + profissao[i]);
            System.out.println("\n");
        }

        input.close();
    }

    private static void troca(String n1, String n2) {
        String aux;
        aux = n1;
        n1 = n2;
        n2 = aux;

    }
    
}
