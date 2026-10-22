import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        double resultado = (double) numero / 2;

        System.out.println("El resultado de dividir entre 2 es: " + resultado);

        teclado.close();
    }
}
