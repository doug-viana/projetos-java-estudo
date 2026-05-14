import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Lucro da operação: R$ ");
        double lucro = sc.nextDouble();

        System.out.print("Tipo (DT para Day Trade / ST para Swing Trade): ");
        String tipo = sc.next();

        // Enviando os dois dados para a calculadore
        double impostoFinal = CalculadoraFiscal.calc(lucro, tipo);

        System.out.println("\n--- RECIBO FISCAL ---");
        System.out.printf("Operação: %s%n", tipo.toUpperCase());
        System.out.printf("Imposto Devido: R$ %.2f%n", impostoFinal);
        System.out.printf("Líquido: R$ %.2f%n", (lucro - impostoFinal));

        sc.close();

    }
}