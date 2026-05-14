import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldoConta = 2500.00;

        try {
            System.out.println("--- SISTEMA DE TRANSFERÊNCIA ---");
            System.out.println("Saldo Atual: R$ " + saldoConta);
            double valor = sc.nextDouble();

            // REGRA 1: Valor negativo ou zero
            if (valor <= 0) {
                throw new ValorInvalidoException("O valor deve ser positivo.");
            }

            // REGRA 2: Saldo insuficiente
            if (valor > saldoConta) {
                throw new SaldoInsuficienteException("Saldo insuficiente para sta remessa.");
            }

            // Se as regras passarem:
            saldoConta -= valor;
            System.out.printf("Transferência de R$ %.2f concluída com sucesso!%n", valor);
            System.out.printf("Novo Saldo:  R$ %.2f%n, saldoConta);");

        } catch (ValorInvalidoException e) {
            System.err.println("ERRO DE DADOS: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.err.println("ALERTA FINANCEIRO: " + e.getMessage());
            System.out.println("Deseja solicitar um empréstimo?");
        }catch (Exception e) {
            System.err.println("ERRO CRÍTICO: " + e.getMessage());
        } finally {
            System.out.println("Encerrando conexão com o banco...");
            sc.close();
        }
    }
}