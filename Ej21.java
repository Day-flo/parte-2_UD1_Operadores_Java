import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int n1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int n2 = teclado.nextInt();

        int resultado = n1;
        resultado += n2;

        System.out.println("La suma es: " + resultado);

        resultado = n1;
        resultado -= n2;

        System.out.println("La resta es: " + resultado);

        teclado.close();
    }
}