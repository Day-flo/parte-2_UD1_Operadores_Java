public class Ej29 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        boolean resultado = (a + b * 2) > c || (c / a) < b;

        System.out.println(resultado);

        // Primero se calcula la multiplicacion y la suma:
        // a + b * 2 = 10 + 5 * 2 = 20.
        // 20 > 20 es false.
        // Despues, c / a = 20 / 10 = 2.
        // 2 < 5 es true.
        // Como usamos ||, basta con que una condicion sea true.
        // Por tanto, el resultado final es true.
    }
}