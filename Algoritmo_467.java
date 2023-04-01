import java.util.Scanner;

public class Algoritmo_467 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double z, logaritmando, base;
        int i; //indice

        for(i=1; i<=3; i++){
        System.out.println("\nDigite logaritmando maior do que 0: ");
        logaritmando = input.nextDouble();

        while(logaritmando<=0){
            System.out.println("\nInvalido. Digite logaritmando maior do que 0: ");
            logaritmando = input.nextDouble();
        }
            System.out.println("\nDigite base maior que 0 e diferente de 1: ");
            base = input.nextDouble();
            System.out.println("\nlogaritmo: " + loga(logaritmando, base));

            z= loga(logaritmando, base);
            System.out.println("\nz = " + z);

            input.close();
        }

    }

    private static double loga(double base, double expo) {
       double log = Math.log(base) / Math.log(expo);
        return log;
    }
}
