import java.util.Scanner;

public class Algoritmo_464 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angulo, graus;

        System.out.println("\nDigite angulo em radianos: ");
        angulo = input.nextInt();

        graus = graus(angulo);

        System.out.println("\nradianos: " + angulo + "\ngraus: " + graus);
        System.out.println("\n");

        
        input.close();
    }

    private static double graus(double angulo) {
        angulo = ((angulo * 180)/Math.PI);
        return angulo;
    }
}
