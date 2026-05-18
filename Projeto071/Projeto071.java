import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projeto071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declarando as duas listas usando a Interface List
        List<Double> todasTransacoes = new ArrayList<>();
        List<Double> transacoesSuspeitas = new ArrayList<>();

        System.out.println("=== Monitoramento de Compliance ANBIMA ===");

        // 1. Entrada e carga dos dados brutos
        while (true) {
            try {
                System.out.print("Digite o valor da transação (ou 0 para encerrar): R$ ");
                String entrada = scanner.nextLine().replace(",", ".");
                double valor = Double.parseDouble(entrada);

                if (valor == 0 ) break; // Criterio de parada

                if (valor < 0) {
                    System.out.println("Erro: O valor da transação não pode ser negativo.");
                    continue;
                }

                todasTransacoes.add(valor);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um valor numérico válido.");
            }
        }

        // 2. O Filtro (Regra de Negócio: Acima de 50k vai para auditoria)
        for (double transacao : todasTransacoes) {
            if (transacao > 50000.0) {
                transacoesSuspeitas.add(transacao); // Populando a segunda lista
            }
        }

        // 3. Emissão do Relatório de Auditoria
        System.out.println("\n--- Relatório de Auditoria de Riscos ---");
        System.out.println("Total de transações processadas: " + todasTransacoes.size());
        System.out.println("Alertas de risco gerados: " + transacoesSuspeitas.size());

        if (!transacoesSuspeitas.isEmpty()) {
            System.out.println("Valores retidos para análise: " + transacoesSuspeitas);
        } else {
            System.out.println("Nenhum alerta gerado. Compliance 100% em conformidade.");
        }

        scanner.close();
    }
}
