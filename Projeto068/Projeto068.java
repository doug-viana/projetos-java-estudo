import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projeto068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando uma lista dinâmica de Strings
        List<String> carteira = new ArrayList<>();

        System.out.println("=== Gestor de Carteira ANBIMA ===");

        while (true) {
            System.out.print("Digite o nome do ativo (ou 'fim' para encerrar): ");
            String ativo = scanner.nextLine();

            if (ativo.equalsIgnoreCase("fim")) {
                break;
            }

            // Adicionando o item na lista
            carteira.add(ativo);
        }

        System.out.println("\n--- Ativos na sua Carteira ---");
        // O for-each percorre a lista do início ao fim
        for (String item : carteira) {
            System.out.println("- " + item);
        }

        System.out.println("Total de ativos: " + carteira.size());
        scanner.close();
    }
}
