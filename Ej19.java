import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota del trabajo 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Nota del trabajo 2: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Nota del trabajo 3: ");
        double nota3 = teclado.nextDouble();

        System.out.print("Nota del trabajo 4: ");
        double nota4 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        long notaFinal = Math.round(media);

        System.out.println("La nota media es: " + media);
        System.out.println("La nota redondeada es: " + notaFinal);

        teclado.close();
    }
}