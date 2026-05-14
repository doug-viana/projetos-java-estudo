import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
       // 1. Configuração do ambiente (As rodinhas)
       Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("--- SISTEMA DE TRIBUTAÇÃO ANBIMA ---");

        // 2. Entrada de Dados
        System.out.println("Informe o lucro bruto da operação: R$ ");
        double lucroBruto = sc.nextDouble();

        // 3. Processamento (Cálculo dos 15%)
        double taxaIR = 0.15;
        double valorImposto = lucroBruto * taxaIR;
        double lucroLiquido = lucroBruto - valorImposto;

        // 4. Saída Formatada (Onde a mágica do printf acontece)
        System.out.println("\n===== EXTRATO DE RENDIMENTOS =====");

        // %n pula linha, %.2f formata 2 casas
        System.out.printf("Lucro Bruto    : R$ %10.2f%n", lucroBruto);
        System.out.printf("Imposto (15%%) : R$ %10.2f%n", valorImposto);
        System.out.printf("Lucro Líquido  : R$ %10.2f%n", lucroLiquido);

        System.out.println("=======================================");

        sc.close();
    }
}