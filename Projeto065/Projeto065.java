import java.util.Scanner;

public class Projeto065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 0;

        System.out.println("--- Cadastro de Salário - RH ANBIMA ---");

        while (true) {
            try {
                System.out.print("Digite o salário bruto (mínimo R$ 1.412,00): ");
                // Substituímos a vírgula por ponto caso o usuário digite no padrão BR
                String entrada = scanner.nextLine().replace(",", ".");
                salario = Double.parseDouble(entrada);

                if (salario >= 1412.00) {
                    break; // Salário válido!
                } else {
                    System.out.println("Erro: O salário não pode ser menor que o mínimo (R$ 1.412,00).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Digite apenas números e use ponto para centavos.");
            }
        }

            System.out.printf("Salário cadastrado com sucesso: R$ %.2f%n", salario);
            scanner.close();
        }
    }

