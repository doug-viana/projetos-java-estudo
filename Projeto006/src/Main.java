import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Investimento Inicial: R$ ");
        double capital = sc.nextDouble();

        System.out.println("Taxa de Juros Mensal: (ex: 0.01 para 1%): ");
        double taxa = sc.nextDouble();

        System.out.println("Prazo (em meses): ");
        int meses = sc.nextInt();

        // O FOR é o patrão para prazos determinados
        // (início; condição; incremento)
        for (int i = 1; i <= meses; i++) {
            capital += capital * taxa; // Juros sobre juros!
            System.out.printf("Mês %d: Saldo de R$ %.2f%n", i, capital);
    }
        System.out.println("--- Cálculo Finalizado ---");
        sc.close();
    }
}