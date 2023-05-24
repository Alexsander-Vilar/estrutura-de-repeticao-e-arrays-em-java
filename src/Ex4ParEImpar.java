import java.util.Scanner;

public class Ex4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumero;
        int contador = 0;
        int numero;
        int quantPares = 0, quantiImpares = 0;

        System.out.println("Quantidade de numero: ");
        quantNumero = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantiImpares++;

            contador++;
        } while (contador < quantNumero);

        System.out.println("Quantidade de numeros pares: " + quantPares);
        System.out.println("Quantidade de numeros impares: " + quantiImpares);
        System.out.println("Finalizado! ");
    }
}
