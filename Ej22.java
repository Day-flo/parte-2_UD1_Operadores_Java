import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        System.out.println("Valor inicial: " + numero);

        System.out.println("Postfijo ++: " + numero++);
        System.out.println("Valor despues del postfijo: " + numero);

        System.out.println("Prefijo ++: " + (++numero));
        System.out.println("Valor actual: " + numero);

        System.out.println("Postfijo --: " + numero--);
        System.out.println("Valor despues del postfijo: " + numero);

        System.out.println("Prefijo --: " + (--numero));
        System.out.println("Valor final: " + numero);

        teclado.close();
    }
}
