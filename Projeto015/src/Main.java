public class Main {
    public static void main(String[] args) {
        // --- TESTE 1: TIPO PRIMITIVO (VALOR) ---
        // O valor é copiado na Stack. Cada um tem seu espaço.
        double x = 10.0;
        double y = x;
        y = 20.0;

        System.out.println("X: " + x); // Continua 10.0
        System.out.println("Y: " + y); // Virou 20.0

        System.out.println("--------------------");

        // --- TESTE 2: TIPO REFERÊNCIA (OBJETO) ---
        // O endereço é copiado na Stack. Ambos apontam pro mesmo objeto no Heap.
        Ativo a1 = new Ativo();
        a1.setPreco(10.0);

        Ativo a2 = a1;
        a2.setPreco(20.0);

        System.out.println("Preço A1: " + a1.getPreco()); // VIROU 20.0!
        System.out.println("Preço A2: " + a2.getPreco()); // 20.0
    }
}