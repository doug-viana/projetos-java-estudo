import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos no vetor? ");
        int n = sc.nextInt();

        // 1. LIMPEZA DE BUFFER (O segredo!)
        // Se não fizer isso, o primeiro sc.nextLine() dentro do loop será pulado.
        sc.nextLine();

        Ativo[] vect = new Ativo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nCadastro do Ativo #" + (i + 1));

            System.out.print("Ticker: ");
            String ticker = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            // 2. LIMPEZA DE BUFFER DE NOVO
            // Sempre que ler um número e for voltar para um texto, limpe o buffer.
            sc.nextLine();

            vect[i] = new Ativo(ticker, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }

        double media = soma / n;
        System.out.printf("%nVALOR MÉDIO EM CARTEIRA: R$ %.2f%n", media);

        sc.close();
    }
}