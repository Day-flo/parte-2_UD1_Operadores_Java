public class Ej23 {
    public static void main(String[] args) {
        int resultado = 10 + 2 * 3 - 4;
        int resultado2 = (10 + 2) * (3 - 4);

        System.out.println("Resultado 1: " + resultado);
        System.out.println("Resultado 2: " + resultado2);

        // Sin parentesis, la multiplicacion se hace antes que
        // las sumas y restas. Con parentesis, se calculan
        // primero las operaciones que estan dentro de ellos.
    }
}