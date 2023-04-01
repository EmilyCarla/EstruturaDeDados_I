import java.util.Scanner;

public class Algoritmo_460{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a; //numero
        int c; //indice

        for(c= 1; c<=3; c++ ){
            System.out.println("\n\nDigite numero: ");
            a = input.nextInt();
            System.out.println("Dobro: " + dobro(a));
            System.out.println("\n");

            input.close();
        }
    }
    private static int dobro(int a) {
        return (a * 2);
    }
}