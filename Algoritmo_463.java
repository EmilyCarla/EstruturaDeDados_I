import java.util.Scanner;

public class Algoritmo_463 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angulo, radianos;
        
        System.out.println("\nDigite o angulo em graus: ");
        angulo = input.nextInt();

        radianos = radiano(angulo);
        System.out.println("\ngraus: " + angulo + "\nradianos: " + radianos );
        System.out.println("\n");
        
        input.close();
    }

    private static double radiano(double angulo) {
        angulo = ((angulo * Math.PI)/180);
        return angulo;
    }
}
