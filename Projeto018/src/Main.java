import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Ativo acao1 = new Ativo("PETR4", 38.50, 100);

        Ativo acao2 = new Ativo("VALE3", 62.10);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println(acao1);
        System.out.println(acao2);

        System.out.println("\n--- EXECUTANDO OPERAÇÃO ---");
        System.out.println("Comprando 50 cotas de VALE3...");
        acao2.comprar(50);

        System.out.println("\n--- ESTADO FINAL (CARTEIRA ATUALIZADA) ---");
        System.out.println(acao1);
        System.out.println(acao2);

        }
    }