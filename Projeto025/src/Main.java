import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos quer cadastrar? ");
        int n = sc.nextInt();
        Ativo[] vect = new Ativo[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); //Limpeza de buffer
            System.out.println("Ativo #" + (i + 1) + ":");
            System.out.print("Ticker: ");
            String ticker = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            // Instanciando o objeto na vaga i
            vect[i] = new Ativo(ticker, preco);
        }

        System.out.print("\nDigite o seu preço teto para compra: ");
        double precoTeto = sc.nextDouble();

        System.out.println("\n--- ATIVOS DENTRO DA ESTRATÉGIA ---");
        int encontrados = 0;
        for (int i = 0; i < vect.length; i++) {
            // Acessando cada objeto do vetor e testando o preço
            if (vect[i].getPreco() <= precoTeto) {
                System.out.println(vect[i]); // Usa o toString()
                encontrados++;
            }
        }

        if (encontrados == 0) {
            System.out.println("Nenhum ativo encontrado abaixo de R$ " + precoTeto);
        } else {
            System.out.println("Total de oportunidades: " + encontrados);
        }

        sc.close();
    }
}