import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- PADRONIZADOR DE ATIVOS ---");
        System.out.println("Digite o ticker da ação (ex: petr4); ");

        // 1. Lendo o texto
        String entrada = sc.nextLine();

        // 2. Tratamento de Dados (Limpeza)
        String ticker = entrada.trim().toUpperCase();
        //trim() remove espaços nas pontas | toUpperCase() deixa tudo MAIÚSCULO

        // 3. Validação (Tamanho do código)
        int tamanho = ticker.length(); // Conta quantos caracteres tem

        System.out.println("\n--- RESULTADO DA ANÁLISE ---");
        System.out.println("Ticker Processado: " + ticker);
        System.out.println("Quantidade de caracteres: " + tamanho);

        if (tamanho == 5) {
            System.out.println("STATUS: Ticker válido para o padrão B3.");
        } else {
            System.out.println("STATUS: Alerta! Verifique se o código está correto.");
        }
        sc.close();
    }
}