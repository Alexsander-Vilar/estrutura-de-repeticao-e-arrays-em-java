import java.util.Random;

public class Ex3NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatoriso = new int[20];

        for (int i = 0; i < numerosAleatoriso.length; i ++) {
            int numero = random.nextInt(100);
            numerosAleatoriso[i] = numero;

        }

        System.out.print("Numeros aleatorios: ");
        for (int numero : numerosAleatoriso) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos numeros aleatorios: ");
        for (int numero: numerosAleatoriso) {
            System.out.print((numero + 1) + " ");
        }

        System.out.print("\nAntecessores dos numeros : ");
        for (int numero: numerosAleatoriso) {
            System.out.print((numero - 1) + " ");
        }
    }
}
