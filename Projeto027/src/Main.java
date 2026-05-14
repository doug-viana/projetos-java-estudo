import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos deseja analisar? ");
        int n = sc.nextInt();
        Ativo[] vect = new Ativo[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Ticker do ativo #" + (i + 1) + ": ");
            String ticker = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            vect[i] = new Ativo(ticker, preco);
        }

        double somaCaros = 0.0;
        int contCaros = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getPreco() > 50.0) {
                somaCaros += vect[i].getPreco();
                contCaros++;
            }
        }

        System.out.println("\n--- RESULTADO DA AUDITORIA ---");

        if (contCaros > 0) {
            double mediaCaros = somaCaros / contCaros;
            System.out.printf("Média de preço dos ativos acima de R$ 50: R$ %.2f%n", mediaCaros);
        } else {
            System.out.println("Não há ativos acima de R$50,00 na carteira.");
        }

        // CÁLCULO DE PORCENTAGEM
        // Usamos (double) para garantir que a divisão não corte as casas decimais
        double percentual = (double) contCaros / n * 100.0;
        System.out.printf("Percentual de ativos caros na carteira: %.1f%%%n", percentual);

        sc.close();
    }
}