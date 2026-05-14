import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // 1. Criamos os objetos de Setor
        Setor bancos = new Setor("Financeiro");
        Setor energia = new Setor("Energia Elétrica");

        // 2. Criamos a lista de ativos
        List<Ativo> carteira = new ArrayList<>();

        // 3. Ao cadastrar o ativo, passamos o OBJETO setor correspondente

        carteira.add(new Ativo("ITUB4", 28.50, bancos));
        carteira.add(new Ativo("BBAS3", 55.20, bancos));
        carteira.add(new Ativo("TAEE11", 11.40, energia));
        carteira.add(new Ativo("CPLE6", 9.80, energia));

        System.out.println("--- RELATÓRIO DE CARTEIRA POR SETOR ---");
        for (Ativo a : carteira) {
            System.out.println(a);
        }
    }
}