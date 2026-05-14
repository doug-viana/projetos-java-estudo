import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Criando o objeto Scanner (O "Ouvido do Programa)
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("--- CALCULADORA DE RENDIMENTOS ---");

        // 2. Entrada de Dados Interativa
        System.out.println("Digite o Capital Inicial: R$ ");
        double capital = sc.nextDouble(); // O programa para aqui e espera você digitar
        System.out.println("Digite a Taxa de Juros (ex: 0.12 para 12%): ");
        double taxa = sc.nextDouble();

        // 3. Processamento (A conta do dinheiro!)
        double rendimento = capital * taxa;
        double montanteFinal = capital + rendimento;

        //4. Saída de Dados
        System.out.println("--------------------");
        System.out.println("Lucro Bruto: R$ " + rendimento);
        System.out.println("Valor Total após 1 ano: R$ " + montanteFinal);

        // Boas práticas: Fechar o scanner
        sc.close();
    }
    }