import java.util.Scanner;

public class Algoritmo_480 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, x;

        System.out.println("\nDigite numero: ");
        numero = input.nextInt();

        x = reverso(numero);
        System.out.println("\n" + numero + " - " + x);

        if(x==numero){
            System.out.println("\nÉ um numero capicua");
        }else{
            System.out.println("\nNão é um numero capicua");
        }
        System.out.println("\n");
        
        input.close();
    }

    private static int reverso(int num) {
        int soma, r;
        soma = 0; 

        while(num != 0){
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return (soma);
    }
    
}
