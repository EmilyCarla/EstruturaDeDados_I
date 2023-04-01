import java.util.Scanner;

public class Algoritmo_473 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letra;
        int x;

        System.out.println("\nDigite letra: ");
        letra = input.nextLine();

        x = maiuscula(letra);

        if(x==1){
            System.out.println("\né uma consoante ");
        }else{
            System.out.println("\nnão é uma consoante");
            System.out.println("\n");
        }


        input.close();
    }

    private static int maiuscula(String letra) {
        if(letra.equals("A") || letra.equals("a") || letra.equals("E") || letra.equals("e") ||
        letra.equals("I") || letra.equals("i") || letra.equals("O") || letra.equals("o") ||
        letra.equals("U") || letra.equals("u")){
            return(0);
        }else{
            return(1);
        }
    }
}
    
