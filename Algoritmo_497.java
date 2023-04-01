import java.util.Scanner;

public class Algoritmo_497 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorNum = new int[10];
        int L, c, n, aux;

        for(L=0; L<10; L++){
            System.out.println("Digite numero : " + (L+1) + " : ");
            vetorNum[L] = input.nextInt();
        }

        System.out.println("Digite numero de busca: " );
        n = input.nextInt();

        ordena(vetorNum, 10);

        c= busca(vetorNum, 10, n);

        System.out.println("\nVETOR\n");

        for(L=0; L<10;L++){
            System.out.println("\n" + (L+1) + " - " + vetorNum[L]);
        }
        c++;

        if(c!=0){
            System.out.println("\n\nposicao no vetor: " + c);
        }else{
            System.out.println("\nnão encontrado");
        }
        System.out.println("\n");

        
    }

    private static void ordena(int[] vetorNum, int tam) {
        int L1, c1, aux;
        for(L1=0; L1<tam-1; L1++){
            for(c1=L1+1; c1<tam; c1++){
                if(vetorNum[L1] > vetorNum[L1]){
                    aux=vetorNum[L1];
                    vetorNum[L1] = vetorNum[c1];
                    vetorNum[c1] = aux;
                }

            }
        }

    }

    private static int busca(int[] vetorNum, int tam, int chave) {

        int i, inicio, meio, fim, n;

        inicio = 0;
        fim = (tam-1);

        while(inicio <= fim){
            meio = (inicio + fim)/2;
            if(chave == vetorNum[meio]){
                return (meio);
            }else{
                if(chave < vetorNum[meio]){
                    fim = (meio-1);
                }else{
                    inicio = (meio+1);
                }
            }
            meio = -1;
            return -1;
        }
        return 0;
        
    }
}
