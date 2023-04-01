import java.util.Scanner;

public class Algoritmo_465 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("\nDigite numero 1: ");
        numero1 = input.nextInt();
        System.out.println("\nDigite numero 2: ");
        numero2 = input.nextInt();

        verifica(numero1, numero2);
        
        System.out.println("\n");


        input.close();
    }

    private static void verifica(int numero1, int numero2) {
        if(numero1 > numero2){
            System.out.println("\nMaior numero: " + numero1);
        }else{
            System.out.println("\nMaior numero: " + numero2);
        }
    }
}
