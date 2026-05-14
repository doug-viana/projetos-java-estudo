import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos cadastrar? ");
        int n = sc.nextInt();

        //Criando o "estojo" (vetor)
        Ativo[] vect = new Ativo[n];

        //Loop de cadastro
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Limpeza de buffer obrigatória
            System.out.println("Cadastro do ativo #" + i);
            System.out.print("Ticker: ");
            String ticker = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            // Colocando o objeto na vaga i
            vect[i] = new Ativo(ticker, preco);
        }

        // Relatório de Índices Pares
        System.out.println("\n=== ATIVOS EM ÍNDICES PARES ===");
        for (int i = 0; i < vect.length; i++) {
            if (i % 2 ==0) {
                System.out.println("Vaga [" + i + "]: " + vect[i]);
            }
        }

        // Relatório de Índices Ímpares
        System.out.println("\n=== ATIVOS EM ÍNDICES ÍMPARES ===");
        for (int i = 0; i < vect.length; i++) {
            if (i % 2 != 0) {
                System.out.println("Vaga [" + i + "]: " + vect[i]);

            }
        }

        sc.close();
    }
}