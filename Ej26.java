public class Ej26 {
    public static void main(String[] args) {
        double saldo = 100;

        saldo += 50;
        System.out.println("Despues de anadir 50: " + saldo);

        saldo -= 20;
        System.out.println("Despues de restar 20: " + saldo);

        saldo *= 2;
        System.out.println("Despues de duplicar: " + saldo);

        saldo /= 4;
        System.out.println("Despues de dividir entre 4: " + saldo);
    }
}