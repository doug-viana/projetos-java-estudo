import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Criando o objeto (Instanciando a classe)
        Ativo acao = new Ativo();

        System.out.println("--- CADASTRO DE ATIVO ---");

        System.out.println("Nome da Empresa: ");
        acao.nome = sc.nextLine();

        System.out.println("Ticker (ex: VALE3): ");
        acao.ticker = sc.next().toUpperCase();

        System.out.println("Preço Atual: R$ ");
        acao.preco = sc.nextDouble();

        // Exibindo os dados do OBJETO
        System.out.println("\n--- ATIVO CADASTRADO COM SUCESSO ---");
        System.out.printf("Empresa: %s (%s)%n", acao.nome, acao.ticker);
        System.out.printf("Preço: R$ %.2f%n", acao.preco);

        sc.close();
    }
}