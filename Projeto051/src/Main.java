import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldoAtual = 1000.00;

        try {
            System.out.println("Saldo disponível: R$ " + saldoAtual);
            System.out.print("Valor da compra: R$ ");
            double valorCompra = sc.nextDouble();

            // REGRA DE NEGÓCIO COM EXCEÇÃO PRÓPRIA
            if (valorCompra > saldoAtual) {
                throw new SaldoInsuficienteException("Você não tem fundos para essa operação!");
            }

            saldoAtual -= valorCompra;
            System.out.printf("Sucesso! Novo saldo: R$ %.2f%n", saldoAtual);
        } catch (SaldoInsuficienteException e) {
            // Tratamento especializado para falta de dinheiro
            System.err.println("FINANCEIRO: " + e.getMessage());
            System.out.println("Dica: Deposite mais dinheiro ou diminua a quantidade.");

        } catch (Exception e) {
            // Tratamento para qualquer outro erro (letras, etc)
            System.err.println("ERRO INESPERADO: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}