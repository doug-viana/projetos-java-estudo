import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Ativo> lista = new ArrayList<>();
        String resposta;

        // 1. CADASTRO DINÂMICO
        do {
            System.out.print("Ticker do ativo: ");
            String ticker = sc.next();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            lista.add(new Ativo(ticker, preco));

            System.out.print("Deseja adicionar outro (s/n)? ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("s"));

        // 2. BUSCA POR INICIAL
        System.out.print("\nDigite uma letra ou termo para filtrar a busca: ");
        String busca = sc.next();

        System.out.println("\n--- RESULTADOS ENCONTRADOS ---");
        boolean algumEncontrado = false;

        // Usando o FOR-EACH (Para cada Ativo 'a' dentro da 'lista')
        for (Ativo a : lista) {
            // Pegamos o Ticker, passamos para Maiúsculo e verificamos se começa com a busca
            if (a.getTicker().toUpperCase().startsWith(busca.toUpperCase())) {
                System.out.println(a); // Chama o toString()
                algumEncontrado = true;
            }
        }

        if (!algumEncontrado) {
            System.out.println("Nenhum ativo corresponde à busca: " + busca);
        }

        sc.close();
    }
}