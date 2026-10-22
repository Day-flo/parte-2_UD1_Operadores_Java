import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        numero++;
        numero++;
        numero++;

        System.out.println("Valor final: " + numero);

        String tipo = numero % 2 == 0 ? "par" : "impar";

        System.out.println("El numero resultante es " + tipo);

        teclado.close();
    }
}