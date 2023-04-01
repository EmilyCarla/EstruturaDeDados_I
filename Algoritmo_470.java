import java.util.Scanner;

public class Algoritmo_470 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, numPrimo;

        System.out.println("\nDigite um numero maior que 0: ");
        numero = input.nextInt();

        numPrimo = primo(numero);

        if(numPrimo == 0){
            System.out.println("\n" + numero +" é primo: ");
        }else{
            System.out.println("\n" + numero +" não é primo " );
        }
        System.out.println("\n");

        input.close();
        
    }

    private static int primo(int n) {
        int c, p;
        c=0;
        p=2;

        while( c== 0 && p<=n / 2){
            if( n % p ==0){
                c=1;
            }
            p++;
        }
        return (c);
    }

   
    
}
