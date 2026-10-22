import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int n1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int n2 = teclado.nextInt();

        int mayor = n1 > n2 ? n1 : n2;

        System.out.println("El mayor es: " + mayor);

        teclado.close();
    }
}