import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero entero: ");
        int n1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero entero: ");
        int n2 = teclado.nextInt();

        if (n2 != 0) {
            int divisionEntera = n1 / n2;
            double divisionReal = (double) n1 / n2;

            System.out.println("Division entera: " + divisionEntera);
            System.out.println("Division real: " + divisionReal);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        teclado.close();
    }
}