import java.util.Scanner;

public class Algoritmo_487 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, numero;
        int[] vetorNum = new int[10];

        for(i=0; i<10; i++){
            System.out.println("Digite numero: " + (i+1) + " : ");
            vetorNum[i] = input.nextInt();
        }

        inverte (vetorNum, 10);
        System.out.println("\nVETOR\n");

        for(i=0; i<10; i++){
            System.out.println("\n" + (i+1) + " - " + vetorNum[i]);
        }
        System.out.println("\n");

        input.close();
    }

    private static int inverte(int[] vetorNum, int maximo) {
        int k, i, aux;
        
        k=maximo;

        for(i=0; i<maximo/2; i++){
            aux = vetorNum[i];
            k--;
            vetorNum[i] = vetorNum[k];
            vetorNum[k] = aux;
        }
        return 0;
    }
    
}
