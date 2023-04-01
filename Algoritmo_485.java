import java.util.Scanner;

public class Algoritmo_485 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, c;
        int[] vetorNum = new int[10];

        for(i=0; i<10; i++){
            System.out.println("\n\nDigite numero: " + (i+1) + " : ");
            vetorNum[i] = input.nextInt();
        }
            c = menorElemento(vetorNum, 10);
            System.out.println("\nVETOR\n");

            for(i=0; i<10; i++){
                System.out.println("\n" + vetorNum[i]);
                System.out.println("\n\nMENOR ELEMENTO: " + c);
                System.out.println("\n");
            }
        input.close();
    }

    private static int menorElemento(int[] vetorNum, int tamanho) {
        int i, menor;
        i = 0;
        menor= vetorNum[0];
        for(i=1; i<tamanho; i++){
            if(vetorNum[i] < menor){
                menor = vetorNum[i];
            } 
        }
        return (menor);
    }
}
