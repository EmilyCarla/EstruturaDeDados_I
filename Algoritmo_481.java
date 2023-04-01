import java.util.Scanner;

public class Algoritmo_481 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, base, c;

        System.out.println("\nDigite numero maior ou igual a 0: ");
        numero = input.nextInt();

        while(numero < 0){
            System.out.println("\nNumero negativo. Digite numero maior ou igual a 0: ");
            numero = input.nextInt();
        }
        System.out.println("\nDigite a base em que deseja representa-lo (2-10): ");
        base = input.nextInt();

        while(base<2 || base>10){
            System.out.println("\nNao sei converter. Digite a base em que deseja representa-lo (2-10): ");
            base = input.nextInt();
        }

        c = converte(numero, base);
        System.out.println("\nnumero em decimal: " + numero);
        System.out.println("\nnumero na base " + base + " : " + c);
        System.out.println("\n");

        input.close();
        
    }

    private static int converte(int nnumero, int nbase) {
        int nb, r, b;
        b = 0;
        nb = 0;

        while(nnumero>=nbase){
            r = nnumero % nbase;
            nb = nb + (int) Math.pow(10, b) * r; // (int) Math.pow(10, b) -> calcula um aumento de número à potência de outro numero. Aceita dois parametros e retorna o valor do primeiro elevado ao segundo.
            nnumero = nnumero / nbase;
            b++;
        } 
        nb = nb + (int) Math.pow(10, b) * nnumero;
        return(nb);
    }
    
}
