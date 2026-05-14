import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos na base? ");
        int n = sc.nextInt();
        Ativo[] vect = new Ativo[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Limpeza de buffer
            System.out.println("Cadastro do ativo #" + (i + 1));
            System.out.print("Ticker: ");
            String ticker = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            vect[i] = new Ativo(ticker, preco);
        }

        System.out.print("\nQual Ticker deseja atualizar o preço? ");
        sc.nextLine(); // Limpeza de buffer antes de ler String
        String tickerBusca = sc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < vect.length; i++) {
            // Verificamos se o ticker do objeto na vaga 'i' é igual ao buscado
            if (vect[i].getTicker().equalsIgnoreCase(tickerBusca)) {
                System.out.println("Ativo encontrado! Digite o novo preço: ");
                double novopreco = sc.nextDouble();

                //USANDO O SETTER PARA ATUALIZAR
                vect[i].setPreco(novopreco);
                encontrado = true;
                break; //Achou? Para o loop!
            }
        }

        if (!encontrado) {
            System.out.println("ERRO: Ativo '" + tickerBusca + "' não consta na base.");
        } else {
            System.out.println("\n--- RELATÓRIO FINAL ---");
            for (Ativo obj : vect) {
                System.out.println(obj);
            }
        }

        sc.close();
    }
}