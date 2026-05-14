import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Ativo> lista = new ArrayList<>();

        // 1. ADICIONANDO NORMAL (No final da fila)
        lista.add(new Ativo("VALE3", 75.0));
        lista.add(new Ativo("PETR4", 36.0));
        lista.add(new Ativo("ITUB4", 28.0));

        System.out.println("--- LISTA INICIAL ---");;
        for (Ativo a : lista) System.out.println(a);

        // 2. INSERINDO EM POSIÇÃO ESPECÍFICA (Índice, Objeto)
        // Vamos colocar a BBAS3 na posição 1. A VALE3 continua na 0, mas a PETR4 vira 2
        lista.add(1, new Ativo("BBAS3", 55.0));

        System.out.println("\n--- APÓS INSERIR BBAS3 NA POSIÇÃO 1 ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Vaga " + i + ": " + lista.get(i));
        }

        // 3. REMOVENDO POR CONDIÇÃO (Auditoria de 'Penny Stocks')
        // Vamos adicionar um ativo baratinho para testar
        lista.add(new Ativo("OIBR3", 0.80));

        System.out.println("\nRemovendo ativos abaixo de R$ 10.00...");
        // O predicado (x -> ...) é uma função rápido: "Para cada x, verifique se..."
        lista.removeIf(x -> x.getPreco() < 10.0);

        System.out.println("\n--- RELATÓRIO FINAL ---");
        for (Ativo a : lista) {
            System.out.println(a);
        }

    }
}