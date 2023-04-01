import java.util.Scanner;

public class Algoritmo_490 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] vetorNome = new String[10];
        int i;

        for(i=0; i<10; i++){
            System.out.println("Digite " + (i+1) + "° palavra em letras minusculas ");
            vetorNome[i] = input.nextLine();
            restantes(vetorNome, vetorNome[i].length(), "c" );
        }

        for(i=0; i<10; i++){
            System.out.println("\n" + (i+1) + " - " + vetorNome[i]);
        }
            System.out.println("\n");
        
        input.close();
    }

    private static int restantes(String[] vet, int tam, String x) {
        int i, cont;
        cont = 0;

        for(i=0; i<tam; i++){
            if(vet[i]==x){
                vet[i] = "*"; 
                cont++;
            }
        }
        return (cont);
    }

   
    }
    

