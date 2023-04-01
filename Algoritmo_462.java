import java.util.Scanner;

public class Algoritmo_462{  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double m;

        System.out.println("\nDigite nota 1: ");
        nota1 = input.nextInt();

        System.out.println("\nDigite nota 2: ");
        nota2 = input.nextInt();

        System.out.println("\nDigite nota 3: ");
        nota3 = input.nextInt();


        System.out.println("\nMedia aritmetica " + media(nota1, nota2, nota3));
        m = media(nota1, nota2, nota3);

        System.out.println("\nmedia armazenada em variavel = " + m);
        
        System.out.println("\n");
 
        input.close();
 
    }
    private static double media(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3)/3.0;
        return media;
    }

}
   
    

