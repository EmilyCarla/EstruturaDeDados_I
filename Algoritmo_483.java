import java.util.Scanner;

public class Algoritmo_483 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, c; //i=indice / c=produto interno
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];

        for(i = 0; i<4; i++){
            System.out.println("\n\nDigite o " + (i+1) + "° valor para o vetor 1: ");
            vetor1[i] = input.nextInt();
        }

        for(i=0; i<4; i++){
            System.out.println("\n\nDigite o " + (i+1) + "° valor para o vetor 2: ");
            vetor2[i] = input.nextInt();
        }

        c = produtointerno(vetor1, vetor2, 4);
        System.out.println("\nVETOR A\tVETOR B\n");

        for(i =0; i<4; i++){
            System.out.println("\n" + vetor1[i] + "\t" + vetor2[i]);
            System.out.println("\n\nproduto interno: " + c);
            System.out.println("\n");
        }
        input.close();
        
    }

    private static int produtointerno(int[] vetor1, int[] vetor2, int quantidade) {
        int produto, i;
        produto = 0;
        for(i=0; i<quantidade; i++){
            produto = produto + (vetor1[i] * vetor2[i]);
        }
        return (produto);
    }
    
}
