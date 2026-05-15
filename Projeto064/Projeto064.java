import java.util.Scanner;

public class Projeto064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        System.out.println("=== Sistema de Cadastro de Colaboradores ===");

        while (true) {
            try {
                System.out.print("Informe  a idade (permitido de 18 a 120): ");
                idade = Integer.parseInt(scanner.nextLine());

                // Validação da Regra de Negócio
                if (idade >= 18 && idade <= 120) {
                    break; // Sucesso! Sai do loop.
                } else {
                    System.out.println("Erro: Idade fora da faixa permitida. Tente novamente");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
            }
        }
        System.out.println("Cadastro realizado com sucesso! Idade registrada: " + idade);
        scanner.close();
    }
}
