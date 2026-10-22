import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        boolean par = numero % 2 == 0;

        System.out.println(par);

        teclado.close();
    }
}