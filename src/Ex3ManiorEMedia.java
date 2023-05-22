import java.util.Scanner;

public class Ex3ManiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maiorNumero = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maiorNumero) maiorNumero = numero;
            contador = contador + 1;

        } while (contador < 5);

        System.out.println("Média: " + soma / 5);
        System.out.println("Maior Numero: " + maiorNumero);
        System.out.println("Finalizado! ");
    }
}
