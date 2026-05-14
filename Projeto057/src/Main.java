import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o modo: (1) Lucro Direto | (2) Por Preço ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Lucro: R$ ");
            double L = sc.nextDouble();
            // Java chama a Versão A
            System.out.printf("Imposto: R$ %.2f%n", CalculadoraFiscal.calc(L));

        } else {
            System.out.print("Preço Compra: ");
            double c = sc.nextDouble();
            System.out.print("Preço Venda: ");
            double v = sc.nextDouble();
            System.out.print("Quantidade ");
            int q = sc.nextInt();
            // Java chama a Versão B automaticamente porque você passou 3 valores
            System.out.printf("Imposto: R$ %.2f%n", CalculadoraFiscal.calc(c, v, q));
        }

        sc.close();
    }
}