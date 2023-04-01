import java.util.Scanner;

public class Algoritmo_493 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int L, c, aux;
        int[] vetorNum = new int[10];

        for(L=0; L<10; L++){
            System.out.println("Digite numero : " + (L+1) + " : ");
            vetorNum[L] = input.nextInt();
        }

        c= verificaordem(vetorNum, 10);

        if(c==1){
            System.out.println("\n ORDENAÇÃO CRESCENTE\n");
        }else{
            if(c==2){
                System.out.println("\nORDENAÇÃO DECRESCENTE");
            }else{

            System.out.println("\nNÃO ESTÁ ORDENADO\n");
        }
    }
    System.out.println("\n");

    }



    private static int verificaordem(int[] vetorNum, int t) {
        int r, res, L;

        r = busca(vetorNum, t);{
            if(r==1){
                res = 2; 
                return(res);
            }else{
                r = busca(vetorNum, t);
                if(r==1){
                    res = 1; 
                    return(res);
                }else{
                    res =0; 
                    return(res);
                }
            }
        }
    }

    private static int busca(int[] vetorNum, int tam) {
        int i, x, L;
        for(i=0; i<tam-1; i++){
            if(vetorNum[i] < vetorNum[i+1]){
                x=0; 
                return(x);
            }
        }
        x=1; 
        return(x);
    }


public static int busca1(int[] vetorNum, int tam){
    int i, x, L;

    for(i=0; i<tam-1; i++){
        if(vetorNum[i] > vetorNum[i+1]){
            x=0; 
            return(x);
        }
   }
   x=1;
   return(x);
}
}

    

