import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Ativo acao = new Ativo();

        System.out.println("Ticker: ");
        acao.ticker = sc.next().toUpperCase();
        System.out.println("Preço: ");
        acao.preco = sc.nextDouble();
        System.out.println("Quantidade: ");
        acao.quantidade = sc.nextInt();

        //SEM PRINTF GIGANTE! Apenas imprima o objeto.
        System.out.println("\n--- RELATÓRIO DO ATIVO ---");
        System.out.println(acao); //O Java chama o toString() automaticamente aqui!
        sc.close();
    }
}