import java.util.Scanner;

public class Ex2Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeDeConsoantes = 0;
        int contador = 0;

        do {
            System.out.print("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                quantidadeDeConsoantes++;
            }
            contador++;

        } while (contador < consoantes.length);

        System.out.print("Quantidade de consoantes: " + quantidadeDeConsoantes);
        System.out.print("\nConsoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");

        }
    }
}
