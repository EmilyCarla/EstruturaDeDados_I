import java.util.Scanner;

public class Algoritmo_495 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int L, c, t, t1;
        String[] [] nome = new String [5] [20];

        for(L=0; L<5; L++){
            System.out.println("Digite nome: ");
            nome[L] = input.nextLine().split(" ");
        }

        ordena(nome, 5);

        System.out.println("\n\nNOMES ORDENADOS\n");

        for(L=0; L<5; L++){
            System.out.println("\n" + (L+1) + " - " + nome[L]);
            System.out.println("\n");
        }

        input.close();
    }

    private static void ordena(String[][] vet, int tam) {
        int L1, c1;
        String aux;

        for(L1=0; L1<(tam-1); L1++){
            for(c1=(L1+1);c1<tam; c1++){
                if (vet[L1][0].compareTo(vet[c1][0]) > 0) {
                    aux = vet[L1][0]; 
                    vet[L1] = vet[c1];
                    vet[c1][0] = aux;
                }
            }
        }
    }
    
}
