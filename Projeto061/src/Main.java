import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SIMULADOR DE PATRIMÔNIO ---");

        System.out.print("Aporte Inicial: R$ ");
        double ini = sc.nextDouble();

        System.out.print("Aporte Mensal: R$ ");
        double mens = sc.nextDouble();

        System.out.print("Taxa Mensal (ex: 0.01 para 1%): ");
        double tx = sc.nextDouble();

        System.out.print("Prazo (meses): ");
        int tempo = sc.nextInt();

        double totalFinal = CalculadoraFinanceira.simularInvestimento(ini, mens, tx, tempo);

        System.out.println("----------------------------------------");
        System.out.printf("RESULTADO FINAL: R$ %.2f%n", totalFinal);

        sc.close();
    }
}