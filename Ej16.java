import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        int absoluto = numero < 0 ? -numero : numero;

        System.out.println("El valor absoluto es: " + absoluto);

        teclado.close();
    }
}