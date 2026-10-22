import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        boolean dentro = numero >= 0 && numero <= 100;
        boolean fuera = numero < 0 || numero > 100;

        if (!fuera) {
            System.out.println("El numero esta dentro del rango 0-100.");
        } else {
            System.out.println("El numero esta fuera del rango 0-100.");
        }

        System.out.println("Dentro del rango: " + dentro);

        teclado.close();
    }
}