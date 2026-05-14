public class Main {
    public static void main(String[] args) { // 1. O que o main nunca devolve?

        // Declarando os dados do Fundo (Variáveis)
        String nomeDoFundo = "Brasil Global FI"; // 2. Tipo para textos?
        Double patrimonio = 1500000.50; // 3. Tipo para valores monetários?
        int totalCotas = 5000; // 4. Tipo para números inteiros?
        boolean ativo = true; // 5. Tipo para verdadeiro/falso?

        // Exibindo os dados (Saída)
        System.out.println("Fundo: " + nomeDoFundo); // 6. Qual variável vai aqui?
        System.out.println("Patrimônio: R$ " + patrimonio);
        // Cálculo simples: Valor da Cota
        double valorCota = patrimonio / totalCotas;
        System.out.println("Valor da Cota: R$ " + valorCota);
    }
}