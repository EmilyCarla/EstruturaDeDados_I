import java.util.Scanner;

public class Algoritmo_471 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int divisor, dividendo, n;

        System.out.println("\ndigite dividendo: ");
        divisor = input.nextInt();

        System.out.println("\ndigite divisor: ");
        dividendo = input.nextInt();

        while(dividendo > divisor){
            System.out.println("\nInvalido. Digite numero menor do que o dividendo: " );
            dividendo = input.nextInt();
        }

       n = divisor(divisor, dividendo);

       if(n==0){
        System.out.println("\nNenhuma vez");
       }else{
        System.out.println("\nNumero de vezes: " + n);
        System.out.println("\n");
       }

        input.close();
    }

    private static int divisor(int x, int y) {
            int resto;
            int n1;
            n1=0;
            resto= x % y;
            while(resto==0){
                n1++;
                x = x / y;
                resto = x % y;
        }
        return (n1);
    }   
}
