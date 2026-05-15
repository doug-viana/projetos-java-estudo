import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projeto069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usamos a Interface List e o Wrapper Double
        List<Double> precos = new ArrayList<>();

        System.out.println("=== Calculadora de Preço Médio - Investimentos ===");

        while (true) {
            try {
                System.out.print("Digite o preço de compra (ou 0 para calcular): ");
                String entrada = scanner.nextLine().replace(",",".");
                double valor = Double.parseDouble(entrada);

                if (valor == 0) break;   // Sai do loop para calcular

                if (valor < 0) {
                    System.out.println("Erro: O preço não pode ser negativo.");
                    continue;
                }

                precos.add(valor);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um valor numérico válido.");
            }
        }

        // Cálculo da média
        if (precos.isEmpty()) {
            System.out.println("Nenhum preço foi cadastrado.");
        } else {
            double soma = 0;
            for (double p : precos) {
                soma += p;
            }
            double media = soma / precos.size();
            System.out.printf("%nTotal de compras: %d", precos.size());
            System.out.printf("%nPreço Médio do Ativo: R$ %.2f%n", media);
        }

        scanner.close();
    }
}
