import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero real: ");
        double n1 = teclado.nextDouble();

        System.out.print("Introduce el segundo numero real: ");
        double n2 = teclado.nextDouble();

        System.out.print("Introduce el tercer numero real: ");
        double n3 = teclado.nextDouble();

        int resultado = (int) (n1 + n2 + n3);

        System.out.println("La suma sin decimales es: " + resultado);

        teclado.close();
    }
}