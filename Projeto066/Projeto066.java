import java.util.Scanner;


public class Projeto066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cpf;

        System.out.println("=== Validador de Documentos - Compliance ANBIMA ===");

        while (true) {
            System.out.print("Digite o CPF (apenas os 11 números): ");
            cpf = scanner.nextLine();

            // 1. Validação de Comprimento
            if (cpf.length() != 11) {
                System.out.println("ERRO: O CPF deve ter exatamente 11 dígitos.");
                continue; // Reinicia o loop para pedir o CPF de novo
            }

            // 2. Validação de Formato (Apenas números)
            try {
                // Usamos Long porque 11 dígitos ultrapassam o limite do Integer
                Long.parseLong(cpf);
                break; // Se chegou aqui, passou nas duas validações
            } catch (NumberFormatException e) {
                System.out.println("Erro: O CPF deve conter apenas algarismos numéricos!");
            }
        }
        System.out.println("CPF " + cpf + " validado com sucesso.");
        scanner.close();
    }
}
