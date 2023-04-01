import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Algoritmo_499 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorNum = new int[5];
        int L, flag, op;

        flag = 0;

        for(L = 0; L<5; L++){
            vetorNum[L] = 0;
        }
        do{
            System.out.println("\n\n\n");
            System.out.println("\nMENU VETOR - FUNÇÃO \n");
            System.out.println("\n1 Dados do Vetor");
            System.out.println("\n2 Ordena VETOR");
            System.out.println("\n3 Imprime VETOR");
            System.out.println("\n4 Sai do programa");
            System.out.println("\nOPCAO: ");
            op = input.nextInt();
            
            switch(op){
                case 1 :
                entrada(vetorNum, 5);
                flag = 1;
                break;

                case 2:
                if(flag==1){
                    ordena(vetorNum, 5);
                }else{
                    System.out.println("\nEscolha primeiro opcap 1");
                }
                break;

                case 3:
                if(flag==1){
                    imprime(vetorNum, 5);
                }else{
                    System.out.println("\nEscolha primeiro opcao 1");
                }
                break;

                case 4:
                System.out.println("\nSaindo do Algoritmo");
                break;
            
                default:
                System.out.println("\nOpção invalida");
                break;
            }
        }while(op != 4);
            System.out.println("\n");
        }



        
    private static int[] ordena(int[] vetorNum, int tam) {
        int L1, c1, aux;

        for(L1=0; L1<tam-1; L1++){
            for(c1=L1+1; c1<tam; c1++){
                if(vetorNum[L1]>vetorNum[c1]){
                    aux = vetorNum[L1];
                    vetorNum[L1] = vetorNum[c1];
                    vetorNum[c1] = aux;
                }
                return(vetorNum);
            }
            
        }

    }




    private static int[] imprime(int[] vetorNum, int t) {
        int L;
        System.out.println("\nVETOR\n");

        for(L=0; L<t; L++){
            System.out.println("\n" + (L+1) + " - " + vetorNum[L] );
        }
        return(vetorNum);        
    }



    private static int[] entrada(int[] vetorNum, int t) {
        Scanner input = new Scanner(System.in);
        
        int L;

        System.out.println("\nEntrada do VETOR\n");

        for(L=0; L<t; L++){
        System.out.println("Digite numero: " + (L+1) + " : " );
        vetorNum[L] = input.nextInt();
    }
        return (vetorNum);
    }
    
        
}

   
    
    

