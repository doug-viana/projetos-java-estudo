import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projeto070 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Double> historicoPrecos = new ArrayList<>();

            System.out.println("=== Monitor de Extremos ANBIMA - Painel de Trading ===");

            // 1. Entrada de dados
            while (true) {
                try {
                    System.out.print("Digite o preço do fundo (ou 0 para encerrar): ");
                    String entrada = scanner.nextLine().replace(",", ".");
                    double preco = Double.parseDouble(entrada);

                    if (preco == 0) break;

                    if (preco <0) {
                        System.out.println("Erro: Preço inválido (negativo).");
                        continue;
                    }

                    historicoPrecos.add(preco);
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Digite um valor numérico válido.");
                }
            }

            // 2. Análise dos Extremos (Maior e Menor)
            if (historicoPrecos.isEmpty()) {
                System.out.println("Nenhum preço foi registrado.");
            } else {
                // Começamos assumindo que o primeiro item da lista é tanto o maior quanto o menor
                double maior = historicoPrecos.get(0);
                double menor = historicoPrecos.get(0);

                // Percorremos a lista comparando cada preço
                for (double preco : historicoPrecos) {
                    if (preco > maior) {
                        maior = preco; // Atualiza a máxima
                    }
                    if (preco < menor) {
                        menor = preco; // Atualiza a mínima
                    }
                }

                // 3. Exibição dos Resultados
                System.out.println("\n--- Relatório de Performance ---");
                System.out.println("Histórico de preços: " + historicoPrecos);
                System.out.printf("Preço Máximo (Máxima): R$ %.2f%n", maior);
                System.out.printf("Preço Mínimo (Mínima): R$ %.2f%n", menor);
            }

            scanner.close();
        }
    }
