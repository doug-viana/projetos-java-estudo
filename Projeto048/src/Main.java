import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldo = 500.00;
        double limiteSaque = 300.00;

        System.out.println("Saldo disponível: R$ " + saldo);
        System.out.println("Limite por saque: R$ " + limiteSaque);

        try {
            System.out.print("\nQuanto deseja sacar? ");
            double valor = sc.nextDouble();

            // 1ª Regra de Negócio: Limite por operação
            if (valor > limiteSaque) {
                throw new Exception("O valor excede o limite permitido por saque!");
            }

            // 2ª Regra de Negócio: Saldo insuficiente
            if (valor > saldo) {
                throw new Exception("Saldo insuficiente para esta operação.");
            }

            // Se passar pelas validações:
            saldo -= valor;
            System.out.printf("Saque realizado! Novo saldo: R$ %.2f%n", saldo);

        } catch (InputMismatchException e) {
            // Captura se o usuário digitar "abc"
            System.err.println("Erro: Por favor, digite um valor numérico válido.");
        } catch (Exception e) {
            // Captura as nossas mensagens do 'throw new Exception'
            System.err.println("Operação Negada: " + e.getMessage());
        } finally {
            System.out.println("\nObrigado por usar nosso banco.");
            sc.close();
        }
    }
}