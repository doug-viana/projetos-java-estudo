import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos vai auditar? ");
        int n = sc.nextInt();
        Ativo[] vect = new Ativo[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Ticker: ");
            String ticker = sc.nextLine();
            System.out.print("Preço Médio: ");
            double preco = sc.nextDouble();

            vect[i] = new Ativo(ticker, preco);
        }

        System.out.println("\n--- ALERTA DE ATIVOS NEGATIVOS ---");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getPreco() < 0) {
                System.out.println("CUIDADO: " + vect[i].getTicker() + " está com preço R$" + vect[i].getPreco());
            }
        }

        double somaPositivos = 0.0;
        int contPositivos = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getPreco() > 0) {
                somaPositivos += vect[i].getPreco();
                contPositivos++;
            }
        }

        if (contPositivos > 0) {
            double media = somaPositivos / contPositivos;
            System.out.printf("%nMédia dos preços saudáveis: R$ %.2f%n", media);
        } else {
            System.out.println("Nenhum preço positivo encontrado.");
        }

        sc.close();
    }
}