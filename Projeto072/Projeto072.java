import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projeto072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> evolucaoPatrimonio = new ArrayList<>();

        System.out.println("=== Simulador de Evolução de Patrimônio - ANBIMA ===");

        try {
            // 1. Entrada de Dados
            System.out.print("Digite o capital inicial aplicável: R$ ");
            double capital = Double.parseDouble(scanner.nextLine().replace(",","."));

            System.out.print("Digite a taxa de juros mensal (em %): ");
            double taxa = Double.parseDouble(scanner.nextLine().replace(",",".")) / 100;

            System.out.print("Digite o tempo da aplicação (em meses): ");
            int meses = Integer.parseInt(scanner.nextLine());

            // Validação simples
            if (capital <= 0 || taxa < 0 || meses <= 0) {
                System.out.println("Erro: Os valores digitados devem ser maiores que zero.");
                scanner.close();
                return; // Encerra o métodx main mais cedo de forma limpa
            }

            // 2. Cálculo dos Juros Compostos Mês a Mês
            double saldoAtual = capital;
            for (int i = 1; i <= meses; i++) {
                saldoAtual += saldoAtual * taxa; // Aplica os juros sobre o saldo do mês anterior
                evolucaoPatrimonio.add(saldoAtual); // Guarda o saldo atualizado na lista

            }

            // 3. Exibição do Extrato de Evolução
            System.out.println("\n--- Extrato da Evolução Mensal ---");
            for (int mes = 0; mes < evolucaoPatrimonio.size(); mes++) {
                System.out.printf("Mês %d: R$ %.2f%n", (mes +1), evolucaoPatrimonio.get(mes));
            }

            // 4. Resumo Final
            double totalGanhos = saldoAtual - capital;
            System.out.println("\n--- Resumo Consolidado ---");
            System.out.printf("Valor Inicial: R$ %.2f%n", capital);
            System.out.printf("Valor Final: R$ %.2f%n", saldoAtual);
            System.out.printf("Total em Juros Acumulados: R$ %.2f%n", totalGanhos);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada de dados inválida. Certifique-se de digitar números.");
        }

        scanner.close();
    }
}
